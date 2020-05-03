
package cn.xpbootcamp.tennis;

public class TennisGameImpl implements TennisGame {

  private int m_score1 = 0;
  private int m_score2 = 0;
  private String player1Name;
  private String player2Name;

  public TennisGameImpl(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public void wonPoint(String playerName) {
    if (playerName.equals("player1")) {
      m_score1 += 1;
    } else {
      m_score2 += 1;
    }
  }

  public String getScore() {

    if (m_score1 == m_score2) {
      if (m_score1 < 3) {
        return TennisEqualScore.values()[m_score1].getSymbol();
      } else {
        return TennisEqualScore.DEFAULT.getSymbol();
      }

    } else if (m_score1 >= 4 || m_score2 >= 4) {
      int minusResult = m_score1 - m_score2;
      if (minusResult == 1) {
        return "Advantage player1";
      } else if (minusResult == -1) {
        return "Advantage player2";
      } else if (minusResult >= 2) {
        return "Win for player1";
      } else {
        return "Win for player2";
      }
    } else {

      StringBuilder score = new StringBuilder();
      int tempScore;
      for (int i = 1; i < 3; i++) {
        if (i == 1) {
          tempScore = m_score1;
        } else {
          score.append("-");
          tempScore = m_score2;
        }
        score.append(Score.values()[tempScore].getSymbol());
      }
      return score.toString();
    }
  }
}