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
public class Soy extends ToppingDecorater {
 Beverage beverage;
 public Soy(Beverage beverage) {
 this.beverage = beverage;
 }
 public String getDescription() {
 return beverage.getDescription() + ", Soy";
 }
 public double cost() {
 return .15 + beverage.cost();
 }
}
