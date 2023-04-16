package io.reactivex.internal.operators.completable.CompletableObserveOn;
import brd.a;
import brd.e;
import brd.z;
import brd.d;
import io.reactivex.internal.operators.completable.CompletableObserveOn$ObserveOnCompletableObserver;

public final class CompletableObserveOn extends a	// class@0011fa
{
    public final e b;
    public final z c;

    public void CompletableObserveOn(e p0,z p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void v(d p0){
       this.b.a(new CompletableObserveOn$ObserveOnCompletableObserver(p0, this.c));
    }
}
