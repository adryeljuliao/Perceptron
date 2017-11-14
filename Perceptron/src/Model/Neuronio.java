package Model;

public class Neuronio {
	private double pesos[];
	private int entradas[];
	private int saida;
	private int erro;

	public Neuronio(int qtdEntrada) {
		entradas = new int[qtdEntrada];
		pesos = new double[qtdEntrada];
		inicializaPesos();
	}

	private void inicializaPesos() {
		for (int i = 0; i < pesos.length; i++) {
			pesos[i] = 0;
			
		}
	}

	public void setErro(int saidaDesejada) {

		erro = saidaDesejada - saida;

		if (erro != 0) {
			atualizaPesos();
		}

	}

	public void atualizaPesos() {

		for (int i = 0; i < pesos.length; i++) {

			pesos[i] = pesos[i] + 0.3 * erro * entradas[i];

		}

	}

	public void calculaSaida() {
		int somatorio = 0;

		for (int i = 0; i < entradas.length; i++) {

			somatorio += (entradas[i] * pesos[i]);

		}

		if (somatorio > 0) {
			saida = 1;
		} else {
			saida = 0;
		}
		System.out.println(saida);


	}

	 
	public void setEntradas(int[] entradas) {
		this.entradas = entradas;
	}



	public int getSaida() {
		return saida;
	}

	public int getErro() {
		return erro;
	}
}
