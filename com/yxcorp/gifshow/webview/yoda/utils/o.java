package com.yxcorp.gifshow.webview.yoda.utils.o;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$d;
import java.lang.Object;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$State;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import java.lang.Enum;
import nyc.d;

public final class o implements MemoryPressureMonitor$d	// class@0017d7
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public final void a(MemoryPressureMonitor$State p0){
       p0.status = (p0.equals(MemoryPressureMonitor$State.LOW_MEMORY))? "low": "normal";
       return;
    }
}
