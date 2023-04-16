package com.tencent.map.geolocation.TencentLocationBridge;
import java.lang.String;
import com.tencent.map.geolocation.TencentLocation;
import android.content.Context;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationRequest;
import android.os.Looper;

public interface abstract TencentLocationBridge	// class@000e5b
{

    String getBuild();
    int getCoordinateType();
    TencentLocation getLastKnownLocation();
    String getVersion();
    void init(Context p0);
    void removeUpdates(TencentLocationListener p0);
    int requestLocationUpdates(TencentLocationRequest p0,TencentLocationListener p1,Looper p2);
    int requestSingleFreshLocation(TencentLocationRequest p0,TencentLocationListener p1,Looper p2);
    void setCoordinateType(int p0);
    void setDebuggable(boolean p0);
    void setDeviceID(Context p0,String p1);
    boolean startIndoorLocation();
    boolean stopIndoorLocation();
    void triggerCodeGuarder(boolean p0);
}
