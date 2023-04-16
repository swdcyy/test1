package io.reactivex.internal.operators.observable.ObservableTimeoutTimed$a;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableTimeoutTimed$a implements y	// class@001380
{
    public final y actual;
    public final AtomicReference b;

    public void ObservableTimeoutTimed$a(y p0,AtomicReference p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.replace(this.b, p0);
    }
}
