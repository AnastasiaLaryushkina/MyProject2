public class Items {
    int id;
    String itemsName;
    double price;
    int itemQuantity;

    public Items() {
    }

    public Items(int id, String itemsName, double price, int itemQuantity) {
        this.id = id;
        this.itemsName = itemsName;
        this.price = price;
        this.itemQuantity = itemQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
