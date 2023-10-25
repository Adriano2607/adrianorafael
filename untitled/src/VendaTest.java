import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {
    @Test
    public void teste() {
        Venda venda = new Venda(10, 25.5);
        assertEquals(25.5, venda.getValor(), "Valor certo");

    }

    @Test
    public void valorMaiorIgualQueZero(){
        Venda venda = new Venda(null,2.0);
        boolean test = venda.getValor()>=0;

        assertTrue(test, "Maior que zero");
    }

    @Test
    public void qtdMaiorQueZero(){
        Venda venda = new Venda(1,null);
        boolean test = venda.getQuantidade()>0;

        assertTrue(test, "Maior que zero");
    }

    @Test
    public void valorIsNull(){
        Venda venda = new Venda(1,null);

        assertNull(venda.getValor());
    }

    @Test
    public void qtdIsNull() {
        Venda venda = new Venda(null, 1.0);

        assertNull(venda.getQuantidade());
    }
}