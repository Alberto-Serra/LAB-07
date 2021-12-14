package pt.up.fe.ldts.example3;

public class PercentageDiscount extends Discount {

    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        if (percentage > 0)
            return price - price * percentage;
        else
            return price;
    }
}
