class RegraDesenvolvedorOCP implements RegraDeCalculoOCP {
    public double calcular(double salarioBase) {
        return salarioBase * 0.9;
    }
}

//O - Open/Closed Principle (OCP)
//Uma classe deve estar aberta para extensão, mas fechada para modificação.