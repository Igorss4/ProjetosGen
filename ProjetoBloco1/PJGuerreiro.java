package ProjetoBloco1;

import java.util.ArrayList;

public class PJGuerreiro {
	
	public static void main(String[] args) {
		
		PerfilJogador guerreiro = new PerfilJogador("Maça", 50, 10);
		
		ArrayList<PerfilJogador> perfil = new ArrayList<>();
		
		perfil.add(guerreiro);
		System.out.println(perfil);
		
		
	}

}
