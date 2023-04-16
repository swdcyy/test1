package io.reactivex.internal.operators.observable.w1$a;
import brd.y;
import crd.b;
import brd.d0;
import java.util.Collection;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class w1$a implements y, b	// class@00142a
{
    public final d0 actual;
    public Collection b;
    public b c;

    public void w1$a(d0 p0,Collection p1){
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
       w1$a tb = this.b;
       this.b = null;
       this.actual.onSuccess(tb);
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
