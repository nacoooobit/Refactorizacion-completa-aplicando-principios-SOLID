public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA REFACTORIZADO (SOLID) ---");

        // 1. Inyección para el Inventario
        IPeceraRepository repo = new MysqlPeceraRepository();
        InventarioService inventarioService = new InventarioService(repo);
        inventarioService.agregarPecera("Pecera Panorámica 100L", 250000.0);

        // 2. Cálculo de Facturación (VIP)
        ICalculadoraDescuento descuentoVip = new ClienteVipDescuento();
        FacturacionService facturacionService = new FacturacionService();
        double totalFinal = facturacionService.calcularTotal(250000.0, descuentoVip);
        System.out.println("Total con descuento VIP e IVA: $" + totalFinal);

        // 3. Procesamiento de Pago y Notificación (Nequi)
        IPasarelaPago pagoNequi = new NequiPago();
        INotificadorService notificador = new EmailNotificador();
        CheckoutService checkout = new CheckoutService(pagoNequi, notificador);
        checkout.procesarCompra(totalFinal, "cliente@correo.com");
    }
}