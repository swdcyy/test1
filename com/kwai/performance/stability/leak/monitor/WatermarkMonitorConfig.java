package com.kwai.performance.stability.leak.monitor.WatermarkMonitorConfig;
import yf7.f;
import java.lang.String;
import msd.a;
import msd.l;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class WatermarkMonitorConfig extends f	// class@001238
{
    public final String[] a;
    public final String[] b;
    public final String[] c;
    public final int d;
    public final int e;
    public final long f;
    public final a g;
    public final l h;

    public void WatermarkMonitorConfig(String[] p0,String[] p1,String[] p2,int p3,int p4,long p5,a p6,l p7){
       a.q(p0, "selectedSoList");
       a.q(p1, "ignoredSoList");
       a.q(p2, "focusPages");
       a.q(p6, "usageTimeMillsInvoker");
       a.q(p7, "memInfoUploader");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
}
