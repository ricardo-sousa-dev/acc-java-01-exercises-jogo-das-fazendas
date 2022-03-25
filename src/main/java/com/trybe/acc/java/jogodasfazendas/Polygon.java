package com.trybe.acc.java.jogodasfazendas;

abstract class Polygon implements Farm {
  public double base;
  public double height;

  public Polygon(double base, double height) {
    this.base = base;
    this.height = height;
  }
}

// https://www.w3schools.com/java/ref_keyword_implements.asp#:~:text=The%20implements%20keyword%20is%20used,keyword%20(instead%20of%20extends%20)

// interface é uma "classe" abstrata que é usada para agrupar métodos
// relacionados

// Para acessar os métodos da interface, a interface deve ser "implementada"
// (como herdada) por outra classe com a palavra- implements chave (em vez de
// extends). O corpo do método de interface é fornecido pela classe "implement":
