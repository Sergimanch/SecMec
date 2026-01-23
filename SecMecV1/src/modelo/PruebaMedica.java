package modelo;

import java.time.LocalDate;
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

    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado){
        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }
    public String getResultado(){
        return resultado;
    }
    public String getTipo(){
        return this.getClass().getSimpleName();
    }
    public String toString(){
        return "PruebaMedica{" +
                "tipoPrueba=" + tipoPrueba +
                ", resultado='" + resultado + '\'' +
                ", fecha=" + fecha +
                ", idMedico='" + idMedico + '\'' +
                ", causa='" + causa + '\'' +
                '}';
    }


}