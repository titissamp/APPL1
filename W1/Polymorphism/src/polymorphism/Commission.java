/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author LENOVO
 */
public class Commission extends Hourly {
    private double TotalSales;
    private double CommissionRate;
    
    public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double Comrate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        CommissionRate = Comrate;
    }
    public void addSales (double totalSales){
        TotalSales = TotalSales + totalSales;
    }
    
    @Override
       public double pay(){
           TotalSales = TotalSales * CommissionRate + super.pay();
           double myPay = TotalSales;
           TotalSales = 0;
           return myPay;
       }
       
       public String toString()
       {
           String result = super.toString();
           result = result + "\nTotal Sales: " + TotalSales;
           return result;
       }
       
}
