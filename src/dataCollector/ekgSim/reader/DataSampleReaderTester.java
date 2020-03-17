package dataCollector.ekgSim.reader;

import java.util.List;

public class DataSampleReaderTester {
    public static void main(String[] args) {
        new DataSampleReaderTester().go();
    }

    private void go() {
        DataSampleReader reader = new DataSampleReaderSimImpl();
        List<Double> doubles = reader.loadData();
        System.out.println(doubles);
    }
}
