public class InputDataCorrectness {

    public static boolean cardNumberControl(String inputString) {
        return inputString.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}");
    }

    public static boolean pinCodeControl(String inputString) {
        return inputString.matches("\\d{4}");
    }

    public static boolean upBalanceInputControl(String enteredValue) {
        var MAX_INCREASE_VALUE = 1_000_000;
        if (Integer.parseInt(enteredValue) <= 0) {
            System.out.println("Value cannot be negative");
            return false;
        }
        if (Integer.parseInt(enteredValue) > MAX_INCREASE_VALUE) {
            System.out.println("Value cannot be greater than 1.000.000");
            return false;
        }
        return true;
    }

}
