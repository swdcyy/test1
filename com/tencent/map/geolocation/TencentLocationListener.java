package com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocation;
import java.lang.String;

public interface abstract TencentLocationListener	// class@000e5c
{
    public static final String RADIO = "radio";

    void onLocationChanged(TencentLocation p0,int p1,String p2);
    void onStatusUpdate(String p0,int p1,String p2);
}
