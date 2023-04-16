package io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;

public final class ObservableBufferBoundary$BufferCloseObserver extends AtomicReference implements y, b	// class@0012eb
{
    public final long index;
    public final ObservableBufferBoundary$BufferBoundaryObserver parent;
    public static final long serialVersionUID = 0x8a0eba2505783c5a;

    public void ObservableBufferBoundary$BufferCloseObserver(ObservableBufferBoundary$BufferBoundaryObserver p0,long p1){
       super();
       this.parent = p0;
       this.index = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.get() != dISPOSED) {
          this.lazySet(dISPOSED);
          this.parent.close(this, this.index);
       }
       return;
    }
    public void onError(Throwable p0){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.get() != dISPOSED) {
          this.lazySet(dISPOSED);
          this.parent.boundaryError(this, p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       p0 = this.get();
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (p0 != dISPOSED) {
          this.lazySet(dISPOSED);
          p0.dispose();
          this.parent.close(this, this.index);
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
