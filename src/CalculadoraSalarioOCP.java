class CalculadoraSalarioOCP {
 public double calcular(RegraDeCalculoOCP regra, double salarioBase) {
     return regra.calcular(salarioBase);
 }
}

//O - Open/Closed Principle (OCP)
//Uma classe deve estar aberta para extensão, mas fechada para modificação.