package HW3;

/**
 * BST structure
 * 
 * @author Xiaoxue Du
 */
public class BST
{
	private Node root;
	private int size;

	public Node find(Node root, int key)
	{
		if (root == null || root.getKey() == key)
		{
			return root;
		}
		if (root.getKey() < key)
		{
			return find(root.right, key);
		} else
		{
			return find(root.left, key);
		}
	}

	private Node insert(Node root, Trip trip)
	{
		if (root == null)
		{
			root = new Node(trip);
			return root;
		}
		if (trip.getKey() < root.getKey())
		{
			root.left = insert(root.left, trip);
		} else if (trip.getKey() > root.getKey())
		{
			root.right = insert(root.right, trip);
		}
		return root;
	}

	private void traverseInOrder(Node root)
	{
		if (root != null)
		{
			traverseInOrder(root.left);
			visit(root);
			traverseInOrder(root.right);
		}
	}

	private void visit(Node n)
	{
		System.out.println(n.trip.toString());
	}

	// external operations
	public double findCost(int key)
	{
		Node node = find(root, key);
		if (node == null)
		{
			return 0;
		} else
		{
			return node.trip.fee * node.trip.days;
		}
	}

	public void insertTrip(Trip trip)
	{
		size++;
		root = insert(root, trip);
	}

	public void printTrips()
	{
		traverseInOrder(root);
	}

	public double returnAverage()
	{
		double sum = calculateSum(root);
		return sum / size;
	}

	private double calculateSum(Node root)
	{
		double sum = 0;
		if (root == null)
		{
			return 0;
		} else
		{
			sum = root.trip.days * root.trip.fee;
			if (root.left != null)
			{
				sum += calculateSum(root.left);
			}
			if (root.right != null)
			{
				sum += calculateSum(root.right);
			}
		}
		return sum;
	}

	public class Node
	{
		private Node left;
		private Node right;
		private Trip trip;

		public Node(Trip trip)
		{
			this.trip = trip;
		}

		public int getKey()
		{
			return trip.getKey();
		}
	}
}
