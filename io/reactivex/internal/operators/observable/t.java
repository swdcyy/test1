package io.reactivex.internal.operators.observable.t;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import grd.g;
import brd.z$c;
import io.reactivex.internal.operators.observable.t$a;

public final class t extends a	// class@00141a
{
    public final long c;
    public final TimeUnit d;
    public final z e;
    public final boolean f;

    public void t(w p0,long p1,TimeUnit p2,z p3,boolean p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void subscribeActual(y p0){
       y oy = (this.f != null)? p0: new g(p0);
       t$a uoa = new t$a(oy, this.c, this.d, this.e.b(), this.f);
       this.b.subscribe(v0);
       return;
    }
}
