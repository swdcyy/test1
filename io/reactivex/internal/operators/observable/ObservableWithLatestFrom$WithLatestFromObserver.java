package io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLatestFromObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.c;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;

public final class ObservableWithLatestFrom$WithLatestFromObserver extends AtomicReference implements y, b	// class@001392
{
    public final y actual;
    public final c combiner;
    public final AtomicReference other;
    public final AtomicReference s;
    public static final long serialVersionUID = 0xfbaaadb47f343b95;

    public void ObservableWithLatestFrom$WithLatestFromObserver(y p0,c p1){
       super();
       this.s = new AtomicReference();
       this.other = new AtomicReference();
       this.actual = p0;
       this.combiner = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this.s);
       DisposableHelper.dispose(this.other);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.s.get());
    }
    public void onComplete(){
       DisposableHelper.dispose(this.other);
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       DisposableHelper.dispose(this.other);
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       Object obj = this.get();
       if (obj != null) {
          p0 = this.combiner.a(p0, obj);
          a.c(p0, "The combiner returned a null value");
          this.actual.onNext(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.s, p0);
    }
    public void otherError(Throwable p0){
       DisposableHelper.dispose(this.s);
       this.actual.onError(p0);
    }
    public boolean setOther(b p0){
       return DisposableHelper.setOnce(this.other, p0);
    }
}
