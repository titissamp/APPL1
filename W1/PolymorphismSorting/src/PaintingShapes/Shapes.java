/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

/**
 *
 * @author LENOVO
 */
public abstract class Shapes {
    private String shapeName;
    public Shapes (String shapeName)
    {
        this.shapeName = shapeName;
    }
    public abstract double area();
    public String toString(){
        return super.toString() + "Shape Name : " + shapeName;
    }
}
