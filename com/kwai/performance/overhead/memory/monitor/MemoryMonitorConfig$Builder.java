package com.kwai.performance.overhead.memory.monitor.MemoryMonitorConfig$Builder;
import yf7.f$a;
import java.lang.Object;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitorConfig;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitorConfig$Builder$build$1;
import msd.a;
import yf7.f;

public final class MemoryMonitorConfig$Builder implements f$a	// class@001160
{
    public long a;
    public a b;

    public void MemoryMonitorConfig$Builder(){
       super();
       this.a = 500;
    }
    public MemoryMonitorConfig a(){
       MemoryMonitorConfig$Builder ta = this.a;
       MemoryMonitorConfig$Builder tb = this.b;
       if (tb != null) {
       }else {
          tb = MemoryMonitorConfig$Builder$build$1.INSTANCE;
       }
       return new MemoryMonitorConfig(ta, tb);
    }
    public f build(){
       return this.a();
    }
}
