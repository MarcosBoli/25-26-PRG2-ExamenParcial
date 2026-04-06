public class Main {
    public static void main(String[] args) {
        
        Hospital hospital = new Hospital("Hospital General", null, null, null);

        Medico drJuan = new Medico("Dr. Juan G.", "Cardiología", "L-V 9-13");
        Medico draAna = new Medico("Dra. Ana L.", "Dermatología", "L-V 16-20");

        Paciente maria = new Paciente("María P.", "12345678A", true);
        Paciente pedro = new Paciente("Pedro S.", "876543218", false);
        
        Consulta consultaMaria = new Consulta("01/04/2025", "Gripe", "Medicamento X", draAna, pedro);

        Consulta consultaPedro = new Consulta ("02/04/2025", "Dermatitis", "Crema Z", draAna, pedro);
    }
}
