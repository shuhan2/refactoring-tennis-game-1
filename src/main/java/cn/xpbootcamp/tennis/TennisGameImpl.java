
package cn.xpbootcamp.tennis;

import java.util.Arrays;

public class TennisGameImpl implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (player1Name.equals(playerName)) {
            player1Score += 1;
        } else {
            player2Score += 1;
        }
    }

    public String getScore() {
        if (isTied()) {
            return scoreForTied();
        }
        if (isAtLeastOneScoreAbove4Points()) {
            return scoreForAtLeastOneScoreAbove4Points();
        }
        return scoreForBothBelow4Points();
    }

    private String scoreForBothBelow4Points() {
        return getScoreName(player1Score) + "-" + getScoreName(player2Score);
    }

    private String scoreForAtLeastOneScoreAbove4Points() {
        if (doesPlayer1HaveAdvantage()) {
            return scoreForAdvantage(player1Name);
        }
        if (doesPlayer2HasAdvantage()) {
            return scoreForAdvantage(player2Name);
        }
        if (doesPlayer1Win()) {
            return scoreForWin(player1Name);
        }
        if (doesPlayer2Win()) {
            return scoreForWin(player2Name);
        }
        return "";
    }

    private String scoreForTied() {
        return player1Score > 2 ? "Deuce" : getScoreName(player1Score) + "-All";
    }

    private boolean doesPlayer2Win() {
        return player2Score - player1Score >= 2;
    }

    private boolean doesPlayer1Win() {
        return player1Score - player2Score >= 2;
    }

    private boolean doesPlayer2HasAdvantage() {
        return player1Score - player2Score == -1;
    }

    private boolean doesPlayer1HaveAdvantage() {
        return player1Score - player2Score == 1;
    }

    private boolean isAtLeastOneScoreAbove4Points() {
        return player1Score >= 4 || player2Score >= 4;
    }

    private boolean isTied() {
        return player1Score == player2Score;
    }

    private String scoreForWin(String playerName) {
        return "Win for " + playerName;
    }

    private String scoreForAdvantage(String playerName) {
        return "Advantage " + playerName;
    }

    private String getScoreName(int score) {
        return Arrays.asList("Love", "Fifteen", "Thirty", "Forty").get(score);
    }
}