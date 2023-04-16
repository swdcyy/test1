package io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.z;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver;

public final class ObservableUnsubscribeOn extends a	// class@001386
{
    public final z c;

    public void ObservableUnsubscribeOn(w p0,z p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableUnsubscribeOn$UnsubscribeObserver(p0, this.c));
    }
}
