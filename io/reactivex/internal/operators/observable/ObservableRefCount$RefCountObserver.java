package io.reactivex.internal.operators.observable.ObservableRefCount$RefCountObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableRefCount$RefCountObserver extends AtomicBoolean implements y, b	// class@001336
{
    public final y actual;
    public final ObservableRefCount$RefConnection connection;
    public final ObservableRefCount parent;
    public b upstream;
    public static final long serialVersionUID = 0x9908220faab56a59;

    public void ObservableRefCount$RefCountObserver(y p0,ObservableRefCount p1,ObservableRefCount$RefConnection p2){
       super();
       this.actual = p0;
       this.parent = p1;
       this.connection = p2;
    }
    public void dispose(){
       this.upstream.dispose();
       if (this.compareAndSet(false, true)) {
          ObservableRefCount$RefCountObserver tparent = this.parent;
          ObservableRefCount$RefCountObserver tconnection = this.connection;
          _monitor_enter(tparent);
          if (tparent.g == null) {
             _monitor_exit(tparent);
          }else {
             long l = tconnection.subscriberCount - 1;
             tconnection.subscriberCount = l;
             ObservableRefCount observableRe = null;
             if (l - observableRe || tconnection.connected == null) {
                _monitor_exit(tparent);
             }else if(!tparent.d - observableRe){
                tparent.c(tconnection);
                _monitor_exit(tparent);
             }else {
                SequentialDisposable sequentialDi = new SequentialDisposable();
                tconnection.timer = sequentialDi;
                _monitor_exit(tparent);
                sequentialDi.replace(tparent.f.e(tconnection, tparent.d, tparent.e));
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.upstream.isDisposed();
    }
    public void onComplete(){
       if (this.compareAndSet(false, true)) {
          this.parent.b(this.connection);
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.compareAndSet(false, true)) {
          this.parent.b(this.connection);
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.upstream, p0)) {
          this.upstream = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
