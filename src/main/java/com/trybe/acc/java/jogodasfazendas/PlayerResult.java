package com.trybe.acc.java.jogodasfazendas;

public class PlayerResult {
  public String playerName;
  Farm[] farms;

  public PlayerResult(String playerName, Farm[] farms) {
    this.playerName = playerName;
    this.farms = farms;
  }

  public double score() {
    double totalArea = 0;
    for (Farm farm : this.farms) {
      totalArea += farm.area();
    }
    return totalArea;
  }
}
