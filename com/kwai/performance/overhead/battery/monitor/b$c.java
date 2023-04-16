package com.kwai.performance.overhead.battery.monitor.b$c;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import java.lang.Object;

public class b$c	// class@001137
{
    public int a;
    public int b;
    public final float[] c;
    public final BatteryMonitorConfig d;

    public void b$c(BatteryMonitorConfig p0){
       super();
       this.d = p0;
       float[] uofloatArray = new float[p0.slideWindowSize];
       this.c = uofloatArray;
    }
    public void a(float p0){
       this.b = this.b + 1;
       b$c tc = this.c;
       if (this.a >= tc.length) {
          this.a = 0;
       }
       b$c ta = this.a;
       this.a = ta + 1;
       tc[ta] = p0;
       return;
    }
    public float b(){
       float f = 0;
       if (this.a == null) {
          return f;
       }
       b$c tc = this.c;
       int len = tc.length;
       for (int i = 0; i < len; i = i + 1) {
          f = f + tc[i];
       }
       b$c tc1 = this.c;
       int len1 = (this.b >= tc1.length)? tc1.length: this.a;
       return (f / (float)len1);
    }
}
