package com.edu.uce.negocio;

public class NotificadorWhatsApp {

    public void enviar(String cliente, String mensaje) {
        System.out.println("Se envia un mensaje por WhatsApp al cliente: " + cliente);
        System.out.println("Con el mensaje: " + mensaje);
    }
}
