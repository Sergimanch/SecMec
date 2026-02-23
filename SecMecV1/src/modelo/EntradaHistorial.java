package modelo;
import java.time.LocalDate;

/**
 * Entrada genérica para el historial médico (pruebas, recetas, etc.).
 *
 * @author Sergio
 */
public abstract class EntradaHistorial {
    public enum Gravedad{
        LEVE,
        MODERADA,
        GRAVE,
        MUY_GRAVE
    }
    private Integer coste;
    protected LocalDate fecha;
    protected String idMedico;
    protected String causa;
    protected Gravedad gravedad;

    /**
     * Constructor de entrada de historial.
     * @param fecha Fecha de la entrada
     * @param idMedico Identificador o número de colegiado del médico
     * @param causa Motivo/causa
     * @param coste Coste asociado
     * @param gravedad Gravedad de la entrada
     */
    public EntradaHistorial(LocalDate fecha, String idMedico, String causa,Integer coste, Gravedad gravedad){
        this.coste = coste;
        this.fecha = fecha;
        this.idMedico = idMedico;
        this.causa = causa;
        this.gravedad = gravedad;
    }

    /**
     * Obtiene la fecha de la entrada.
     * @return fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Obtiene el identificador del médico.
     * @return idMedico
     */
    public String getIdMedico() {
        return idMedico;
    }

    /**
     * Obtiene la causa de la entrada.
     * @return causa
     */
    public String getCausa() {
        return causa;
    }
    /**
     * Obtiene el coste.
     * @return coste
     */
    public Integer getCoste() {
        return coste;
    }
    /**
     * Obtiene la gravedad.
     * @return gravedad
     */
    public modelo.EntradaHistorial.Gravedad getGravedad(){
        return gravedad;
    }
   
    /**
     * Tipo de entrada (clase simple).
     * @return nombre de la clase concreta
     */
    public String getTipo() {
        return this.getClass().getSimpleName();
    }   
}