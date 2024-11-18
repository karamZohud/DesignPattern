/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherobservablepattern;
import java.util.ArrayList;
import java.util.List;



class WeatherStation implements SubjectI {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    // Method to set new temperature and notify observers
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}