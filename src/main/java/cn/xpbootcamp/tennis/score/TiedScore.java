package cn.xpbootcamp.tennis.score;

import cn.xpbootcamp.tennis.Player;
import cn.xpbootcamp.tennis.score.AbstractScore;

public class TiedScore extends AbstractScore {

    public TiedScore(Player player, Player player2) {
        super(player, player2);
    }

    public boolean isApplied() {
        return player1.isTiedWith(player2);
    }

    public String state() {
        return player1.getScore() > 2 ? "Deuce" : getScoreName(player1.getScore()) + "-All";
    }

}
