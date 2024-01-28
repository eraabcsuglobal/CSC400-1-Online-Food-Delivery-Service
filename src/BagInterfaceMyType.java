public interface BagInterfaceMyType<T> {
	
	boolean add(T newEntry);
	T[] toArray();
	boolean isFull();
	

}