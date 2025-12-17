package modelo;

public class Admin extends Usuario{
    private String idAdmin;
    public Admin(String nombre, String dni, String email, String dni, String username, String passwordHash, String salt, String idAdmin)){
    this.idAdmin = idAdmin;
    }
}
