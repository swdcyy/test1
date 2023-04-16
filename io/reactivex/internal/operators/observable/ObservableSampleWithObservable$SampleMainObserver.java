package io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.w;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable$a;

public abstract class ObservableSampleWithObservable$SampleMainObserver extends AtomicReference implements y, b	// class@00135d
{
    public final y actual;
    public final AtomicReference other;
    public b s;
    public final w sampler;
    public static final long serialVersionUID = 0xcf2ef70693764ead;

    public void ObservableSampleWithObservable$SampleMainObserver(y p0,w p1){
       super();
       this.other = new AtomicReference();
       this.actual = p0;
       this.sampler = p1;
    }
    public void complete(){
       this.s.dispose();
       this.completeOther();
    }
    public abstract void completeMain();
    public abstract void completeOther();
    public void dispose(){
       DisposableHelper.dispose(this.other);
       this.s.dispose();
    }
    public void emit(){
       Object andSet = this.getAndSet(null);
       if (andSet != null) {
          this.actual.onNext(andSet);
       }
       return;
    }
    public void error(Throwable p0){
       this.s.dispose();
       this.actual.onError(p0);
    }
    public boolean isDisposed(){
       boolean b = (this.other.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       DisposableHelper.dispose(this.other);
       this.completeMain();
    }
    public void onError(Throwable p0){
       DisposableHelper.dispose(this.other);
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.lazySet(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
          if (this.other.get() == null) {
             this.sampler.subscribe(new ObservableSampleWithObservable$a(this));
          }
       }
       return;
    }
    public abstract void run();
    public boolean setOther(b p0){
       return DisposableHelper.setOnce(this.other, p0);
    }
}
