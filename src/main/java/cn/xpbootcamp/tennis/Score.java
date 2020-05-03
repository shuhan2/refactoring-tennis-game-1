package cn.xpbootcamp.tennis;

public enum Score {

  LOVE(0, "Love"),
  FIFTEEN(1, "Fifteen"),
  THIRTY(2, "Thirty"),
  FORTY(3, "Forty");


  private int score;
  private String symbol;

  Score(int score, String symbol) {
    this.score = score;
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }
}
