import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class PersonGenerator {
    public static void main(String[] args) {

        String ID = " ";
        String fName = " ";
        String lName = " ";
        String title = " ";
        int YOB = 0;

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> records = new ArrayList<>();


        //fName = SafeInput.getNonZeroLenString(scanner, "Enter First Name");
        //lName = SafeInput.getNonZeroLenString(scanner, "Enter Last Name");
        //title = SafeInput.getNonZeroLenString(scanner, "Enter Title");
        //YOB = SafeInput.getInt(scanner, "Enter Year of Birth");

        ID = SafeInput.getNonZeroLenString(scanner, "Enter ID");

        records.add(ID);
        System.out.println(records);

        //File file = new File("PersonTestData.txt");
    }

}
