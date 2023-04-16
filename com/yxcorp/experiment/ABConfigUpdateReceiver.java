package com.yxcorp.experiment.ABConfigUpdateReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import wu8.f;
import android.content.Intent;
import java.lang.String;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Bundle;
import com.yxcorp.experiment.b;
import java.lang.Runnable;
import com.yxcorp.experiment.a;

public class ABConfigUpdateReceiver extends BroadcastReceiver	// class@00100f
{
    public Handler a;
    public static final int b;

    public void ABConfigUpdateReceiver(){
       super();
    }
    public static void b(Context p0,boolean p1){
       if (f.c()) {
          return;
       }
       Intent intent = new Intent();
       intent.setPackage(p0.getPackageName());
       intent.putExtra("is_user_changed", p1);
       try{
          intent.setAction("com.yxcorp.experiment.ABConfigUpdateReceiver");
          p0.sendBroadcast(intent);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final Handler a(){
       if (this.a == null) {
          _monitor_enter(this);
          if (this.a == null) {
             HandlerThread handlerThrea = new HandlerThread("ABConfigUpdate", 10);
             handlerThrea.start();
             this.a = new Handler(handlerThrea.getLooper());
          }
          _monitor_exit(this);
       }
       return this.a;
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 != null && p1.getExtras() != null) {
          if (!f.c()) {
             return;
          }else if(p1.getExtras().getBoolean("is_user_changed", false)){
             this.a().post(b.b);
          }else {
             this.a().post(a.b);
          }
       }
       return;
    }
}
