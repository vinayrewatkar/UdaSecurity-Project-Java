package main.java.com.udacity.catpoint.application;

import main.java.com.udacity.catpoint.security.data.AlarmStatus;

/**
 * Identifies a component that should be notified whenever the system status changes
 */
public interface StatusListener {
    void notify(AlarmStatus status);
    void catDetected(boolean catDetected);
    void sensorStatusChanged();
}
