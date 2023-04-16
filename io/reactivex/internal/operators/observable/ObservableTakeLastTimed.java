package io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed$TakeLastTimedObserver;

public final class ObservableTakeLastTimed extends a	// class@001373
{
    public final long c;
    public final long d;
    public final TimeUnit e;
    public final z f;
    public final int g;
    public final boolean h;

    public void ObservableTakeLastTimed(w p0,long p1,long p2,TimeUnit p3,z p4,int p5,boolean p6){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public void subscribeActual(y p0){
       ObservableTakeLastTimed$TakeLastTimedObserver takeLastTime = new ObservableTakeLastTimed$TakeLastTimedObserver(p0, this.c, this.d, this.e, this.f, this.g, this.h);
       this.b.subscribe(v11);
    }
}
