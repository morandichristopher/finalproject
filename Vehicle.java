package labproject.fin;

public class Vehicle implements Comparable<Vehicle>{

	private int topSpeed;
	private int seats;
	
	public Vehicle(int topSpeed, int seats) {
		this.topSpeed  = topSpeed;
		this.seats = seats;
		
		
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	
	public String toString() {
		return getClass() + "[topSpeed=" + topSpeed + ", seats=" + seats + "]";
	}

	@Override
	public int compareTo(Vehicle o) {
		if(getTopSpeed() > o.getTopSpeed()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
}
