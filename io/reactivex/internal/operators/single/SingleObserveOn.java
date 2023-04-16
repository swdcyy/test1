package io.reactivex.internal.operators.single.SingleObserveOn;
import brd.a0;
import brd.e0;
import brd.z;
import brd.d0;
import io.reactivex.internal.operators.single.SingleObserveOn$ObserveOnSingleObserver;

public final class SingleObserveOn extends a0	// class@00146d
{
    public final e0 b;
    public final z c;

    public void SingleObserveOn(e0 p0,z p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.b(new SingleObserveOn$ObserveOnSingleObserver(p0, this.c));
    }
}
