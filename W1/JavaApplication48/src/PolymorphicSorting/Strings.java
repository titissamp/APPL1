/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphicSorting;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Strings
{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args)
{
    Strings[] stringList;
    int size;
    Scanner scan = new Scanner(System.in);
    System.out.print ("\nHow many string do you want to sort? ");
    size = scan.nextInt();
    stringList = new Strings[size];
    System.out.println ("\nEnter the string...");
    for (int i = 0; i < size; i++){
        String[] intList = null;
        intList[i] = scan.next();
    }
        
    Sorting.insertionSort((Comparable[]) stringList);
    System.out.println ("\nYour numbers in sorted order...");
    for (int i = 0; i < size; i++)
        System.out.print(stringList[i] + " ");
        
    System.out.println ();
}
}
