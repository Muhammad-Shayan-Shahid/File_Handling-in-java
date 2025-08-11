/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputsteam;
import java.io.*;
public class Length_Check {
    public static void main(String[] args) {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            OutputStream os = new FileOutputStream("E:\\Shayan\\file.txt");
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                os.write(c);
            } while(c != 'q');
            os.close();
            System.out.println("The given data is as below");
            InputStream is = new FileInputStream("E:\\Shayan\\file.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read());
            }
            is.close();
        } catch(IOException e) {
            System.out.print("Exception");
        }
    }
    
}
