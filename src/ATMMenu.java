import java.util.Scanner;

public class ATMMenu {

    private final Scanner scanner;

    public ATMMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    PrintATMPagesAlerts printATMPagesAlerts = new PrintATMPagesAlerts();
    Bank bank = new Bank();
    DataBase dataBase = new DataBase();
    IOStreamsActions ioStreamsActions = new IOStreamsActions();


    public void mainMenu() {
        if (this.scanner != null) {
            int key;
            do {
                printATMPagesAlerts.printMainMenu();
                System.out.println("Please enter menu number: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1 -> {
                        System.out.println("Please enter your card number in format XXXX-XXXX-XXXX-XXXX");
                        bank.enterCardNumber();
                        System.out.println("Please enter your pin-code in format XXXX");
                        bank.enterPinCode();
                        bank.createNewAccount();
                    }
                    case 2 -> {
                        System.out.println("Please enter your card number");
                        var tempCardNumber = ioStreamsActions.scannerSystemIn();
                        System.out.println("Please enter your pin-code");
                        var tempPinCode = ioStreamsActions.scannerSystemIn();
                        if (bank.loginAccount(tempCardNumber, tempPinCode)) {
                            bankMenu();
                        } else System.out.println("User data does not match. Try once more.");
                    }
                    case 3 -> System.out.println("Thank you for using our ATM. We will be glad to see you again.");
                    default -> System.out.println("Wrong menu number. Try once more.");
                }
            } while (key != 3);
        }
    }

    public void bankMenu() {
        if (this.scanner != null) {
            int key;
            do {
                printATMPagesAlerts.printATMMenu();
                System.out.println("Please enter menu number: ");
                key = scanner.nextInt();
                switch (key) {
                    case 1 -> System.out.println("On your balance: " + bank.getAccountBalance());
                    case 2 -> {
                        System.out.println("On your balance: " + bank.getAccountBalance());
                        System.out.println("Enter the replenishment amount: ");
                        bank.upBalance();
                        dataBase.writeToFile();
                    }
                    case 3 -> {
                        System.out.println("On your balance: " + bank.getAccountBalance());
                        System.out.println("How much do you want to withdraw? ");
                        bank.decreaseBalance();
                        dataBase.writeToFile();
                    }
                    case 4 -> mainMenu();
                    case 5 -> {
                        System.out.println("Thank you for using our ATM. We will be glad to see you again.");
                        System.exit(0);
                    }
                    default -> System.out.println("Wrong menu number");
                }
            } while (key != 4);
        }
    }

}
