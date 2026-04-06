public class Paciente{
    private String nombre;
    private String DNI;
    private boolean historialMedico;

    public Paciente (String nombre, String DNI, boolean historialMedico){
        this.nombre=nombre;
        this.DNI=DNI;
        this.historialMedico=historialMedico;
    }


    public String verHistorial(){
        if(this.historialMedico == false){
            return "El paciente no tiene historial médico";
        }else {
            return "El paciente acude en periodos regulares por enfermedad crónica.";
        }
    }
}