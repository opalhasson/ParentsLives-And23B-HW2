package com.example.HW2;

import android.hardware.Sensor;
import android.hardware.SensorManager;

public class Sensors {

    private SensorManager sensorManager;
    private Sensor accSensor;

    public SensorManager getSensorManager() {
        return sensorManager;
    }

    public Sensors() {
    }

    public Sensors setSensorManager(SensorManager sensorManager) {
        this.sensorManager = sensorManager;
        return this;
    }

    public Sensor getAccSensor() {
        return accSensor;
    }

    public Sensors setAccSensor(Sensor accSensor) {
        this.accSensor = accSensor;
        return this;
    }

    public void initSensor() {
        accSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }

}
