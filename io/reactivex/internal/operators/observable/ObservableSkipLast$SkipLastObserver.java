package io.reactivex.internal.operators.observable.ObservableSkipLast$SkipLastObserver;
import brd.y;
import crd.b;
import java.util.ArrayDeque;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableSkipLast$SkipLastObserver extends ArrayDeque implements y, b	// class@001369
{
    public final y actual;
    public b s;
    public final int skip;
    public static final long serialVersionUID = 0xcb291257bc42536b;

    public void ObservableSkipLast$SkipLastObserver(y p0,int p1){
       super(p1);
       this.actual = p0;
       this.skip = p1;
    }
    public void dispose(){
       this.s.dispose();
    }
    public boolean isDisposed(){
       return this.s.isDisposed();
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       if (this.skip == this.size()) {
          this.actual.onNext(this.poll());
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
