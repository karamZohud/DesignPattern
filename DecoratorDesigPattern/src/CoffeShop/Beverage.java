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
public abstract class Beverage {
    String description="unknown Bevarage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
