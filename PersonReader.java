import javax.swing.*;
import java.io.*;

public class PersonReader {
    public static void main(String[] args) {

        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));// set current directory

            int response = chooser.showSaveDialog(null); // showOpenDialog selects file to open // showSaveDialog selects file to save

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(chooser.getSelectedFile().getAbsolutePath());

                FileReader fileReader = new FileReader(file);

                BufferedReader buffer = new BufferedReader(fileReader);

                System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "ID#", "Firstname", "Lastname", "Title", "YOB");
                System.out.println("===================================================");


                String line;
                while ((line = buffer.readLine()) != null) {
                    String[] columns = line.split(", ");
                    System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", columns[0], columns[1], columns[2], columns[3], columns[4]);
                }

                buffer.close();
                fileReader.close();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
