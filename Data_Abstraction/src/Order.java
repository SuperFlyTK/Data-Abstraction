import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Item> items;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{customer=" + customer + ", items=" + items + ", total=" + calculateTotal() + "}";
    }
}