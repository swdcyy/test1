package io.reactivex.internal.operators.observable.ObservableTakeLast$TakeLastObserver;
import brd.y;
import crd.b;
import java.util.ArrayDeque;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableTakeLast$TakeLastObserver extends ArrayDeque implements y, b	// class@001370
{
    public final y actual;
    public boolean cancelled;
    public final int count;
    public b s;
    public static final long serialVersionUID = 0x6479cc5265c56d72;

    public void ObservableTakeLast$TakeLastObserver(y p0,int p1){
       super();
       this.actual = p0;
       this.count = p1;
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.s.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       ObservableTakeLast$TakeLastObserver tactual = this.actual;
       while (true) {
          if (this.cancelled != null) {
             return;
          }
          Object obj = this.poll();
          if (obj == null) {
             if (this.cancelled == null) {
                tactual.onComplete();
                break ;
             }
             break ;
          }else {
             tactual.onNext(obj);
          }
       }
       return;
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       if (this.count == this.size()) {
          this.poll();
       }
       this.offer(p0);
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
