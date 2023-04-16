package io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable;
import brd.m;
import brd.q;
import brd.e;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$OtherObserver;
import brd.d;

public final class MaybeDelayWithCompletable extends m	// class@001297
{
    public final q b;
    public final e c;

    public void MaybeDelayWithCompletable(q p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void A(p p0){
       this.c.a(new MaybeDelayWithCompletable$OtherObserver(p0, this.b));
    }
}
