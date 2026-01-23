package modelo;

import java.util.ArrayList;
public class HistorialMedico{
    private ArrayList <EntradaHistorial> entradas;

    public HistorialMedico(){
        this.entradas = new ArrayList<>();
    }
    public ArrayList<EntradaHistorial> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<EntradaHistorial> entradas) {
        this.entradas = entradas;
    }
    public String toString(){
        return "HistorialMedico{" +
                "entradas=" + entradas +
                '}';
    }
}