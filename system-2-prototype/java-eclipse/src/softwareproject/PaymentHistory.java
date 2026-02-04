/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Bingxuan
 */

public class PaymentHistory {
    private double amount;
    private String date;
    private int PaymentID;
    
    PaymentHistory(double a, int pID)
    {
        amount = a;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        date = dtf.format(now);
        PaymentID = pID;
    }
    
    public double getAmount()
    {
        return amount;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public int getPaymentID()
    {
        return PaymentID;
    }
            
    
}
