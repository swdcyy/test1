package io.reactivex.subjects.ReplaySubject$ReplayDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;
import io.reactivex.subjects.ReplaySubject;

public final class ReplaySubject$ReplayDisposable extends AtomicInteger implements b	// class@0014ee
{
    public final y actual;
    public boolean cancelled;
    public Object index;
    public final ReplaySubject state;
    public static final long serialVersionUID = 0x679849349531b12;

    public void ReplaySubject$ReplayDisposable(y p0,ReplaySubject p1){
       super();
       this.actual = p0;
       this.state = p1;
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.state.j(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
}
