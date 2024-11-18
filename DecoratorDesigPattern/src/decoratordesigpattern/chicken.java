/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratordesigpattern;

/**
 *
 * @author karam
 */
public class chicken extends ToppingDecorator{
    
    public chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Chicken"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCost() {
        return super.getCost()+5; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
