import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOStreamsActions {

    DataBase dataBase;

    public DataBase getDataBase() {
        return dataBase;
    }
    public Scanner scannerFile() {
        Scanner scanner = null;
        try {
             scanner = new Scanner(getDataBase().getFile());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } return scanner;
    }

    public Scanner scannerSystemIn() {
        return new Scanner(System.in);
    }






}
