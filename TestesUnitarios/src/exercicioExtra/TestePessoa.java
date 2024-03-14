package exercicioExtra;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestePessoa {

	@Test
    public void testGetSetNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        assertEquals("João", pessoa.getNome());
    }

    @Test
    public void testGetSetPeso() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(75.5);
        assertEquals(75.5, pessoa.getPeso(),2);
    }

}
