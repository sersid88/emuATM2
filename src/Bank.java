import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int balance;
    List<String> dataBaseList = new ArrayList<>();

    public Bank(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
