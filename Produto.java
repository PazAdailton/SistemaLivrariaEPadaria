package br.com.proway.padaria;

public class Produto {
	private String nome;
	private Double preco;
	private Integer quantidadeEstoque;
	private String dataValidade;

	
	public Produto() {
		
	}


	public Produto(String nome, Double preco, Integer quantidadeEstoque, String dataValidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.dataValidade = dataValidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}


	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}


	public String getDataValidade() {
		return dataValidade;
	}


	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Preço: "+ this.preco);
		System.out.println("Quantidade em estoque: "+ this.quantidadeEstoque);
		System.out.println("Data de validade: "+ this.dataValidade);
	}
	
	public boolean verificarDisponibilidade(int quantidade) {
		if(this.quantidadeEstoque >= quantidade) {
		return true;
		}
		else {
		return false;
		}
		
		}
		
		
	public Double calcularDesconto(double percentual) {
		double desconto = percentual / 100 * this.preco;
		return this.preco - desconto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	






}
