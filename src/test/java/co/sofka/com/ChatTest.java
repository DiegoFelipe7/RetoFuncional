package co.sofka.com;
import co.sofka.com.ejercicios.Chat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class ChatTest {
    @InjectMocks
    Chat chat;

    @Test
    void Mensaje() {
        String msj = "ESTO ES UNA PRUEBA PARA EL TEST MISERIA";
       ;
        //assert
     //   Assertions.assertEquals("ESTO ES UNA PRUEBA PARA EL TEST ****", chat.mensaje(msj));
    }

}
