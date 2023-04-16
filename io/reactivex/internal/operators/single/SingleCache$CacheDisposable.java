package io.reactivex.internal.operators.single.SingleCache$CacheDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import brd.d0;
import io.reactivex.internal.operators.single.SingleCache;

public final class SingleCache$CacheDisposable extends AtomicBoolean implements b	// class@001459
{
    public final d0 actual;
    public final SingleCache parent;
    public static final long serialVersionUID = 0x6848778996cdf194;

    public void SingleCache$CacheDisposable(d0 p0,SingleCache p1){
       super();
       this.actual = p0;
       this.parent = p1;
    }
    public void dispose(){
       if (this.compareAndSet(false, true)) {
          this.parent.k0(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
}
