package io.reactivex.internal.operators.observable.a1$a;
import brd.y;
import crd.b;
import java.lang.Object;
import brd.s;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class a1$a implements y, b	// class@00139d
{
    public final y actual;
    public b b;

    public void a1$a(y p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public void onComplete(){
       this.actual.onNext(s.a());
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onNext(s.b(p0));
       this.actual.onComplete();
    }
    public void onNext(Object p0){
       this.actual.onNext(s.c(p0));
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.b, p0)) {
          this.b = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
