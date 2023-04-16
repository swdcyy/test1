package com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder$Companion$MAX_MEMORY$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Application;
import yf7.k;
import java.lang.String;
import java.lang.Object;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import kotlin.TypeCastException;
import java.lang.Long;

public final class BlockMonitorConfig$Builder$Companion$MAX_MEMORY$2 extends Lambda implements a	// class@00105b
{
    public static final BlockMonitorConfig$Builder$Companion$MAX_MEMORY$2 INSTANCE;

    static {
       BlockMonitorConfig$Builder$Companion$MAX_MEMORY$2.INSTANCE = new BlockMonitorConfig$Builder$Companion$MAX_MEMORY$2();
    }
    public void BlockMonitorConfig$Builder$Companion$MAX_MEMORY$2(){
       super(0);
    }
    public final long invoke(){
       Object systemServic = k.b().getSystemService("activity");
       if (systemServic == null) {
          throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
       }
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       systemServic.getMemoryInfo(memoryInfo);
       return memoryInfo.totalMem;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
