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
public class plainPizza implements Pizza{

    @Override
    public String getDescription() {
return "Basic Pizza";
    }

    @Override
    public double getCost() {
return 10.0;
    }
    
}
