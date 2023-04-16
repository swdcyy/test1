package io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver;
import brd.y;
import java.lang.Object;

public final class ObservableReplay$InnerDisposable extends AtomicInteger implements b	// class@001340
{
    public boolean cancelled;
    public final y child;
    public Object index;
    public final ObservableReplay$ReplayObserver parent;
    public static final long serialVersionUID = 0x25dd165f0e0e7417;

    public void ObservableReplay$InnerDisposable(ObservableReplay$ReplayObserver p0,y p1){
       super();
       this.parent = p0;
       this.child = p1;
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.parent.remove(this);
       }
       return;
    }
    public Object index(){
       return this.index;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
}
