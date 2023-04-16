package com.meizu.cloud.pushsdk.b.a.a;
import android.content.Context;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import android.app.AlarmManager;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.a.a$a;
import com.meizu.cloud.pushsdk.b.a.a$1;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.System;
import android.app.PendingIntent;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import java.lang.Exception;

public class a	// class@001499
{
    public AlarmManager a;
    public Context b;
    public Runnable c;
    public long d;
    public int e;
    public a$a f;
    public PendingIntent g;
    public String h;
    public boolean i;

    public void a(Context p0,Runnable p1,long p2){
       super(p0, p1, p2, true);
    }
    public void a(Context p0,Runnable p1,long p2,boolean p3){
       super();
       p0 = p0.getApplicationContext();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3 ^ 0x01;
       this.a = p0.getSystemService("alarm");
       this.i = true;
    }
    public static String a(a p0){
       return p0.h;
    }
    public static boolean a(a p0,boolean p1){
       p0.i = p1;
       return p1;
    }
    public static void b(a p0){
       p0.c();
    }
    public static Runnable c(a p0){
       return p0.c;
    }
    public boolean a(){
       boolean b = false;
       if (this.i == null) {
          DebugLogger.e("AlarmUtils", "last task not completed");
          return b;
       }else {
          this.i = b;
          a$a uoa = new a$a(this, null);
          this.f = uoa;
          String str = "alarm.util";
          UniversalReceiver.e(this.b, uoa, new IntentFilter(str));
          this.h = String.valueOf(System.currentTimeMillis());
          this.g = PendingIntent.getBroadcast(this.b, b, new Intent(str), 0x40000000);
          if (Build$VERSION.SDK_INT >= 23) {
             this.a.setExactAndAllowWhileIdle(this.e, (System.currentTimeMillis() + this.d), this.g);
          }else {
             this.a.setExact(this.e, (System.currentTimeMillis() + this.d), this.g);
          }
          DebugLogger.i("AlarmUtils", "start delayed task, keyword: "+this.h);
          return true;
       }
    }
    public void b(){
       if (this.a != null && (this.g != null && this.i == null)) {
          DebugLogger.i("AlarmUtils", "cancel  delayed task, keyword: "+this.h);
          this.a.cancel(this.g);
       }
    label_002b :
       this.c();
       return;
    }
    public final void c(){
       try{
          a tf = this.f;
          if (tf != null) {
             UniversalReceiver.f(this.b, tf);
             this.f = null;
          }
       }catch(java.lang.Exception e0){
          DebugLogger.e("AlarmUtils", "clean error, "+e0.getMessage());
       }
       return;
    }
}
