/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reader;
import java.io.*;
import java.util.*;
public class Read_MultipleData {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Shayan\\file.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                // Read entire line, then parse
                String word = reader.nextLine().trim();
                String numberLine = reader.nextLine().trim();
                String percentLine = reader.nextLine().trim();
                String gradeLine = reader.nextLine().trim();

                // Parse data
                int number = Integer.parseInt(numberLine);
                double percent = Double.parseDouble(percentLine);
                char grade = gradeLine.charAt(0);

                // Print
                System.out.println("String: " + word);
                System.out.println("Marks: " + number);
                System.out.println("Percentage: " + percent);
                System.out.println("Grade: " + grade);
                System.out.println("-------------------------");
            }

            reader.close();
        }
        catch(IOException e){
            System.out.println("An error is occuared.");
        }
        catch(InputMismatchException e){
            System.out.println("An error is occuared.");
        }
    
}
}
