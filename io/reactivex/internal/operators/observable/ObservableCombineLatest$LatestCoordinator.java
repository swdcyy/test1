package io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;
import erd.o;
import io.reactivex.internal.util.AtomicThrowable;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver;
import io.reactivex.internal.queue.a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import ird.a;
import brd.w;

public final class ObservableCombineLatest$LatestCoordinator extends AtomicInteger implements b	// class@0012f1
{
    public int active;
    public final y actual;
    public boolean cancelled;
    public final o combiner;
    public int complete;
    public final boolean delayError;
    public boolean done;
    public final AtomicThrowable errors;
    public Object[] latest;
    public final ObservableCombineLatest$CombinerObserver[] observers;
    public final a queue;
    public static final long serialVersionUID = 0x76e7117251786db1;

    public void ObservableCombineLatest$LatestCoordinator(y p0,o p1,int p2,int p3,boolean p4){
       super();
       this.errors = new AtomicThrowable();
       this.actual = p0;
       this.combiner = p1;
       this.delayError = p4;
       Object[] objArray = new Object[p2];
       this.latest = objArray;
       ObservableCombineLatest$CombinerObserver[] uCombinerObs = new ObservableCombineLatest$CombinerObserver[p2];
       for (int i = 0; i < p2; i++) {
          uCombinerObs[i] = new ObservableCombineLatest$CombinerObserver(this, i);
       }
       this.observers = uCombinerObs;
       this.queue = new a(p3);
       return;
    }
    public void cancelSources(){
       ObservableCombineLatest$LatestCoordinator tobservers = this.observers;
       int len = tobservers.length;
       for (int i = 0; i < len; i = i + 1) {
          tobservers[i].dispose();
       }
       return;
    }
    public void clear(a p0){
       _monitor_enter(this);
       this.latest = null;
       _monitor_exit(this);
       p0.clear();
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.cancelSources();
          if (!this.getAndIncrement()) {
             this.clear(this.queue);
          }
       }
       return;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       ObservableCombineLatest$LatestCoordinator tqueue = this.queue;
       ObservableCombineLatest$LatestCoordinator tactual = this.actual;
       ObservableCombineLatest$LatestCoordinator tdelayError = this.delayError;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
             this.clear(tqueue);
             return;
          }else if(tdelayError == null && this.errors.get() != null){
             this.cancelSources();
             this.clear(tqueue);
             tactual.onError(this.errors.terminate());
             return;
          }else {
             ObservableCombineLatest$LatestCoordinator tdone = this.done;
             Object[] objArray = tqueue.poll();
             int i1 = (objArray == null)? 1: 0;
             if (tdone != null && i1) {
                this.clear(tqueue);
                Throwable throwable = this.errors.terminate();
                if (throwable == null) {
                   tactual.onComplete();
                   break ;
                }else {
                   tactual.onError(throwable);
                   break ;
                }
             }else if(i1){
                i = - i;
                if (!this.addAndGet(i)) {
                   return;
                }
             }else {
                Object obj = this.combiner.apply(objArray);
                a.c(obj, "The combiner returned a null value");
                tactual.onNext(obj);
             }
          }
       }
       return;
    }
    public void innerComplete(int p0){
       _monitor_enter(this);
       ObservableCombineLatest$LatestCoordinator tlatest = this.latest;
       if (tlatest == null) {
          _monitor_exit(this);
          return;
       }else if(tlatest[p0] == null){
          p0 = 1;
       }else {
          p0 = 0;
       }
       if (!p0) {
          int i = this.complete + 1;
          this.complete = i;
          if (i != tlatest.length) {
          label_001b :
             _monitor_exit(this);
             if (p0) {
                this.cancelSources();
             }
             this.drain();
             return;
          }
       }
       this.done = true;
       goto label_001b ;
    }
    public void innerError(int p0,Throwable p1){
       if (this.errors.addThrowable(p1)) {
          int i = 1;
          if (this.delayError != null) {
             _monitor_enter(this);
             ObservableCombineLatest$LatestCoordinator tlatest = this.latest;
             if (tlatest == null) {
                _monitor_exit(this);
                return;
             }else if(tlatest[p0] == null){
                p0 = 1;
             }else {
                p0 = 0;
             }
             if (!p0) {
                int i1 = this.complete + i;
                this.complete = i1;
                if (i1 != tlatest.length) {
                label_0027 :
                   _monitor_exit(this);
                   i = p0;
                }
             }
             this.done = i;
             goto label_0027 ;
          }
          if (i) {
             this.cancelSources();
          }
          this.drain();
       }else {
          a.l(p1);
       }
       return;
    }
    public void innerNext(int p0,Object p1){
       _monitor_enter(this);
       ObservableCombineLatest$LatestCoordinator tlatest = this.latest;
       if (tlatest == null) {
          _monitor_exit(this);
          return;
       }else {
          ObservableCombineLatest$LatestCoordinator tactive = this.active;
          if (tlatest[p0] == null) {
             tactive = tactive + 1;
             this.active = tactive;
          }
          tlatest[p0] = p1;
          if (tactive == tlatest.length) {
             this.queue.offer(tlatest.clone());
             p0 = 1;
          }else {
             p0 = 0;
          }
          _monitor_exit(this);
          if (p0) {
             this.drain();
          }
          return;
       }
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void subscribe(w[] p0){
       ObservableCombineLatest$LatestCoordinator tobservers = this.observers;
       int len = tobservers.length;
       this.actual.onSubscribe(this);
       for (int i = 0; i >= len || (this.done == null && this.cancelled == null); i = i + 1) {
          p0[i].subscribe(tobservers[i]);
       }
       return;
    }
}
