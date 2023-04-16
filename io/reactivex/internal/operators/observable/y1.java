package io.reactivex.internal.operators.observable.y1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import grd.g;
import io.reactivex.internal.operators.observable.y1$b;
import io.reactivex.internal.operators.observable.y1$a;
import io.reactivex.internal.operators.observable.y1$c;
import brd.z$c;

public final class y1 extends a	// class@00143d
{
    public final long c;
    public final long d;
    public final TimeUnit e;
    public final z f;
    public final long g;
    public final int h;
    public final boolean i;

    public void y1(w p0,long p1,long p2,TimeUnit p3,z p4,long p5,int p6,boolean p7){
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
       g og = new g(p0);
       y1 tc = this.c;
       y1 td = this.d;
       if (!tc - td) {
          y1 tg = this.g;
          if (!tg - Long.MAX_VALUE) {
             y1$b uob = new y1$b(og, this.c, this.e, this.f, this.h);
             this.b.subscribe(tg);
             return;
          }else {
             y1$a uoa = new y1$a(og, tc, this.e, this.f, this.h, tg, this.i);
             this.b.subscribe(v10);
             return;
          }
       }else {
          y1$c uoc = new y1$c(og, tc, td, this.e, this.f.b(), this.h);
          this.b.subscribe(v9);
          return;
       }
    }
}
