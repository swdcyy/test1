package com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$a;
import android.content.ComponentCallbacks2;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$State;
import java.util.Objects;

public final class MemoryPressureMonitor$a implements ComponentCallbacks2	// class@001165
{
    public final MemoryPressureMonitor b;

    public void MemoryPressureMonitor$a(MemoryPressureMonitor p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       a.q(p0, "p0");
    }
    public void onLowMemory(){
       this.b.b(MemoryPressureMonitor$State.LOW_MEMORY);
    }
    public void onTrimMemory(int p0){
       MemoryPressureMonitor a;
       MemoryPressureMonitor$a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != 5) {
          a = (p0 != 10 && p0 != 15)? tb.a: MemoryPressureMonitor$State.LOW_MEMORY;
       }else {
          a = MemoryPressureMonitor$State.NORMAL_MEMORY;
       }
       tb.b(a);
       return;
    }
}
