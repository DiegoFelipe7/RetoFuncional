package co.sofka.com.util;

import co.sofka.com.ejercicios.Chat;
import co.sofka.com.ejercicios.Correo;
import co.sofka.com.ejercicios.Ecuaciones;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Menu {
    public static final Logger logger = Logger.getLogger("logger");
    private static Scanner teclado = new Scanner(System.in);
    public static void mensaje() {
        logger.info("-------menu-----" + "\n"+
                "1.Ejercicio"+ "\n"+
                "2.Ejercicio"+ "\n"+
                "3.Ejercicio");
    }
    public static void ejercicio1(){
        logger.info("------------------Ejercicio 1--------------------");
        Correo correo = new Correo();
        logger.info("---- Punto A ----  " + "\n" + "Se encontraron algunos correos repetidos y se eliminaron " +
                ":total correos disponibles " + correo.correosRepetidos());
        logger.info("---- Punto B ----" + "\n" + "Correos validos " + correo.correosConDominio());
        logger.info("---- Punto C ----" + "\n" + correo.correoConCondiciones());
        logger.info("---- Punto D ----" + "\n" + "El numero de correos es : " + correo.numeroCorreos() + "\n");
        logger.info("---- Punto E ----" + "\n" + "El numero de correo gmail : " + correo.numeroDeDominios().get(0) + "\n" +
                "El numero de correos hotmail " + correo.numeroDeDominios().get(1) + "\n" + "El numero de correos outlook " +
                correo.numeroDeDominios().get(2) + "\n");
        logger.info("Listado de correo enviados : " + "\n" + correo.correosEnviados());
        logger.info("--------------------------------------" + "\n");
    }
    public static void ejercicio2(){
        Chat chat = new Chat();
        logger.info("------------------Ejercicio 2--------------------");
        logger.info("Ingresa un mensaje");
        String mensaje_usuario = teclado.nextLine();
        chat.mensaje(mensaje_usuario);
        logger.info("--------------------------------------" + "\n");
     }

     public static void ejercicio3(){

         logger.info("------------------Derivadas  --------------------");
         Ecuaciones ecuaciones = new Ecuaciones();
         var derivadas= ecuaciones.derivadas();
         derivadas.forEach(logger::info);
         logger.info("--------------------------------------" + "\n");

         logger.info("------------------Integral  --------------------");

         logger.info("--------------------------------------" + "\n");
     }

}
