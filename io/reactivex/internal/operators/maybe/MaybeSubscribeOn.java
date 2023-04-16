package io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.a;
import brd.q;
import brd.z;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn$SubscribeOnMaybeObserver;
import crd.b;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn$a;
import java.lang.Runnable;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class MaybeSubscribeOn extends a	// class@0012aa
{
    public final z c;

    public void MaybeSubscribeOn(q p0,z p1){
       super(p0);
       this.c = p1;
    }
    public void A(p p0){
       MaybeSubscribeOn$SubscribeOnMaybeObserver subscribeOnM = new MaybeSubscribeOn$SubscribeOnMaybeObserver(p0);
       p0.onSubscribe(subscribeOnM);
       subscribeOnM.task.replace(this.c.d(new MaybeSubscribeOn$a(subscribeOnM, this.b)));
    }
}
