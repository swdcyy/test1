package io.reactivex.internal.disposables.CancellableDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.f;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;

public final class CancellableDisposable extends AtomicReference implements b	// class@0011a9
{
    public static final long serialVersionUID = 0x4f5c453163a88dc2;

    public void CancellableDisposable(f p0){
       super(p0);
    }
    public void dispose(){
       if (this.get() != null) {
          f andSet = this.getAndSet(null);
          if (andSet != null) {
             try{
                andSet.cancel();
             }catch(java.lang.Exception e0){
                a.b(e0);
                a.l(e0);
             }
          }
       }
    }
    public boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
}
