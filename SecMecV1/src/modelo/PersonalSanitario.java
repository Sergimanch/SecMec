package modelo;

/**
 * Representa a personal sanitario con número de colegiado.
 *
 * @author Sergio
 */
public abstract class PersonalSanitario extends Usuario{
    protected String numeroColegiado;

    /**
     * Constructor de PersonalSanitario.
     */
    public PersonalSanitario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado){
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.numeroColegiado = numeroColegiado;
    }

    /**
     * Obtiene el número de colegiado.
     * @return numeroColegiado
     */
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    /**
     * Establece el número de colegiado.
     * @param numeroColegiado Nuevo número
     */
    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
}