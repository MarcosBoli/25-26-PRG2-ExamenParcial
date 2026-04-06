public class Consulta{

    private String fecha;
    private String diagnostico;
    private String tratamiento;
    private Medico mAsignado;
    private Paciente pAsignado;

    public Consulta(String fecha, String diagnostico, String tratamiento, Medico mAsignado, Paciente pAsignado){
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.mAsignado = mAsignado;
        this.pAsignado = pAsignado;
    }

    public Consulta crearConsulta(Paciente paciente, Medico medico, String fecha){
        return new Consulta(fecha, "Pendiente", "Pendiente", medico,paciente);
    }

    public String registrarDyT(String diagnostico, Stringg tratamiento){
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        return "Diagnostico: "+diagnostico+"; Tratamiento: "+tratamiento;
    }
}