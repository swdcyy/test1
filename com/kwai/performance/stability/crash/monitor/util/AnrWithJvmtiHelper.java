package com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv$JvmtiControl;
import com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper$JvmtiInfo;
import java.lang.StringBuilder;
import java.lang.String;
import yf7.h;
import android.os.Process;
import com.kwai.performance.stability.artti.monitor.JvmtiHelper;

public class AnrWithJvmtiHelper	// class@000e3f
{
    public static boolean a;
    public static boolean b;
    public static AnrMonitorConfigAdv$JvmtiControl c;
    public static AnrWithJvmtiHelper$JvmtiInfo d;

    public void AnrWithJvmtiHelper(){
       super();
    }
    public static void a(AnrMonitorConfigAdv$JvmtiControl p0){
       AnrWithJvmtiHelper.b = true;
       AnrWithJvmtiHelper.c = p0;
    }
    public static AnrWithJvmtiHelper$JvmtiInfo b(){
       AnrWithJvmtiHelper$JvmtiInfo jvmtiInfo = null;
       if (!AnrWithJvmtiHelper.b) {
          return jvmtiInfo;
       }
       AnrWithJvmtiHelper$JvmtiInfo lastJvmtiInf = AnrWithJvmtiHelper.getLastJvmtiInfo();
       if (lastJvmtiInf != null) {
          AnrWithJvmtiHelper.d = lastJvmtiInf;
       }
       if (AnrWithJvmtiHelper.a) {
          jvmtiInfo = lastJvmtiInf;
       }
       return jvmtiInfo;
    }
    public static void c(){
       int b = AnrWithJvmtiHelper.d();
       h.d("ArnWithJvmti", "init\(\) | switch = "+AnrWithJvmtiHelper.b+", agent = "+b);
       if (AnrWithJvmtiHelper.b && b) {
          if (AnrWithJvmtiHelper.c == null) {
             AnrWithJvmtiHelper.c = new AnrMonitorConfigAdv$JvmtiControl();
          }
          AnrMonitorConfigAdv$JvmtiControl c = AnrWithJvmtiHelper.c;
          AnrMonitorConfigAdv$JvmtiControl gcQueueLimit = c.gcQueueLimit;
          AnrMonitorConfigAdv$JvmtiControl classLoadQue = c.classLoadQueueLimit;
          b = (c.filterMainThread != null)? Process.myPid(): -1;
          AnrWithJvmtiHelper.initJvmtiCallback(gcQueueLimit, classLoadQue, b, AnrWithJvmtiHelper.c.perfDebugFlag);
          AnrWithJvmtiHelper.a = true;
       }
       return;
    }
    public static boolean d(){
       return JvmtiHelper.isLoaded();
    }
    public static native AnrWithJvmtiHelper$JvmtiInfo getLastJvmtiInfo();
    public static native void initJvmtiCallback(int p0,int p1,int p2,int p3);
}
