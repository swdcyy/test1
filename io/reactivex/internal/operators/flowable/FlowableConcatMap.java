package io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.a;
import cxd.c;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$a;
import java.lang.Enum;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapImmediate;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapDelayed;
import cxd.b;
import io.reactivex.internal.operators.flowable.r;
import brd.h;

public final class FlowableConcatMap extends a	// class@001220
{
    public final o d;
    public final int e;
    public final ErrorMode f;

    public static c I(c p0,o p1,int p2,ErrorMode p3){
       int i = FlowableConcatMap$a.a[p3.ordinal()];
       boolean b = true;
       if (i == b) {
          return new FlowableConcatMap$ConcatMapDelayed(p0, p1, p2, false);
       }
       if (i != 2) {
          return new FlowableConcatMap$ConcatMapImmediate(p0, p1, p2);
       }
       return new FlowableConcatMap$ConcatMapDelayed(p0, p1, p2, b);
    }
    public void D(c p0){
       if (r.a(this.c, p0, this.d)) {
          return;
       }
       this.c.subscribe(FlowableConcatMap.I(p0, this.d, this.e, this.f));
       return;
    }
}
