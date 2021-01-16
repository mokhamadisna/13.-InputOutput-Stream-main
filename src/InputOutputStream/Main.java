/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
       FileInputStream in = null;
       FileOutputStream out = null;
 
       try {
           in = new FileInputStream("latihan_input.txt");
           out = new FileOutputStream("latihan_ouput.txt");
           int c;
 
           while ((c = in.read()) != -1) {
               out.write(c);
           }
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           try {
               if (in != null) {
                   in.close();
               }
               if (out != null) {
                   out.close();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   }    
}
