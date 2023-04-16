package io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainNoLast;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver;
import brd.y;
import brd.w;

public final class ObservableSampleWithObservable$SampleMainNoLast extends ObservableSampleWithObservable$SampleMainObserver	// class@00135c
{
    public static final long serialVersionUID = 0xd5f42546acf217d7;

    public void ObservableSampleWithObservable$SampleMainNoLast(y p0,w p1){
       super(p0, p1);
    }
    public void completeMain(){
       this.actual.onComplete();
    }
    public void completeOther(){
       this.actual.onComplete();
    }
    public void run(){
       this.emit();
    }
}
