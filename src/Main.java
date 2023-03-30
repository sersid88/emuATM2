import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Hello. Welcome to our ATM system.
                                
                If you want to create a new account - select [ 1 ].
                If you already have an account and want to log in - select [ 2 ].
                To exit - select [ 3 ].
                """);
        ATMMenu atmMenu = new ATMMenu(new Scanner(System.in));
        atmMenu.mainMenu();
    }
}