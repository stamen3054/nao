package du;

/**
 * @author Xiaoxue Du
 *
 */
public class Trip
{
	private int id;
	private int days;
	private double fee;

	public Trip(int id, int days, double fee)
	{
		this.id = id;
		this.days = days;
		this.fee = fee;
	}
	
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getDays()
	{
		return days;
	}

	public void setDays(int days)
	{
		this.days = days;
	}

	public double getFee()
	{
		return fee;
	}

	public void setFee(double fee)
	{
		this.fee = fee;
	}

	@Override
	public boolean equals(Object obj)
	{
		return id == ((Trip) obj).getId();
	}

	@Override
	public String toString()
	{
		return "Trip [id=" + id + ", days=" + days + ", fee=" + fee + "]";
	}
}
