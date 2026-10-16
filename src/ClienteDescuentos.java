public class ClienteRegularDescuento implements ICalculadoraDescuento {
    @Override
    public double calcular(double precioBase) {
        return precioBase * 1.19; // IVA estándar
    }
}

public class ClienteVipDescuento implements ICalculadoraDescuento {
    @Override
    public double calcular(double precioBase) {
        return (precioBase * 1.19) * 0.85; // 15% de descuento VIP
    }
}

public class ClienteMayoristaDescuento implements ICalculadoraDescuento {
    @Override
    public double calcular(double precioBase) {
        return (precioBase * 1.19) * 0.75; // 25% de descuento Mayorista
    }
}