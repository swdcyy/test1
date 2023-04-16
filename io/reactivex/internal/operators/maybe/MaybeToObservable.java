package io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.fuseable.f;
import brd.t;
import brd.q;
import brd.y;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeToObservable$MaybeToObservableObserver;

public final class MaybeToObservable extends t implements f	// class@0012af
{
    public final q b;

    public void MaybeToObservable(q p0){
       super();
       this.b = p0;
    }
    public static p b(y p0){
       return new MaybeToObservable$MaybeToObservableObserver(p0);
    }
    public q a(){
       return this.b;
    }
    public void subscribeActual(y p0){
       this.b.b(MaybeToObservable.b(p0));
    }
}
