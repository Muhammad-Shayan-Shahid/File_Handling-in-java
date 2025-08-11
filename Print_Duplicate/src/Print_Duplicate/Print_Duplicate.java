/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labq4;
import java.io.*;
import java.util.*;
public class Print_Duplicate {
    public static String removeDupliacte(String str){
        String [] split = str.split(" ");
        String merge="";
        for(int i=0; i<split.length;i++){
            boolean isDuplicate = false;
            
             String[] resultParts = merge.split(" ");
            for (int j = 0; j < resultParts.length; j++) {
            if (split[i].equals(resultParts[j])) {
            isDuplicate = true;
            break;
        }
    }

    if (!isDuplicate) {
        merge += split[i] + " ";
    }
        }
        return merge.trim();
    }
    public static void main(String[] args) {
         try{
             String str1="";
             String str2="";
            File file = new File("E:\\Shayan\\file.txt");
            Scanner reader1 = new Scanner(file);
            
            File obj = new File("E:\\Shayan\\file1.txt");
            Scanner reader2 = new Scanner(obj);
            
            while(reader1.hasNextLine()){
                 str1 += reader1.nextLine()+" ";
            }
            
            while(reader2.hasNextLine()){
                 str2 += reader2.nextLine()+" ";
            }
           
            String temp = str1.concat(str2);
            
           reader1.close();
           reader2.close();
           String merge = removeDupliacte(temp);
           
           PrintWriter writer = new PrintWriter("E:\\Shayan\\file2.txt");
               String[] parts = merge.split(" ");
            for (String part : parts) {
                if (!part.trim().isEmpty()) {
                    writer.println(part); 
                }
            }
           System.out.println("Both files merges successfully .:");
           writer.close();
         }
         catch(IOException e){
             System.out.println("An error is occuared.");
         }
    }
    
}
