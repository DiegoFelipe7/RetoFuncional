package co.sofka.com;
import co.sofka.com.ejercicios.Correo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class CorreoTests {
    @InjectMocks
    Correo correo;


    @Test
    void NumeroDeCorreos(){

        //arrange
        //act
        var valor = correo.correosRepetidos();
        //assert
        Assertions.assertEquals(27, valor);
    }
    @Test
    void CorreosConDominio(){

        //arrange
        //act
        var valor = correo.correosConDominio();
        //assert
        Assertions.assertEquals(25, valor.stream().count());
    }
    @Test
    void correosConCondicion(){

        //arrange
        //act
        var valor = correo.correoConCondiciones();
        //assert
        Assertions.assertEquals(25, valor.stream().count());
    }
    @Test
    void numeroCorreos(){

        //arrange
        //act
        var valor = correo.numeroCorreos();
        //assert
        Assertions.assertEquals(30, valor);

    }
    @Test
    void Dominios(){

        //arrange
        //act
        var valor = correo.numeroDeDominios();
        //assert
        Assertions.assertEquals(9, valor.get(0));
        Assertions.assertEquals(9, valor.get(1));
        Assertions.assertEquals(7, valor.get(2));
    }


}
