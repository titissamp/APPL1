/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloringcircle;

/**
 *
 * @author LENOVO
 */
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
public class CirclePanel extends JPanel  
{  
    private final int CIRCLE_SIZE = 50;  
    private int x,y;  
    private Color c;  
    JButton choose = new JButton ("Choose Color");
 //---------------------------------------------------------------   
 // Set up circle and buttons to move it.  
 //---------------------------------------------------------------   
    public CirclePanel(int width, int height)  
    {  
 // Set coordinates so circle starts in middle  
        x = (width/2)-(CIRCLE_SIZE/2);  
        y = (height/2)-(CIRCLE_SIZE/2);  
        c = Color.green;  
 // Need a border layout to get the buttons on the bottom   
        this.setLayout(new BorderLayout());  
 // Create buttons to move the circle  
        JButton left = new JButton("Left");  
        JButton right = new JButton("Right");  
        JButton up = new JButton("Up");  
        JButton down = new JButton("Down");
 // Create buttons to change color
         JButton orange = new JButton("Orange");
         JButton blue = new JButton("Blue");
         JButton red = new JButton("Red");
         JButton pink = new JButton("Pink");
         JButton choose = new JButton("Choose");
 // Add listeners to the buttons  
        left.addActionListener(new MoveListener(-20,0));   
        right.addActionListener(new MoveListener(20,0));   
        up.addActionListener(new MoveListener(0,-20));   
        down.addActionListener(new MoveListener(0,20)); 
// Add listeners to the color buttons        
        orange.addActionListener(new ColorListener(Color.ORANGE));
        blue.addActionListener(new ColorListener(Color.BLUE));
        red.addActionListener(new ColorListener(Color.RED));
        pink.addActionListener(new ColorListener(Color.PINK));
        choose.addActionListener(new ColorListener(null)); 
 // Need a panel to put the color buttons on or they'll be on   
 // top of each other.  
        JPanel buttonPanel = new JPanel();  
        buttonPanel.add(left);  
        buttonPanel.add(right);  
        buttonPanel.add(up);  
        buttonPanel.add(down);  
 // Add the button panel to the bottom of the main panel   
        this.add(buttonPanel, "South"); 
 // Need a panel to put the buttons on or they'll be on   
 // top of each other.  
        JPanel colorPanel = new JPanel();  
        colorPanel.add(orange);  
        colorPanel.add(blue);  
        colorPanel.add(red);  
        colorPanel.add(pink); 
        colorPanel.add(choose); 
 // Add the button panel to the bottom of the main panel   
        this.add(colorPanel, "North"); 
 // Set Color background
        orange.setBackground(Color.ORANGE);
        blue.setBackground(Color.BLUE);
        red.setBackground(Color.RED);
        pink.setBackground(Color.PINK);
    }  
 //---------------------------------------------------------------   
 // Draw circle on CirclePanel  
 //---------------------------------------------------------------   
    public void paintComponent(Graphics page)  
    { 
        super.paintComponent(page);  
        page.setColor(c);  
        page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);  
    }  
 //---------------------------------------------------------------   
 // Class to listen for button clicks that move circle.   
 //---------------------------------------------------------------   
    private class MoveListener implements ActionListener   {  
        private int dx;  
        private int dy;  
 //---------------------------------------------------------------   
 // Parameters tell how to move circle at click.  
 //---------------------------------------------------------------   
        public MoveListener(int dx, int dy)  
        {  
            this.dx = dx;  
            this.dy = dy;  
        }  
 //---------------------------------------------------------------   
 // Change x and y coordinates and repaint.  
 //---------------------------------------------------------------   
        public void actionPerformed(ActionEvent e)  
        {  
            x += dx;  
            y += dy;  
            repaint();  
        }  
 }
        private class ColorListener implements ActionListener   {  
            private Color color;
            public ColorListener (Color color){
                this.color = color;
            }
            @Override
             public void actionPerformed(ActionEvent e)  
            {  
                if(this.color == null){
                    c = JColorChooser.showDialog(choose, "Choose Color: ", c);
                }else{
                    c = this.color;
                }
                repaint();  
            }  
        }
}
 

