package ProjetoBloco1;

import java.util.ArrayList;

public class PJMago {
	
	public static void main(String[] args) {
		
		PerfilJogador mago = new PerfilJogador("Cajado", 50, 10);
		
		ArrayList<PerfilJogador> perfil = new ArrayList<>();
		
		perfil.add(mago);
		System.out.println(perfil);
		
		
	}

}
