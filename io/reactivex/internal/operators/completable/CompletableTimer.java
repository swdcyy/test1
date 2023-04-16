package io.reactivex.internal.operators.completable.CompletableTimer;
import brd.a;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.d;
import io.reactivex.internal.operators.completable.CompletableTimer$TimerDisposable;
import crd.b;
import java.lang.Runnable;

public final class CompletableTimer extends a	// class@0011fe
{
    public final long b;
    public final TimeUnit c;
    public final z d;

    public void CompletableTimer(long p0,TimeUnit p1,z p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void v(d p0){
       CompletableTimer$TimerDisposable timerDisposa = new CompletableTimer$TimerDisposable(p0);
       p0.onSubscribe(timerDisposa);
       timerDisposa.setFuture(this.d.e(timerDisposa, this.b, this.c));
    }
}
