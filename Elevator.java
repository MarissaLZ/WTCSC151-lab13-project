
public class Elevator extends Room
{
	private int floor;

	public Elevator(int area) // Elevator starts on the ground floor (1).
	{
		super(area);
		this.floor = 1;
	}

	public int getFloor()
	{
		return floor;
	}

	public void up(int floors)
	{
		this.floor += floors;
	}

	public void down(int floors)
	{
		this.floor--;
	}

	@Override
	public String toString()
	{
		return "Elevator's area in square feet:" + getSquareFeet()
				+ "\nElevator's capacity: " + getCapacity()
				+ "\nEvevator's current floor: " + getFloor();
	}
}
