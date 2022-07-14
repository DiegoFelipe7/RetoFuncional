package co.sofka.com;

import co.sofka.com.ejercicios.Chat;
import co.sofka.com.ejercicios.Correo;
import co.sofka.com.ejercicios.Ecuaciones;
import co.sofka.com.util.Menu;
import org.jboss.logging.Logger;

import java.util.Scanner;

/**
 * clase para ejecutar el programa
 */
public class App {
    public static final Logger logger = Logger.getLogger("logger");
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Menu.mensaje();
        int option=teclado.nextInt();
        switch (option){
            case 1:
                Menu.ejercicio1();
                break;

            case 2:
                Menu.ejercicio2();
                break;
            case 3:
                Menu.ejercicio3();
                break;
        }




    }
}
