package com.kwai.performance.stability.oom.monitor.OOMMonitorConfig$Builder;
import yf7.f$a;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig$Builder$a;
import nsd.u;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig$Builder$Companion$DEFAULT_HEAP_THRESHOLD$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig$Builder$Companion$DEFAULT_THREAD_THRESHOLD$2;
import java.lang.Object;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import java.lang.Float;
import java.util.Objects;
import java.lang.Number;
import java.lang.Integer;
import com.kwai.performance.stability.oom.monitor.OOMHprofUploader;
import ch7.d;
import kh7.d;
import kh7.f;
import yf7.f;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class OOMMonitorConfig$Builder implements f$a	// class@001252
{
    public int a;
    public int b;
    public Float c;
    public int d;
    public int e;
    public Integer f;
    public float g;
    public float h;
    public int i;
    public int j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public OOMHprofUploader u;
    public d v;
    public d w;
    public f x;
    public static final OOMMonitorConfig$Builder$a A;
    public static final p y;
    public static final p z;

    static {
       OOMMonitorConfig$Builder.A = new OOMMonitorConfig$Builder$a(null);
       OOMMonitorConfig$Builder.y = s.c(OOMMonitorConfig$Builder$Companion$DEFAULT_HEAP_THRESHOLD$2.INSTANCE);
       OOMMonitorConfig$Builder.z = s.c(OOMMonitorConfig$Builder$Companion$DEFAULT_THREAD_THRESHOLD$2.INSTANCE);
    }
    public void OOMMonitorConfig$Builder(){
       super();
       this.a = 5;
       this.b = 0x4d3f6400;
       this.d = 0x37b1d0;
       this.e = 1000;
       this.g = 0.05f;
       this.h = 0x3f666666;
       this.i = 0x55730;
       this.j = 3;
       this.k = 0x3a98;
       this.l = 0x2e8a10;
       this.m = 0x319750;
       this.n = 12;
       this.o = 3;
       this.p = 0x30d40;
       this.q = 0x61a80;
       this.r = true;
       this.s = true;
    }
    public OOMMonitorConfig a(){
       float f;
       int i;
       OOMMonitorConfig$Builder uBuilder = this;
       OOMMonitorConfig$Builder a = uBuilder.a;
       OOMMonitorConfig$Builder b = uBuilder.b;
       OOMMonitorConfig$Builder c = uBuilder.c;
       if (c != null) {
          f = c.floatValue();
       }else {
          Objects.requireNonNull(OOMMonitorConfig$Builder.A);
          f = OOMMonitorConfig$Builder.y.getValue().floatValue();
       }
       float f1 = f;
       OOMMonitorConfig$Builder d = uBuilder.d;
       OOMMonitorConfig$Builder e = uBuilder.e;
       c = uBuilder.f;
       if (c != null) {
          i = c.intValue();
       }else {
          Objects.requireNonNull(OOMMonitorConfig$Builder.A);
          i = OOMMonitorConfig$Builder.z.getValue().intValue();
       }
       OOMMonitorConfig oOMMonitorCo = new OOMMonitorConfig(a, b, f1, d, e, i, uBuilder.g, uBuilder.j, uBuilder.k, uBuilder.r, uBuilder.s, uBuilder.t, uBuilder.h, uBuilder.i, uBuilder.l, uBuilder.m, uBuilder.n, uBuilder.o, uBuilder.p, uBuilder.q, uBuilder.u, uBuilder.v, uBuilder.w, uBuilder.x);
       return v27;
    }
    public final OOMMonitorConfig$Builder b(int p0){
       this.a = p0;
       return this;
    }
    public f build(){
       return this.a();
    }
    public final OOMMonitorConfig$Builder c(int p0){
       this.b = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder d(float p0){
       this.g = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder e(boolean p0){
       this.r = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder f(boolean p0){
       this.t = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder g(boolean p0){
       this.s = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder h(int p0){
       this.e = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder i(int p0){
       this.i = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder j(float p0){
       this.h = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder k(float p0){
       this.c = Float.valueOf(p0);
       return this;
    }
    public final OOMMonitorConfig$Builder l(OOMHprofUploader p0){
       a.p(p0, "hprofUploader");
       this.u = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder m(int p0){
       this.l = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder n(int p0){
       this.n = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder o(int p0){
       this.o = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder p(int p0){
       this.m = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder q(int p0){
       this.q = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder r(int p0){
       this.p = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder s(d p0){
       a.p(p0, "leakFixerConfig");
       this.v = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder t(long p0){
       this.k = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder u(int p0){
       this.j = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder v(d p0){
       a.p(p0, "oomInfoCollector");
       this.w = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder w(f p0){
       a.p(p0, "oomTrigger");
       this.x = p0;
       return this;
    }
    public final OOMMonitorConfig$Builder x(int p0){
       this.f = Integer.valueOf(p0);
       return this;
    }
    public final OOMMonitorConfig$Builder y(int p0){
       this.d = p0;
       return this;
    }
}
