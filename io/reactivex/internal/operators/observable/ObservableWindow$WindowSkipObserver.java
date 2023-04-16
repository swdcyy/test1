package io.reactivex.internal.operators.observable.ObservableWindow$WindowSkipObserver;
import brd.y;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayDeque;
import java.lang.Object;
import io.reactivex.subjects.UnicastSubject;
import java.lang.Throwable;
import java.util.Iterator;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableWindow$WindowSkipObserver extends AtomicBoolean implements y, b, Runnable	// class@00138a
{
    public final y actual;
    public boolean cancelled;
    public final int capacityHint;
    public final long count;
    public long firstEmission;
    public long index;
    public b s;
    public final long skip;
    public final ArrayDeque windows;
    public final AtomicInteger wip;
    public static final long serialVersionUID = 0x2eb9e739d805fc76;

    public void ObservableWindow$WindowSkipObserver(y p0,long p1,long p2,int p3){
       super();
       this.wip = new AtomicInteger();
       this.actual = p0;
       this.count = p1;
       this.skip = p2;
       this.capacityHint = p3;
       this.windows = new ArrayDeque();
    }
    public void dispose(){
       this.cancelled = true;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       ObservableWindow$WindowSkipObserver twindows = this.windows;
       while (!twindows.isEmpty()) {
          twindows.poll().onComplete();
       }
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       ObservableWindow$WindowSkipObserver twindows = this.windows;
       while (!twindows.isEmpty()) {
          twindows.poll().onError(p0);
       }
       this.actual.onError(p0);
       return;
    }
    public void onNext(Object p0){
       ObservableWindow$WindowSkipObserver twindows = this.windows;
       ObservableWindow$WindowSkipObserver tindex = this.index;
       ObservableWindow$WindowSkipObserver tskip = this.skip;
       if (!(tindex % tskip) && this.cancelled == null) {
          this.wip.getAndIncrement();
          UnicastSubject unicastSubje = UnicastSubject.h(this.capacityHint, this);
          twindows.offer(unicastSubje);
          this.actual.onNext(unicastSubje);
       }
       long l = this.firstEmission + 1;
       Iterator iterator = twindows.iterator();
       while (iterator.hasNext()) {
          iterator.next().onNext(p0);
       }
       if (l - this.count >= 0) {
          twindows.poll().onComplete();
          if (twindows.isEmpty() && this.cancelled != null) {
             this.s.dispose();
             return;
          }else {
             this.firstEmission = l - tskip;
          }
       }else {
          this.firstEmission = l;
       }
       this.index = tindex + 1;
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void run(){
       if (!this.wip.decrementAndGet() && this.cancelled != null) {
          this.s.dispose();
       }
       return;
    }
}
