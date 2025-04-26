
package GestorCItas;

public class Paciente {
    private String DNI;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private int edad;
    private String telefono;
    private String correo;
    private String direccion;

    // Constructor sin parámetros
    public Paciente() {
        // Constructor vacío, puedes establecer valores después.
    }

    // Métodos Setters
    public void Dni(String DNI) {
        this.DNI = DNI;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public void Apaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public void Amaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public void Edad(int edad) {
        this.edad = edad;
    }

    public void Telefono(String telefono) {
        this.telefono = telefono;
    }

    public void Correo(String correo) {
        this.correo = correo;
    }

    public void Direccion(String direccion) {
        this.direccion = direccion;
    }

    // Métodos Getters (mantenidos igual)
    public String Dni() {
        return DNI;
    }

    public String Nombre() {
        return nombre;
    }

    public String Apaterno() {
        return apaterno;
    }

    public String Amaterno() {
        return amaterno;
    }

    public int Edad() {
        return edad;
    }

    public String Telefono() {
        return telefono;
    }

    public String Correo() {
        return correo;
    }

    public String Direccion() {
        return direccion;
    }

    // Sobrecarga de Métodos
    public void mostrar_informacion(){
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + apaterno);
        System.out.println("Apellido Materno: " + amaterno);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de contacto: " + telefono);
        System.out.println("Correo Electronico: " + correo);
        System.out.println("Direccion: " + direccion);
    }

    public void mostrar_informacion(Boolean mostrarNombreCompleto) {
        System.out.println("Paciente registrado con nombres: " + nombre + " " + apaterno + " " +
            amaterno + ", Identificado con DNI nro; " + DNI);
    }
    
    public void mostrar_informacion(String otrosDatos){
        System.out.println("Edad: " + edad);
        System.out.println("Numero de contacto: " + telefono);
        System.out.println("Correo Electronico: " + correo);
        System.out.println("Direccion: " + direccion);
    }
}
