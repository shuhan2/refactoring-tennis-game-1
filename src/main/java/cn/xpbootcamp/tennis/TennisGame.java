
package cn.xpbootcamp.tennis;

public class TennisGame {

  private Player player1;
  private Player player2;

  public TennisGame(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public void wonPoint(String playerName) {
    if (playerName.equals(player1.getName())) {
      player1.setPoint(player1.getPoint() + 1);
    } else {
      player2.setPoint(player2.getPoint() + 1);
    }
  }

  public String getScore() {
    if (player1.getPoint() == player2.getPoint()) {
      if (player1.getPoint() < 3) {
        return TennisEqualScore.values()[player1.getPoint()].getScore();
      }
      return TennisEqualScore.DEFAULT.getScore();

    } else if (player1.getPoint() >= 4 || player2.getPoint() >= 4) {
      int differResult = player1.getPoint() - player2.getPoint();

      if (differResult >= 2) {
        return "Win for player1";
      }
      if (differResult <= -2) {
        return "Win for player2";
      }
      return AdvantageScore.ofDifferValue(differResult).getScore();
    } else {
      StringBuilder score = new StringBuilder();
      for (int i = 1; i < 3; i++) {
        if (i == 1) {
          score.append(Score.values()[player1.getPoint()].getScore());
        } else {
          score.append("-").append(Score.values()[player2.getPoint()].getScore());
        }
      }
      return score.toString();
    }
  }
}