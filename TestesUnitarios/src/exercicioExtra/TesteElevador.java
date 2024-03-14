package exercicioExtra;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteElevador {

	@Test
    public void testEntrarNoElevador() {
        Elevador elevador = new Elevador();
        elevador.setCargaMaxima(1000);
        assertEquals(200.0, elevador.entrarNoElevador(200.0),2);
    }

    @Test
    public void testSairDoElevador() {
        Elevador elevador = new Elevador();
        elevador.setCargaAtual(500.0);
        assertEquals(300.0, elevador.sairDoElevador(200.0),2);
    }

    @Test
    public void testAvaliarPeso() {
        Elevador elevador = new Elevador();
        elevador.setCargaMaxima(1000);
        assertTrue(elevador.avaliarPeso(500.0));
        assertFalse(elevador.avaliarPeso(1500.0));
    }

}
