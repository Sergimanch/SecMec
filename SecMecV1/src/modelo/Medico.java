package modelo;

/**
 * Representa a un médico con una especialidad.
 *
 * @author Sergio
 */
public class Medico extends PersonalSanitario{
    public enum Especialidad {
        CARDIOLOGIA,
        CIRUGIA_GENERAL,
        PEDIATRIA,
        DERMATOLOGIA,
        GINECOLOGIA,
        NEUROLOGIA,
        TRAUMATOLOGIA,
        PSIQUIATRIA
    }
    private Especialidad especialidad;
    /**
     * Constructor de Medico.
     */
    public Medico(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado, Especialidad especialidad){
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado);
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la especialidad del médico.
     * @return especialidad
     */
    public modelo.Medico.Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del médico.
     * @param especialidad Nueva especialidad
     */
    public void setEspecialidad(modelo.Medico.Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    /**
     * Representación en cadena del médico.
     */
    public String toString(){
        return "Medico:" +
                "\nEspecialidad=" + especialidad +
                "\nNumero de Colegiado='" + numeroColegiado + '\'' +
                "\nUsername='" + username + '\'' +
                "\nPasswordHash='" + passwordHash + '\'' +
                "\nSalt='" + salt + '\'' +
                "\nNombre='" + nombre + '\'' +
                "\nDNI='" + dni + '\'' +
                "\nEmail='" + email + '\'' +
                "\nDireccion='" + direccion;
    }
}