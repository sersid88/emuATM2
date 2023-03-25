public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        DataBase dataBase = new DataBase();
        bank.enterCardNumber();
        bank.enterPinCode();
        //bank.createNewAccount();
        //dataBase.readFromFile();
        System.out.println(bank.loginAccount());
        dataBase.printList();

    }
}