/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copypaste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author ANGGA
 */
public class CopyPaste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String isiFile;
        FileInputStream copy = null;
        FileOutputStream paste = null;
        try {
            copy = new FileInputStream("C:\\ayo.txt");
            paste = new FileOutputStream("C:\\ayoPaste.txt");
            byte[] buf = new byte[1024];
            int byteRead;
            while ((byteRead = copy.read(buf))>0) {                
                paste.write(buf, 0, byteRead);
            }
            System.out.println("SUDAH SELESAI DI COPY-PASTE");
        } catch (Exception e) {
        }
    }
    
}
