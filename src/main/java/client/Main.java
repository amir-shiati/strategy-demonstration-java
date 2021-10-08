package client;

import core.PayByCreditCard;
import core.PayByEmail;
import core.PayStrategy;
import core.model.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            new Main().example();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void example() throws IOException {
        // Creating a sample order
        Order order = new Order();
        order.setTotal(400);

        System.out.println("Select a payment method: \n" +
                "1- Email \n" +
                "2- Credit Card");
        String selectedMethod = reader.readLine();

        PayStrategy strategy = null;
        switch (selectedMethod) {
            case "1":
                strategy = new PayByEmail();
                break;
            case "2":
                strategy = new PayByCreditCard();
                break;
            default:
                break;
        }

        if (strategy != null)
            order.processOrder(strategy);
        else
            System.out.println("No payment method was selected.");
    }
}
