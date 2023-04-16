package io.reactivex.internal.operators.observable.ObservableWithLatestFrom$a;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLatestFromObserver;
import java.lang.Object;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicReference;
import crd.b;

public final class ObservableWithLatestFrom$a implements y	// class@001393
{
    public final ObservableWithLatestFrom$WithLatestFromObserver b;
    public final ObservableWithLatestFrom c;

    public void ObservableWithLatestFrom$a(ObservableWithLatestFrom p0,ObservableWithLatestFrom$WithLatestFromObserver p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void onComplete(){
    }
    public void onError(Throwable p0){
       this.b.otherError(p0);
    }
    public void onNext(Object p0){
       this.b.lazySet(p0);
    }
    public void onSubscribe(b p0){
       this.b.setOther(p0);
    }
}
