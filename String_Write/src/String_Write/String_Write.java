/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileprac;
import java.io.*;
import java.util.*;
public class String_Write {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            //writing:
            PrintWriter writer = new PrintWriter("E:\\Shayan\\file.txt");
            System.out.println("Enter string .");
            String str = input.nextLine();
            writer.println(str);
            writer.close();
            
            //Reading:
            String s = "";
            File obj = new File("E:\\Shayan\\file.txt");
            Scanner reader = new Scanner(obj);
            while(reader.hasNextLine()){
                s += reader.hasNextLine()+" ";
            }
             reader.close();
             String [] word = s.split(" ");
            System.out.println("Readed String is : "+s);
            System.out.println("Total words are : "+word.length);
        }
         catch(IOException e){
            System.out.println("An error is occuared.");
        }
    }
    
}
