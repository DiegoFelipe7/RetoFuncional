package co.sofka.com.ejercicios;

import co.sofka.com.clase.Derivadas;

import java.util.List;
import java.util.stream.Collectors;

public class Ecuaciones {
    List<Derivadas> derivadasList;


    public Ecuaciones() {
        this.derivadasList =List.of(
                new Derivadas(3,2),
                new Derivadas(4,2),
                new Derivadas(2,2));
    }

    public List<String> derivadas(){
       return  derivadasList.stream().map(valor->{

            return "La derivada de "+valor.getValor()+"X^"+valor.getPotencia()+" es :"+
                    Math.pow(valor.getValor(), valor.getPotencia())+"X^"+valor.getPotencia();
        }).collect(Collectors.toList());
    }

    public List<String> integrales(){
        return  derivadasList.stream().map(valor->{
            return "La integral de S "+valor.getValor()+"X^"+valor.getPotencia() +" dx ";
        }).collect(Collectors.toList());
    }

    /*+" es :"+
                    Math.pow(valor.getValor(), valor.getPotencia())+"X^"+valor.getPotencia();*/
}
