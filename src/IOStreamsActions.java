import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOStreamsActions {

    public String scannerSystemIn() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
