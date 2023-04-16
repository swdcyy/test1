package io.reactivex.internal.operators.single.SingleSubscribeOn;
import brd.a0;
import brd.e0;
import brd.z;
import brd.d0;
import io.reactivex.internal.operators.single.SingleSubscribeOn$SubscribeOnObserver;
import crd.b;
import java.lang.Runnable;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class SingleSubscribeOn extends a0	// class@001471
{
    public final e0 b;
    public final z c;

    public void SingleSubscribeOn(e0 p0,z p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       SingleSubscribeOn$SubscribeOnObserver subscribeOnO = new SingleSubscribeOn$SubscribeOnObserver(p0, this.b);
       p0.onSubscribe(subscribeOnO);
       b uob = this.c.d(subscribeOnO);
       subscribeOnO.task.replace(uob);
    }
}
