package com.kwai.performance.fluency.thermal.monitor.ThermalMonitor$startSection$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import vf7.a;
import java.lang.Object;
import qrd.l1;
import com.google.gson.Gson;
import java.lang.String;
import yf7.i;
import yf7.d;
import yf7.d$a;
import kotlin.jvm.internal.a;
import yf7.h;

public final class ThermalMonitor$startSection$2$1 extends Lambda implements a	// class@0010eb
{
    public final a $thermalEvent;

    public void ThermalMonitor$startSection$2$1(a p0){
       this.$thermalEvent = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       String str = new Gson().q(this.$thermalEvent);
       d$a.c(i.a, "perf-thermal", str, false, 4, null);
       a.h(str, "it");
       h.d("ThermalMonitor", str);
    }
}
