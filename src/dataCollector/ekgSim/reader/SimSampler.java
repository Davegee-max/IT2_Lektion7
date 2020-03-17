package dataCollector.ekgSim.reader;

import dataCollector.ekgSim.EKGListener;
import dataCollector.ekgSim.EKGSampler;
import dataCollector.implementation.EKGDataImpl;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class SimSampler implements EKGSampler, Runnable{


    private final List<Double> data;
    private EKGListener observer;

    public SimSampler(){
        DataSampleReader sampleReader = new DataSampleReaderSimImpl();
        this.data = sampleReader.loadData();
    }
    @Override
    public void registerObserver(EKGListener listener) {
        this.observer = listener;
    }

    @Override
    public void run() {
        for (int i = 0; i < data.size(); i++) {
            try {
                Thread.sleep(20);
                if (observer !=null){
                    observer.notify(
                            new EKGDataImpl(
                                    new Timestamp(LocalDateTime.now().getNano()/1000),
                                    data.get(i)
                            )
                    );
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
