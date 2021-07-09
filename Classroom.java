
public class Classroom extends Room
{
	private int chairs;

	public Classroom(int area)
	{
		super(area);
	}

	public Classroom(int area, int chairs)
	{
		super(area);
		this.chairs = chairs;
	}

	public int getChairs()
	{
		return chairs;
	}

	public void setChairs(int chairs)
	{
		this.chairs = chairs;
	}

	@Override
	public int getCapacity()
	{
		return chairs;
	}

	@Override
	public String toString()
	{
		return "Classroom's area in square feet: " + getSquareFeet()
				+ "\nClassroom's capacity: " + getCapacity()
				+ "\nNumder of chairs: " + chairs;
	}

}
