/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package writeeeee;
import java.io.*;
import java.util.*;
public class Write_MultipleData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            //writing:
            FileOutputStream os= new FileOutputStream("E:\\Shayan\\file.txt");
            PrintWriter writer = new PrintWriter(os);
            for(int i=0;  i<3 ;i++){
                System.out.println("Enter names : ");
                String str = input.nextLine();
                writer.println(str);
                
                System.out.println("Enter marks : ");
                int num = input.nextInt();
                writer.println(num);
                
                System.out.println("Enter perceantage : ");
                double per = input.nextDouble();
                writer.println(per);
                
                System.out.println("Enter grades : ");
                char grade = input.next().charAt(0);
                writer.println(grade);
                input.nextLine();
            }
            writer.close();
        }
         catch(IOException e){
            System.out.println("An error is occuared.");
        }
        catch(InputMismatchException e){
            System.out.println("An error is occuared.");
        }
    }
    
}
