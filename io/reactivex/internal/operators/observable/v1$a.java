package io.reactivex.internal.operators.observable.v1$a;
import brd.y;
import crd.b;
import java.util.Collection;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class v1$a implements y, b	// class@001424
{
    public final y actual;
    public Collection b;
    public b c;

    public void v1$a(y p0,Collection p1){
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
       v1$a tb = this.b;
       this.b = null;
       this.actual.onNext(tb);
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.b = null;
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.b.add(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
