package co.sofka.com;

import co.sofka.com.ejercicios.Chat;
import co.sofka.com.ejercicios.Correo;

import java.util.Scanner;

/**
 * clase para ejecutar el programa
 */
public class App 
{
    private static Scanner teclado = new Scanner(System.in);

    public static void main( String[] args )
    {
        /*
        Correo correo = new Correo();
        System.out.println("---- Punto A ----  "+"\n"+"Se encontraron algunos correos repetidos y se eliminaron " +
                ":total correos disponibles "+ correo.correosRepetidos());
        System.out.println("---- Punto B ----"+"\n"+"Correos validos "+ correo.correosConDominio());
        System.out.println("---- Punto C ----"+"\n"+correo.correoConCondiciones());
        System.out.println("---- Punto D ----"+"\n"+"El numero de correos es : "+correo.numeroCorreos()+"\n");
        System.out.println("---- Punto E ----" +"\n"+"El numero de correo gmail : " + correo.numeroDeDominios().get(0)+"\n"+
                "El numero de correos hotmail "+correo.numeroDeDominios().get(1) +"\n"+ "El numero de correos outlook " +
                correo.numeroDeDominios().get(2)+"\n"
        );

        System.out.println("Listado de correo enviados : " +"\n"+correo.correosEnviados());
        */
        /*CASO 2*/
        Chat chat= new Chat();
        System.out.println("Ingresa un mensaje");
        String mensaje_usuario = teclado.nextLine();
        chat.mensaje(mensaje_usuario);
    }
}
