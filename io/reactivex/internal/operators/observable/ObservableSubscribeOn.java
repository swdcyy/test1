package io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.z;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeOnObserver;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn$a;
import java.lang.Runnable;

public final class ObservableSubscribeOn extends a	// class@0018ba
{
    public final z c;

    public void ObservableSubscribeOn(w p0,z p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       ObservableSubscribeOn$SubscribeOnObserver subscribeOnO = new ObservableSubscribeOn$SubscribeOnObserver(p0);
       p0.onSubscribe(subscribeOnO);
       subscribeOnO.setDisposable(this.c.d(new ObservableSubscribeOn$a(this, subscribeOnO)));
    }
}
