package modelo;

public class Paciente extends Persona{
    private HistorialMedico historialMedico;
    private Medico medicoAsignado;
    
    public Paciente(String nombre, String dni, String email, String direccion, HistorialMedico historialMedico, Medico medicoAsignado){
        super(nombre, dni, email, direccion);
        this.historialMedico = historialMedico;
        this.medicoAsignado = medicoAsignado;
    }
    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }
    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }
    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }
    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }
    public String toString(){
        return "Paciente{" +
                "historialMedico=" + historialMedico +
                ", medicoAsignado=" + medicoAsignado +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}