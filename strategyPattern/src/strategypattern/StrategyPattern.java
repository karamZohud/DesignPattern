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
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Duck mallard = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        System.out.println("Mallard Duck:");
        mallard.display();
        mallard.performFly();   // "I'm flying with wings!"
        mallard.performQuack(); // "Quack!"

        System.out.println("\nRubber Duck:");
        rubberDuck.display();
        rubberDuck.performFly();   // "I can't fly!"
        rubberDuck.performQuack(); // "Squeak!"    }
    
}
}
