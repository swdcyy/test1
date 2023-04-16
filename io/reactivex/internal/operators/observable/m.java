package io.reactivex.internal.operators.observable.m;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.util.concurrent.Callable;
import brd.y;
import io.reactivex.internal.operators.observable.m$b;
import grd.g;
import brd.z$c;
import io.reactivex.internal.operators.observable.m$a;
import io.reactivex.internal.operators.observable.m$c;

public final class m extends a	// class@0013df
{
    public final long c;
    public final long d;
    public final TimeUnit e;
    public final z f;
    public final Callable g;
    public final int h;
    public final boolean i;

    public void m(w p0,long p1,long p2,TimeUnit p3,z p4,Callable p5,int p6,boolean p7){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public void subscribeActual(y p0){
       if (!this.c - this.d && this.h == Integer.MAX_VALUE) {
          m$b uob = new m$b(new g(p0), this.g, this.c, this.e, this.f);
          this.b.subscribe(v8);
          return;
       }else {
          z$c uoc = this.f.b();
          if (!this.c - this.d) {
             m$a uoa = new m$a(new g(p0), this.g, this.c, this.e, this.h, this.i, uoc);
             this.b.subscribe(v10);
             return;
          }else {
             m$c uoc1 = new m$c(new g(p0), this.g, this.c, this.d, this.e, uoc);
             this.b.subscribe(v10);
             return;
          }
       }
    }
}
