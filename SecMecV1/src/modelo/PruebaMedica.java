package modelo;

import java.time.LocalDate;

/**
 * Representa una prueba médica realizada.
 *
 * @author Sergio
 */
public class PruebaMedica extends EntradaHistorial{
    public enum TipoPrueba{
        HEMOGRAMA,
        BIOQUIMICA,
        ORINA,
        ECOGRAFIA,
        RADIOLOGIA,
        ELECTROCARDIOGRAMA,
        RESONANCIA_MAGNETICA,
        TOMOGRAFIA
    }
    private TipoPrueba tipoPrueba;
    private String resultado;

    /**
     * Constructor de PruebaMedica.
     */
    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado, Gravedad gravedad, Integer coste){
        super(fecha, idMedico, causa, coste, gravedad);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }

    /**
     * Obtiene el tipo de prueba.
     * @return tipoPrueba
     */
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }
    /**
     * Obtiene el resultado de la prueba.
     * @return resultado
     */
    public String getResultado(){
        return resultado;
    }
    /**
     * Tipo de entrada (clase simple).
     * @return nombre de la clase
     */
    public String getTipo(){
        return this.getClass().getSimpleName();
    }
    /**
     * Representación en cadena de la prueba médica.
     */
    public String toString(){
        return "PruebaMedica: " +
                "\nTipo de Prueba=" + tipoPrueba +
                "\nResultado=" + resultado + 
                "\nFecha=" + fecha +
                "\nidMedico=" + idMedico +
                "\nCausa=" + causa;
    }


}