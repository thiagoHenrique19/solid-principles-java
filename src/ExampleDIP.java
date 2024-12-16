public class ExampleDIP {
    public static void main(String[] args) {
        DatabaseDIP mysql = new MySQLDatabaseDIP();
        UsuarioServiceDIP serviceDIP = new UsuarioServiceDIP(mysql);
        serviceDIP.salvarUsuario();
    }
}

//D - Dependency Inversion Principle (DIP)
//Dependa de abstrações, não de implementações concretas.