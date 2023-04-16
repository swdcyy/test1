package com.kuaishou.android.security.base.perf.j;
import java.lang.Object;
import com.kuaishou.android.security.base.perf.j$c;
import com.kuaishou.android.security.base.perf.j$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import java.lang.Number;
import java.lang.System;
import java.lang.RuntimeException;
import java.lang.IllegalStateException;
import java.lang.Boolean;

public class j	// class@000f0d
{
    public j$c a;
    public j$b b;
    public long c;
    public long d;
    public long e;

    public void j(){
       super();
       this.a = j$c.a;
       this.b = j$b.b;
    }
    public static j a(){
       j obj = PatchProxy.apply(null, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new j();
       obj.n();
       return obj;
    }
    public long a(TimeUnit p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return p0.convert(this.c(), TimeUnit.NANOSECONDS);
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (System.currentTimeMillis() - this.d);
    }
    public long c(){
       j obj = PatchProxy.apply(null, this, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.a;
       if (obj == j$c.c || obj == j$c.d) {
          return (this.e - this.c);
       }
       if (obj == j$c.a) {
          return 0;
       }
       if (obj == j$c.b) {
          return (System.nanoTime() - this.c);
       }
       throw new RuntimeException("Illegal running state has occurred.");
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.b == j$b.a) {
          return (this.e - this.c);
       }
       throw new IllegalStateException("Stopwatch must be split to get the split time. ");
    }
    public long e(){
       Object obj = PatchProxy.apply(null, this, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (this.d() / 0xf4240);
    }
    public long f(){
       Object obj = PatchProxy.apply(null, this, j.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.a != j$c.a) {
          return this.d;
       }
       throw new IllegalStateException("Stopwatch has not been started");
    }
    public long g(){
       Object obj = PatchProxy.apply(null, this, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (this.c() / 0xf4240);
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, j.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.a();
    }
    public boolean i(){
       Object obj = PatchProxy.apply(null, this, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.b();
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, j.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.c();
    }
    public void k(){
       this.a = j$c.a;
       this.b = j$b.b;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       if (this.a != j$c.d) {
          throw new IllegalStateException("Stopwatch must be suspended to resume. ");
       }
       this.c = this.c + (System.nanoTime() - this.e);
       this.a = j$c.b;
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       if (this.a != j$c.b) {
          throw new IllegalStateException("Stopwatch is not running. ");
       }
       this.e = System.nanoTime();
       this.b = j$b.a;
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.d = System.currentTimeMillis();
       this.a = j$c.b;
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       j ta = this.a;
       j$c b = j$c.b;
       if (ta != b && ta != j$c.d) {
          throw new IllegalStateException("Stopwatch is not running. ");
       }
       if (ta == b) {
          this.e = System.nanoTime();
       }
       this.a = j$c.c;
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       if (this.a != j$c.b) {
          throw new IllegalStateException("Stopwatch must be running to suspend. ");
       }
       this.e = System.nanoTime();
       this.a = j$c.d;
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, j.class, "6")) {
          return;
       }
       if (this.b != j$b.a) {
          throw new IllegalStateException("Stopwatch has not been split. ");
       }
       this.b = j$b.b;
       return;
    }
}
