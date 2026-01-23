package controlador;

import java.time.LocalDate;
import java.util.Arrays;
import vista.Vista;
import modelo.*;
import modelo.PruebaMedica.TipoPrueba;

public class Controlador {
    public void iniciar(){
        Vista V = new Vista();
        Admin testAdmin = new Admin("Pepe","4455667788T","gestor@clinica.es","Avenida Paz 33", "usr.gestorClin","pwdGestor999","hashGestor","idAdmin_01");
        Medico testMedico = new Medico("Dra. Gómez","876543210N","gomez.med@centro.es","Plaza Mayor 21", "user.draGomez","passMed789","saltMed","nCol_888", Medico.Especialidad.CARDIOLOGIA);

        V.imprimir("\n--- Usuarios creados ---");
        V.imprimir(testAdmin.toString());
        V.imprimir(testMedico.toString());
        Paciente testPaciente = new Paciente("Lucía","987654321X","lucia.mail@example.com","Av. Sol 103");
        V.imprimir("\n--- Paciente creado ---");
        V.imprimir(testPaciente.toString());
        testAdmin.asignarMedicoAPaciente(testPaciente,testMedico);
        PruebaMedica testPruebaMedica = new PruebaMedica(LocalDate.now(),testMedico.getNumeroColegiado(),"Presión arterial alta", TipoPrueba.ECOGRAFIA,"Hipertensión");
        Receta testReceta = new Receta(LocalDate.now(),testMedico.getNumeroColegiado(),"Presión arterial alta", Arrays.asList("Enalapril 20mg", "Amlodipino 5mg"));
        testPaciente.getHistorialMedico().getEntradas().add(testReceta);
        testAdmin.agregarPruebaMedicaAHistorial(testPaciente, testPruebaMedica);
        V.imprimir("\n--- Realizando prueba médica ---");
        V.imprimir(testPruebaMedica.toString());
        V.imprimir("\n--- Se ha recetado  ---");
        V.imprimir(testReceta.toString());

        V.imprimir("");
        V.imprimir("");
    }
}