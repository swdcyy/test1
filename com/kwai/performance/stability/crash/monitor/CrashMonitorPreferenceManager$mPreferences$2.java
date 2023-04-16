package com.kwai.performance.stability.crash.monitor.CrashMonitorPreferenceManager$mPreferences$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.SharedPreferences;
import com.kwai.performance.stability.crash.monitor.CrashMonitorPreferenceManager;
import java.lang.Object;
import msd.l;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class CrashMonitorPreferenceManager$mPreferences$2 extends Lambda implements a	// class@000de6
{
    public static final CrashMonitorPreferenceManager$mPreferences$2 INSTANCE;

    static {
       CrashMonitorPreferenceManager$mPreferences$2.INSTANCE = new CrashMonitorPreferenceManager$mPreferences$2();
    }
    public void CrashMonitorPreferenceManager$mPreferences$2(){
       super(0);
    }
    public final SharedPreferences invoke(){
       l c = CrashMonitorPreferenceManager.c;
       if (c != null) {
          return c.invoke("crash_monitor_pref");
       }
       a.S("mSharedPreferencesInvoker");
       throw null;
    }
    public Object invoke(){
       return this.invoke();
    }
}
