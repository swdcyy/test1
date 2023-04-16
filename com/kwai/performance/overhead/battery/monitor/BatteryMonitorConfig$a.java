package com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig$a;
import yf7.f$a;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuInfoConfig;
import java.util.List;
import nsd.u;
import msd.l;
import msd.a;
import msd.p;
import yf7.f;

public final class BatteryMonitorConfig$a implements f$a	// class@001127
{
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int[] g;
    public boolean h;
    public long i;
    public boolean j;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public List r;
    public List s;
    public ThreadCpuInfoConfig t;
    public l u;
    public ArrayList v;
    public a w;
    public p x;

    public void BatteryMonitorConfig$a(){
       super();
       this.d = 1000;
       this.e = 10;
       this.f = 200;
       this.g = BatteryMonitorConfig.TIME_DIFF_THRESHOLD_DEFAULT;
       this.i = 4000;
       this.k = 80.00f;
       this.l = 2;
       this.m = 1;
       this.n = 3;
       this.o = 60;
       this.p = 1;
       this.q = 11;
       this.v = new ArrayList();
    }
    public BatteryMonitorConfig a(){
       long l;
       int[] tIME_DIFF_TH;
       float f;
       BatteryMonitorConfig$a uoa = this;
       BatteryMonitorConfig$a d = uoa.d;
       BatteryMonitorConfig$a uoa1 = 1000;
       if (d - uoa1 < 0) {
          d = uoa1;
       }
       uoa.d = d;
       uoa1 = uoa.i;
       int i = 4000;
       if (uoa1 - i < 0) {
          l = i;
       }
       uoa.i = l;
       int i1 = (int)(0x2710 / d);
       BatteryMonitorConfig$a e = uoa.e;
       if (e >= i1) {
          i1 = e;
       }
       uoa.e = i1;
       d = uoa.f;
       e = 1000;
       if (d < 20) {
          i1 = 20;
       }else if(d > e){
          i1 = 1000;
       }
       uoa.f = i1;
       d = uoa.g;
       int i2 = 3;
       if (d != null) {
          if (d == null) {
             a.L();
          }
          if (d.length == i2) {
             tIME_DIFF_TH = uoa.g;
          label_0048 :
             uoa.g = tIME_DIFF_TH;
             d = uoa.k;
             int i3 = 1;
             if (d - (float)i3 <= 0) {
                f = 80.00f;
             }
             uoa.k = f;
             d = uoa.l;
             if (d < i3) {
                i1 = 1;
             }
             uoa.l = i1;
             d = uoa.m;
             if (d < null) {
                i1 = 0;
             }
             uoa.m = i1;
             d = uoa.o;
             BatteryMonitorConfig$a uoa2 = 600;
             BatteryMonitorConfig$a uoa3 = 10;
             if (d < uoa3) {
                i1 = 60;
             }else if(d > uoa2){
                i1 = 600;
             }
             uoa.o = i1;
             d = uoa.n;
             if (d >= i2) {
                i2 = (d > uoa3)? 10: d;
             }
          label_0080 :
             uoa.n = i2;
             d = uoa.p;
             if (d > null) {
                i3 = d;
             }
             uoa.p = i3;
             d = uoa.q;
             if (d <= null) {
                i1 = 11;
             }
             uoa.q = i1;
             d = uoa.t;
             if (d == null) {
                ThreadCpuInfoConfig threadCpuInf = new ThreadCpuInfoConfig(null, false, 0, null, 15, null);
             }
             uoa.t = d;
             uoa2 = uoa.a;
             uoa3 = uoa.b;
             BatteryMonitorConfig$a c = uoa.c;
             BatteryMonitorConfig$a d1 = uoa.d;
             BatteryMonitorConfig$a e1 = uoa.e;
             BatteryMonitorConfig$a f1 = uoa.f;
             BatteryMonitorConfig$a g = uoa.g;
             if (g == null) {
                a.L();
             }
             BatteryMonitorConfig uBatteryMoni = new BatteryMonitorConfig(false, uoa2, uoa3, c, d1, e1, f1, g, uoa.h, uoa.i, uoa.j, uoa.k, uoa.l, uoa.m, uoa.n, uoa.o, uoa.p, uoa.q, uoa.r, uoa.s, uoa.t, uoa.u, uoa.v, uoa.w, uoa.x, 1, null);
             return d;
          }
       }
       tIME_DIFF_TH = BatteryMonitorConfig.TIME_DIFF_THRESHOLD_DEFAULT;
       goto label_0048 ;
    }
    public f build(){
       return this.a();
    }
}
