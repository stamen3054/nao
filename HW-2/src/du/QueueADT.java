package du;

/**
 * @author Xiaoxue Du
 *
 */
public class QueueADT
{
	private DLinkedListADT items;
	private int capacity;

	public QueueADT(int min) throws Exception
	{
		if (min < 0)
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

	public void enQueue(Trip trip) throws Exception
	{
		if (isFull())
		{
			throw new Exception("The queue is full");
		}
		items.addLast(trip);
	}

	public Trip deQueue() throws Exception
	{
		if (isEmpty())
		{
			throw new Exception("The queue is empty");
		}
		return items.deleteFirst();
	}
	
	public int size()
	{
		return items.size();
	}
	
	public Trip peek() throws Exception
	{
		Trip trip = items.deleteFirst();
		items.addFirst(trip);
		return trip;
	}
	
	public void printQueue()
	{
		items.printNextList();
	}
}
