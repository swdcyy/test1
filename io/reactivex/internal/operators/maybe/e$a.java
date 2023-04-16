package io.reactivex.internal.operators.maybe.e$a;
import brd.d0;
import crd.b;
import brd.p;
import erd.r;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import drd.a;

public final class e$a implements d0, b	// class@0012b5
{
    public final p actual;
    public final r b;
    public b c;

    public void e$a(p p0,r p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       e$a tc = this.c;
       this.c = DisposableHelper.DISPOSED;
       tc.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       if (this.b.test(p0)) {
          this.actual.onSuccess(p0);
       }else {
          this.actual.onComplete();
       }
       return;
    }
}
