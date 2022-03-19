package ProjetoBloco1;

public abstract class  BaseStatus implements Acoes{

	private String nome;
	private double hpHeroi=60, hpInimigo=50;
	private double ataqueHeroi=16, ataqueInimigo=13, defesaHeroi=14, defesaInimigo=10;
	private double maca=0, adaga=0, espada=0;
	
	
	
	public void setHpHeroi(double hpHeroi) {
		this.hpHeroi = hpHeroi;
	}
	public void setHpInimigo(double hpInimigo) {
		this.hpInimigo = hpInimigo;
	}
	public void setAtaqueHeroi(double ataqueHeroi) {
		this.ataqueHeroi = ataqueHeroi;
	}
	public void setAtaqueInimigo(double ataqueInimigo) {
		this.ataqueInimigo = ataqueInimigo;
	}
	public void setDefesaHeroi(double defesaHeroi) {
		this.defesaHeroi = defesaHeroi;
	}
	public void setDefesaInimigo(double defesaInimigo) {
		this.defesaInimigo = defesaInimigo;
	}
	public void setMaca(double maca) {
		this.maca = maca;
	}
	public void setAdaga(double adaga) {
		this.adaga = adaga;
	}
	public void setEspada(double espada) {
		this.espada = espada;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getHpHeroi() {
		return hpHeroi;
	}
	public double getHpInimigo() {
		return hpInimigo;
	}
	public double getAtaqueHeroi() {
		return ataqueHeroi;
	}
	public double getAtaqueInimigo() {
		return ataqueInimigo;
	}
	public double getDefesaHeroi() {
		return defesaHeroi;
	}
	public double getDefesaInimigo() {
		return defesaInimigo;
	}
	public double getMaca() {
		return maca;
	}
	public double getAdaga() {
		return adaga;
	}
	public double getEspada() {
		return espada;
	}
	public void soma(int x,int y) {
		 this.maca=(x+y);
		System.out.println("A maça tem "+maca+" de atributo defesa");
		this.defesaHeroi= this.defesaHeroi+this.maca;
	}
	public void soma(int x, int y, int z) {
		this.espada=(x+y+z);
		System.out.println("A espada tem "+espada+" de atributo vida");
		this.hpHeroi= this.hpHeroi+this.espada;
		
	}
	public void soma(int w,int x, int y, int z) {
		this.adaga=(w+x+y+z);
		System.out.println("A adaga tem "+adaga+" de atributo ataque");
		this.ataqueHeroi= this.ataqueHeroi+this.adaga;
	
	}
	
	
}
