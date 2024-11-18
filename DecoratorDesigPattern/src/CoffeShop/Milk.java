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
public class Milk extends ToppingDecorater{

 Beverage beverage;
 public Milk(Beverage beverage) {
 this.beverage = beverage;
 }
 @Override
 public String getDescription() {
 return beverage.getDescription() + ", Milk";
 }
 @Override
 public double cost() {
 return .10 + beverage.cost();

}
}
