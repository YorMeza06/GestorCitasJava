package GestorCItas;

public class Pagos {
    public static void main(String[] args) {
        MostrarPagos pago = new MostrarPagos();

        double total1 = pago.calcularPago("Juan Pérez", 150);
        System.out.println("Total a pagar: $" + total1);

        double total2 = pago.calcularPago("Maria Rafael", 180, 20);
        System.out.println("Total con seguro (10%): $" + total2);

        double total3 = pago.calcularPago("Luisa Vargas", 120, 90, true);
        System.out.println("Total con laboratorio y seguro: $" + total3);

        double total4 = pago.calcularPago("Rafael Vargas", 110, 95, false);
        System.out.println("Total con laboratorio sin seguro: $" + total4);
    }
}
