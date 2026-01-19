package modelo;

public class Admin extends Usuario{
    private String idAdmin;
    public Admin(String nombre, String dni, String email, String username, String passwordHash, String salt, String idAdmin)){
    super(nombre, dni, email, direccion, username, passwordHash, salt)
    this.idAdmin = idAdmin;
    }
}
