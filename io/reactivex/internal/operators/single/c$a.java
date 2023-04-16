package io.reactivex.internal.operators.single.c$a;
import brd.d0;
import crd.b;
import erd.a;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class c$a implements d0, b	// class@001488
{
    public final d0 actual;
    public final a b;
    public b c;

    public void c$a(d0 p0,a p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public final void a(){
       this.b.run();
       return;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
       this.a();
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
       this.a();
    }
}
