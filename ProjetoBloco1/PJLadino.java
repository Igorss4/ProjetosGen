package ProjetoBloco1;

import java.util.ArrayList;

public class PJLadino {
	
	public static void main(String[] args) {
		
		PerfilJogador ladino = new PerfilJogador("Adaga", 50, 10);
		
		ArrayList<PerfilJogador> perfil = new ArrayList<>();
		
		perfil.add(ladino);
		System.out.println(perfil);
		
		
	}

}
