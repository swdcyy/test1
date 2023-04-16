package io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import erd.o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import io.reactivex.internal.operators.observable.ObservableGroupBy$a;
import io.reactivex.internal.operators.observable.ObservableGroupBy$State;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableGroupBy$GroupByObserver extends AtomicInteger implements y, b	// class@001312
{
    public final y actual;
    public final int bufferSize;
    public final AtomicBoolean cancelled;
    public final boolean delayError;
    public final Map groups;
    public final o keySelector;
    public b s;
    public final o valueSelector;
    public static final Object NULL_KEY;
    public static final long serialVersionUID;

    static {
       ObservableGroupBy$GroupByObserver.NULL_KEY = new Object();
    }
    public void ObservableGroupBy$GroupByObserver(y p0,o p1,o p2,int p3,boolean p4){
       super();
       this.cancelled = new AtomicBoolean();
       this.actual = p0;
       this.keySelector = p1;
       this.valueSelector = p2;
       this.bufferSize = p3;
       this.delayError = p4;
       this.groups = new ConcurrentHashMap();
       this.lazySet(1);
    }
    public void cancel(Object p0){
       if (p0 != null) {
       }else {
          p0 = ObservableGroupBy$GroupByObserver.NULL_KEY;
       }
       this.groups.remove(p0);
       if (!this.decrementAndGet()) {
          this.s.dispose();
       }
       return;
    }
    public void dispose(){
       if (this.cancelled.compareAndSet(false, true) && !this.decrementAndGet()) {
          this.s.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.cancelled.get();
    }
    public void onComplete(){
       this.groups.clear();
       Iterator iterator = new ArrayList(this.groups.values()).iterator();
       while (iterator.hasNext()) {
          iterator.next().c.onComplete();
       }
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       this.groups.clear();
       Iterator iterator = new ArrayList(this.groups.values()).iterator();
       while (iterator.hasNext()) {
          iterator.next().c.onError(p0);
       }
       this.actual.onError(p0);
       return;
    }
    public void onNext(Object p0){
       Object obj = this.keySelector.apply(p0);
       Object obj1 = (obj != null)? obj: ObservableGroupBy$GroupByObserver.NULL_KEY;
       ObservableGroupBy$a uoa = this.groups.get(obj1);
       if (uoa == null) {
          if (this.cancelled.get()) {
             return;
          }else {
             uoa = new ObservableGroupBy$a(obj, new ObservableGroupBy$State(this.bufferSize, this, obj, this.delayError));
             this.groups.put(obj1, uoa);
             this.getAndIncrement();
             this.actual.onNext(uoa);
          }
       }
       p0 = this.valueSelector.apply(p0);
       a.c(p0, "The value supplied is null");
       uoa.c.onNext(p0);
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
