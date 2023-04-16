package io.reactivex.internal.operators.flowable.e;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.g;
import erd.a;
import cxd.c;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.operators.flowable.e$a;
import brd.k;
import io.reactivex.internal.operators.flowable.e$b;

public final class e extends a	// class@001270
{
    public final a d;
    public final a onComplete;
    public final g onError;
    public final g onNext;

    public void e(h p0,g p1,g p2,a p3,a p4){
       super(p0);
       this.onNext = p1;
       this.onError = p2;
       this.onComplete = p3;
       this.d = p4;
    }
    public void D(c p0){
       if (p0 instanceof a) {
          e$a uoa = new e$a(p0, this.onNext, this.onError, this.onComplete, this.d);
          this.c.C(v7);
       }else {
          e$b uob = new e$b(p0, this.onNext, this.onError, this.onComplete, this.d);
          this.c.C(v7);
       }
       return;
    }
}
