package io.reactivex.internal.operators.observable.ObservableJoin$JoinDisposable;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Integer;
import brd.y;
import erd.o;
import erd.c;
import crd.a;
import io.reactivex.internal.queue.a;
import brd.t;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Map;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver;
import java.util.Collection;
import java.util.Iterator;
import io.reactivex.internal.util.ExceptionHelper;
import drd.a;
import ird.a;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver;

public final class ObservableJoin$JoinDisposable extends AtomicInteger implements b, ObservableGroupJoin$a	// class@00131f
{
    public final AtomicInteger active;
    public final y actual;
    public boolean cancelled;
    public final a disposables;
    public final AtomicReference error;
    public final o leftEnd;
    public int leftIndex;
    public final Map lefts;
    public final a queue;
    public final c resultSelector;
    public final o rightEnd;
    public int rightIndex;
    public final Map rights;
    public static final Integer LEFT_CLOSE;
    public static final Integer LEFT_VALUE;
    public static final Integer RIGHT_CLOSE;
    public static final Integer RIGHT_VALUE;
    public static final long serialVersionUID;

    static {
       ObservableJoin$JoinDisposable.LEFT_VALUE = Integer.valueOf(1);
       ObservableJoin$JoinDisposable.RIGHT_VALUE = Integer.valueOf(2);
       ObservableJoin$JoinDisposable.LEFT_CLOSE = Integer.valueOf(3);
       ObservableJoin$JoinDisposable.RIGHT_CLOSE = Integer.valueOf(4);
    }
    public void ObservableJoin$JoinDisposable(y p0,o p1,o p2,c p3){
       super();
       this.actual = p0;
       this.disposables = new a();
       this.queue = new a(t.bufferSize());
       this.lefts = new LinkedHashMap();
       this.rights = new LinkedHashMap();
       this.error = new AtomicReference();
       this.leftEnd = p1;
       this.rightEnd = p2;
       this.resultSelector = p3;
       this.active = new AtomicInteger(2);
    }
    public void cancelAll(){
       this.disposables.dispose();
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.cancelAll();
          if (!this.getAndIncrement()) {
             this.queue.clear();
          }
       }
       return;
    }
    public void drain(){
       ObservableJoin$JoinDisposable obj1;
       Iterator iterator;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableJoin$JoinDisposable tqueue = this.queue;
       ObservableJoin$JoinDisposable tactual = this.actual;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
             tqueue.clear();
             return;
          }else if(this.error.get() != null){
             tqueue.clear();
             this.cancelAll();
             this.errorAll(tactual);
             return;
          }else {
             ObservableJoin$JoinDisposable joinDisposab = null;
             ObservableJoin$JoinDisposable joinDisposab1 = (!this.active.get())? 1: null;
             Integer integer = tqueue.poll();
             Integer integer1 = (integer == null)? 1: null;
             if (joinDisposab1 && integer1) {
                this.lefts.clear();
                this.rights.clear();
                this.disposables.dispose();
                tactual.onComplete();
                return;
             }else if(integer1){
                i = - i;
                if (!this.addAndGet(i)) {
                   return;
                }
             }else {
                Object obj = tqueue.poll();
                if (integer == ObservableJoin$JoinDisposable.LEFT_VALUE) {
                   joinDisposab = this.leftIndex;
                   int i1 = joinDisposab + 1;
                   this.leftIndex = i1;
                   this.lefts.put(Integer.valueOf(joinDisposab), obj);
                   obj1 = this.leftEnd.apply(obj);
                   a.c(obj1, "The leftEnd returned a null ObservableSource");
                   ObservableGroupJoin$LeftRightEndObserver leftRightEnd = new ObservableGroupJoin$LeftRightEndObserver(this, true, joinDisposab);
                   this.disposables.c(leftRightEnd);
                   obj1.subscribe(leftRightEnd);
                   if (this.error.get() != null) {
                      tqueue.clear();
                      this.cancelAll();
                      this.errorAll(tactual);
                      return;
                   }else {
                      iterator = this.rights.values().iterator();
                      while (iterator.hasNext()) {
                         obj1 = this.resultSelector.a(obj, iterator.next());
                         a.c(obj1, "The resultSelector returned a null value");
                         tactual.onNext(obj1);
                      }
                   }
                }else if(integer == ObservableJoin$JoinDisposable.RIGHT_VALUE){
                   obj1 = this.rightIndex;
                   int i2 = obj1 + 1;
                   this.rightIndex = i2;
                   this.rights.put(Integer.valueOf(obj1), obj);
                   Object obj2 = this.rightEnd.apply(obj);
                   a.c(obj2, "The rightEnd returned a null ObservableSource");
                   ObservableGroupJoin$LeftRightEndObserver leftRightEnd1 = new ObservableGroupJoin$LeftRightEndObserver(this, joinDisposab, obj1);
                   this.disposables.c(leftRightEnd1);
                   obj2.subscribe(leftRightEnd1);
                   if (this.error.get() != null) {
                      break ;
                   }else {
                      iterator = this.lefts.values().iterator();
                      while (iterator.hasNext()) {
                         Object obj3 = this.resultSelector.a(iterator.next(), obj);
                         a.c(obj3, "The resultSelector returned a null value");
                         tactual.onNext(obj3);
                      }
                   }
                }else if(integer == ObservableJoin$JoinDisposable.LEFT_CLOSE){
                   this.lefts.remove(Integer.valueOf(obj.index));
                   this.disposables.a(obj);
                }else {
                   this.rights.remove(Integer.valueOf(obj.index));
                   this.disposables.a(obj);
                }
             }
          }
       }
       tqueue.clear();
       this.cancelAll();
       this.errorAll(tactual);
       return;
    }
    public void errorAll(y p0){
       this.lefts.clear();
       this.rights.clear();
       p0.onError(ExceptionHelper.b(this.error));
    }
    public void fail(Throwable p0,y p1,a p2){
       a.b(p0);
       ExceptionHelper.a(this.error, p0);
       p2.clear();
       this.cancelAll();
       this.errorAll(p1);
    }
    public void innerClose(boolean p0,ObservableGroupJoin$LeftRightEndObserver p1){
       _monitor_enter(this);
       ObservableJoin$JoinDisposable tqueue = this.queue;
       Integer lEFT_CLOSE = (p0)? ObservableJoin$JoinDisposable.LEFT_CLOSE: ObservableJoin$JoinDisposable.RIGHT_CLOSE;
       tqueue.offer(lEFT_CLOSE, p1);
       _monitor_exit(this);
       this.drain();
       return;
    }
    public void innerCloseError(Throwable p0){
       if (ExceptionHelper.a(this.error, p0)) {
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void innerComplete(ObservableGroupJoin$LeftRightObserver p0){
       this.disposables.b(p0);
       this.active.decrementAndGet();
       this.drain();
    }
    public void innerError(Throwable p0){
       if (ExceptionHelper.a(this.error, p0)) {
          this.active.decrementAndGet();
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void innerValue(boolean p0,Object p1){
       _monitor_enter(this);
       ObservableJoin$JoinDisposable tqueue = this.queue;
       Integer lEFT_VALUE = (p0)? ObservableJoin$JoinDisposable.LEFT_VALUE: ObservableJoin$JoinDisposable.RIGHT_VALUE;
       tqueue.offer(lEFT_VALUE, p1);
       _monitor_exit(this);
       this.drain();
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
}
