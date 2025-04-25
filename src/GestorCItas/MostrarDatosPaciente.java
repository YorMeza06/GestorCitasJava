
package GestorCItas;

public class MostrarDatosPaciente {
    public static void main(String[] args) {
        // Crear un objeto de tipo Paciente usando el constructor sin parámetros
        Paciente paciente1 = new Paciente();

        // Asignar los valores uno por uno con los setters
        paciente1.Dni("71466345");
        paciente1.Nombre("Yorman");
        paciente1.Apaterno("Meza");
        paciente1.Amaterno("Melquiades");
        paciente1.Edad(30);
        paciente1.Telefono("991752626");
        paciente1.Correo("Y.meza06@hotmail.com");
        paciente1.Direccion("Calle Falsa 123");

        // Mostrar toda la información del paciente
        System.out.println("Mostrar toda la información del paciente:");
        paciente1.mostrar_informacion();

        System.out.println("--------------------------------------------");

        // Mostrar solo el nombre completo del paciente
        System.out.println("Mostrar nombre completo del paciente:");
        paciente1.mostrar_informacion(true);

        System.out.println("--------------------------------------------");

        // Mostrar detalles adicionales del paciente
        System.out.println("Mostrar otros detalles del paciente:");
        paciente1.mostrar_informacion("Otros datos");

        System.out.println("--------------------------------------------");
    }
        // Crear otro objeto de tipo Paciente con diferente información
}
