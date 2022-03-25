package com.trybe.acc.java.jogodasfazendas;

public class Triangle extends Polygon {

  public Triangle(double base, double height) {
    super(base, height);
  }

  public double area() {
    return super.base * super.height / 2;
  }
}
