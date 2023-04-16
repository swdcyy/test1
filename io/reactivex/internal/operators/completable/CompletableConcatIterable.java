package io.reactivex.internal.operators.completable.CompletableConcatIterable;
import brd.a;
import java.lang.Iterable;
import brd.d;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.completable.CompletableConcatIterable$ConcatInnerObserver;
import crd.b;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class CompletableConcatIterable extends a	// class@0011f2
{
    public final Iterable b;

    public void CompletableConcatIterable(Iterable p0){
       super();
       this.b = p0;
    }
    public void v(d p0){
       Iterator iterator = this.b.iterator();
       a.c(iterator, "The iterator returned is null");
       CompletableConcatIterable$ConcatInnerObserver uConcatInner = new CompletableConcatIterable$ConcatInnerObserver(p0, iterator);
       p0.onSubscribe(uConcatInner.sd);
       uConcatInner.next();
    }
}
