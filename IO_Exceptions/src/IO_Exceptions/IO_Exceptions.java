/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ffffile;
import java.io.*;
import java.util.*;
public class IO_Exceptions {
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
            
            System.out.println("Enter numbers .");
            int num = input.nextInt();
            while( num!=0){
                 num = input.nextInt();
                 writer.println(num);
                }
            int  [] array1  = new int [6];
            System.out.println("Enter a elements 0f array :");
        for(int i=0 ; i<6 ; i++){
            array1 [i] = input.nextInt();
        }
        writer.println(Arrays.toString(array1));
            writer.close();
            
            //reading:
        }
        catch(IOException e){
            System.out.println("An error is occuared.");
        }
        catch(InputMismatchException e){
            System.out.println("An error is occuared.");
        }
    }
    
}
