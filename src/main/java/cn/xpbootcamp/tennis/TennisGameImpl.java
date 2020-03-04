
package cn.xpbootcamp.tennis;

import java.util.Arrays;

public class TennisGameImpl implements TennisGame {
    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (player1.getName().equals(playerName)) {
            player1.wonPoint();
        } else {
            player2.wonPoint();
        }
    }

    public String getScore() {
        if (player1.isTiedWith(player2)) {
            return scoreForTied();
        }
        if (player1.hasAdvantageOver(player2)) {
            return scoreForAdvantage(player1);
        }
        if (player2.hasAdvantageOver(player1)) {
            return scoreForAdvantage(player2);
        }
        if (player1.hasWonAgainst(player2)) {
            return scoreForWin(player1);
        }
        if (player2.hasWonAgainst(player1)) {
            return scoreForWin(player2);
        }
        return scoreForBothBelow4Points();
    }
    private String scoreForBothBelow4Points() {
        return getScoreName(player1.getScore()) + "-" + getScoreName(player2.getScore());
    }

    private String scoreForTied() {
        return player1.getScore() > 2 ? "Deuce" : getScoreName(player1.getScore()) + "-All";
    }

    private String scoreForWin(Player player) {
        return "Win for " + player.getName();
    }

    private String scoreForAdvantage(Player player) {
        return "Advantage " + player.getName();
    }

    private String getScoreName(int score) {
        return Arrays.asList("Love", "Fifteen", "Thirty", "Forty").get(score);
    }
}