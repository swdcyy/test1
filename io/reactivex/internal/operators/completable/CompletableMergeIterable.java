package io.reactivex.internal.operators.completable.CompletableMergeIterable;
import brd.a;
import java.lang.Iterable;
import brd.d;
import crd.a;
import crd.b;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.completable.CompletableMergeIterable$MergeCompletableObserver;
import brd.e;
import java.lang.Throwable;
import drd.a;

public final class CompletableMergeIterable extends a	// class@0011f8
{
    public final Iterable b;

    public void CompletableMergeIterable(Iterable p0){
       super();
       this.b = p0;
    }
    public void v(d p0){
       a uoa = new a();
       p0.onSubscribe(uoa);
       Iterator iterator = this.b.iterator();
       a.c(iterator, "The source iterator returned is null");
       AtomicInteger uAtomicInteg = new AtomicInteger(1);
       CompletableMergeIterable$MergeCompletableObserver mergeComplet = new CompletableMergeIterable$MergeCompletableObserver(p0, uoa, uAtomicInteg);
       while (true) {
          if (uoa.isDisposed()) {
             return;
          }
          if (!iterator.hasNext()) {
             mergeComplet.onComplete();
             return;
          }else if(uoa.isDisposed()){
             return;
          }else {
             p0 = iterator.next();
             a.c(p0, "The iterator returned a null CompletableSource");
             if (uoa.isDisposed()) {
                break ;
             }else {
                uAtomicInteg.getAndIncrement();
                p0.a(mergeComplet);
             }
          }
       }
       return;
    }
}
