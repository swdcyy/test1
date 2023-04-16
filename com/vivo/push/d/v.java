package com.vivo.push.d.v;
import java.lang.Runnable;
import com.vivo.push.d.u;
import android.content.Context;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningTaskInfo;
import android.content.ComponentName;
import java.lang.StringBuilder;
import com.vivo.push.util.p;
import android.content.Intent;
import java.lang.Throwable;
import android.content.pm.PackageManager;

public final class v implements Runnable	// class@001076
{
    public final Context a;
    public final Map b;
    public final u c;

    public void v(u p0,Context p1,Map p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void run(){
       Intent launchIntent;
       String str = "OnNotificationClickTask";
       String packageName = this.a.getPackageName();
       ActivityManager systemServic = this.a.getSystemService("activity");
       try{
          int i = 100;
          List runningTasks = systemServic.getRunningTasks(i);
          if (runningTasks != null) {
             Iterator iterator = runningTasks.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   ActivityManager$RunningTaskInfo topActivity = iterator.next().topActivity;
                   if ((topActivity.getPackageName()).equals(packageName)) {
                      p.d(str, "topClassName="+topActivity.getClassName());
                      launchIntent = new Intent();
                      launchIntent.setComponent(topActivity);
                      launchIntent.setFlags(0x14000000);
                      u.a(launchIntent, this.b);
                      this.a.startActivity(launchIntent);
                      return;
                   }
                }
             }
             p.a(str, "LaunchIntent is null");
             return;
          }
       }catch(java.lang.Exception e1){
          p.a(str, "start recentIntent is error", e1);
       }
       launchIntent = this.a.getPackageManager().getLaunchIntentForPackage(this.a.getPackageName());
       if (launchIntent != null) {
          launchIntent.setFlags(0x10000000);
          u.a(launchIntent, this.b);
          this.a.startActivity(launchIntent);
          return;
       }else {
          goto label_008b ;
       }
    }
}
