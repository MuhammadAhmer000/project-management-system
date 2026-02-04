/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareproject;

import java.util.ArrayList;

/**
 *
 * @author Bingxuan
 */
public class UnifiedBill {
    //has many record of paymenthistory
    private double total;
    private boolean status;
    private double amountPaid;
    private int PaymentID = 0;
    private ArrayList<PaymentHistory> payHistoryList;
    UnifiedBill(int uTotal, int pTotal, int mTotal)
    {
        payHistoryList = new ArrayList();
        total +=uTotal;
        total +=pTotal;
        total +=mTotal;
        amountPaid = 0;
    }
    
    
    public void setStatus(boolean s)
    {
        status = s;
    }
    
    public double getPaid()
    {
        return amountPaid;
    }
    public void amountPay(double paidAmount)
    {
        amountPaid += paidAmount;
        payHistoryList.add(new PaymentHistory(amountPaid,PaymentID));
    }
    
    public ArrayList<PaymentHistory> getHistory()
    {
        return payHistoryList;
    }
    
    public double getTotal()
    {
        return total;
    }
    
    public void setBill(int a)
    {
        total = a;
    }
    
    
    
    
}
