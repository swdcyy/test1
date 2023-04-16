package com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$State;

public final class MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$1 extends Lambda implements a	// class@001169
{
    public final ActivityManager$RunningAppProcessInfo $memoryState$inlined;
    public final MemoryPressureMonitor this$0;

    public void MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$1(MemoryPressureMonitor p0,ActivityManager$RunningAppProcessInfo p1){
       this.this$0 = p0;
       this.$memoryState$inlined = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       this.this$0.b(MemoryPressureMonitor$State.NORMAL_MEMORY);
    }
}
