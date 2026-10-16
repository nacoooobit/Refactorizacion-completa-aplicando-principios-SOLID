public class CheckoutService {
    private final IPasarelaPago pasarelaPago;
    private final INotificadorService notificador;

    public CheckoutService(IPasarelaPago pasarelaPago, INotificadorService notificador) {
        this.pasarelaPago = pasarelaPago;
        this.notificador = notificador;
    }

    public void procesarCompra(double monto, String emailCliente) {
        boolean exito = pasarelaPago.procesar(monto);
        if (exito) {
            notificador.notificar(emailCliente, "Su pago de $" + monto + " fue exitoso.");
        }
    }
}