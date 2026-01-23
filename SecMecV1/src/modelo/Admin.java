package modelo;

public class Admin extends Usuario{
    private String idAdmin;
    public Admin(String nombre, String direccion, String dni, String email, String username, String passwordHash, String salt, String idAdmin){
    super(nombre, direccion ,dni, email, username, passwordHash, salt);
    this.idAdmin = idAdmin;
    }
    public String getIdAdmin() {
        return idAdmin;
    }
    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    public void asignarMedicoAPaciente(Paciente paciente, Medico medico){
        paciente.setMedicoAsignado(medico);
    }
    public void agregarPruebaMedicaAHistorial(Paciente paciente, PruebaMedica pruebaMedica){
        paciente.getHistorialMedico().getEntradas().add(pruebaMedica);
    }
}