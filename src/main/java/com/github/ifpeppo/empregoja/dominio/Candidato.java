package negocio;

public class Candidato {
	private String Nome;
	private int Idade;
	
	public Candidato(String nome, int idade){
		this.Nome = nome;
		this.Idade = idade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}
	
}