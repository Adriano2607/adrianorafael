import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    Criador cria = new Criador();
    @Test
    public void validaNull(){
        Cliente testa = cria.cliente("","","","");
        assertNull(testa);
    }

    @Test
    public void validaTelefone(){
        Cliente testa = cria.cliente("Adriano","hiomem","12345678","ali");
        assertNull(testa);
    }



}