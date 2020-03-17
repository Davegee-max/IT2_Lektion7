package dataCollector.ekgSim;

import dataCollector.EKGData;
import dataCollector.ekgSim.reader.SimSampler;

public class EKGObserverPatternTester implements EKGListener {
    public static void main(String[] args) {
        EKGListener listener = new EKGObserverPatternTester();
        SimSampler sampler = new SimSampler();
        new Thread(sampler).start();
        sampler.registerObserver(listener);
    }

    @Override
    public void notify(EKGData ekgData) {
        System.out.println("Got New Data " + ekgData.getTimestamp() + " : " + ekgData.getReading());
    }
}
