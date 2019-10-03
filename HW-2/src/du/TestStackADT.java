package du;

/**
 * @author Xiaoxue Du
 *
 */
public class TestStackADT
{
	public static void main(String[] args) throws Exception
	{
		Trip trip1 = new Trip(1, 100, 1.5);
		Trip trip2 = new Trip(2, 5, 2.5);
		Trip trip3 = new Trip(3, 30, 4.5);
		Trip trip4 = new Trip(4, 200, 2.5);
		try
		{
			StackADT stackADT = new StackADT(-1);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		StackADT stackADT = new StackADT(1);
		stackADT.push(trip1);
		stackADT.push(trip2);
		stackADT.printQueue();
		try
		{
			stackADT.push(trip3);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		stackADT.pop();
		stackADT.push(trip3);
		stackADT.printQueue();
		System.out.println("Size: " + stackADT.size());
		System.out.print(stackADT.peek().toString());
	}

}
