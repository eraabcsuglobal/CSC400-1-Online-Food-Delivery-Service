public class BagDemo {
	
	public static void main(String[] args) {
		BagInterfaceMyType<Item> myBag = new ShoppingCart<>();
		
		Item Chicken = new Item("Chicken", 100.50);
		Item Pasta = new Item("Pasta", 500);
		Item Macaroni = new Item("Macaroni", 200);
		Item Spinach = new Item("Spinach", 150);
		Item Milk = new Item("Milk", 75);
		Item Bread = new Item("Bread", 50);
		
		System.out.println("\nTesting a bag that starts out empty");
		Item[] itemsInBag1 = { Chicken, Pasta, Macaroni, Spinach};
		testAddl(myBag, itemsInBag1);
		
		System.out.println("\nTesting a bag that starts out empty and will be filled to capacity");
		
		myBag = new ShoppingCart<>(6);
		Item[] itemsInBag2 = {Chicken, Pasta, Macaroni, Spinach, Milk, Bread};
		testAddl(myBag, itemsInBag2);
	
	}
		
	// testAddl() - will add the contents to the Bag.
	private static void testAddl(BagInterfaceMyType<Item> myBag, Item[] items) {
		System.out.print("Adding these items to the bag: ");
		for (int i = 0; i < items.length; i++) {
			if (myBag.add(items[i])) {
				System.out.print(items[i].getName() + " ");
			}
			else {
				System.out.print("\nUnable to add " + items[i] + " to the bag.");
			}
		}
		System.out.println();
		displayBag(myBag);
	}
	
	// displayBag() - will display the contents of the Bag
	private static void displayBag(BagInterfaceMyType<Item> myBag) {
		System.out.println("This bag contains the following shopping products:");
		Item[] bagArray = myBag.toArray();
		for (int i = 0; i < bagArray.length; i++) {
			System.out.print(bagArray[i].getName() + " ");
		}
		System.out.println();
	}

}