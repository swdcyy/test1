package io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import brd.a0;
import brd.e0;
import brd.e;
import brd.d0;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable$OtherObserver;
import brd.d;

public final class SingleDelayWithCompletable extends a0	// class@00145e
{
    public final e0 b;
    public final e c;

    public void SingleDelayWithCompletable(e0 p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.c.a(new SingleDelayWithCompletable$OtherObserver(p0, this.b));
    }
}
