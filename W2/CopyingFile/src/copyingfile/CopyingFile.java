/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingfile;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class CopyingFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String namafile;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama File: ");
        namafile = scanner.next();
        File file = new File ("C:\\Users\\LENOVO\\OneDrive\\Documents\\Kasus1 Tubes\\APPL1\\W2\\CopyingFile\\src\\copyingfile\\"+namafile+".txt");
        try(Scanner scan = new Scanner(file)){
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException ex){
                System.out.println("File tidak ditemukan");
                }
    }
    
}
