package io.reactivex.subjects.SingleSubject$SingleDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.d0;
import io.reactivex.subjects.SingleSubject;
import java.lang.Object;

public final class SingleSubject$SingleDisposable extends AtomicReference implements b	// class@0014f3
{
    public final d0 actual;
    public static final long serialVersionUID = 0x95d2881581696d7c;

    public void SingleSubject$SingleDisposable(d0 p0,SingleSubject p1){
       super();
       this.actual = p0;
       this.lazySet(p1);
    }
    public void dispose(){
       SingleSubject andSet = this.getAndSet(null);
       if (andSet != null) {
          andSet.l0(this);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
}
