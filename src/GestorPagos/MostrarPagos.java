package GestorPagos;

public class MostrarPagos {

    // Método 1: Solo consulta médica
    public double calcularPago(String nombrePaciente, double costoConsulta) {
        System.out.println("Paciente: " + nombrePaciente);
        return costoConsulta;
    }

    // Método 2: Consulta médica con seguro (aplica descuento)
    public double calcularPago(String nombrePaciente, double costoConsulta, double porcentajeDescuento) {
        System.out.println("Paciente: " + nombrePaciente);
        double descuento = costoConsulta * porcentajeDescuento / 100;
        return costoConsulta - descuento;
    }

    // Método 3: Consulta + Laboratorio, con o sin seguro
    public double calcularPago(String nombrePaciente, double costoConsulta, double costoLaboratorio, boolean tieneSeguro) {
        System.out.println("Paciente: " + nombrePaciente);
        double total = costoConsulta + costoLaboratorio;
        if (tieneSeguro) {
            double descuento = total * 0.20; // 20% de descuento
            total -= descuento;
        }
        return total;
    }
}
