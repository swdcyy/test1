package io.reactivex.subjects.CompletableSubject$CompletableDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.d;
import io.reactivex.subjects.CompletableSubject;
import java.lang.Object;

public final class CompletableSubject$CompletableDisposable extends AtomicReference implements b	// class@0014ea
{
    public final d actual;
    public static final long serialVersionUID = 0x95d2881581696d7c;

    public void CompletableSubject$CompletableDisposable(d p0,CompletableSubject p1){
       super();
       this.actual = p0;
       this.lazySet(p1);
    }
    public void dispose(){
       CompletableSubject andSet = this.getAndSet(null);
       if (andSet != null) {
          andSet.C(this);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
}
