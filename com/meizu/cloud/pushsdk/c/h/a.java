package com.meizu.cloud.pushsdk.c.h.a;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.a.e;
import com.meizu.cloud.pushsdk.c.c.l;
import com.meizu.cloud.pushsdk.c.g.d;
import com.meizu.cloud.pushsdk.c.g.m;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import android.net.TrafficStats;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.a.a;

public final class a	// class@0014fd
{

    public static void a(k p0,b p1){
       if (p1.f() != e.d && (p0 != null && (p0.b() != null && p0.b().a() != null))) {
          try{
             p0.b().a().close();
             if (!MinSdkChecker.isSupportNotificationChannel()) {
             label_0047 :
                return;
             }
          }catch(java.lang.Exception e0){
             a.a("Unable to close source data");
             if (!MinSdkChecker.isSupportNotificationChannel()) {
             }
          }
          TrafficStats.clearThreadStatsTag();
          goto label_0047 ;
       }else {
          goto label_0047 ;
       }
    }
}
