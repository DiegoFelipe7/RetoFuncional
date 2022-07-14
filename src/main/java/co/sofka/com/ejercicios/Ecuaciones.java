package co.sofka.com.ejercicios;

import co.sofka.com.clase.Derivadas;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ecuaciones {
    List<Derivadas> derivadasList;


    public Ecuaciones() {
        this.derivadasList = List.of(
                new Derivadas(3,2),
                new Derivadas(4,3),
                new Derivadas(2,1));
    }

    /**
     *
     * @return  String con la derivada realizada 3x^2 = 9x
     */

    public List<String> derivadas() {
        return derivadasList.stream().map(valor -> {
            String mensaje;
                mensaje ="La derivada de " + valor.getValor() + "X^" + valor.getPotencia() + " es :"+
                        Math.pow(valor.getValor(), valor.getPotencia()) + "X^"+(valor.getPotencia()-1);
            return mensaje;
        }).collect(Collectors.toList());
    }

    /**
     *
     * @return String con la ecuacion realizada  3X^2  =
     */

   public List<String> integrales() {
        return derivadasList.stream().map(valor -> {
            String mensaje;

            if(valor.getValor()/ (valor.getPotencia()+1)==1) {
                mensaje= "La integral de S " + valor.getValor() + "X^" + valor.getPotencia() + " dx " + " es :"
                         + "S" + (valor.getValor() / (valor.getPotencia() + 1)) + "X^" + (valor.getPotencia() + 1) + "+ C";
            }else{
                mensaje= "La integral de S " + valor.getValor() + "X^" + valor.getPotencia() + " dx " + " es :"
                         + "S" + valor.getValor()+ "X^" + (valor.getPotencia() + 1) + "+ C" + " / "+(valor.getPotencia()+1);
            }
            return mensaje;
        }).collect(Collectors.toList());

    }


}

