package com.kwai.performance.fluency.jank.monitor.JankMonitorConfig$Builder;
import yf7.f$a;
import java.lang.Object;
import com.kwai.performance.fluency.jank.monitor.JankMonitorConfig;
import com.kwai.performance.fluency.jank.monitor.JankMonitorConfig$Builder$build$1;
import msd.a;
import yf7.m;
import yf7.f;

public final class JankMonitorConfig$Builder implements f$a	// class@001085
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public a e;
    public m f;

    public void JankMonitorConfig$Builder(){
       super();
    }
    public JankMonitorConfig a(){
       JankMonitorConfig$Builder ta = this.a;
       JankMonitorConfig$Builder tb = this.b;
       JankMonitorConfig$Builder tc = this.c;
       JankMonitorConfig$Builder td = this.d;
       JankMonitorConfig$Builder te = this.e;
       if (te == null) {
          te = JankMonitorConfig$Builder$build$1.INSTANCE;
       }
       JankMonitorConfig jankMonitorC = new JankMonitorConfig(ta, tb, tc, td, te, this.f);
       return v7;
    }
    public f build(){
       return this.a();
    }
}
