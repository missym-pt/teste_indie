package indie;

public class Player extends SensibleDummy {
	
	private int fatigue;
	private int atack;
	private int defense;
	private char faceTo;

	public Player(String nome, String cor,int fatigue, int atack, int defense, char faceTo) {
		super(cor, cor);
		this.fatigue=fatigue;
		this.atack=atack;
		this.defense=defense;
		this.faceTo=faceTo;
	}

	public int getFatigue() {
		return fatigue;
	}

	public void setFatigue(int fatigue) {
		this.fatigue = fatigue;
	}

	public int getAtack() {
		return atack;
	}

	public void setAtack(int atack) {
		this.atack = atack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public void setFaceTo(char faceTo){
		this.faceTo=faceTo;
	}
	
	public char getFaceTo(){
		return faceTo;
	}

	public void pass(){
		
	}
	
	public void shot(){
		
	}
}
