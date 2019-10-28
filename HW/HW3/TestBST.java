package HW3;

/**
 * Tests for @{@link BST#returnAverage()}, {@link BST#findCost(int)} and
 * {@link BST#insertTrip(Trip)}
 * 
 * @author Xiaoxue Du
 *
 */
public class TestBST
{
	public static void main(String[] args)
	{
		Trip trip1 = new Trip(110, 10, 30);
		Trip trip2 = new Trip(101, 2, 10);
		Trip trip3 = new Trip(311, 5, 50.5);
		Trip trip4 = new Trip(271, 3, 25.3);
		BST bst = new BST();
		bst.insertTrip(trip1);
		bst.insertTrip(trip2);
		bst.insertTrip(trip3);
		bst.insertTrip(trip4);
		System.out.println(bst.findCost(311));
		System.out.println(bst.findCost(101));
		bst.printTrips();
		System.out.println(bst.returnAverage());
	}
}
