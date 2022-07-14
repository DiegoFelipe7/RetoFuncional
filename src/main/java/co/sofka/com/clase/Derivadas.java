package co.sofka.com.clase;

import java.util.List;

public class Derivadas {
    private Integer valor;
    private Integer potencia;

    public Derivadas(Integer valor, Integer potencia) {
        this.valor = valor;
        this.potencia = potencia;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
}
