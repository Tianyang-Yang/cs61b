/** remember to use <> to declare the formal type */
public class GList<Item> {
	/** This is a Generic list from array 
	 * The formal type is Item
	 * */
	private int size;
	private Item[] items;
	
	public GList() {
		items = (Item[]) new Object[100];
		/* the length (space) of an created array in Java cannot be changed
		 * the only way to change it is to create a new longer array and do arrayCopy */
		size =0;
	}
	
	public void resize(int n) {
		Item[] a =(Item[]) new Object[n];
		if(n > size) {
			System.arraycopy(items, 0, a, 0, size);
			items = a;
		}
		else if(n <size) {
			System.arraycopy(items, 0, a, 0, n);
			items = a;
		}
	}
	
	public void addLast(Item x) {
		if(items.length>=size) {
			/* This is a tricky way to speed the resizing up to O(log n) time
			 * and this is the method used by Python list
			 * */
			resize(size*2);
		}
		items[size] = x;
		size += 1;
	}
	
	public Item getItem(int i) {
		/*the index start from 0 */
		return items[i];
	}
	
	public int size() {
		return size;
	}
	 public Item getLast() {
		 return items[size-1];
	 }
	 
	 public Item removeLast() {
		 Item x = getLast();
		 size -=1;
		 return x;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
