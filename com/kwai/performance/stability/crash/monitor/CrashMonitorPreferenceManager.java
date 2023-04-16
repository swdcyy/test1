package com.kwai.performance.stability.crash.monitor.CrashMonitorPreferenceManager;
import com.kwai.performance.stability.crash.monitor.CrashMonitorPreferenceManager$mPreferences$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.SharedPreferences;
import java.lang.String;

public final class CrashMonitorPreferenceManager	// class@000de7
{
    public static final CrashMonitorPreferenceManager a;
    public static final p b;
    public static l c;

    static {
       CrashMonitorPreferenceManager.a = new CrashMonitorPreferenceManager();
       CrashMonitorPreferenceManager.b = s.c(CrashMonitorPreferenceManager$mPreferences$2.INSTANCE);
    }
    public void CrashMonitorPreferenceManager(){
       super();
    }
    public final boolean a(){
       return this.b().getBoolean("launched", false);
    }
    public final SharedPreferences b(){
       return CrashMonitorPreferenceManager.b.getValue();
    }
}
