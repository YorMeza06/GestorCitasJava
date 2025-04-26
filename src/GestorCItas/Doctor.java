
package GestorCItas;

public class Doctor {
    
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private int Celular;
    private int Consultorio;
    private String Especialidad;
    private String Horario;
    
    //creacion de metodos get y set
    
    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public int getConsultorio() {
        return Consultorio;
    }

    public void setConsultorio(int Consultorio) {
        this.Consultorio = Consultorio;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

//metodos 
    public void Info_Dcotor(){
        
        System.out.println("Dr." + Nombre +"-"+ ApellidoP);
        System.out.println("Especialidad: " + Especialidad);
        System.out.println("Cell: " + Celular);
        System.out.println("Consultorio: N°" + Consultorio);
        
    }   
    public void Info_Dcotor(String DatosAdicionales){
        
        System.out.println("HORARIO DE ATENCION: " + Horario);
        
    }  
}
