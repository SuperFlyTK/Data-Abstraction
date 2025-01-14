public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@example.com");
        Item item1 = new Item("Laptop", 999.99, 5);
        Item item2 = new Item("Mouse", 19.99, 10);

        Order order = new Order(customer);
        order.addItem(item1);
        order.addItem(item2);

        System.out.println(order);
    }
}