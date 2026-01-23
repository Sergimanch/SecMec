package modelo;
import java.util.ArrayList;
import java.time.LocalDate;

public class Receta extends EntradaHistorial {
    private ArrayList<String> medicamentos;

    public Receta(LocalDate fecha, String idMedico, String causa, ArrayList<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }
    public ArrayList<String> getMedicamentos() {
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