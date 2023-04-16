package io.reactivex.internal.operators.completable.CompletableMergeIterable$MergeCompletableObserver;
import brd.d;
import java.util.concurrent.atomic.AtomicBoolean;
import crd.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import ird.a;
import crd.b;

public final class CompletableMergeIterable$MergeCompletableObserver extends AtomicBoolean implements d	// class@0011f7
{
    public final d actual;
    public final a set;
    public final AtomicInteger wip;
    public static final long serialVersionUID = 0x94b7af3059714a48;

    public void CompletableMergeIterable$MergeCompletableObserver(d p0,a p1,AtomicInteger p2){
       super();
       this.actual = p0;
       this.set = p1;
       this.wip = p2;
    }
    public void onComplete(){
       if (!this.wip.decrementAndGet() && this.compareAndSet(false, true)) {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       this.set.dispose();
       if (this.compareAndSet(false, true)) {
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       this.set.c(p0);
    }
}
