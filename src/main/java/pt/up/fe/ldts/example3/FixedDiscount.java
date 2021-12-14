package pt.up.fe.ldts.example3;

public class FixedDiscount extends Discount {

    private final int fixed;

    protected FixedDiscount(int fixed) {
        this.fixed = fixed;
    }

    @Override
    public double applyDiscount(double price) {
        if (fixed > price)
            return 0;
        else
            return price - fixed;
    }
}
