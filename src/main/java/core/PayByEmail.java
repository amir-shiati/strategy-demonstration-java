package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByEmail implements PayStrategy {
    private final BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void pay(int amount) {
        try {
            System.out.println("Enter your email: ");
            String email = Reader.readLine();
            System.out.println("Enter your password: ");
            String password = Reader.readLine();
            // Process the payment using the email provided
            System.out.println("The payment was successful." + " The total was: " + amount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
