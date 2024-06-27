package inventoryManagment;

public class InventoryMain {

	public static void main(String[] args) {
		
		 InventoryManagementSystem ims = new InventoryManagementSystem();

	        // Adding items to inventory
	        ims.addItem(1, "Laptop", 1200.0, 5, "Electronics");
	        ims.addItem(2, "Printer", 300.0, 10, "Electronics");
	        ims.addItem(3, "Chair", 80.0, 20, "Furniture");

	        // Printing all items in inventory
	        ims.printAllItems();

	        // Retrieving an item by itemId
	        Item item = ims.getItemById(1);
	        if (item != null) {
	            System.out.println("Retrieved item: " + item);
	        } else {
	            System.out.println("Item not found.");
	        }

	        // Removing an item by itemId
	        ims.removeItemById(2);

	        // Printing all items in inventory after removal
	        ims.printAllItems();
	    }
	
}
