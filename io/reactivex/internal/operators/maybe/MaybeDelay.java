package io.reactivex.internal.operators.maybe.MaybeDelay;
import io.reactivex.internal.operators.maybe.a;
import brd.q;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeDelay$DelayMaybeObserver;

public final class MaybeDelay extends a	// class@001294
{
    public final long c;
    public final TimeUnit d;
    public final z e;

    public void MaybeDelay(q p0,long p1,TimeUnit p2,z p3){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void A(p p0){
       MaybeDelay$DelayMaybeObserver uDelayMaybeO = new MaybeDelay$DelayMaybeObserver(p0, this.c, this.d, this.e);
       this.b.b(v7);
    }
}
