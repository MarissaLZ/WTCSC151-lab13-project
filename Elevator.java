
public class Elevator extends Room {
	private int floor;
	
	public Elevator(int area) {
		super(area);
		floor = 1;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public void up(int floors) {
		floor += floors;
	}
	
	public void down(int floors) {
		if (floor > 1) {
			if (floor - floors <= 1) {
				floor = 1;
			}
			else {
				floor -= floors;
			}
		}
	}
	@Override
	public String toString() {
		return "Elevator's area in square feet:" + getSquareFeet() + 
				"\nElevator's capacity: " + getCapacity() + 
				"\nEvevator's current floor: " + getFloor();
	}
}
