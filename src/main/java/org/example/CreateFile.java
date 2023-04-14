package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase :");
        String str = sc.nextLine();

        try {

            // Recevoir le fichier
            //File f = new File("C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\Essaie.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\Essaie2.txt");
            //f.setWritable(str);
            fos.write(str.getBytes());
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
