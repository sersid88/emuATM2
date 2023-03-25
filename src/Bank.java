public class Bank {

    IOStreamsActions ioStreamsActions = new IOStreamsActions();
    DataBase dataBase = new DataBase();

    Account account = new Account();
    public  Bank() {

    }

    public void enterCardNumber() {
        String cardNumber = ioStreamsActions.scannerSystemIn();
        if (!InputDataCorrectness.cardNumberControl(cardNumber)) {
            System.out.println("Wrong card number. Try again");
        } account.setCardNumber(cardNumber);
    }
    public void enterPinCode() {
        String pinCode = ioStreamsActions.scannerSystemIn();
        if (!InputDataCorrectness.pinCodeControl(pinCode)) {
            System.out.println("Wrong pin-code. Try again");
        } account.setPinCode(pinCode);
    }


    public void createNewAccount() {
        DataBase.dataBaseList.add(new Account
                (account.getCardNumber(),
                account.getPinCode(),
                account.getBalance()));
        dataBase.writeToFile();
    }


    public boolean loginAccount() {
        dataBase.readFromFile();
        return account.getCardNumber().equals(DataBase.dataBaseList.get(0).getCardNumber()) &&
                account.getPinCode().equals(DataBase.dataBaseList.get(0).getPinCode());
    }


}
