package com.yugao.avajlauncher.simulator;

public abstract class Flyable {
    protected WeatherTower weatherTower;

    public abstract void updateConditions();
    public void registerTower(WeatherTower p_tower) {
        weatherTower = p_tower;
        p_tower.register(this);
    }
}
