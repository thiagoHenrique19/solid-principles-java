class EntregadorISP implements TrabalhadorISP,MotoristaISP {
    public void trabalhar() {
        System.out.println("Fazendo entregas...");
    }
    public void dirigir() {
        System.out.println("Dirigindo o veiculo...");
    }
}

//I - Interface Segregation Principle (ISP)
//Uma classe não deve ser forçada a implementar métodos que não usa.