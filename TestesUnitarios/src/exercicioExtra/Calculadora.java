package exercicioExtra;

public class Calculadora {
	
	private double resultado = 0;

	public double somar(double n1, double n2) {
		resultado = n1 + n2;
		return resultado;
	}
	public double subtrair(double n1, double n2) {
		resultado = n1 - n2;
		return resultado;
	}
	public double multiplicar(double n1, double n2) {
		resultado = n1 * n2;
		return resultado;
	}
	public double dividir(double n1, double n2) {
		resultado = n1 / n2;
		return resultado;
	}
}
