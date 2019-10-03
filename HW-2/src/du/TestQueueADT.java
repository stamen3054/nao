package du;

/**
 * @author Xiaoxue Du
 *
 */
public class TestQueueADT
{

	public static void main(String[] args) throws Exception
	{
		Trip trip1 = new Trip(1, 100, 1.5);
		Trip trip2 = new Trip(2, 5, 2.5);
		Trip trip3 = new Trip(3, 30, 4.5);
		Trip trip4 = new Trip(4, 200, 2.5);
		try
		{
			QueueADT queueADT = new QueueADT(-1);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		QueueADT queueADT = new QueueADT(1);
		queueADT.enQueue(trip1);
		queueADT.enQueue(trip2);
		queueADT.printQueue();
		try
		{
			queueADT.enQueue(trip3);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		queueADT.deQueue();
		queueADT.enQueue(trip3);
		queueADT.printQueue();
		System.out.println("Size: " + queueADT.size());
		System.out.print(queueADT.peek().toString());
	}

}
