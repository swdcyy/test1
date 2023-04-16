package io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe;
import io.reactivex.internal.operators.maybe.a;
import brd.q;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver;
import crd.b;

public final class MaybeTakeUntilMaybe extends a	// class@0012ad
{
    public final q c;

    public void MaybeTakeUntilMaybe(q p0,q p1){
       super(p0);
       this.c = p1;
    }
    public void A(p p0){
       MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver takeUntilMai = new MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver(p0);
       p0.onSubscribe(takeUntilMai);
       this.c.b(takeUntilMai.other);
       this.b.b(takeUntilMai);
    }
}
