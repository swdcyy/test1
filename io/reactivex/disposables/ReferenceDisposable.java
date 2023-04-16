package io.reactivex.disposables.ReferenceDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;

public abstract class ReferenceDisposable extends AtomicReference implements b	// class@001818
{
    public static final long serialVersionUID = 0x5abac7da20d0ae41;

    public void ReferenceDisposable(Object p0){
       a.c(p0, "value is null");
       super(p0);
    }
    public final void dispose(){
       if (this.get() != null) {
          Object andSet = this.getAndSet(null);
          if (andSet != null) {
             this.onDisposed(andSet);
          }
       }
       return;
    }
    public final boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
    public abstract void onDisposed(Object p0);
}
