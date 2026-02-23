package modelo;

/**
 * Usuario administrador con capacidades de gestión.
 *
 * @author Sergio
 */
public class Admin extends Usuario{
    private String idAdmin;

    /**
     * Constructor de Admin.
     * @param nombre Nombre
     * @param dni DNI
     * @param email Email
     * @param direccion Dirección
     * @param username Usuario
     * @param passwordHash Hash de contraseña
     * @param salt Salt utilizado
     * @param idAdmin Identificador del admin
     */
    public Admin(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String idAdmin){
    super(nombre, dni, email, direccion, username, passwordHash, salt);
    this.idAdmin = idAdmin;
    }

    /**
     * Obtiene el id del admin.
     * @return idAdmin
     */
    public String getIdAdmin() {
        return idAdmin;
    }

    /**
     * Establece el id del admin.
     * @param idAdmin Identificador
     */
    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    /**
     * Asigna un médico a un paciente.
     * @param paciente Paciente receptor
     * @param medico Médico asignado
     */
    public void asignarMedicoAPaciente(Paciente paciente, Medico medico){
        paciente.setMedicoAsignado(medico);
    }

    /**
     * Añade una prueba médica al historial de un paciente.
     * @param paciente Paciente destino
     * @param pruebaMedica Entrada de prueba médica
     */
    public void agregarPruebaMedicaAHistorial(Paciente paciente, PruebaMedica pruebaMedica){
        paciente.getHistorialMedico().getEntradas().add(pruebaMedica);
    }
}