package io.reactivex.subjects.PublishSubject$PublishDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import brd.y;
import io.reactivex.subjects.PublishSubject;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;

public final class PublishSubject$PublishDisposable extends AtomicBoolean implements b	// class@00195a
{
    public final y actual;
    public final PublishSubject parent;
    public static final long serialVersionUID = 0x3171d4005ebf93fe;

    public void PublishSubject$PublishDisposable(y p0,PublishSubject p1){
       super();
       this.actual = p0;
       this.parent = p1;
    }
    public void dispose(){
       if (this.compareAndSet(false, true)) {
          this.parent.h(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
    public void onComplete(){
       if (!this.get()) {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.get()) {
          a.l(p0);
       }else {
          this.actual.onError(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (!this.get()) {
          this.actual.onNext(p0);
       }
       return;
    }
}
