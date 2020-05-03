
package cn.xpbootcamp.tennis;

public class TennisGameImpl implements TennisGame {

  private int score1 = 0;
  private int score2 = 0;

  public void wonPoint(String playerName) {
    if (playerName.equals("player1")) {
      score1 += 1;
    } else {
      score2 += 1;
    }
  }

  public String getScore() {

    if (score1 == score2) {
      if (score1 < 3) {
        return TennisEqualScore.values()[score1].getSymbol();
      }
      return TennisEqualScore.DEFAULT.getSymbol();

    } else if (score1 >= 4 || score2 >= 4) {
      int differResult = score1 - score2;

      if (differResult >= 2) {
        return "Win for player1";
      }
      if (differResult <= -2) {
        return "Win for player2";
      }
      return AdvantageScore.ofDifferValue(differResult).getScore();
    } else {

      StringBuilder score = new StringBuilder();
      int tempScore;
      for (int i = 1; i < 3; i++) {
        if (i == 1) {
          tempScore = score1;
        } else {
          score.append("-");
          tempScore = score2;
        }
        score.append(Score.values()[tempScore].getSymbol());
      }
      return score.toString();
    }
  }
}