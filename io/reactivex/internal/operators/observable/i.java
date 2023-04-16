package io.reactivex.internal.operators.observable.i;
import brd.t;
import frd.a;
import erd.g;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;

public final class i extends t	// class@0013c8
{
    public final a b;
    public final int c;
    public final g d;
    public final AtomicInteger e;

    public void i(a p0,int p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = new AtomicInteger();
    }
    public void subscribeActual(y p0){
       this.b.subscribe(p0);
       if (this.e.incrementAndGet() == this.c) {
          this.b.c(this.d);
       }
       return;
    }
}
