/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareproject;

/**
 *
 * @author Bingxuan
 */
public class MaintenanceBill {
    private int amount;
    
    MaintenanceBill()
    {
        amount = 50;
    }
    
    public int getBill()
    {
        return amount;
    }
    
    public void setBill(int a)
    {
        amount = a;
    }
}
