package br.com.proway.padaria;

public class Pao extends Produto{
	
	private String tipoFarinha;
	private Double peso;
	private String tipoPao;
	
	public Pao() {
		
	}

	public Pao(String nome, Double preco, Integer quantidadeEstoque, String dataValidade, String tipoFarinha, Double peso, String tipoPao) {
		super(nome, preco, quantidadeEstoque, dataValidade);
		this.tipoFarinha = tipoFarinha;
		this.peso = peso;
		this.tipoPao = tipoPao;
	}

	public String getTipoFarinha() {
		return tipoFarinha;
	}

	public void setTipoFarinha(String tipoFarinha) {
		this.tipoFarinha = tipoFarinha;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getTipoPao() {
		return tipoPao;
	}

	public void setTipoPao(String tipoPao) {
		this.tipoPao = tipoPao;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Farinha: "+ this.tipoFarinha);
		System.out.println("Peso farinha: "+ this.peso);
		System.out.println("Tipo do Pão: "+ this.tipoPao);
	}
	
	public Double calculcarPrecoFinal(double percentual) {
		double valorComDesconto = super.calcularDesconto(percentual);
		
		return valorComDesconto + 10.0;
	}
	
}
