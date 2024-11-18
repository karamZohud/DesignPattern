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
public class CoffeShop {
    public static void main(String[] args) {
        Beverage bv1=new Espresso();
        System.out.println(bv1.getDescription()
 + " $" + bv1.cost()); 
        
        bv1=new Milk(bv1);
          System.out.println(bv1.getDescription()
 + " $" + bv1.cost()); 
        bv1=new Mocha(bv1);
          System.out.println(bv1.getDescription()
 + " $" + bv1.cost()); 
        
        
    }
     
}
