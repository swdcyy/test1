package io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$OtherObserver;
import brd.d;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.p;
import brd.q;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$a;
import java.lang.Throwable;

public final class MaybeDelayWithCompletable$OtherObserver extends AtomicReference implements d, b	// class@001295
{
    public final p actual;
    public final q source;
    public static final long serialVersionUID = 0x9c3039c7940ab61;

    public void MaybeDelayWithCompletable$OtherObserver(p p0,q p1){
       super();
       this.actual = p0;
       this.source = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.source.b(new MaybeDelayWithCompletable$a(this, this.actual));
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          this.actual.onSubscribe(this);
       }
       return;
    }
}
