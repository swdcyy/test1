package io.reactivex.internal.operators.single.SingleTimeout;
import brd.a0;
import brd.e0;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.d0;
import io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;

public final class SingleTimeout extends a0	// class@001477
{
    public final e0 b;
    public final long c;
    public final TimeUnit d;
    public final z e;
    public final e0 f;

    public void SingleTimeout(e0 p0,long p1,TimeUnit p2,z p3,e0 p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void S(d0 p0){
       SingleTimeout$TimeoutMainObserver timeoutMainO = new SingleTimeout$TimeoutMainObserver(p0, this.f);
       p0.onSubscribe(timeoutMainO);
       DisposableHelper.replace(timeoutMainO.task, this.e.e(timeoutMainO, this.c, this.d));
       this.b.b(timeoutMainO);
    }
}
