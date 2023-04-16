package io.reactivex.internal.operators.single.SingleTakeUntil;
import brd.a0;
import brd.e0;
import cxd.b;
import brd.d0;
import io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver;
import crd.b;
import cxd.c;

public final class SingleTakeUntil extends a0	// class@001474
{
    public final e0 b;
    public final b c;

    public void SingleTakeUntil(e0 p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       SingleTakeUntil$TakeUntilMainObserver takeUntilMai = new SingleTakeUntil$TakeUntilMainObserver(p0);
       p0.onSubscribe(takeUntilMai);
       this.c.subscribe(takeUntilMai.other);
       this.b.b(takeUntilMai);
    }
}
