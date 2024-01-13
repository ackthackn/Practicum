import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ProductWriter {
    public static void main(String[] args) {

        String ID;
        String Name;
        String Description;
        Double Cost;
        boolean add = true;
        String yesNo;
        try {
            Scanner scanner = new Scanner(System.in);

            ArrayList<String> records = new ArrayList<>();

            ID = SafeInput.getNonZeroLenString(scanner, "Enter ID");
            Name = SafeInput.getNonZeroLenString(scanner, "Enter Name");
            Description = SafeInput.getNonZeroLenString(scanner, "Enter Description");
            Cost = SafeInput.getDouble(scanner, "Enter Cost");

            records.add(ID + ", " + Name + ", " + Description + ", " + Cost);


            while (add) {
                System.out.print("Add another record? Y/N ");
                yesNo = scanner.nextLine();

                if (yesNo.equalsIgnoreCase("Y")) {
                    ID = SafeInput.getNonZeroLenString(scanner, "Enter ID");
                    Name = SafeInput.getNonZeroLenString(scanner, "Enter Name");
                    Description = SafeInput.getNonZeroLenString(scanner, "Enter Description");
                    Cost = SafeInput.getDouble(scanner, "Enter Cost");

                    records.add(ID + ", " + Name + ", " + Description + ", " + Cost);
                } else if (yesNo.equalsIgnoreCase("N")) {
                    add = false;
                } else {
                    System.out.println("Invalid answer, answer with Y/N");
                }
            }

            FileWriter file = new FileWriter("ProductTestData.txt");

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
