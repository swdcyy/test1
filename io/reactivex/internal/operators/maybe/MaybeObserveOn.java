package io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.a;
import brd.q;
import brd.z;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeObserveOn$ObserveOnMaybeObserver;

public final class MaybeObserveOn extends a	// class@0012a4
{
    public final z c;

    public void MaybeObserveOn(q p0,z p1){
       super(p0);
       this.c = p1;
    }
    public void A(p p0){
       this.b.b(new MaybeObserveOn$ObserveOnMaybeObserver(p0, this.c));
    }
}
