package modelo;

public class Medico extends PersonalSanitario{
    enum Especialidad {
        CARDIOLOGIA,
        CIRUGIA_GENERAL,
        PEDIATRIA,
        DERMATOLOGIA,
        GINECOLOGIA,
        NEUROLOGIA,
        TRAUMATOLOGIA,
        PSIQUIATRIA
    }
    private Especialidad especialidad;
    public Medico(String nombre, String dni, String email, String dni, String username, String passwordHash, String salt, String numeroColegiado, Especialidad especialidad){
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado)
        this.especialidad = especialidad;
    }

    public modelo.Medico.Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(modelo.Medico.Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}