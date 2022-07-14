package co.sofka.com.clase;

import java.util.Objects;

public class Gmail {
    private String correo;
    private String mensaje;
    private boolean enviado;


    public Gmail(String correo, String mensaje) {
        this.correo = correo;
        this.mensaje = mensaje;
        this.enviado = false;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gmail gmail = (Gmail) o;
        return enviado == gmail.enviado && correo.equals(gmail.correo) && mensaje.equals(gmail.mensaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo, mensaje, enviado);
    }

    @Override
    public String toString() {
        return '\n' + "Gmail{" +
                "correo='" + correo + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", enviado=" + enviado +
                '}' + '\n';
    }
}
