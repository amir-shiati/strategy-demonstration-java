package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void pay(int amount) {
        try {
            System.out.println("Enter your card number: ");
            String cardNumber = Reader.readLine();
            System.out.println("Enter the CVV code: ");
            String cvv = Reader.readLine();
            // Process the payment using the credit card
            System.out.println("The payment was successful." + " The total was: " + amount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
