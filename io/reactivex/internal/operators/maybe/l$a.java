package io.reactivex.internal.operators.maybe.l$a;
import brd.p;
import crd.b;
import erd.r;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

public final class l$a implements p, b	// class@0012bf
{
    public final p actual;
    public final r b;
    public b c;

    public void l$a(p p0,r p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       if (this.b.test(p0)) {
          this.actual.onComplete();
       }else {
          this.actual.onError(p0);
       }
       return;
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
    }
}
