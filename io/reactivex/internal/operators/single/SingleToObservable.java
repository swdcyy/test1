package io.reactivex.internal.operators.single.SingleToObservable;
import brd.t;
import brd.e0;
import brd.y;
import brd.d0;
import io.reactivex.internal.operators.single.SingleToObservable$SingleToObservableObserver;

public final class SingleToObservable extends t	// class@00147d
{
    public final e0 b;

    public void SingleToObservable(e0 p0){
       super();
       this.b = p0;
    }
    public static d0 b(y p0){
       return new SingleToObservable$SingleToObservableObserver(p0);
    }
    public void subscribeActual(y p0){
       this.b.b(SingleToObservable.b(p0));
    }
}
