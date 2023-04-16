package io.reactivex.internal.operators.completable.CompletableConcatArray;
import brd.a;
import brd.e;
import brd.d;
import io.reactivex.internal.operators.completable.CompletableConcatArray$ConcatInnerObserver;
import crd.b;

public final class CompletableConcatArray extends a	// class@0011f0
{
    public final e[] b;

    public void CompletableConcatArray(e[] p0){
       super();
       this.b = p0;
    }
    public void v(d p0){
       CompletableConcatArray$ConcatInnerObserver uConcatInner = new CompletableConcatArray$ConcatInnerObserver(p0, this.b);
       p0.onSubscribe(uConcatInner.sd);
       uConcatInner.next();
    }
}
