package Model;

import java.util.Scanner;

public class Rede {

	Scanner entrada = new Scanner(System.in);
	int qtdAtributos;
	int qtdExemplos;
	Neuronio neuronioMCP;

	int[][] entradas = { {1,0,1,0},{0,1,0,1},{1,0,1,0},{0,1,1,1},{0,0,1,1},{0,0,0,1} };
	int[] saidaDesejada = {0,1,0,1,0,1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rede r = new Rede();
		r.iniciarRede();
		r.treinar();
	}

	public void iniciarRede() {

		System.out.println("-------------------------------------");
		System.out.println("----------- INICIANDO REDE ----------");
		System.out.println("-------------------------------------");

		qtdExemplos = entradas.length;
		qtdAtributos = entradas[0].length;
		
		neuronioMCP = new Neuronio(qtdAtributos);

	}

	public void treinar() {
		double erroTotal;
		int cont = 0;
		do {
			System.out.println("-------------------------------------");
			System.out.println("----------- Interação " + cont +  " -------------");
			System.out.println("-------------------------------------");
			erroTotal = 0;
			
			for (int i = 0; i < entradas.length; i++){
				
				neuronioMCP.setEntradas(entradas[i]);
				
				neuronioMCP.calculaSaida();
				System.out.println("saida: " + neuronioMCP.getSaida());
				neuronioMCP.setErro(saidaDesejada[i]);
				erroTotal += Math.abs(neuronioMCP.getErro());
				System.out.println("Erro total: " + erroTotal);
				System.out.println("Erro neuronio: " + neuronioMCP.getErro());
			}
			cont++;
		} while (erroTotal != 0);

	}
	public void executar(){
		int op = 0;
		do{
			
			System.out.println("\n\nINFORME A QUANTIDADE DE ENTRADA");
			
			
		}while(op != 0);
		
		
	}
}
