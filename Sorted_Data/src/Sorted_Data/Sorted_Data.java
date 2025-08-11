/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13task2;
import java.io.*;
import java.util.*;
public class Sorted_Data {
    public static void main(String[] args) {
        String [] arr = new String[10];
        try{
            File file = new File("E:\\Shayan\\file.txt");
            Scanner reader = new Scanner(file);
            
            for(int i=0; i<arr.length; i++){
                arr[i] = reader.nextLine();
                }
            
            reader.close();
            Arrays.sort(arr);
            
            System.out.println("Sorted data is : ");
            for(String line:arr){
                if(line!=null){
                    System.out.println(line);
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found.");
}
    }
    
}
