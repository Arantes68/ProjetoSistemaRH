package SistemaRH;

/* Classe Abstrata Pessoa */
abstract class Pessoa {
  
/* atributos */	
	String nome;
	int idade;
	
/* Construtor */	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

/* Construtor Padrão */	
	public Pessoa() {
	}

/* Métodos Especiais */	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
