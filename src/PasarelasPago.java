public class TarjetaPago implements IPasarelaPago {
    @Override
    public boolean procesar(double monto) {
        System.out.println("Conectando con pasarela de pago con tarjeta... Procesando $" + monto);
        return true;
    }
}

public class NequiPago implements IPasarelaPago {
    @Override
    public boolean procesar(double monto) {
        System.out.println("Conectando con API de Nequi... Procesando $" + monto);
        return true;
    }
}