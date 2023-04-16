package com.tencent.map.geolocation.s;
import android.app.Service;
import com.tencent.map.geolocation.s$MyBinder;
import android.content.Intent;
import android.os.IBinder;
import android.os.Bundle;
import java.lang.String;
import java.lang.Object;
import android.app.Notification;
import java.lang.Integer;
import c.t.m.g.cd;

public class s extends Service	// class@000e65
{
    public boolean isStartForeground;
    public s$MyBinder mBinder;
    public static boolean removeNotification = true;

    public void s(){
       super();
       this.isStartForeground = false;
       this.mBinder = new s$MyBinder(this);
    }
    public IBinder onBind(Intent p0){
       Notification notification = p0.getExtras().get("LocNotification");
       int i = p0.getExtras().get("LocNotificationId").intValue();
       if (i > 0 && (notification != null && this.isStartForeground == null)) {
          this.startForeground(i, notification);
          cd.c().a("LOC", "startForeground");
          this.isStartForeground = true;
       }
    label_0035 :
       return this.mBinder;
    }
    public void onCreate(){
       super.onCreate();
    }
    public void onDestroy(){
       super.onDestroy();
       if (this.isStartForeground != null) {
          this.isStartForeground = false;
          this.stopForeground(s.removeNotification);
       }
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return super.onStartCommand(p0, p1, p2);
    }
    public boolean onUnbind(Intent p0){
       if (this.isStartForeground != null) {
          this.isStartForeground = false;
          this.stopForeground(s.removeNotification);
          cd.c().a("LOC", "stopForeground");
       }
       return super.onUnbind(p0);
    }
}
