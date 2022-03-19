package ProjetoBloco1;

public class Heroi extends BaseStatus{


	private double vidaInimigo, vidaHeroi;
	
		
	
	

	public double getVidaHeroi() {
		return vidaHeroi;
	}

	public void setVidaHeroi(double vidaHeroi) {
		this.vidaHeroi = vidaHeroi;
	}

	public double getVidaInimigo() {
		return vidaInimigo;
	}

	public void setVidaInimigo(double vidaInimigo) {
		this.vidaInimigo = vidaInimigo;
	}

	@Override
	public void atacar() {
		this.setHpInimigo((int) (this.getHpInimigo()-(this.getAtaqueHeroi()-(this.getDefesaInimigo()*0.30))));
		System.out.println("Voce deu "+(this.getAtaqueHeroi()-(this.getDefesaInimigo()*0.30))+
				" de dano.\nA vida do monstro é "+this.getHpInimigo());
		this.setAtaqueHeroi(this.getAtaqueHeroi()+1);
		vidaInimigo=this.getHpInimigo();
	}

	@Override
	public void defender() {
		
		
	}

	@Override
	public void especial() {
		this.setHpInimigo(80);
		
		
	}

	
	

	
}
