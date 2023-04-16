package io.reactivex.internal.operators.observable.w$a;
import brd.y;
import crd.b;
import java.lang.Object;
import io.reactivex.internal.util.EmptyComponent;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class w$a implements y, b	// class@001427
{
    public y actual;
    public b b;

    public void w$a(y p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       w$a tb = this.b;
       this.b = EmptyComponent.INSTANCE;
       this.actual = EmptyComponent.asObserver();
       tb.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public void onComplete(){
       w$a tactual = this.actual;
       this.b = EmptyComponent.INSTANCE;
       this.actual = EmptyComponent.asObserver();
       tactual.onComplete();
    }
    public void onError(Throwable p0){
       w$a tactual = this.actual;
       this.b = EmptyComponent.INSTANCE;
       this.actual = EmptyComponent.asObserver();
       tactual.onError(p0);
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.b, p0)) {
          this.b = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
