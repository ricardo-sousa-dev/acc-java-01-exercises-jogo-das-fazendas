package com.trybe.acc.java.jogodasfazendas;

public class PlayerResult {
  public String playerName;
  Farm[] farms;

  public PlayerResult(String playerName, Farm[] farms) {
    this.playerName = playerName;
    this.farms = farms;
  }

  /** Javadoc. */
  public double score() {
    double totalArea = 0;
    for (Farm farm : this.farms) {
      totalArea += farm.area();
    }
    return totalArea;
  }

  // alternative for

  // double totalArea = 0;
  // for(int i = 0; i < farms.length; i++) {
  // totalArea += farms[i].area();
  // }

}
