package HW3;

public class Trip
{
	int id;
	int days;
	double fee;

	public Trip(int id, int days, double fee)
	{
		this.id = id;
		this.days = days;
		this.fee = fee;
	}
	
	public int getKey()
	{
		return id;
	}

	@Override
	public String toString()
	{
		return "id=" + id + ", days=" + days + ", fee=" + fee;
	}
}
