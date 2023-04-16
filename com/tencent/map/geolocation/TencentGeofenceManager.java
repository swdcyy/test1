package com.tencent.map.geolocation.TencentGeofenceManager;
import android.content.Context;
import java.lang.Object;
import c.t.m.g.cl;
import com.tencent.map.geolocation.TencentGeofence;
import android.app.PendingIntent;
import java.lang.String;

public class TencentGeofenceManager	// class@000e59
{
    public cl a;

    public void TencentGeofenceManager(Context p0){
       super();
       this.a = new cl(p0);
    }
    public void addFence(TencentGeofence p0,PendingIntent p1){
       this.a.a(p0, p1);
    }
    public void destroy(){
       this.a.a();
    }
    public void removeAllFences(){
       this.a.b();
    }
    public void removeFence(TencentGeofence p0){
       this.a.a(p0);
    }
    public void removeFence(String p0){
       this.a.a(p0);
    }
}
