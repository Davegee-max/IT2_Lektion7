package dataCollector;

import java.sql.Timestamp;

public interface EKGData {
    Timestamp getTimestamp();
    double getReading();
}
