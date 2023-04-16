package com.kwai.performance.fluency.jank.monitor.JankMonitorConfig;
import yf7.f;
import msd.a;
import yf7.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class JankMonitorConfig extends f	// class@001086
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final a e;
    public final m f;

    public void JankMonitorConfig(boolean p0,boolean p1,boolean p2,boolean p3,a p4,m p5){
       a.p(p4, "jankOptimizeThresholdInvoker");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final boolean a(){
       return this.d;
    }
}
