/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeShop;

/**
 *
 * @author karam
 */
public class DarkRoast extends  Beverage{

    public DarkRoast() {
    description="DarkRoast";
    }
       
    @Override
    public double cost() {
       return 11;
    }
    
}
