package GestorPagos;

public class MostrarPagos {

    // M�todo 1: Solo consulta m�dica
    public double calcularPago(String nombrePaciente, double costoConsulta) {
        System.out.println("Paciente: " + nombrePaciente);
        return costoConsulta;
    }

    // M�todo 2: Consulta m�dica con seguro (aplica descuento)
    public double calcularPago(String nombrePaciente, double costoConsulta, double porcentajeDescuento) {
        System.out.println("Paciente: " + nombrePaciente);
        double descuento = costoConsulta * porcentajeDescuento / 100;
        return costoConsulta - descuento;
    }

    // M�todo 3: Consulta + Laboratorio, con o sin seguro
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
