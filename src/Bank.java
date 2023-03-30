public class Bank {
    IOStreamsActions ioStreamsActions = new IOStreamsActions();
    DataBase dataBase = new DataBase();
    Account account = new Account();

    public Bank() {

    }

    public void enterCardNumber() {
        String cardNumber = ioStreamsActions.scannerSystemIn();
        if (!InputDataCorrectness.cardNumberControl(cardNumber)) {
            System.out.println("Wrong card number. Try again");
        }
        account.setCardNumber(cardNumber);
    }

    public void enterPinCode() {
        String pinCode = ioStreamsActions.scannerSystemIn();
        if (!InputDataCorrectness.pinCodeControl(pinCode)) {
            System.out.println("Wrong pin-code. Try again");
        }
        account.setPinCode(pinCode);
    }

    public void createNewAccount() {
        DataBase.dataBaseList.add(new Account
                (account.getCardNumber(),
                        account.getPinCode(),
                        account.getBalance()));
        dataBase.writeToFile();
    }

    public boolean loginAccount(String tempCardNumber, String tempPinCode) {
        dataBase.readFromFile();
        return tempCardNumber.equals(DataBase.dataBaseList.get(0).getCardNumber()) &&
                tempPinCode.equals(DataBase.dataBaseList.get(0).getPinCode());
    }

    public void upBalance() {
        var enteredValue = ioStreamsActions.scannerSystemIn();
        var currentBalance = DataBase.dataBaseList.get(0).getBalance();
        if (InputDataCorrectness.upBalanceInputControl(enteredValue)) {
            DataBase.dataBaseList.get(0).setBalance(currentBalance + Integer.parseInt(enteredValue));
        }
    }

    public void decreaseBalance() {
        var enteredValue = Integer.parseInt(ioStreamsActions.scannerSystemIn());
        var currentBalance = DataBase.dataBaseList.get(0).getBalance();
        if (enteredValue <= currentBalance && enteredValue > 0) {
            DataBase.dataBaseList.get(0).setBalance(currentBalance - enteredValue);
        } else System.out.println("Incorrect value");
    }

    public int getAccountBalance() {
        return DataBase.dataBaseList.get(0).getBalance();
    }
}
