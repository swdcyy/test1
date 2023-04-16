package io.reactivex.internal.disposables.SequentialDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;

public final class SequentialDisposable extends AtomicReference implements b	// class@0011ac
{
    public static final long serialVersionUID = 0xf5860f8a57ba5918;

    public void SequentialDisposable(){
       super();
    }
    public void SequentialDisposable(b p0){
       super();
       this.lazySet(p0);
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public boolean replace(b p0){
       return DisposableHelper.replace(this, p0);
    }
    public boolean update(b p0){
       return DisposableHelper.set(this, p0);
    }
}
