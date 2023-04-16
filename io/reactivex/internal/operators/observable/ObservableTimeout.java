package io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutObserver;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutFallbackObserver;

public final class ObservableTimeout extends a	// class@00137d
{
    public final w c;
    public final o d;
    public final w e;

    public void ObservableTimeout(t p0,w p1,o p2,w p3){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       if (this.e == null) {
          ObservableTimeout$TimeoutObserver timeoutObser = new ObservableTimeout$TimeoutObserver(p0, this.d);
          p0.onSubscribe(timeoutObser);
          timeoutObser.startFirstTimeout(this.c);
          this.b.subscribe(timeoutObser);
       }else {
          ObservableTimeout$TimeoutFallbackObserver timeoutFallb = new ObservableTimeout$TimeoutFallbackObserver(p0, this.d, this.e);
          p0.onSubscribe(timeoutFallb);
          timeoutFallb.startFirstTimeout(this.c);
          this.b.subscribe(timeoutFallb);
       }
       return;
    }
}
