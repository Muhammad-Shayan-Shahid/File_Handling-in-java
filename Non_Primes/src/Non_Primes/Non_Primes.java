/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13task3;
import java.io.*;
import java.util.*;
public class Non_Primes {
    public static boolean isPrime(int num){
            boolean prime=true;
             if (num == 1) {
                prime =  false;
        }
             else{
               for(int j=2; j<=Math.sqrt(num); j++){
                 if(num%j==0){
                    prime =  false; 
                 }
             }  
}
           return prime;  
    }
    public static void removePrime(int[] array) {
            try{
            FileOutputStream os = new FileOutputStream("E:\\Shayan\\file.txt");
            PrintWriter writer = new PrintWriter(os);
             System.out.println("Non-prime numbers are:");
            for (int value : array) {
            if (!isPrime(value)) {
                System.out.println(value);
                writer.println(value);
            }
            }
            writer.close();
            }
            catch(IOException e){
                System.out.println("An error is occuared.");
                e.printStackTrace();
            }
        
    }
    public static void main(String[] args) {
        int [] arr = new int[10];
        try{
            File file = new File("E:\\Shayan\\file.txt");
            Scanner reader = new Scanner(file);
            
            for(int i=0; i<arr.length; i++){
                arr[i] = reader.nextInt();
                }
            reader.close();
            removePrime(arr);
        }
       catch(IOException e){
            System.out.println("An error is occuared.");
        }
    }
   
}