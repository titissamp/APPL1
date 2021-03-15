/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismsorting;

/**
 *
 * @author LENOVO
 */
public class Rectangle extends Shapes{
    private double panjang; 
    private double lebar;
    //radius in feet
    //----------------------------------
    // Constructor: Sets up the sphere.
    //----------------------------------
    public Rectangle(double p, double l)
    {
        super("Rectangle");
        panjang = p;
        lebar = l;
    }
//-----------------------------------------
// Returns the surface area of the sphere.
//-----------------------------------------
    public double area()
    {
        return panjang*lebar;
    }
//-----------------------------------
// Returns the sphere as a String.
//-----------------------------------
    public String toString()
    {
        return super.toString() + " of panjang " + panjang + " of lebar " + lebar;
    }
}
