/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author karam
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
         flyBehavior =new FlyNoWay();
    quackBehavior =new MuteQuack();
    }

   
    
    
    @Override
    void display() {
        System.out.println("I'm a rubber duck!");
    }
    
}
