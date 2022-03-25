package com.trybe.acc.java.jogodasfazendas;

public class Square implements Farm {
  public double side;

  public Square(double side) {
    this.side = side;
  }

  public double area() {
    return side * side;
  }
}

// https://www.w3schools.com/java/ref_keyword_implements.asp#:~:text=The%20implements%20keyword%20is%20used,keyword%20(instead%20of%20extends%20)

// interface é uma "classe" abstrata que é usada para agrupar métodos
// relacionados

// Para acessar os métodos da interface, a interface deve ser "implementada"
// (como herdada) por outra classe com a palavra- implements chave (em vez de
// extends). O corpo do método de interface é fornecido pela classe "implement":
