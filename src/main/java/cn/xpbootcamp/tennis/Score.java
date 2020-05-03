package cn.xpbootcamp.tennis;

public enum Score {

  LOVE(0, "Love"),
  FIFTEEN(1, "Fifteen"),
  THIRTY(2, "Thirty"),
  FORTY(3, "Forty");

  private int point;
  private String score;

  Score(int point, String score) {
    this.point = point;
    this.score = score;
  }

  public String getScore() {
    return score;
  }
}
