package io.reactivex.internal.operators.observable.ObservableRefCount;
import brd.t;
import frd.a;
import java.util.concurrent.TimeUnit;
import brd.z;
import lrd.b;
import io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableRefCount$RefCountObserver;
import erd.g;

public final class ObservableRefCount extends t	// class@001337
{
    public final a b;
    public final int c;
    public final long d;
    public final TimeUnit e;
    public final z f;
    public ObservableRefCount$RefConnection g;

    public void ObservableRefCount(a p0){
       super();
       this.b = p0;
       this.c = 1;
       this.d = 0;
       this.e = TimeUnit.NANOSECONDS;
       this.f = b.f();
    }
    public void b(ObservableRefCount$RefConnection p0){
       _monitor_enter(this);
       if (this.g != null) {
          this.g = null;
          p0 = p0.timer;
          if (p0 != null) {
             p0.dispose();
          }
          ObservableRefCount tb = this.b;
          if (tb instanceof b) {
             tb.dispose();
          }
       }
       _monitor_exit(this);
       return;
    }
    public void c(ObservableRefCount$RefConnection p0){
       _monitor_enter(this);
       if (!p0.subscriberCount && p0 == this.g) {
          this.g = null;
          DisposableHelper.dispose(p0);
          ObservableRefCount tb = this.b;
          if (tb instanceof b) {
             tb.dispose();
          }
       }
       _monitor_exit(this);
       return;
    }
    public void subscribeActual(y p0){
       _monitor_enter(this);
       ObservableRefCount tg = this.g;
       if (tg == null) {
          tg = new ObservableRefCount$RefConnection(this);
          this.g = tg;
       }
       ObservableRefCount$RefConnection subscriberCo = tg.subscriberCount;
       if (!subscriberCo - null) {
          ObservableRefCount$RefConnection timer = tg.timer;
          if (timer != null) {
             timer.dispose();
          }
       }
       long l = subscriberCo + 1;
       tg.subscriberCount = l;
       boolean b = true;
       if (tg.connected == null && !l - (long)this.c) {
          tg.connected = b;
       }else {
          b = false;
       }
       _monitor_exit(this);
       this.b.subscribe(new ObservableRefCount$RefCountObserver(p0, this, tg));
       if (b) {
          this.b.c(tg);
       }
       return;
    }
}
