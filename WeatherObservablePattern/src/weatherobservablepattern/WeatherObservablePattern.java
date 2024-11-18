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
public class WeatherObservablePattern {

    public static void main(String[] args) {
         WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay(weatherStation);
        Observer windowDisplay = new WindowDisplay(weatherStation);

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(windowDisplay);

        // Change temperature, observers will be notified
        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);

        // Remove an observer and update temperature
        weatherStation.removeObserver(windowDisplay);
        weatherStation.setTemperature(22.0f);
    }
    
}
