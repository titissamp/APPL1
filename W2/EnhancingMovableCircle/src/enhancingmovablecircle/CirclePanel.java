/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancingmovablecircle;
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  

/**
 *
 * @author LENOVO
 */
public class CirclePanel extends JPanel{
    private final int CIRCLE_SIZE = 50;  
    private int x,y;  
    private Color c;  
    private JButton left, right, up, down;
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
        left = new JButton("Left");  
        right = new JButton("Right");  
        up = new JButton("Up");  
        down = new JButton("Down");  
 // Add listeners to the buttons  
        left.addActionListener(new MoveListener(-20,0));   
        right.addActionListener(new MoveListener(20,0));   
        up.addActionListener(new MoveListener(0,-20));   
        down.addActionListener(new MoveListener(0,20));
 // Add Mnemonic to the button
        left.setMnemonic('l');
        right.setMnemonic('r');
        up.setMnemonic('u');
        down.setMnemonic('d');
 // Add Tooltip to the button  
        left.setToolTipText("Circle Moves 20 pixels to the left");
        right.setToolTipText("Circle Moves 20 pixels to the right");
        up.setToolTipText("Circle Moves 20 pixels up");
        down.setToolTipText("Circle Moves 20 pixels down");
 // Need a panel to put the buttons on or they'll be on   
 // top of each other.  
        JPanel buttonPanel = new JPanel();  
        buttonPanel.add(left);  
        buttonPanel.add(right);  
        buttonPanel.add(up);  
        buttonPanel.add(down);  
 // Add the button panel to the bottom of the main panel   
        this.add(buttonPanel, "South");  
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
    private class MoveListener implements ActionListener   
    {  
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
 // Circle when hit the edge right and left            
            if (x < 0){
                x = 0;
                left.setEnabled(false);
            } else if (x + CIRCLE_SIZE > getWidth()){
                x = getWidth() - CIRCLE_SIZE;
                right.setEnabled(false);
            } else {
                left.setEnabled(true);
                right.setEnabled(true);
            }
 // Circle when hit the edge up and down           
            if (y < 0){
                y = 0;
                up.setEnabled(false);
            } else if (y + CIRCLE_SIZE > getHeight()){
                y = getHeight() - CIRCLE_SIZE;
                down.setEnabled(false);
            } else {
                up.setEnabled(true);
                down.setEnabled(true);
            }
            repaint();  
        }  
    }  

}
