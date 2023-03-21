import java.util.Date;

public class Account {
    private String cardNumber;
    private String pinCode;

    public Account(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
