package io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.fuseable.g;
import frd.a;
import brd.w;
import java.util.concurrent.atomic.AtomicReference;
import erd.g;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservablePublish$a;
import java.util.concurrent.atomic.AtomicBoolean;
import brd.y;
import java.lang.Throwable;
import drd.a;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;

public final class ObservablePublish extends a implements g	// class@00132d
{
    public final w b;
    public final AtomicReference c;
    public final w onSubscribe;

    public void ObservablePublish(w p0,w p1,AtomicReference p2){
       super();
       this.onSubscribe = p0;
       this.b = p1;
       this.c = p2;
    }
    public w a(){
       return this.b;
    }
    public void c(g p0){
       while (true) {
          ObservablePublish$a uoa = this.c.get();
          if (uoa == null || uoa.isDisposed()) {
             ObservablePublish$a uoa1 = new ObservablePublish$a(this.c);
             if (!this.c.compareAndSet(uoa, uoa1)) {
                continue ;
             }else {
                uoa = uoa1;
             }
          }
          boolean b = true;
          if (uoa.d.get() || !uoa.d.compareAndSet(false, b)) {
             b = false;
          }
          p0.accept(uoa);
          if (b) {
             this.b.subscribe(uoa);
             break ;
          }
          break ;
       }
       return;
    }
    public void subscribeActual(y p0){
       this.onSubscribe.subscribe(p0);
    }
}
