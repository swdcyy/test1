package io.reactivex.internal.operators.observable.ObservableWindow$WindowExactObserver;
import brd.y;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.subjects.UnicastSubject;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableWindow$WindowExactObserver extends AtomicInteger implements y, b, Runnable	// class@001389
{
    public final y actual;
    public boolean cancelled;
    public final int capacityHint;
    public final long count;
    public b s;
    public long size;
    public UnicastSubject window;
    public static final long serialVersionUID = 0x982b5e6f490a8cf0;

    public void ObservableWindow$WindowExactObserver(y p0,long p1,int p2){
       super();
       this.actual = p0;
       this.count = p1;
       this.capacityHint = p2;
    }
    public void dispose(){
       this.cancelled = true;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       ObservableWindow$WindowExactObserver twindow = this.window;
       if (twindow != null) {
          this.window = null;
          twindow.onComplete();
       }
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       ObservableWindow$WindowExactObserver twindow = this.window;
       if (twindow != null) {
          this.window = null;
          twindow.onError(p0);
       }
       this.actual.onError(p0);
       return;
    }
    public void onNext(Object p0){
       ObservableWindow$WindowExactObserver twindow = this.window;
       if (twindow == null && this.cancelled == null) {
          twindow = UnicastSubject.h(this.capacityHint, this);
          this.window = twindow;
          this.actual.onNext(twindow);
       }
       if (twindow != null) {
          twindow.onNext(p0);
          long l = this.size + 1;
          this.size = l;
          if (l - this.count >= 0) {
             this.size = 0;
             this.window = null;
             twindow.onComplete();
             if (this.cancelled != null) {
                this.s.dispose();
             }
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void run(){
       if (this.cancelled != null) {
          this.s.dispose();
       }
       return;
    }
}
