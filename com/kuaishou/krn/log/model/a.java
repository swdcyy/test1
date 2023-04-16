package com.kuaishou.krn.log.model.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import java.lang.Math;

public class a	// class@0008e9
{
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public KrnPageRenderParams i;
    public e j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;

    public void a(long p0,long p1,long p2){
       super();
       this.b = -1;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = 0;
       this.i = null;
       this.j = null;
       this.k = -1;
       this.l = -1;
       this.m = -1;
       this.n = -1;
       this.o = -1;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = -1;
       this.t = -1;
       this.u = -1;
       this.a = p0;
       this.h = p2 - p1;
    }
    public static long a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return SystemClock.elapsedRealtime();
    }
    public final long b(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (Math.max(this.b, this.c) - this.a);
    }
    public long c(){
       long l = this.d - this.a;
       if (l > 0) {
       }else {
          l = 0;
       }
       return l;
    }
    public long d(){
       long l = this.e - this.a;
       if (l > 0) {
       }else {
          l = 0;
       }
       return l;
    }
    public long e(){
       return this.f;
    }
    public long f(){
       return this.g;
    }
    public void g(long p0){
       if (this.b - -1) {
          return;
       }
       this.b = p0;
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (this.e - -1) {
          return;
       }
       this.e = SystemClock.elapsedRealtime();
       return;
    }
}
