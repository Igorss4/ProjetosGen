package ProjetoBloco1;

public class PerfilJogador {
	
	private String nome;
	private int vida;
	private int ataque;
	
	
	public PerfilJogador(String a, int v, int at) {
		this.nome=a;
		this.vida=v;
		this.ataque=at;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	
	public String toString() {
		return "Status: "+this.nome+", voce tem "+this.vida
				+" de vida, e seu ataque é "+this.ataque;
	}

}
