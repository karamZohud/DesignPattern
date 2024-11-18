/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherobservablepattern;

/**
 *
 * @author karam
 */
public interface Observer {
     void update(float temperature);
   void setTemperature(float temperature); // Allow observers to set temperature

}
