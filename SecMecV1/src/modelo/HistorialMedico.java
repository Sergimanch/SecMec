package modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class HistorialMedico{
    private List <EntradaHistorial> entradas;
    private LocalDate fechaInicio;
    private Integer coste;

    /**
     * Historial médico que contiene entradas (pruebas, recetas,...)
     *
     * @author Sergio
     */
    public HistorialMedico(List<EntradaHistorial> entradas, LocalDate fechaInicio, Integer coste){
        this.entradas = entradas;
        this.fechaInicio = fechaInicio;
        this.coste = coste;
    }
    /**
     * Obtiene la lista de entradas.
     * @return entradas
     */
    public List<EntradaHistorial> getEntradas() {
        return entradas;
    }

    /**
     * Establece la lista de entradas.
     * @param entradas Nueva lista
     */
    public void setEntradas(List<EntradaHistorial> entradas) {
        this.entradas = entradas;
    }
    /**
     * Coste médico total (placeholder).
     * @return coste
     */
    public Integer costeMedicoTotal(){
        return this.coste;

    }
    /**
     * Coste total (placeholder).
     * @return coste
     */
    public Integer costeTotal(){
        return this.coste;
    }

    /**
     * Obtiene las entradas posteriores a una fecha dada.
     * @param fechaInicio Fecha desde la que filtrar
     * @return Lista filtrada
     */
    public List<EntradaHistorial> obtenerEntradasDesde(LocalDate fechaInicio){
        ArrayList<EntradaHistorial> fechasBuenas = new ArrayList<>();
        for(EntradaHistorial e : entradas){
            if (e.getFecha().isAfter(fechaInicio)){
            fechasBuenas.add(e);
            }
      }
       return fechasBuenas;
    }
    /**
     * Representación en cadena del historial.
     */
    public String toString(){
        return "HistorialMedico:" +
                "\nEntradas=" + entradas +
                "\nEntradas Validas=" + obtenerEntradasDesde(fechaInicio)
            ;
    }
}