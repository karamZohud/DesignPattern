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
public class Whip extends ToppingDecorater {
 Beverage beverage;
 public Whip(Beverage beverage) {
 this.beverage = beverage;
 }
 @Override
 public String getDescription() {
 return beverage.getDescription() + ", Whip";
 }
 @Override
 public double cost() {
 return .10 + beverage.cost();
 }
}
