package com.kwai.performance.stability.crash.monitor.CrashMonitor$onApplicationPostCreate$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;
import java.lang.Object;
import android.app.Activity;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.monitor.base.Monitor;
import lg7.c;
import com.kwai.performance.stability.crash.monitor.CrashMonitor$onApplicationPostCreate$1$1$1$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import com.kwai.performance.stability.crash.monitor.CrashMonitorPreferenceManager;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class CrashMonitor$onApplicationPostCreate$1$1$1 extends Lambda implements l	// class@000de3
{
    public final CrashMonitor $this_runCatching;

    public void CrashMonitor$onApplicationPostCreate$1$1$1(CrashMonitor p0){
       this.$this_runCatching = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Activity p0){
       a.p(p0, "it");
       if (this.$this_runCatching.getMonitorConfig().b != null && !CrashMonitor.mHasReported) {
          CrashMonitor.mHasReported = true;
          Monitor_ThreadKt.a(0x2710, CrashMonitor$onApplicationPostCreate$1$1$1$1.INSTANCE);
       }
       g.a(CrashMonitorPreferenceManager.a.b().edit().putBoolean("launched", true));
       return;
    }
}
