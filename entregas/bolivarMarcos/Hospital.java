public class Hospital{
    private String nombreHospital;
    private Paciente paciente;
    private Medico medico;
    private Consulta consulta;

    public Hospital (String nombreHospital, Paciente paciente, Medico medico, Consulta consulta){
        this.nombreHospital = nombreHospital;
        this.paciente = paciente;
        this.medico = medico;
        this.consulta = consulta;
    }

    public Hospital registrarPaciente(Paciente nuevo){
        return new Hospital(this.nombreHospital, nuevo, this.medico, this.consulta);
    }
    
}