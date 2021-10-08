package core.model;

import core.PayStrategy;

public class Order {
    private int total = 0;

    public void processOrder(PayStrategy payStrategy) {
        payStrategy.pay(total);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
