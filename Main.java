package br.com.proway.padaria;

public class Main {

	public static void main(String[] args) {
		
	 Pao pao = new Pao("Pão Frânces", 20.0, 15, "23-06-2024", "Integral", 0.3, "Frânces");
	
	 pao.imprimirDados();
	 double valorFinalDoPao = pao.calculcarPrecoFinal(50);
	 System.out.println("Valor final do pão: "+ valorFinalDoPao);
			
	System.out.println("\n");
	 Bolo bolo = new Bolo("Bolo de Cenoura", 50.0, 10, "25-03-2026", "Cenoura", "Médio", "Chocolate");
	 	
	 	bolo.imprimirDados();
	 	double valorFinalBolo = bolo.calcularPrecoFinal(10);
	 	System.out.println("O valor final do bolo é: "+ valorFinalBolo);
	 	
	 
	}

}
