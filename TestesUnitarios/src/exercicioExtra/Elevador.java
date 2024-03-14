package exercicioExtra;

public class Elevador {
	private int id;
	private double cargaMaxima;
	private double cargaAtual;
	private boolean sinalAlerta;
	private Calculadora calculadora;
	
	public Elevador() {
        calculadora = new Calculadora(); // Inicializa o objeto Calculadora
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public double getCargaAtual() {
		return cargaAtual;
	}
	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}
	public boolean isSinalAlerta() {
		return sinalAlerta;
	}
	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}
	
	public double entrarNoElevador(double peso) {
		if (avaliarPeso(peso)) {
            cargaAtual = calculadora.somar(cargaAtual, peso);
        }
        return cargaAtual;
	}
	
	public double sairDoElevador(double peso) {
		cargaAtual = calculadora.subtrair(cargaAtual, peso); 
        return cargaAtual;
	}
	
	public boolean avaliarPeso(double peso){
		double cargaFutura = calculadora.somar(cargaAtual, peso);
        if (cargaFutura <= cargaMaxima) {
            sinalAlerta = false;
            return true;
        } else {
            sinalAlerta = true;
            System.out.println("Carga máxima excedida. Não é possível entrar no elevador.");
            return false;
        }
	}
	
	

}
