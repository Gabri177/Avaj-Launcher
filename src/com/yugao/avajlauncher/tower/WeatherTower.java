package com.yugao.avajlauncher.simulator;

public class WeatherTower extends Tower {

    public String getWeather(Coordinates p_coordinates) {

        WeatherProvider weatherProvider = WeatherProvider.getInstance();
        return weatherProvider.getCurrentWeather(p_coordinates);
    }

    public void changeWeather(){
        super.conditionChanged();
    }

}
