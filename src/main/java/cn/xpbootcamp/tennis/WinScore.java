package cn.xpbootcamp.tennis;

public class WinScore extends AbstractScore {

    public WinScore(Player player1, Player player2) {
        super(player1, player2);
    }

    public boolean isApplied() {
        return player1.hasWonAgainst(player2) || player2.hasWonAgainst(player1);
    }

    public String state() {
        return "Win for " + (player1.hasWonAgainst(player2) ? player1.getName() : player2.getName());
    }
}
