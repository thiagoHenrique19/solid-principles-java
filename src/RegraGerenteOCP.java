class RegraGerenteOCP implements RegraDeCalculoOCP {
    public double calcular(double salarioBase) {
        return salarioBase * 0.8;
    }
}

//O - Open/Closed Principle (OCP)
////Uma classe deve estar aberta para extensão, mas fechada para modificação