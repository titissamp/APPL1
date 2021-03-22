/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwing.exceptions;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;  
public class Factorials  
{  
 public static void main(String[] args)  
 {  
    String keepGoing = "y";  
    Scanner scan = new Scanner(System.in);  
    while (keepGoing.equals("y") || keepGoing.equals("Y"))  
    {  
        System.out.print("Enter an integer: ");  
        try{
            int val = scan.nextInt();  
            if (val < 0 ){
                throw new IllegalArgumentException ("Factorial can't negative");
            } else if (val > 16){
                throw new IllegalArgumentException ("Factorial can't mora than 16");
            }
            System.out.println("Factorial(" + val + ") = "  + MathUtils.factorial(val));    
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
        System.out.print("Another factorial? (y/n) ");  
        keepGoing = scan.next();  
    }  
 } 
 }

