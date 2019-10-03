package du;

/**
 * @author Xiaoxue Du
 *
 */
public class StackADT
{
	private DLinkedListADT items;
	private int capacity;
	
	public StackADT(int min) throws Exception
	{
		if(min <= 0)
		{
			throw new Exception("Invalid parameter");
		}
		items = new DLinkedListADT();
		capacity = min * 2;
	}
	
	public boolean isFull()
	{
		if (items.size() == capacity)
		{
			return true;
		}
		return false;
	}

	public boolean isEmpty()
	{
		if (items.size() == 0)
		{
			return true;
		}
		return false;
	}

	public void push(Trip trip) throws Exception
	{
		if (isFull())
		{
			throw new Exception("The stack is full");
		}
		items.addLast(trip);
	}

	public Trip pop() throws Exception
	{
		if (isEmpty())
		{
			throw new Exception("The queue is empty");
		}
		return items.deleteLast();
	}
	
	public int size()
	{
		return items.size();
	}
	
	public Trip peek() throws Exception
	{
		Trip trip = items.deleteLast();
		items.addLast(trip);
		return trip;
	}
	
	public void printQueue()
	{
		items.printNextList();
	}
}
