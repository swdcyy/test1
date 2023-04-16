package com.kwai.performance.stability.oom.monitor.OOMMonitorConfig$Builder$Companion$DEFAULT_THREAD_THRESHOLD$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import java.lang.Integer;

public final class OOMMonitorConfig$Builder$Companion$DEFAULT_THREAD_THRESHOLD$2 extends Lambda implements a	// class@001250
{
    public static final OOMMonitorConfig$Builder$Companion$DEFAULT_THREAD_THRESHOLD$2 INSTANCE;

    static {
       OOMMonitorConfig$Builder$Companion$DEFAULT_THREAD_THRESHOLD$2.INSTANCE = new OOMMonitorConfig$Builder$Companion$DEFAULT_THREAD_THRESHOLD$2();
    }
    public void OOMMonitorConfig$Builder$Companion$DEFAULT_THREAD_THRESHOLD$2(){
       super(0);
    }
    public final int invoke(){
       int i = (a.g(MonitorBuildConfig.e(), "EMUI") && Build$VERSION.SDK_INT <= 26)? 450: 750;
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
