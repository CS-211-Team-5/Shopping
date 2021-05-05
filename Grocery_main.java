package GroceryList;

public class Grocery_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GroceryList myList = new GroceryList();
		
		
		GroceryItemOrder item1 = new GroceryItemOrder("rice 1", 5, 9.95 );
		
GroceryItemOrder item11 = new GroceryItemOrder("ben 1", 5, 9.95 );

	GroceryItemOrder item21 = new GroceryItemOrder("taco 1", 5, 9.95 );
	
		GroceryItemOrder item2 = new GroceryItemOrder("salad", 1, 3.00 );
		GroceryItemOrder item3 = new GroceryItemOrder("chips",3, 3.5 );
		GroceryItemOrder item4 = new GroceryItemOrder("cookies",1, 2.00 );
		GroceryItemOrder item5 = new GroceryItemOrder("flowers",1, 9.95 );
		GroceryItemOrder item6 = new GroceryItemOrder("milk",1, 9.95 );
		GroceryItemOrder item7 = new GroceryItemOrder(" gum",1, 9.95 );
		
		
		myList.add(item1);
		myList.add(item2);
		myList.add(item3);
		myList.add(item4);
		myList.add(item5);
		myList.add(item6);
		myList.add(item7);
		
		myList.displayItems();
		//System.out.println("Total = " + myList.getTotalCost());
	}

}
