package du;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Xiaoxue Du
 *
 */
public class DLinkedListADT
{
	private Node front;
	private Node rear;
	private int length;
	private Set<Integer> trips;

	public DLinkedListADT()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
		this.trips = new HashSet<Integer>();
	}

	public void addFirst(Trip trip)
	{
		if (trips.add(trip.getId()))
		{
			Node n = new Node(trip);
			if (front == null)
			{
				front = n;
				rear = n;
			} else
			{
				n.setNext(front);
				front.setPrev(n);
				front = n;
			}
			length++;
		}
	}

	public void addLast(Trip trip)
	{
		if (trips.add(trip.getId()))
		{
			Node n = new Node(trip);
			if (front == null)
			{
				front = n;
				rear = n;
			} else
			{
				rear.setNext(n);
				n.setPrev(rear);
				rear = n;
			}
			length++;
		}
	}

	public Trip deleteFirst() throws Exception
	{
		if (front == null)
		{
			throw new Exception("The list is empty");
		}

		Node n = front;
		if (front == rear)
		{
			front = null;
			rear = null;
		} else
		{
			front = front.getNext();
			front.setPrev(null);
		}

		trips.remove(n.getData().getId());
		length--;
		return n.getData();
	}

	public Trip deleteLast() throws Exception
	{
		if (front == null)
		{
			throw new Exception("The list is empty");
		}

		Node n = rear;
		if (front == rear)
		{
			front = null;
			rear = null;
		} else
		{
			rear = rear.getPrev();
			rear.setNext(null);
		}

		trips.remove(n.getData().getId());
		length--;
		return n.getData();
	}

	public void deleteAll() throws Exception
	{
		while (length > 0)
		{
			deleteLast();
		}
	}

	public int size()
	{
		return length;
	}

	public void printNextList()
	{
		Node n = front;
		while (n != null)
		{
			System.out.println(n.getData().toString());
			n = n.next;
		}
	}

	public void printPrevList()
	{
		Node n = rear;
		while (n != null)
		{
			System.out.println(n.getData().toString());
			n = n.getPrev();
		}
	}

	public double calculatCost(int id)
	{
		Node node = front;
		while (node != null)
		{
			if (node.getData().getId() == id)
			{
				return node.getData().getFee() * node.getData().getDays();
			}
			node = node.getNext();
		}
		return 0;
	}

	public double averageCost()
	{
		double cost = 0;
		Node node = front;
		while (node != null)
		{
			cost += node.getData().getFee() * node.getData().getDays();
			node = node.getNext();
		}
		return cost;
	}

	public static DLinkedListADT convertToList(Trip[] trips) throws Exception
	{
		if (trips == null || trips.length == 0 )
		{
			throw new Exception("The list is empty or null");
		}

		DLinkedListADT dLinkedListADT = new DLinkedListADT();
		for (int i = 0; i < trips.length; i++)
		{
			double cost = trips[i].getFee() * trips[i].getDays();
			if (cost > 100)
			{
				dLinkedListADT.addLast(trips[i]);
			}
		}

		return dLinkedListADT;
	}

	public void insertBetween(int id1, int id2, Trip trip) throws Exception
	{
		if (front == null)
		{
			// empty list
			addFirst(trip);
		} else
		{
			int count = 0;
			int first = -1;
			int second = -1;
			Node node = front;
			while (node != null)
			{
				if (node.getData().getId() == id1)
				{
					first = count;
				} else if (node.getData().getId() == id2)
				{
					second = count;
				}
				node = node.getNext();
				count++;
			}
			if (first >= second)
			{
				throw new Exception("Invalid parameters");
			}
			node = front;
			while (node != null)
			{
				if (node.getData().getId() == id1)
				{
					Node nextNode = node.getNext();
					Node newNode = new Node(trip);
					node.setNext(newNode);
					newNode.setPrev(node);
					newNode.setNext(nextNode);
					nextNode.setPrev(newNode);
				}
				node = node.getNext();
				count++;
			}
		}
	}

	private class Node
	{
		private Trip data;
		private Node next;
		private Node prev;

		public Node(Trip trip)
		{
			this.data = trip;
		}

		public Trip getData()
		{
			return data;
		}

		public Node getNext()
		{
			return next;
		}

		public void setNext(Node next)
		{
			this.next = next;
		}

		public Node getPrev()
		{
			return prev;
		}

		public void setPrev(Node prev)
		{
			this.prev = prev;
		}
	}
}
