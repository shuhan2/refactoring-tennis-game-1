package cn.xpbootcamp.tennis;

import java.util.Arrays;

public class TiedScore {
    private final Player player;
    private final Player player2;

    public TiedScore(Player player, Player player2) {
        this.player = player;
        this.player2 = player2;
    }

    public boolean isApplied() {
        return player.isTiedWith(player2);
    }

    public String state() {
        return player.getScore() > 2 ? "Deuce" : getScoreName(player.getScore()) + "-All";
    }

    private String getScoreName(int score) {
        return Arrays.asList("Love", "Fifteen", "Thirty", "Forty").get(score);
    }
}
