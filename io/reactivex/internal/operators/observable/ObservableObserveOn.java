package io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.z;
import brd.y;
import io.reactivex.internal.schedulers.k;
import brd.z$c;
import io.reactivex.internal.operators.observable.ObservableObserveOn$ObserveOnObserver;

public final class ObservableObserveOn extends a	// class@0018a1
{
    public final z c;
    public final boolean d;
    public final int e;

    public void ObservableObserveOn(w p0,z p1,boolean p2,int p3){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       ObservableObserveOn tc = this.c;
       if (tc instanceof k) {
          this.b.subscribe(p0);
       }else {
          this.b.subscribe(new ObservableObserveOn$ObserveOnObserver(p0, tc.b(), this.d, this.e));
       }
       return;
    }
}
