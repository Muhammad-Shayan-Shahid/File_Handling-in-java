/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filestrings;
import java.io.*;
import java.util.*;
public class File_Read {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         try{
            //writing:
            PrintWriter writer = new PrintWriter("E:\\Shayan\\file.txt");
            System.out.println("Enter string .");
            for(int i=0 ; i<6 ; i++){
                String str = input.nextLine();
                writer.println(str);
            }
            writer.close();
            
            //Reading:
            File os  = new File("E:\\Shayan\\file.txt");
        Scanner reader = new Scanner(os);
        System.out.println("Readed Data is : ");
        while(reader.hasNextLine()){
            String str = reader.nextLine();
            System.out.println(str);
        }
        reader.close();
         }
         catch(IOException e){
            System.out.println("An error is occuared.");
        }
    }
    
}
