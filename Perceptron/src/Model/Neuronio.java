package Model;

public class Neuronio {
	private double pesos[];
	private int entradas[];
	private int saida;
	private int saidaDesejada;
	private double somatorio;
	
	public Neuronio(int qtdEntrada){
		entradas = new int[qtdEntrada];
		pesos = new double[qtdEntrada];		
	}
	
	void inicializaPesos(){
		for(int i = 0; i < pesos.length;){
			pesos[i] = 0;
			i++;
		}
	}
	
	public int getSaida(){
		
		for(int i = 0; i < entradas.length; i++){
			
			somatorio += (entradas[i] * pesos[i]);		
			
		}
		
		if(somatorio >= 2){
			saida = 1;
		}else if (somatorio < 2) {
			saida = 0;
		}
		return saida;
	}
	
	

	public double[] getPesos() {
		return pesos;
	}

	public void setPesos(double[] pesos) {
		this.pesos = pesos;
	}

	public int[] getEntradas() {
		return entradas;
	}

	public void setEntradas(int[] entradas) {
		this.entradas = entradas;
	}

	public double getSaidaDesejada() {
		return saidaDesejada;
	}

	public void setSaidaDesejada(int saidaDesejada) {
		this.saidaDesejada = saidaDesejada;
	}

	public double getSomatorio() {
		return somatorio;
	}

	public void setSomatorio(double somatorio) {
		this.somatorio = somatorio;
	}

	public void setSaida(int saida) {
		this.saida = saida;
	}
}
