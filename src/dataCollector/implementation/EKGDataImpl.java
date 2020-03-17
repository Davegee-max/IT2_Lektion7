package dataCollector.implementation;

import dataCollector.EKGData;

import java.sql.Timestamp;

public class EKGDataImpl implements EKGData {
    private Timestamp timeStamp;
    private double reading;

    public EKGDataImpl(Timestamp timeStamp, double reading) {
        this.timeStamp = timeStamp;
        this.reading = reading;
    }

    @Override
    public Timestamp getTimestamp() {
        return this.timeStamp;
    }

    @Override
    public double getReading() {
        return this.reading;
    }
}
