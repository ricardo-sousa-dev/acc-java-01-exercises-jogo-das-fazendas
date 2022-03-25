package com.trybe.acc.java.jogodasfazendas;

public class Circle {
  double PI = 3.14;
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return PI * radius * radius;
  }
}
