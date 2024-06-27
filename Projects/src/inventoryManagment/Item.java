package inventoryManagment;

class Item {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;
    private String category;

    public Item(int itemId, String itemName, double price, int quantity, String category) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                '}';
    }
}
