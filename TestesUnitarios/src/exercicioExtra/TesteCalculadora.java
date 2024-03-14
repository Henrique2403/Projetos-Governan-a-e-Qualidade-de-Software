package exercicioExtra;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCalculadora {

	@Test
	public void testeSomar(){
		double nro1 = 5;
		double nro2 = 5;
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 10;
		double resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal,0);
	}
	
	@Test
	public void testeSubtrair(){
		double nro1 = 5;
		double nro2 = 4;
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 1;
		double resultadoReal = calc.subtrair(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal,0);
	}
	
	@Test
	public void testeMultiplicar(){
		double nro1 = 5;
		double nro2 = 4;
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 20;
		double resultadoReal = calc.multiplicar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal,2);
	}
	
	@Test
	public void testeDividir(){
		double nro1 = 4;
		double nro2 = 4;
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 1;
		double resultadoReal = calc.dividir(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal,2);
	}

}
