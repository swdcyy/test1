package com.kwai.performance.stability.crash.monitor.CrashMonitor$init$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.monitor.base.d;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class CrashMonitor$init$1$1 extends Lambda implements l	// class@000de0
{
    public final d $commonConfig;

    public void CrashMonitor$init$1$1(d p0){
       this.$commonConfig = p0;
       super(1);
    }
    public final SharedPreferences invoke(String p0){
       a.p(p0, "it");
       return this.$commonConfig.f().invoke(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
