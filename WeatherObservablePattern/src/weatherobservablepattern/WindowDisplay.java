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
public class WindowDisplay implements Observer{
private WeatherStation weatherStation;

    public WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
    @Override
       public void update(float temperature) {
        System.out.println("Window Display: Temperature updated to " + temperature + "°C");
    }
    public void setTemperature(float temperature) {
        System.out.println("Window Display: Setting temperature to " + temperature + "°C");
        weatherStation.setTemperature(temperature);
    }
}
