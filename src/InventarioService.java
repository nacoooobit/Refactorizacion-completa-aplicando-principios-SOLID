public class InventarioService {
    private final IPeceraRepository repository;

    public InventarioService(IPeceraRepository repository) {
        this.repository = repository;
    }

    public void agregarPecera(String tipo, double precio) {
        repository.guardar(tipo, precio);
    }
}