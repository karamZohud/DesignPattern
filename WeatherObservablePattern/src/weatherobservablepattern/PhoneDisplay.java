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
public class PhoneDisplay implements Observer {

    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Phone Display: Temperature updated to " + temperature + "°C");
    }

    @Override
   public void setTemperature(float temperature) {
        System.out.println("Phone Display: Setting temperature to " + temperature + "°C");
        weatherStation.setTemperature(temperature);
    }

}
