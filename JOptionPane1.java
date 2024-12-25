/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane1;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author Tiyani
 */
public class JOptionPane1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Get radius from the user
        String input = JOptionPane.showInputDialog(null,"Enter the radius of the circle", JOptionPane.QUESTION_MESSAGE);
        
        double radius = Double.parseDouble(input);  //Convert input into a double
        
        
        //Create a circle object
        
        Circle circle = new Circle(radius);
        
        //Get properties of the circle
        
        double diameter = circle.getDiameter();
        double circumference = circle.getCircumference();
        double area = circle.getArea();
        
        
        //Display the results using JOptionPane
        
        String output = String.format(
        "Circle Properties: \n" +
        "Radius: %.2f\n" +
        "Diameter: %.2f\n" +
        "Circumference: %.2f\n"+
        "Area: %.2f",
        circle.getRadius(),circle.getDiameter(),circle.getCircumference(), circle.getArea());
        
        JOptionPane.showMessageDialog(null,output,"Circle Properties",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
