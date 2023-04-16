package io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver extends AtomicReference implements y, b	// class@0012e9
{
    public final ObservableBufferBoundary$BufferBoundaryObserver parent;
    public static final long serialVersionUID = 0x8a0eba2505783c5a;

    public void ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver(ObservableBufferBoundary$BufferBoundaryObserver p0){
       super();
       this.parent = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       this.lazySet(DisposableHelper.DISPOSED);
       this.parent.openComplete(this);
    }
    public void onError(Throwable p0){
       this.lazySet(DisposableHelper.DISPOSED);
       this.parent.boundaryError(this, p0);
    }
    public void onNext(Object p0){
       this.parent.open(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
