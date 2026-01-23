package modelo;
import java.util.List;
import java.time.LocalDate;

public class Receta extends EntradaHistorial {
    private List<String> medicamentos;

    public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }
    public List<String> getMedicamentos() {
        return medicamentos;
    }
    public String getTipo(){
        return this.getClass().getSimpleName();
    }
    public String toString(){
        return "Receta{" +
                "medicamentos=" + medicamentos +
                ", fecha=" + fecha +
                ", idMedico='" + idMedico + '\'' +
                ", causa='" + causa + '\'' +
                '}';
    }
}