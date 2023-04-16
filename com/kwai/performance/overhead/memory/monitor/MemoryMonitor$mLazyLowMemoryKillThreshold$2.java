package com.kwai.performance.overhead.memory.monitor.MemoryMonitor$mLazyLowMemoryKillThreshold$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Application;
import yf7.k;
import java.lang.String;
import java.lang.Object;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import java.lang.Long;

public final class MemoryMonitor$mLazyLowMemoryKillThreshold$2 extends Lambda implements a	// class@00115a
{
    public static final MemoryMonitor$mLazyLowMemoryKillThreshold$2 INSTANCE;

    static {
       MemoryMonitor$mLazyLowMemoryKillThreshold$2.INSTANCE = new MemoryMonitor$mLazyLowMemoryKillThreshold$2();
    }
    public void MemoryMonitor$mLazyLowMemoryKillThreshold$2(){
       super(0);
    }
    public final long invoke(){
       long l;
       ActivityManager systemServic = k.b().getSystemService("activity");
       if (systemServic != null) {
          ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
          systemServic.getMemoryInfo(memoryInfo);
          l = memoryInfo.threshold / (long)1024;
       }else {
          l = 0;
       }
       return l;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
