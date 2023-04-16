package com.kwai.performance.fluency.thermal.monitor.ThermalMonitorConfig$Builder;
import yf7.f$a;
import java.lang.Object;
import com.kwai.performance.fluency.thermal.monitor.ThermalMonitorConfig;
import com.kwai.performance.fluency.thermal.monitor.ThermalMonitorConfig$Builder$build$1;
import msd.a;
import yf7.f;

public final class ThermalMonitorConfig$Builder implements f$a	// class@0010ef
{
    public a a;

    public void ThermalMonitorConfig$Builder(){
       super();
    }
    public ThermalMonitorConfig a(){
       ThermalMonitorConfig$Builder ta = this.a;
       if (ta != null) {
       }else {
          ta = ThermalMonitorConfig$Builder$build$1.INSTANCE;
       }
       return new ThermalMonitorConfig(ta);
    }
    public f build(){
       return this.a();
    }
}
