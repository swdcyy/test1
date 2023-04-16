package com.tencent.map.geolocation.TencentLocationManager$1;
import android.content.ServiceConnection;
import com.tencent.map.geolocation.TencentLocationManager;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import c.t.m.g.cd;
import java.lang.String;

public class TencentLocationManager$1 implements ServiceConnection	// class@000e5d
{
    public final TencentLocationManager a;

    public void TencentLocationManager$1(TencentLocationManager p0){
       this.a = p0;
       super();
    }
    public void onNullBinding(ComponentName p0){
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       cd.c().a("LOC", "s onServiceConnected");
    }
    public void onServiceDisconnected(ComponentName p0){
       cd.c().a("LOC", "s onServiceDisconnected");
    }
}
