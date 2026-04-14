package com.edu.uce.negocio;

public class NotificadorSms {

 public void enviar(String cliente, String mensaje) {
        System.out.println("Se envia el sms al cliente: " + cliente);
        System.out.println("Con el mensaje es: " + mensaje);
    }
}
