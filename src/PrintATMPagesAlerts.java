public class PrintATMPagesAlerts {

    public void printMainMenu() {
        System.out.println("""                        
                ******************************************************************
                [ 1 ] Create new account.
                [ 2 ] I have an account. Sign in with my card number.
                [ 3 ] Exit.
                ******************************************************************
                """);
    }

    public void printATMMenu() {
        System.out.println("""
                ******************************************************************
                [ 1 ] Show balance
                [ 2 ] Deposit the amount
                [ 3 ] Withdraw the amount
                [ 4 ] Return to main menu
                [ 5 ] Exit
                ******************************************************************
                """);
    }

}
