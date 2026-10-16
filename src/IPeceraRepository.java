import java.util.List;

public interface IPeceraRepository {
    void guardar(String tipoPecera, double precio);
    List<String> obtenerInventario();
}