package io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import brd.a;
import brd.e;
import brd.z;
import brd.d;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn$SubscribeOnObserver;
import crd.b;
import java.lang.Runnable;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class CompletableSubscribeOn extends a	// class@0011fc
{
    public final e b;
    public final z c;

    public void CompletableSubscribeOn(e p0,z p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void v(d p0){
       CompletableSubscribeOn$SubscribeOnObserver subscribeOnO = new CompletableSubscribeOn$SubscribeOnObserver(p0, this.b);
       p0.onSubscribe(subscribeOnO);
       b uob = this.c.d(subscribeOnO);
       subscribeOnO.task.replace(uob);
    }
}
