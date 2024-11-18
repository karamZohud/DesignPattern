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
public class Cheese extends ToppingDecorator{
     
    public Cheese(Pizza pizza) {
        super(pizza);
    }
    @Override
      public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
    @Override
      public double getCost() {
        return pizza.getCost() + 1.25; // cost of cheese
    }
}
