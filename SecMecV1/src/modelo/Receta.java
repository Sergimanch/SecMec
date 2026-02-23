package modelo;
import java.util.List;
import java.time.LocalDate;

/**
 * Representa una receta médica con la lista de medicamentos.
 *
 * @author Sergio
 */
public class Receta extends EntradaHistorial {
    private List<String> medicamentos;

    /**
     * Constructor de Receta.
     */
    public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos, Gravedad gravedad, Integer coste) {
        super(fecha, idMedico, causa, coste, gravedad);
        this.medicamentos = medicamentos;
    }
    /**
     * Obtiene la lista de medicamentos.
     * @return medicamentos
     */
    public List<String> getMedicamentos() {
        return medicamentos;
    }
    /**
     * Tipo de entrada.
     * @return nombre de la clase
     */
    public String getTipo(){
        return this.getClass().getSimpleName();
    }
    /**
     * Representación en cadena de la receta.
     */
    public String toString(){
        return "Receta:" +
                "\nMedicamentos=" + medicamentos +
                "\nFecha=" + fecha +
                "\nidMedico=" + idMedico +  
                "\nCausa=" + causa +
                "\nGravedad=" + gravedad
                ;
    }
    
}