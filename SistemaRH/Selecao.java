package SistemaRH;

/* Classe Seleção herdando a Classe Pessoa */
public class Selecao extends Pessoa{

/* Variaveis Constantes */	
     double salarioPretendido;
     double salarioBase = 2500.0;
     int limitedeCadastro;

/* Construtor */     
	public Selecao(String nome, int idade, double salarioPretendido, int limitedeCadastro) {
		super(nome, idade);
		this.salarioPretendido = salarioPretendido;
		this.limitedeCadastro = limitedeCadastro;
	}

/* Construtor Padrão */	
	public Selecao() {
	}

/* Métodos Especiais */	
	public double getValorPretendido() {
		return salarioPretendido;
	}

	public void setValorPretendido(double valorPretendido) {
		this.salarioPretendido = valorPretendido;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

/* Método para Avaliar Candidatos */
    public void avaliarCandidatos() {
    	if(salarioPretendido <= salarioBase) {
    		System.out.println("Ligar para o candidato");
    	} else if (salarioPretendido == salarioBase) {
    		System.out.println("Ligar para o Candidato com contra proposta");
    	} else {
    		System.out.println("Aguardando o resultado dos demais candidatos");
    	}
    }
     
	
     
}
