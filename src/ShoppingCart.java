public class ShoppingCart<T> implements BagInterfaceMyType<T> {
	
	private T[] myBag;
	private int numberOfProducts;
	private static int DEFAULT_CAPACITY = 5;
	
	// Constructor(): initialize bag
	public ShoppingCart() {
		this(DEFAULT_CAPACITY);
	}

	public ShoppingCart(int objCapacity) {
		@SuppressWarnings("unchecked")
		T[] objBag = (T[]) new Item[objCapacity];
		myBag = objBag;
		numberOfProducts = 0;
	}

	// add() - will be used to add a new entry.
	public boolean add(T newEntry) {
		boolean result = true;
		if (isFull()) {
			result = false;
		}
		else {
			myBag[numberOfProducts] = newEntry;
			numberOfProducts++;
		}
		return result;
	}
	
	//toArray() - provides an array of the allocated bag
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Item[numberOfProducts];
		
		for (int i = 0; i < numberOfProducts; i++) {
			result[i] = myBag[i];
		}
		return result;
	}
	
	
	//isFull() - test whether the bag is at the maximum capacity
	public boolean isFull() {
		return numberOfProducts >= myBag.length;
	}
}