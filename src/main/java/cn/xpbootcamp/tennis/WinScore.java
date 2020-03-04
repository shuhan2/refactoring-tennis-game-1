package cn.xpbootcamp.tennis;

public class WinScore {
    private final Player player;
    private Player player2;

    public WinScore(Player player1, Player player2) {
        this.player = player1;
        this.player2 = player2;
    }

    public boolean isApplied() {
        return player.hasWonAgainst(player2) || player2.hasWonAgainst(player);
    }

    public String state() {
        return "Win for " + (player.hasWonAgainst(player2) ? player.getName() : player2.getName());
    }
}
