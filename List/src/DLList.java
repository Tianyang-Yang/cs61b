
public class DLList<Sometype> {
	/** nested class defining the list node */
	public class Node {
		public Sometype item;
		public Node next;
		public Node prev;
		public Node(Sometype nitem, Node nprev, Node nnext) {
			item = nitem;
			prev = nprev;
			next = nnext;
		}
	}
	
	/** the cache of some internal variable */
	/** declare them first without giving them any value; give them value in init method */
	private Node front;
	private int size;
	
	/** the initialization function, assign values to nested objects and variables */
	public DLList(Sometype s) {
		size = 0;
		front.item = s;
		front.next = front;
		front.prev = front; 
		/* it seems like a ring, front -> 1st -> 2nd ... -> the last  -> front */
	}
	
	/** define the method maybe called for DLList */
	public void addFirst(Sometype nitem) {
		/* add node to the front of the list */
		front.next = new Node(nitem,front,front.next);	
		front.next.next.prev = front.next;
		size += 1;
	}
	public void addLast(Sometype nitem) {
		front.prev = new Node(nitem, front.prev, front);
		front.prev.prev.next = front.prev;
		size += 1;
	}
	public Sometype getItem(int i, Node n ) {
		if(i>=size) {
			return null;
		}
		if(i == 0) {
			return n.next.item;
		}
		else if(i > 0 & i<size) {
			return getItem(i-1,n.next);
		}
		return null;
	}
	public void printAll() {
		p = front;
		while(p.next != front) {
			System.out.println(p.next.item);
			p = p.next;
		}
	}
	
	public int getSize() {
		return size;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLList<Integer> l = new DLList<>(0);
		l.addFirst(1);
		l.addLast(2);
		l.addLast(3);
		l.printAll();

	}

}
