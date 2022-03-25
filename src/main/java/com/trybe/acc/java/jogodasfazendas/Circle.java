package com.trybe.acc.java.jogodasfazendas;

public class Circle implements Farm {
  public static double PI = 3.14;
  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return PI * radius * radius;
  }
}

// https://www.w3schools.com/java/ref_keyword_implements.asp#:~:text=The%20implements%20keyword%20is%20used,keyword%20(instead%20of%20extends%20)

// interface é uma "classe" abstrata que é usada para agrupar métodos
// relacionados

// Para acessar os métodos da interface, a interface deve ser "implementada"
// (como herdada) por outra classe com a palavra- implements chave (em vez de
// extends). O corpo do método de interface é fornecido pela classe "implement":
