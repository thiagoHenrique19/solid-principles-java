import com.sun.source.tree.BreakTree;

class QuadradoLSP {
private double lado;

public QuadradoLSP(double lado){
    this.lado = lado;
}
public double calcularArea() {
  return lado * lado;
 }
}
//L - Liskov Substitution Principle (LSP)
//Uma subclasse deve poder substituir sua superclasse sem quebrar o comportamento do sistema.