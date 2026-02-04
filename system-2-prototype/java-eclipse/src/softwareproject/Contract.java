/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareproject;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Bingxuan
 */
public class Contract {
    //only discount is used in MakePayment senario
    //all other attribute are not intialized for this reason
    
    private int contractID;
    private int tenantID;
    private int propertyID;
    private int agentID;
    private Date startDate;
    private Date endDate;
    private int paymentSchedule;
    private int status;
    
    private int utilityPrice;
    private int rentPrice;
    private double discount;
    
    
    Contract()
    {
        discount = 0.9; //10 percent off
    }
    
    public double getDiscount()
    {
        return discount;
    }
    
    public void setDiscount(double d)
    {
        discount = d;
    }
    
}
