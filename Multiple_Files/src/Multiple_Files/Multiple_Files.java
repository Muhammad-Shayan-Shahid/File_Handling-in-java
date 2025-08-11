/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13task1;
import java.io.*;
import java.util.*;
public class Multiple_Files {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int num2;
        try{
            PrintWriter writer1 = new PrintWriter("E:\\Shayan\\file.txt");
            PrintWriter writer2 = new PrintWriter("E:\\Shayan\\file1.txt");
            System.out.println("Enter num for file 1:");
            for(int i=0; i<5;i++){
               num = input.nextInt();
               writer1.println(num);  
            }
            System.out.println("Enter num for file 2:");
            for(int i=0; i<5;i++){
                num2 = input.nextInt();
                writer2.println(num2);
            }
           writer1.close();
           writer2.close();
        }
        catch(IOException e){
            System.out.println("An error is occuared.");
        }
            
    }
    
}
