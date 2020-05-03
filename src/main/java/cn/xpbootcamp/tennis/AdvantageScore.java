package cn.xpbootcamp.tennis;

public enum  AdvantageScore {
  ADVANTAGE_PLAYER1(1, "Advantage player1"),
  ADVANTAGE_PLAYER2(-1, "Advantage player2");

  private int differValue;
  private String score;

  AdvantageScore(int differValue, String score) {
    this.differValue = differValue;
    this.score = score;
  }

  public static AdvantageScore ofDifferValue(int differValue) {
    if (differValue == 1) {
      return ADVANTAGE_PLAYER1;
    }
    return ADVANTAGE_PLAYER2;
  }


  public String getScore() {
    return score;
  }
}
