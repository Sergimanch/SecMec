package modelo;

/**
 * Representa un usuario del sistema con credenciales.
 *
 * @author Sergio
 */
public class Usuario extends Persona{
    protected String username;
    protected String passwordHash;
    protected String salt;

    /**
     * Constructor de Usuario.
     * @param nombre Nombre del usuario
     * @param dni DNI del usuario
     * @param email Email
     * @param direccion Dirección
     * @param username Nombre de usuario
     * @param passwordHash Hash de la contraseña
     * @param salt Salt utilizado para el hash
     */
    public Usuario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt){
        super(nombre, dni, email, direccion);
        this.username = username;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    /**
     * Obtiene el nombre de usuario.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre de usuario.
     * @param username Nuevo nombre de usuario
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene el hash de la contraseña.
     * @return passwordHash
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Establece el hash de la contraseña.
     * @param passwordHash Nuevo hash
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Obtiene el salt utilizado.
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Establece el salt.
     * @param salt Nuevo salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * Representación en cadena del usuario.
     * @return String con los datos del usuario
     */
    public String toString(){
        return "Usuario:" +
                "\nUsername=" + username + 
                "\nPasswordHash=" + passwordHash + 
                "\nSalt=" + salt +
                "\nNombre=" + nombre + 
                "\nDNI=" + dni + 
                "\nEmail=" + email + 
                "\nDireccion=" + direccion;
    }


}
