package br.com.proway.padaria;

public class Bolo extends Produto {

	private String sabor;
	private String tamanho;
	private String tipoCobertura;
	
	public Bolo() {
		
	}

	public Bolo(String nome, Double preco, Integer quantidadeEstoque, String dataValidade, String sabor, String tamanho, String tipoCobertura) {
		super(nome, preco, quantidadeEstoque, dataValidade);
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.tipoCobertura = tipoCobertura;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipoCobertura() {
		return tipoCobertura;
	}

	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Sabor: "+ this.sabor);
		System.out.println("Tamanho: "+ this.tamanho);
		System.out.println("Tipo da cobertura: "+ this.tipoCobertura);
	}
	
	public Double calcularPrecoFinal(double percentual) {
		double ValorComDesconto = super.calcularDesconto(percentual);
		
		return ValorComDesconto + 120.0;
	}
	
	
	
	
	
	
}
