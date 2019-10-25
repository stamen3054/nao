package HW2;

/**
 * QueueADT implemented all methods in pseudo code.
 * Also implemented additional methods according the requirement.
 * 
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

	//Time complexity: O(n)
	//Space complexity: O(1)
	public boolean isFull()
	{
		if (items.size() == capacity)
		{
			return true;
		}
		return false;
	}
	
	
	//Time complexity: O(n)
	//Space complexity: O(1)
	public boolean isEmpty()
	{
		if (items.size() == 0)
		{
			return true;
		}
		return false;
	}

	//Time complexity: O(1)
	//Space complexity: O(1)
	public void enQueue(Trip trip) throws Exception
	{
		if (isFull())
		{
			throw new Exception("The queue is full");
		}
		items.addLast(trip);
	}
	
	//Time complexity: O(1)
	//Space complexity: O(1)
	public Trip deQueue() throws Exception
	{
		if (isEmpty())
		{
			throw new Exception("The queue is empty");
		}
		return items.deleteFirst();
	}
	
	//Time complexity: O(1)
	//Space complexity: O(1)
	public int size()
	{
		return items.size();
	}
	
	//Time complexity: O(1)
	//Space complexity: O(1)
	public Trip peek() throws Exception
	{
		Trip trip = items.deleteFirst();
		items.addFirst(trip);
		return trip;
	}
	
	//Time complexity: O(n)
	//Space complexity: O(1)
	public void printQueue()
	{
		items.printNextList();
	}
}
