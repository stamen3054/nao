package HW2;

/**
 * TestDLinkedList to test all scenario of DlinkedListADT.
 * 
 * @author Xiaoxue Du
 *
 */
public class TestDLinkedList
{
	public static void main(String[] args) throws Exception
	{
		Trip trip1 = new Trip(1, 10, 1.5);
		Trip trip2 = new Trip(2, 5, 2.5);
		Trip trip3 = new Trip(3, 30, 4.5);
		Trip trip4 = new Trip(4, 20, 2.5);
		Trip tripDuplicate = new Trip(1, 100, 11.5);
		DLinkedListADT dLinkedListADT = new DLinkedListADT();
		dLinkedListADT.addFirst(trip1);
		dLinkedListADT.printNextList();
		dLinkedListADT.addFirst(trip2);
		dLinkedListADT.printNextList();
		dLinkedListADT.addLast(trip3);
		dLinkedListADT.printNextList();
		dLinkedListADT.addLast(trip4);
		dLinkedListADT.printNextList();
		dLinkedListADT.deleteFirst();
		dLinkedListADT.printNextList();
		dLinkedListADT.deleteLast();
		dLinkedListADT.printNextList();
		dLinkedListADT.addFirst(tripDuplicate);
		dLinkedListADT.printNextList();
		System.out.println(dLinkedListADT.calculateCost(1));
		System.out.println(dLinkedListADT.averageCost());
		dLinkedListADT.deleteAll();
		System.out.println("size of the list: " + dLinkedListADT.size());
	}
}
