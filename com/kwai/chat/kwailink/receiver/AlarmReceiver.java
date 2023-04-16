package com.kwai.chat.kwailink.receiver.AlarmReceiver;
import android.content.BroadcastReceiver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.log.a;
import android.content.Context;
import com.kwai.chat.kwailink.base.b;
import android.app.AlarmManager;
import android.content.Intent;
import android.app.PendingIntent;
import android.os.SystemClock;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.util.concurrent.ScheduledExecutorService;
import b85.a;
import java.lang.Runnable;

public class AlarmReceiver extends BroadcastReceiver	// class@000a68
{
    public static final int a;

    public void AlarmReceiver(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, AlarmReceiver.class, "4")) {
          return;
       }
       try{
          a.e("AlarmReceiver", "register, schedule to run in 600000ms");
          AlarmManager systemServic = b.b().getSystemService("alarm");
          Intent intent = new Intent("com.kwai.chat.kwailink.heartbeat");
          intent.setClassName(b.b().getPackageName(), AlarmReceiver.class.getName());
          intent.setPackage(b.b().getPackageName());
          PendingIntent broadcast = PendingIntent.getBroadcast(b.b(), 0, intent, 0x8000000);
          long l = SystemClock.elapsedRealtime() + 0x927c0;
          if (Build$VERSION.SDK_INT >= 23) {
             systemServic.setExactAndAllowWhileIdle(2, l, broadcast);
          }else {
             systemServic.setExact(2, l, broadcast);
          }
       }catch(java.lang.Exception e1){
          a.g("AlarmReceiver", "register, exception="+e1.getMessage());
       }
       return;
    }
    public final void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlarmReceiver.class, "1")) {
          return;
       }
       b.c().execute(new a(this, p1, p0));
       return;
    }
}
