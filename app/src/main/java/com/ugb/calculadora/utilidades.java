package com.ugb.calculadora;

import java.util.Base64;

public class utilidades {
    static String urlConsulta = "http://192.168.85.68:5984/karen/_design/lara/_view/carrillo";
    static String urlMto = "http://192.168.85.68:5984/karen";
    static String user = "admin";
    static String passwd = "2013";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}