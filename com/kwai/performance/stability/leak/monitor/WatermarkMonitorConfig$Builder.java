package com.kwai.performance.stability.leak.monitor.WatermarkMonitorConfig$Builder;
import yf7.f$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitorConfig$Builder$mUsageTimeMillsInvoker$1;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitorConfig$Builder$mMemInfoUploader$1;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitorConfig;
import msd.a;
import msd.l;
import yf7.f;

public final class WatermarkMonitorConfig$Builder implements f$a	// class@001237
{
    public String[] a;
    public String[] b;
    public String[] c;
    public int d;
    public int e;
    public long f;
    public a g;
    public l h;

    public void WatermarkMonitorConfig$Builder(){
       super();
       String[] stringArray = new String[0];
       this.a = stringArray;
       stringArray = new String[0];
       this.b = stringArray;
       String[] stringArray1 = new String[0];
       this.c = stringArray1;
       this.d = 80;
       this.e = 64;
       this.f = 0x7530;
       this.g = WatermarkMonitorConfig$Builder$mUsageTimeMillsInvoker$1.INSTANCE;
       this.h = WatermarkMonitorConfig$Builder$mMemInfoUploader$1.INSTANCE;
    }
    public WatermarkMonitorConfig a(){
       WatermarkMonitorConfig watermarkMon = new WatermarkMonitorConfig(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
       return v10;
    }
    public f build(){
       return this.a();
    }
}
