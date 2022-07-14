package co.sofka.com.clase;

import java.util.Arrays;
import java.util.List;

public class Mensajes {
    private List<String> palabras;
    public Mensajes(){
        this.palabras=Arrays.asList("LOCA", "ESTUPIDO", "BASTARDO", "IMBECIL", "MISERIA", "GUSANO", "ESCORIA","MALDITO");
    }

    public List<String> getPalabras() {
        return palabras;
    }

}
