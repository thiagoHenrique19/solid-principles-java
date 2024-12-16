class RetanguloLSP {
protected double largura;
protected double altura;

public RetanguloLSP(double largura, double altura){
    this.largura = largura;
    this.altura = altura;
}
public double calcularArea() {
    return largura * altura;
 }
}
//L - Liskov Substitution Principle (LSP)
//Uma subclasse deve poder substituir sua superclasse sem quebrar o comportamento do sistema.