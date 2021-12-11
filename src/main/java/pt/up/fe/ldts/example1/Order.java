package pt.up.fe.ldts.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public boolean isElegibleForFreeDelivery() {
        double total = 0;
        if (getTotal(total) > 100) return true;
        else return false;
    }

    private double getTotal(double total) {
        for (OrderLine line : lines)
            total += line.getProduct().getPrice() * line.getQuantity();
        return total;
    }

    public String printOrder() {
        StringBuffer printBuffer = new StringBuffer();
        for (OrderLine line : lines)
            printBuffer.append(line.getProduct().getName() + "(x" + line.getQuantity() + "): " + (line.getProduct().getPrice() * line.getQuantity()) + "\n");
        double total = 0;
        return printBuffer.append("Total: " + getTotal(total)).toString();
    }
}