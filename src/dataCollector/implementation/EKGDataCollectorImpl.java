package dataCollector.implementation;

import dataCollector.EKGData;
import dataCollector.EKGDataCollector;

import java.sql.Timestamp;
import java.util.Date;

public class EKGDataCollectorImpl implements EKGDataCollector {

    @Override
    public EKGData getNewReading() {
        return new EKGDataImpl(new Timestamp(new Date().getTime()), 200);
    }
}
