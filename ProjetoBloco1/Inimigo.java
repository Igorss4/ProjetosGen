package ProjetoBloco1;

public class Inimigo extends BaseStatus{
	
	double hpGoblin, vidaHeroi;
	
	public double getHpGoblin() {
		return hpGoblin;
	}
	public void setHpGoblin(int hpGoblin) {
		this.hpGoblin = hpGoblin;
	}
	@Override
	public void atacar() {
		this.setHpHeroi((int) (getHpHeroi()-(this.getAtaqueInimigo()-(this.getDefesaHeroi()*0.3))));
		System.out.println("Voce recebeu "+(this.getAtaqueInimigo()-(this.getDefesaHeroi()*0.3))+
				" de dano.\nA sua vida é "+this.getHpHeroi());
		this.setAtaqueInimigo(this.getAtaqueInimigo()+2);
		vidaHeroi=this.vidaHeroi;
		
		
	}
	@Override
	public void defender() {
		this.setDefesaInimigo(getDefesaInimigo()+2);
		
	}
	@Override
	public void especial() {
		
		
	}
	public double getVidaHeroi() {
		return vidaHeroi;
	}
	public void setVidaHeroi(double vidaHeroi) {
		this.vidaHeroi = vidaHeroi;
	}
	public void setHpGoblin(double hpGoblin) {
		this.hpGoblin = hpGoblin;
	}
	
	
	
}
