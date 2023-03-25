import com.sun.source.tree.BreakTree;

public class InputDataCorrectness {

    public static boolean cardNumberControl(String inputString) {
        return inputString.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}");
    }

    public static boolean pinCodeControl(String inputString) {
        return inputString.matches("\\d{4}");
    }

}
