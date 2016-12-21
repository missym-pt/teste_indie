package indie;

public class Referee extends SensibleDummy {
	
	private int strickness;

	public Referee(String nome, String cor,int strickness) {
		super(cor, cor);
		this.strickness=strickness;
	}

	public int getStrickness() {
		return strickness;
	}

	public void setStrickness(int strickness) {
		this.strickness = strickness;
	}

}
