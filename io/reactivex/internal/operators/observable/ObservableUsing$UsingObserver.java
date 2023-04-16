package io.reactivex.internal.operators.observable.ObservableUsing$UsingObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import erd.g;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableUsing$UsingObserver extends AtomicBoolean implements y, b	// class@001387
{
    public final y actual;
    public final g disposer;
    public final boolean eager;
    public final Object resource;
    public b s;
    public static final long serialVersionUID = 0x51f0e7a17ed319a6;

    public void ObservableUsing$UsingObserver(y p0,Object p1,g p2,boolean p3){
       super();
       this.actual = p0;
       this.resource = p1;
       this.disposer = p2;
       this.eager = p3;
    }
    public void dispose(){
       this.disposeAfter();
       this.s.dispose();
    }
    public void disposeAfter(){
       if (this.compareAndSet(false, true)) {
          this.disposer.accept(this.resource);
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
    public void onComplete(){
       if (this.eager != null) {
          if (this.compareAndSet(false, true)) {
             this.disposer.accept(this.resource);
          }
          this.s.dispose();
          this.actual.onComplete();
       }else {
          this.actual.onComplete();
          this.s.dispose();
          this.disposeAfter();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.eager != null) {
          if (this.compareAndSet(false, true)) {
             this.disposer.accept(this.resource);
          }
          this.s.dispose();
          this.actual.onError(p0);
       }else {
          this.actual.onError(p0);
          this.s.dispose();
          this.disposeAfter();
       }
       return;
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
