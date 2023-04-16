package com.facebook.react.HeadlessJsTaskService;
import ee.e;
import android.app.Service;
import java.util.concurrent.CopyOnWriteArraySet;
import rd.b0;
import android.app.Application;
import rd.m;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactContext;
import ee.c;
import android.os.PowerManager$WakeLock;
import java.lang.Integer;
import java.lang.Object;
import java.util.Set;

public abstract class HeadlessJsTaskService extends Service implements e	// class@001167
{
    public final Set b;
    public static PowerManager$WakeLock c;

    public void HeadlessJsTaskService(){
       super();
       this.b = new CopyOnWriteArraySet();
    }
    public b0 a(){
       return this.getApplication().a();
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public void onDestroy(){
       PowerManager$WakeLock c;
       super.onDestroy();
       if (this.a().d()) {
          ReactContext reactContext = this.a().b().n();
          if (reactContext != null) {
             c.c(reactContext).f(this);
          }
       }
       c = HeadlessJsTaskService.c;
       if (c != null) {
          c.release();
       }
       return;
    }
    public void onHeadlessJsTaskFinish(int p0){
       this.b.remove(Integer.valueOf(p0));
       if (!this.b.size()) {
          this.stopSelf();
       }
       return;
    }
    public void onHeadlessJsTaskStart(int p0){
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return 2;
    }
}
