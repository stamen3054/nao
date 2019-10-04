package du;

/**
 * StackADT implemented all methods in pseudo code.
 * Also implemented additional methods according the requirement.
 * 
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
	public void push(Trip trip) throws Exception
	{
		if (isFull())
		{
			throw new Exception("The stack is full");
		}
		items.addLast(trip);
	}

	//Time complexity: O(1)
	//Space complexity: O(1)
	public Trip pop() throws Exception
	{
		if (isEmpty())
		{
			throw new Exception("The queue is empty");
		}
		return items.deleteLast();
	}
	
	//Time complexity: O(n)
	//Space complexity: O(1)
	public int size()
	{
		return items.size();
	}
	
	//Time complexity: O(1)
	//Space complexity: O(1)
	public Trip peek() throws Exception
	{
		Trip trip = items.deleteLast();
		items.addLast(trip);
		return trip;
	}
	
	//Time complexity: O(n)
	//Space complexity: O(1)
	public void printQueue()
	{
		items.printNextList();
	}
}
