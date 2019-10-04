package du;

/**
 * TestConvertToList to test all scenario of convertToList method.
 * 
 * @author Xiaoxue Du
 *
 */
public class TestConvertToList
{

	public static void main(String[] args) throws Exception
	{
		Trip trip1 = new Trip(1, 100, 1.5);
		Trip trip2 = new Trip(2, 5, 2.5);
		Trip trip3 = new Trip(3, 30, 4.5);
		Trip trip4 = new Trip(4, 200, 2.5);
		Trip[] trips = new Trip[4];
		Trip[] emptyTrips = new Trip[0];
		try
		{
			DLinkedListADT dLinkedListADT = DLinkedListADT.convertToList(emptyTrips);
			dLinkedListADT.printNextList();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		trips[0] = trip1;
		trips[1] = trip2;
		trips[2] = trip3;
		trips[3] = trip4;

		try
		{
			DLinkedListADT dLinkedListADT = DLinkedListADT.convertToList(trips);
			dLinkedListADT.printNextList();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		trips = null;
		try
		{
			DLinkedListADT dLinkedListADT = DLinkedListADT.convertToList(trips);
			dLinkedListADT.printNextList();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
