package HW2;

/**
 * TestLisInsert to test all scenario of insertBetween method
 * 
 * @author Xiaoxue Du
 *
 */
public class TestListInsert
{

	public static void main(String[] args) throws Exception
	{
		Trip trip1 = new Trip(1, 10, 1.5);
		Trip trip2 = new Trip(2, 5, 2.5);
		Trip trip3 = new Trip(3, 30, 4.5);
		Trip trip4 = new Trip(4, 20, 2.5);
		Trip trip5 = new Trip(5, 12, 3.6);
		DLinkedListADT dLinkedListADT = new DLinkedListADT();
		dLinkedListADT.insertBetween(2, 3, trip1);
		dLinkedListADT.printNextList();
		dLinkedListADT.addLast(trip2);
		dLinkedListADT.addLast(trip3);
		dLinkedListADT.printNextList();
		dLinkedListADT.insertBetween(1, 3, trip4);
		dLinkedListADT.printNextList();
		try
		{
			dLinkedListADT.insertBetween(3, 1, trip4);
			dLinkedListADT.printNextList();
		} catch (Exception e)
		{
			System.out.println(e);
		}

		try
		{
			dLinkedListADT.insertBetween(1, 5, trip4);
			dLinkedListADT.printNextList();
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
