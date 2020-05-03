package cn.xpbootcamp.tennis;

public enum TennisEqualScore {

  LOVE_ALL(0, "Love-All"),
  FIFTEEN_ALL(1, "Fifteen-All"),
  THIRTY_ALL(2, "Thirty-All"),
  DEFAULT(3, "Deuce");

  private int point;
  private String score;

  TennisEqualScore(int point, String score) {
    this.point = point;
    this.score = score;
  }

  public String getScore() {
    return score;
  }
}
