package io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.y;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservablePublish$a;

public final class ObservablePublish$InnerDisposable extends AtomicReference implements b	// class@00132a
{
    public final y child;
    public static final long serialVersionUID = 0xf0bb0db025b8ebe8;

    public void ObservablePublish$InnerDisposable(y p0){
       super();
       this.child = p0;
    }
    public void dispose(){
       Object andSet = this.getAndSet(this);
       if (andSet != null && andSet != this) {
          andSet.a(this);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == this)? true: false;
       return b;
    }
    public void setParent(ObservablePublish$a p0){
       if (!this.compareAndSet(null, p0)) {
          p0.a(this);
       }
       return;
    }
}
