package dataCollector.ekgSim.reader;

import java.util.List;

public interface DataSampleReader {
    List<Double> loadData();
}
