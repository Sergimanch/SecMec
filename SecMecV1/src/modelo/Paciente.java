package modelo;

/**
 * Representa a un paciente con historial médico y médico asignado.
 *
 * @author Sergio
 */
public class Paciente extends Persona{
    private HistorialMedico historialMedico;
    private Medico medicoAsignado;
    
    /**
     * Constructor de Paciente.
     */
    public Paciente(String nombre, String dni, String email, String direccion, HistorialMedico historialMedico, Medico medicoAsignado){
        super(nombre, dni, email, direccion);
        this.historialMedico =  historialMedico;
        this.medicoAsignado = medicoAsignado;
    }
    /**
     * Obtiene el historial médico.
     * @return historialMedico
     */
    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }
    /**
     * Establece el historial médico.
     * @param historialMedico Nuevo historial
     */
    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }
    /**
     * Obtiene una descripción del médico asignado.
     * @return cadena con nombre y especialidad, o null si no hay médico
     */
    public String getMedicoAsignado() {
        return medicoAsignado.getNombre() + " - " + medicoAsignado.getEspecialidad();
    }
    /**
     * Asigna un médico al paciente.
     * @param medicoAsignado Médico a asignar
     */
    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }
    /**
     * Representación en cadena del paciente.
     */
    public String toString(){
        return "Paciente: " +
            "\nNombre='" + nombre +
            "\nDni='" + dni +
            "\nEmail='" + email + '\'' +
            "\nDireccion='" + direccion + '\'' +
            "\nHistorialMedico=" + historialMedico.toString() +
            "\nMedicoAsignado=" + getMedicoAsignado();
    }
}