package io.reactivex.internal.operators.observable.ObservableReplay$g;
import brd.w;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableReplay$a;
import java.lang.Object;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver;
import io.reactivex.internal.operators.observable.ObservableReplay$e;
import io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable;
import crd.b;

public final class ObservableReplay$g implements w	// class@00134c
{
    public final AtomicReference b;
    public final ObservableReplay$a c;

    public void ObservableReplay$g(AtomicReference p0,ObservableReplay$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribe(y p0){
       ObservableReplay$ReplayObserver replayObserv;
       ObservableReplay$InnerDisposable innerDisposa;
       while (true) {
          replayObserv = this.b.get();
          if (replayObserv == null) {
             ObservableReplay$ReplayObserver replayObserv1 = new ObservableReplay$ReplayObserver(this.c.call());
             if (!this.b.compareAndSet(null, replayObserv1)) {
                continue ;
             }else {
                replayObserv = replayObserv1;
             }
          }
          innerDisposa = new ObservableReplay$InnerDisposable(replayObserv, p0);
          p0.onSubscribe(innerDisposa);
          replayObserv.add(innerDisposa);
          if (innerDisposa.isDisposed()) {
             break ;
          }else {
             replayObserv.buffer.replay(innerDisposa);
             return;
          }
       }
       replayObserv.remove(innerDisposa);
       return;
    }
}
