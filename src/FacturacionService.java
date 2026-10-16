public class FacturacionService {
    public double calcularTotal(double precioBase, ICalculadoraDescuento estrategiaDescuento) {
        return estrategiaDescuento.calcular(precioBase);
    }
}