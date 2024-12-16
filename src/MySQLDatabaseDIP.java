class MySQLDatabaseDIP implements DatabaseDIP {
    public void conectar() {
        System.out.println("Conectando MySQL...");
    }
}

//D - Dependency Inversion Principle (DIP)
//Dependa de abstrações, não de implementações concretas.