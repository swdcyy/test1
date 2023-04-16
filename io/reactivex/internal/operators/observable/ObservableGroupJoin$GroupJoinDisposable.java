package io.reactivex.internal.operators.observable.ObservableGroupJoin$GroupJoinDisposable;
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
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import io.reactivex.subjects.UnicastSubject;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver;
import io.reactivex.internal.util.ExceptionHelper;
import drd.a;
import ird.a;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver;

public final class ObservableGroupJoin$GroupJoinDisposable extends AtomicInteger implements b, ObservableGroupJoin$a	// class@001316
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
       ObservableGroupJoin$GroupJoinDisposable.LEFT_VALUE = Integer.valueOf(1);
       ObservableGroupJoin$GroupJoinDisposable.RIGHT_VALUE = Integer.valueOf(2);
       ObservableGroupJoin$GroupJoinDisposable.LEFT_CLOSE = Integer.valueOf(3);
       ObservableGroupJoin$GroupJoinDisposable.RIGHT_CLOSE = Integer.valueOf(4);
    }
    public void ObservableGroupJoin$GroupJoinDisposable(y p0,o p1,o p2,c p3){
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
       if (this.cancelled != null) {
          return;
       }
       this.cancelled = true;
       this.cancelAll();
       if (!this.getAndIncrement()) {
          this.queue.clear();
       }
       return;
    }
    public void drain(){
       ObservableGroupJoin$GroupJoinDisposable tleftIndex;
       int i1;
       Object obj1;
       ObservableGroupJoin$LeftRightEndObserver leftRightEnd;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableGroupJoin$GroupJoinDisposable tqueue = this.queue;
       ObservableGroupJoin$GroupJoinDisposable tactual = this.actual;
       boolean b = true;
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
             UnicastSubject unicastSubje = null;
             ObservableGroupJoin$GroupJoinDisposable groupJoinDis = (!this.active.get())? 1: null;
             Integer integer = tqueue.poll();
             Integer integer1 = (integer == null)? 1: null;
             if (groupJoinDis && integer1) {
                Iterator iterator = this.lefts.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().onComplete();
                }
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
                Iterator obj = tqueue.poll();
                if (integer == ObservableGroupJoin$GroupJoinDisposable.LEFT_VALUE) {
                   unicastSubje = new UnicastSubject(t.bufferSize(), b);
                   tleftIndex = this.leftIndex;
                   i1 = tleftIndex + 1;
                   this.leftIndex = i1;
                   this.lefts.put(Integer.valueOf(tleftIndex), unicastSubje);
                   obj1 = this.leftEnd.apply(obj);
                   a.c(obj1, "The leftEnd returned a null ObservableSource");
                   leftRightEnd = new ObservableGroupJoin$LeftRightEndObserver(this, b, tleftIndex);
                   this.disposables.c(leftRightEnd);
                   obj1.subscribe(leftRightEnd);
                   if (this.error.get() != null) {
                      tqueue.clear();
                      this.cancelAll();
                      this.errorAll(tactual);
                      return;
                   }else {
                      obj = this.resultSelector.a(obj, unicastSubje);
                      a.c(obj, "The resultSelector returned a null value");
                      tactual.onNext(obj);
                      obj = this.rights.values().iterator();
                      while (obj.hasNext()) {
                         unicastSubje.onNext(obj.next());
                      }
                   }
                }else if(integer == ObservableGroupJoin$GroupJoinDisposable.RIGHT_VALUE){
                   tleftIndex = this.rightIndex;
                   i1 = tleftIndex + 1;
                   this.rightIndex = i1;
                   this.rights.put(Integer.valueOf(tleftIndex), obj);
                   obj1 = this.rightEnd.apply(obj);
                   a.c(obj1, "The rightEnd returned a null ObservableSource");
                   leftRightEnd = new ObservableGroupJoin$LeftRightEndObserver(this, unicastSubje, tleftIndex);
                   this.disposables.c(leftRightEnd);
                   obj1.subscribe(leftRightEnd);
                   if (this.error.get() != null) {
                      break ;
                   }else {
                      Iterator iterator1 = this.lefts.values().iterator();
                      while (iterator1.hasNext()) {
                         iterator1.next().onNext(obj);
                      }
                   }
                }else if(integer == ObservableGroupJoin$GroupJoinDisposable.LEFT_CLOSE){
                   unicastSubje = this.lefts.remove(Integer.valueOf(obj.index));
                   this.disposables.a(obj);
                   if (unicastSubje != null) {
                      unicastSubje.onComplete();
                   }
                }else if(integer == ObservableGroupJoin$GroupJoinDisposable.RIGHT_CLOSE){
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
       Throwable throwable = ExceptionHelper.b(this.error);
       Iterator iterator = this.lefts.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onError(throwable);
       }
       this.lefts.clear();
       this.rights.clear();
       p0.onError(throwable);
       return;
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
       ObservableGroupJoin$GroupJoinDisposable tqueue = this.queue;
       Integer lEFT_CLOSE = (p0)? ObservableGroupJoin$GroupJoinDisposable.LEFT_CLOSE: ObservableGroupJoin$GroupJoinDisposable.RIGHT_CLOSE;
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
       ObservableGroupJoin$GroupJoinDisposable tqueue = this.queue;
       Integer lEFT_VALUE = (p0)? ObservableGroupJoin$GroupJoinDisposable.LEFT_VALUE: ObservableGroupJoin$GroupJoinDisposable.RIGHT_VALUE;
       tqueue.offer(lEFT_VALUE, p1);
       _monitor_exit(this);
       this.drain();
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
}
