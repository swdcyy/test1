package com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor;
import android.app.ActivityManager$MemoryInfo;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$State;

public final class MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$2 extends Lambda implements a	// class@00116a
{
    public final ActivityManager$MemoryInfo $systemState$inlined;
    public final MemoryPressureMonitor this$0;

    public void MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$2(MemoryPressureMonitor p0,ActivityManager$MemoryInfo p1){
       this.this$0 = p0;
       this.$systemState$inlined = p1;
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
