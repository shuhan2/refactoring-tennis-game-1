package cn.xpbootcamp.tennis;

public class AdvantageScore {
    private final Player player;
    private Player player2;

    public AdvantageScore(Player player1, Player player2) {
        this.player = player1;
        this.player2 = player2;
    }

    public boolean isApplied() {
        return player.hasAdvantageOver(player2) || player2.hasAdvantageOver(player);
    }

    public String state() {
        return "Advantage " + (player.hasAdvantageOver(player2) ? player.getName() : player2.getName());
    }
}
