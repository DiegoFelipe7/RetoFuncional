package co.sofka.com.ejercicios;

import co.sofka.com.clase.Mensajes;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class Chat {
    Mensajes msj = new Mensajes();

    /**
     * Metodo que evalua palabras groseas,con el metodo constaint el cual verifica si una cadena contiene una
     *
     * @return
     */
    public void mensaje(String mensajeUsuario) {
        List<String> mensajeFinal = Arrays.asList(mensajeUsuario.toUpperCase().split(" "));
        Flux.fromIterable(mensajeFinal).map(mensaje->{
            if(msj.getPalabras().contains(mensaje)){
                mensaje="****";
            }
            return mensaje;
        }).reduce((x, y) -> x += " " + y).subscribe(m-> System.out.println(m.toString()));
    }

}
