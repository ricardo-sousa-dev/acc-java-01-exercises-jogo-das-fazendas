package com.trybe.acc.java.jogodasfazendas;

public class Rectangle extends Polygon {

  public Rectangle(double base, double height) {
    super(base, height);
  }

  public double area() {
    return base * height;
  }
}
