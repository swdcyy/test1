package io.reactivex.internal.operators.single.SingleTimer;
import brd.a0;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.d0;
import io.reactivex.internal.operators.single.SingleTimer$TimerDisposable;
import crd.b;
import java.lang.Runnable;

public final class SingleTimer extends a0	// class@001479
{
    public final long b;
    public final TimeUnit c;
    public final z d;

    public void SingleTimer(long p0,TimeUnit p1,z p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void S(d0 p0){
       SingleTimer$TimerDisposable timerDisposa = new SingleTimer$TimerDisposable(p0);
       p0.onSubscribe(timerDisposa);
       timerDisposa.setFuture(this.d.e(timerDisposa, this.b, this.c));
    }
}
