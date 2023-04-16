package io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed$SkipLastTimedObserver;

public final class ObservableSkipLastTimed extends a	// class@00136c
{
    public final long c;
    public final TimeUnit d;
    public final z e;
    public final int f;
    public final boolean g;

    public void ObservableSkipLastTimed(w p0,long p1,TimeUnit p2,z p3,int p4,boolean p5){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public void subscribeActual(y p0){
       ObservableSkipLastTimed$SkipLastTimedObserver skipLastTime = new ObservableSkipLastTimed$SkipLastTimedObserver(p0, this.c, this.d, this.e, this.f, this.g);
       this.b.subscribe(v9);
    }
}
