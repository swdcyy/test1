package io.reactivex.internal.operators.observable.ObservableSkipLast;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableSkipLast$SkipLastObserver;

public final class ObservableSkipLast extends a	// class@00136a
{
    public final int c;

    public void ObservableSkipLast(w p0,int p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableSkipLast$SkipLastObserver(p0, this.c));
    }
}
