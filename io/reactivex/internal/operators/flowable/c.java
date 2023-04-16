package io.reactivex.internal.operators.flowable.c;
import brd.h;
import cxd.b;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import cxd.c;
import io.reactivex.internal.operators.flowable.r;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;

public final class c extends h	// class@001268
{
    public final b c;
    public final o d;
    public final int e;
    public final ErrorMode f;

    public void c(b p0,o p1,int p2,ErrorMode p3){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
    }
    public void D(c p0){
       if (r.a(this.c, p0, this.d)) {
          return;
       }
       this.c.subscribe(FlowableConcatMap.I(p0, this.d, this.e, this.f));
       return;
    }
}
