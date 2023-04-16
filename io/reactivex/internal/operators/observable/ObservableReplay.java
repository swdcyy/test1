package io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.fuseable.g;
import crd.b;
import frd.a;
import io.reactivex.internal.operators.observable.ObservableReplay$i;
import brd.w;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableReplay$a;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.internal.operators.observable.ObservableReplay$h;
import io.reactivex.internal.operators.observable.ObservableReplay$g;
import ird.a;
import java.util.concurrent.Callable;
import erd.o;
import brd.t;
import io.reactivex.internal.operators.observable.ObservableReplay$c;
import io.reactivex.internal.operators.observable.ObservableReplay$d;
import erd.g;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver;
import io.reactivex.internal.operators.observable.ObservableReplay$e;
import java.util.concurrent.atomic.AtomicBoolean;
import brd.y;
import java.lang.Throwable;
import drd.a;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;

public final class ObservableReplay extends a implements g, b	// class@00134f
{
    public final w b;
    public final AtomicReference c;
    public final ObservableReplay$a d;
    public final w onSubscribe;
    public static final ObservableReplay$a e;

    static {
       ObservableReplay.e = new ObservableReplay$i();
    }
    public void ObservableReplay(w p0,w p1,AtomicReference p2,ObservableReplay$a p3){
       super();
       this.onSubscribe = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static a e(w p0,long p1,TimeUnit p2,z p3,int p4){
       ObservableReplay$h oh = new ObservableReplay$h(p4, p1, p2, p3);
       return ObservableReplay.f(p0, v6);
    }
    public static a f(w p0,ObservableReplay$a p1){
       AtomicReference uAtomicRefer = new AtomicReference();
       return a.j(new ObservableReplay(new ObservableReplay$g(uAtomicRefer, p1), p0, uAtomicRefer, p1));
    }
    public static a g(w p0){
       return ObservableReplay.f(p0, ObservableReplay.e);
    }
    public static t h(Callable p0,o p1){
       return a.h(new ObservableReplay$c(p0, p1));
    }
    public static a i(a p0,z p1){
       return a.j(new ObservableReplay$d(p0, p0.observeOn(p1)));
    }
    public w a(){
       return this.b;
    }
    public void c(g p0){
       while (true) {
          ObservableReplay$ReplayObserver replayObserv = this.c.get();
          if (replayObserv == null || replayObserv.isDisposed()) {
             ObservableReplay$ReplayObserver replayObserv1 = new ObservableReplay$ReplayObserver(this.d.call());
             if (!this.c.compareAndSet(replayObserv, replayObserv1)) {
                continue ;
             }else {
                replayObserv = replayObserv1;
             }
          }
          int i = (!replayObserv.shouldConnect.get() && replayObserv.shouldConnect.compareAndSet(false, true))? 1: 0;
          p0.accept(replayObserv);
          if (i) {
             this.b.subscribe(replayObserv);
             break ;
          }
          break ;
       }
       return;
    }
    public void dispose(){
       this.c.lazySet(null);
    }
    public boolean isDisposed(){
       b uob = this.c.get();
       boolean b = (uob == null || uob.isDisposed())? true: false;
       return b;
    }
    public void subscribeActual(y p0){
       this.onSubscribe.subscribe(p0);
    }
}
