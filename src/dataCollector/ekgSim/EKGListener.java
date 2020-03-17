package dataCollector.ekgSim;

import dataCollector.EKGData;

public interface EKGListener {
    void notify(EKGData ekgData);
}
