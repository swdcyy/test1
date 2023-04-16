package com.amap.api.location.APSService;
import android.app.Service;
import android.content.Context;
import com.loc.f;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fj;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcelable;
import android.app.Notification;

public class APSService extends Service	// class@000ed2
{
    public f a;
    public int b;
    public boolean c;

    public void APSService(){
       super();
       this.b = 0;
       this.c = false;
    }
    public final void a(Context p0){
       if (this.a == null) {
          this.a = new f(p0);
       }
       this.a.a();
       super.onCreate();
       return;
    }
    public IBinder onBind(Intent p0){
       return this.a.a(p0);
    }
    public void onCreate(){
       this.a(this);
    }
    public void onDestroy(){
       this.a.b();
       if (this.c != null) {
          this.stopForeground(true);
       }
       super.onDestroy();
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       if (p0 != null) {
          p2 = p0.getIntExtra("g", 0);
          if (p2 == 1) {
             p2 = p0.getIntExtra("i", 0);
             Notification parcelableEx = p0.getParcelableExtra("h");
             if (p2 && parcelableEx != null) {
                this.startForeground(p2, parcelableEx);
                this.c = true;
                this.b = this.b + true;
             }
          }else if(p2 == 2){
             if (p0.getBooleanExtra("j", true)) {
                APSService tb = this.b;
                if (tb > null) {
                   this.b = tb - true;
                }
             }
             if (this.b <= null) {
                this.stopForeground(true);
                this.c = false;
             }else {
                this.stopForeground(0);
             }
          }
       }
       return 0;
    }
}
