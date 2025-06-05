import java.io.Console;

public class LoginSystem {
    public static void main(String[] args) {
        String correctUsername = "collins";
        String correctPassword = "COLLINS";
        int attempts = 3;

        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available. Run this in a terminal or command line.");
            return;
        }

        while (attempts > 0) {
            String username = console.readLine("Enter username: ");
            char[] passwordChars = console.readPassword("Enter password: ");
            String password = new String(passwordChars);

            // Masked output with asterisks
            System.out.print("Password entered: ");
            for (int i = 0; i < password.length(); i++) {
                System.out.print("*");
            }
            System.out.println();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                return;
            } else {
                attempts--;
                System.out.println("Incorrect login. Attempts left: " + attempts);
            }
        }

        System.out.println("Too many failed attempts. Access denied.");
    }
}