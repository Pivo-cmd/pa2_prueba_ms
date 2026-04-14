package com.edu.uce.negocio;

public class PedidoService {

    private NotificadorMail notificadorMail = new NotificadorMail();;
    private NotificadorSms notificadorSms = new NotificadorSms();

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());

        System.out.println("Guardando en la base de datos");
        if (pedido.getTotal() < 0) {
            System.out.println("El pedido no puede ser registrado por tener un monto negativo");
        } else if (pedido.getTotal() < 100) {
            notificadorSms.enviar(pedido.getCliente(),
                    "Se ha creado un pedido para ser atendido por un monto de: "
                            + "$" + pedido.getTotal());
        } else {
            notificadorMail.enviar(pedido.getCorreo(),
                    "Se ha creado un pedido para ser atendido por un monto de: "
                            + "$" + pedido.getTotal());
        }
    }
}
