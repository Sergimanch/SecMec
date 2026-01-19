package modelo;
import java.util.ArrayList;
import java.LocalDate;

public class Receta extends EntradaHistorial {
    private ArrayList<String> medicamentos;

    public Receta(LocalDate fecha, String idMedico, String causa, ArrayList<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }
}