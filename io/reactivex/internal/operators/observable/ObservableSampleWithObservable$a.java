package io.reactivex.internal.operators.observable.ObservableSampleWithObservable$a;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;

public final class ObservableSampleWithObservable$a implements y	// class@00135e
{
    public final ObservableSampleWithObservable$SampleMainObserver parent;

    public void ObservableSampleWithObservable$a(ObservableSampleWithObservable$SampleMainObserver p0){
       super();
       this.parent = p0;
    }
    public void onComplete(){
       this.parent.complete();
    }
    public void onError(Throwable p0){
       this.parent.error(p0);
    }
    public void onNext(Object p0){
       this.parent.run();
    }
    public void onSubscribe(b p0){
       this.parent.setOther(p0);
    }
}
