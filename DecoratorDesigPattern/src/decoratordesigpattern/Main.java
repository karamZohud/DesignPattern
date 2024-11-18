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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza pizza = new plainPizza();
        System.out.println(pizza.getDescription() + " -> $" + pizza.getCost());
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " -> $" + pizza.getCost());

        pizza = new Olives(pizza); // Add olives
        System.out.println(pizza.getDescription() + " -> $" + pizza.getCost());
  pizza=new chicken(pizza);
          System.out.println(pizza.getDescription() + " -> $" + pizza.getCost());

    }

}
