package co.sofka.com.ejercicios;

import co.sofka.com.clase.Gmail;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Correo {
    private final List<Gmail> listaCorreos;
    public Correo(){
        this.listaCorreos = Arrays.asList(
                new Gmail("daniel@gmail.com", "Hola te envio un mensaje"),
                new Gmail("daniel@gmail.com", "Hola te envio un mensaje"),
                new Gmail("andres@gmail.com", "Hola te envio un mensaje"),
                new Gmail("jair@gmail.com", "Hola te envio un mensaje"),
                new Gmail("diego@gmail.com", "Hola te envio un mensaje"),
                new Gmail("felipe@gmail.com", "Hola te envio un mensaje"),
                new Gmail("alejandro@gmail.com", "Hola te envio un mensaje"),
                new Gmail("edwar@gmail.com", "Hola te envio un mensaje"),
                new Gmail("hernan@gmail.com", "Hola te envio un mensaje"),
                new Gmail("raul@gmail.com", "Hola te envio un mensaje"),
                new Gmail("edgar@hotmail.com", "Hola te envio un mensaje"),
                new Gmail("yulieth@hotmail.com", "Hola te envio un mensaje"),
                new Gmail("dora@hotmail.com", "Hola te envio un mensaje"),
                new Gmail("soley@nofunciona.com", "Hola te envio un mensaje"),
                new Gmail("carmen@hotmail.com", "Hola te envio un mensaje"),
                new Gmail("natalia@hotmail.com", "Hola te envio un mensaje"),
                new Gmail("estefania@hotmail.com", "Hola te envio un mensaje"),
                new Gmail("mauricio@hotmail.com", "Hola te envio un mensaje"),
                new Gmail("bairon@hotmail.com", "Hola te envio un mensaje"),
                new Gmail("richar@hotmail.com", "Hola te envio un mensaje"),
                new Gmail("carlos@outlook.com", "Hola te envio un mensaje"),
                new Gmail("jhonny@outlook.com", "Hola te envio un mensaje"),
                new Gmail("cesar@outlook.com", "Hola te envio un mensaje"),
                new Gmail("camilo@outlook.com", "Hola te envio un mensaje"),
                new Gmail("daniel@outlook.com", "Hola te envio un mensaje"),
                new Gmail("hugo@outlook.com", "Hola te envio un mensaje"),
                new Gmail("hugo@outlook.com", "Hola te envio un mensaje"),
                new Gmail("valeria@outlook.com", "Hola te envio un mensaje"),
                new Gmail("valeria@outlook.com", "Hola te envio un mensaje"),
                new Gmail("andrea@noaplica.com", "Hola te envio un mensaje"));
    }

    /**
     * Metodo para eliminar los correos repetido por nombre y dominio
     *
     * @return long de correos
     */
    public long correosRepetidos(){
        return listaCorreos.stream().distinct().count();
    }

    /**
     * Metodo que filtra por los dominios de cada usuario
     *
     * @return List con correos que cumpla con los dominios de gmail.com , hotmail.com , outlook.com
     */
    public List<Gmail> correosConDominio(){
        return listaCorreos.stream().distinct().filter(correo->{
            return correo.getCorreo().endsWith("gmail.com") ||
                   correo.getCorreo().endsWith("hotmail.com") ||
                   correo.getCorreo().endsWith("outlook.com");
        }).collect(Collectors.toList());
    }

    /**
     * Medodo que evalua un correo que tenga arroba punto y sea mayor a 10 caracteres
     *
     * @return List correos que cumplen la condicion
     */
    public List<String> correoConCondiciones() {
        var lista= correosConDominio();
        return lista.stream().distinct().filter(corre ->
                        corre.getCorreo().matches("^[a-zA-Z0-9_!#$%&'*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,4}"))
                .map(correos -> {
                    return correos.getCorreo();
                }).collect(Collectors.toList());
    }

    /**
     * Metodo que devuelve los correo de los usuarios que cumplen el formato solicitado y no esten repetidos
     * @return Integer
     */
    public Integer numeroCorreos(){

        return Math.toIntExact(listaCorreos.stream().count());
    }

    /**
     * Metodo que cuenta los dominios hotmail,gmail,outlook eliminando los correos repetidos
     * @return lista con el numero de correos de cada uno de los dominios
     */

    public List<Integer> numeroDeDominios(){
             Integer gmail= Math.toIntExact(listaCorreos.stream().distinct().filter(correo -> {
                 return correo.getCorreo().endsWith("gmail.com");
             }).count());

            Integer hotmail= Math.toIntExact(listaCorreos.stream().distinct().filter(correo -> {
                return correo.getCorreo().endsWith("hotmail.com");
            }).count());

            Integer outlook= Math.toIntExact(listaCorreos.stream().distinct().filter(correo -> {
                return correo.getCorreo().endsWith("outlook.com");
            }).count());
            List<Integer> valores = Arrays.asList(gmail,hotmail,outlook);
    return valores;
    }

    /**
     * Metodo que envia los correo
     * @return la lista con los correos que cumplen las condiciones
     */

    public List<Gmail> correosEnviados() {
        var correos = correosConDominio();
        return correos.stream().map(correo -> {
            correo.setEnviado(true);
            return correo;
        }).collect(Collectors.toList());
    }
}
