import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DataBase {
    public static List<Account> dataBaseList = new ArrayList<>();

    private String fileAddress = "src\\testDataBase.txt";
    IOStreamsActions ioStreamsActions;

    public DataBase() {
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public File getFile() {
        return new File(getFileAddress());
    }

    public void writeToFile() {
        File file = new File(getFileAddress());
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (Account account : dataBaseList) {
                printWriter.println(account.getCardNumber() + " "
                        + account.getPinCode() + " "
                        + account.getBalance());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFromFile() {
        File file = new File(getFileAddress());
        try (Scanner scanner = new Scanner(file)) {
        while (scanner.hasNextLine()) {
            String lineFromFile = scanner.nextLine();
            String[] arrayFromFile = lineFromFile.split(" ");
            dataBaseList.add(new Account(arrayFromFile[0],
                    arrayFromFile[1],
                    Integer.parseInt(arrayFromFile[2])));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void printList() {
        System.out.println(dataBaseList);
    }

}
