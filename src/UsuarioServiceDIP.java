class UsuarioServiceDIP {
    private DatabaseDIP database;

    public UsuarioServiceDIP(DatabaseDIP database){
        this.database = database;
    }
    public void salvarUsuario() {
        database.conectar();
        System.out.println("Usuario salvo no banco de dados.");
    }
}

//D - Dependency Inversion Principle (DIP)
//Dependa de abstrações, não de implementações concretas.
