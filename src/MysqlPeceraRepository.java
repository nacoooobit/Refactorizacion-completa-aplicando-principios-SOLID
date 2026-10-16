import java.util.ArrayList;
import java.util.List;

public class MysqlPeceraRepository implements IPeceraRepository {
    private final List<String> inventarioPeceras = new ArrayList<>();

    @Override
    public void guardar(String tipoPecera, double precio) {
        inventarioPeceras.add(tipoPecera + " - $" + precio);
        System.out.println("[DB MySQL] INSERT INTO peceras (tipo, precio) VALUES ('" + tipoPecera + "', " + precio + ")");
    }

    @Override
    public List<String> obtenerInventario() {
        return inventarioPeceras;
    }
}