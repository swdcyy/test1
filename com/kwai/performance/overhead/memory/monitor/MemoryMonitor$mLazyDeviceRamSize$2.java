package com.kwai.performance.overhead.memory.monitor.MemoryMonitor$mLazyDeviceRamSize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Application;
import yf7.k;
import java.lang.String;
import java.lang.Object;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import java.lang.Long;

public final class MemoryMonitor$mLazyDeviceRamSize$2 extends Lambda implements a	// class@001159
{
    public static final MemoryMonitor$mLazyDeviceRamSize$2 INSTANCE;

    static {
       MemoryMonitor$mLazyDeviceRamSize$2.INSTANCE = new MemoryMonitor$mLazyDeviceRamSize$2();
    }
    public void MemoryMonitor$mLazyDeviceRamSize$2(){
       super(0);
    }
    public final long invoke(){
       long l;
       ActivityManager systemServic = k.b().getSystemService("activity");
       if (systemServic != null) {
          ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
          systemServic.getMemoryInfo(memoryInfo);
          l = memoryInfo.totalMem / 1024;
       }else {
          l = 0;
       }
       return l;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
