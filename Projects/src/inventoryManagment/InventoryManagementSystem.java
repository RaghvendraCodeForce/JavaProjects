package inventoryManagment;

import java.util.HashMap;

public class InventoryManagementSystem {
    // HashMap to store items (itemId as key, Item object as value)
    private HashMap<Integer, Item> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    // Method to add a new item to the inventory
    public void addItem(int itemId, String itemName, double price, int quantity, String category) {
        Item newItem = new Item(itemId, itemName, price, quantity, category);
        inventory.put(itemId, newItem);
        System.out.println("Item added successfully: " + newItem);
    }

    // Method to retrieve an item by itemId
    public Item getItemById(int itemId) {
        return inventory.get(itemId);
    }

    // Method to print all items in the inventory
    public void printAllItems() {
        System.out.println("List of all items in inventory:");
        for (Item item : inventory.values()) {
            System.out.println(item);
        }
    }

    // Method to remove an item from inventory by itemId
    public void removeItemById(int itemId) {
        Item removedItem = inventory.remove(itemId);
        if (removedItem != null) {
            System.out.println("Item removed successfully: " + removedItem);
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }
}
