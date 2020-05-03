package cn.xpbootcamp.tennis;

public enum TennisEqualScore {

  LOVE_ALL(0, "Love-All"),
  FIFTEEN_ALL(1, "Fifteen-All"),
  THIRTY_ALL(2, "Thirty-All"),
  DEFAULT(3, "Deuce");

  private int score;
  private String symbol;

  TennisEqualScore(int score, String symbol) {
    this.score = score;
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }
}
