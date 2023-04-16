package com.tencent.map.geolocation.fence.TxGeofenceManagerState;
import com.tencent.map.geolocation.TencentLocation;
import java.util.Map;
import java.lang.String;
import java.util.List;

public interface abstract TxGeofenceManagerState	// class@000e63
{

    void add(int p0,TencentLocation p1);
    long getLastInterval();
    TencentLocation getLastLocation();
    long getLastLocationTime();
    Map getLastSummary();
    String getLocationTimes();
    List getLocations();
    long getNextLocationTime();
    double getSpeed();
    List getSummary();
    void reset();
}
