import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Dostonbek"));
        orders.add(new Order(2, "Odil"));
        orders.add(new Order(3, "Jasur"));

        int threadPoolSize = 3;
        OrderProcessor orderProcessor = new OrderProcessor(threadPoolSize);
        orderProcessor.processOrders(orders);
    }
}