package io.reactivex.internal.operators.maybe.j$a;
import brd.p;
import crd.b;
import erd.o;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;

public final class j$a implements p, b	// class@0012bc
{
    public final p actual;
    public final o b;
    public b c;

    public void j$a(p p0,o p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       j$a tc = this.c;
       this.c = DisposableHelper.DISPOSED;
       tc.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       this.actual.onComplete();
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
       p0 = this.b.apply(p0);
       a.c(p0, "The mapper returned a null item");
       this.actual.onSuccess(p0);
    }
}
