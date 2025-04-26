
package GestorCItas;

public class RegistroCitas {
    
    public static void main(String[] args) {
      
        
       Doctor Cita = new Doctor();
       
       Cita.setNombre("Javier");
       Cita.setApellidoP("Rodriguez");
       Cita.setEspecialidad("PEDIATRIA");
       Cita.setCelular(924272898);
       Cita.setConsultorio(20);
       Cita.setHorario("\nLun - Vier :" + "\n8:00 am - 12:00 pm ");
       
    ///////////////////////////////////////////   
       
    Paciente datos = new Paciente();
       
       datos.Nombre("Ricardo");
       datos.Dni("924272898");
       datos.Apaterno("Mendoza");
       datos.Amaterno("Jesus");
       datos.Edad(24);
       datos.Telefono("924272898");
       datos.Correo("prueba@upn.edu.pe");
       datos.Direccion("Trujillo-Trujillo");
       
///////////////////////////////////////////////////       
      
       System.out.println("\tREGISTO DE CITA MEDICA");
       System.out.println("====================================");
     
       Cita.Info_Dcotor();
       System.out.println("\nDATOS DEL PACIENTE");
       System.out.println("--------------------");
       datos.mostrar_informacion();
       
       System.out.println("\nDATOS ADICIONALES");
       System.out.println("--------------------");
       Cita.Info_Dcotor("datos adici0nales");
       
       System.out.println("\nGRACIAS - CLINICA SALUD ACTIVA");
       
    }
   
}
