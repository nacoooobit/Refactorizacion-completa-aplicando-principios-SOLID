public class EmailNotificador implements INotificadorService {
    @Override
    public void notificar(String destino, String mensaje) {
        System.out.println("Enviando correo SMTP a " + destino + ": " + mensaje);
    }
}