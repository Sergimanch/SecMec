package modelo;

import java.LocalDate;
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

    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado)
        super(fecha, idMedico, causa);
    this.TipoPrueba = tipoPrueba;
    this.resultado = resultado;

}