package banking;

public enum AcType {
	SAVING(10000),CURRENT(5000),FD(2000),LOAN(50000);
	
	private double minBalance;
	
	private AcType(double minBalance ) {
		this.minBalance=minBalance;
	}

	@Override
	public String toString(){
		return name()+"  "+minBalance;
		
	}
	
	public double getMinBalance() {
		return minBalance;
	}

}
