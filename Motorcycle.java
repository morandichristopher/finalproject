package labproject.fin;

public class Motorcycle extends Vehicle{

	private boolean hasWindShield;
	
	public Motorcycle(int topSpeed, int seats, boolean hasWindShield) {
		super(topSpeed, seats);
		setHasWindShield(hasWindShield);
		
	}

	public boolean isHasWindShield() {
		return hasWindShield;
	}

	public void setHasWindShield(boolean hasWindShield) {
		this.hasWindShield = hasWindShield;
	}

	public String toString() {
		return super.toString() + "[hasWindShield=" + hasWindShield + "]";
	}
	
	
}
