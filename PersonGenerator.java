import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class PersonGenerator {
    public static void main(String[] args) {

        String ID;
        String fName;
        String lName;
        String title;
        int YOB;
        boolean add = true;
        String yesNo;
        try {
            Scanner scanner = new Scanner(System.in);

            ArrayList<String> records = new ArrayList<>();

            ID = SafeInput.getNonZeroLenString(scanner, "Enter ID");
            fName = SafeInput.getNonZeroLenString(scanner, "Enter First Name");
            lName = SafeInput.getNonZeroLenString(scanner, "Enter Last Name");
            title = SafeInput.getNonZeroLenString(scanner, "Enter Title");
            YOB = SafeInput.getInt(scanner, "Enter Year of Birth");

            records.add(ID + ", " + fName + ", " + lName + ", " + title + ", " + YOB);


            while (add) {
                System.out.print("Add another record? Y/N ");
                yesNo = scanner.nextLine();

                if (yesNo.equalsIgnoreCase("Y")) {
                    ID = SafeInput.getNonZeroLenString(scanner, "Enter ID");
                    fName = SafeInput.getNonZeroLenString(scanner, "Enter First Name");
                    lName = SafeInput.getNonZeroLenString(scanner, "Enter Last Name");
                    title = SafeInput.getNonZeroLenString(scanner, "Enter Title");
                    YOB = SafeInput.getInt(scanner, "Enter Year of Birth");

                    records.add(ID + ", " + fName + ", " + lName + ", " + title + ", " + YOB);
                } else if (yesNo.equalsIgnoreCase("N")) {
                    add = false;
                    System.out.println(records);
                } else {
                    System.out.println("Invalid answer, answer with Y/N");
                }
            }

            FileWriter file = new FileWriter("PersonTestData.txt");

            for(String str: records){
                file.write(str + "\n");
            }
            file.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

}
