package io.reactivex.internal.observers.g;
import brd.y;
import crd.b;
import erd.g;
import erd.a;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class g implements y, b	// class@00185f
{
    public final y actual;
    public final a b;
    public b c;
    public final g onSubscribe;

    public void g(y p0,g p1,a p2){
       super();
       this.actual = p0;
       this.onSubscribe = p1;
       this.b = p2;
    }
    public void dispose(){
       this.b.run();
       this.c.dispose();
       return;
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       if (this.c != DisposableHelper.DISPOSED) {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.c != DisposableHelper.DISPOSED) {
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       this.onSubscribe.accept(p0);
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
