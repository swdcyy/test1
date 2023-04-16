package com.kwai.performance.overhead.battery.monitor.BatteryMonitor$f;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.String;
import android.util.Log;
import yf7.h;
import yf7.i;
import ag7.b;
import yf7.d;
import yf7.d$a;

public final class BatteryMonitor$f implements Runnable	// class@001122
{
    public final Runnable b;

    public void BatteryMonitor$f(Runnable p0){
       this.b = p0;
       super();
    }
    public final void run(){
       this.b.run();
       return;
    }
}
