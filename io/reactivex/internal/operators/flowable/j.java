package io.reactivex.internal.operators.flowable.j;
import brd.h;
import cxd.b;
import erd.o;
import cxd.c;
import io.reactivex.internal.operators.flowable.r;
import brd.k;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;

public final class j extends h	// class@001279
{
    public final b c;
    public final o d;
    public final boolean e;
    public final int f;
    public final int g;

    public void j(b p0,o p1,boolean p2,int p3,int p4){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
    }
    public void D(c p0){
       if (r.a(this.c, p0, this.d)) {
          return;
       }
       this.c.subscribe(FlowableFlatMap.I(p0, this.d, this.e, this.f, this.g));
       return;
    }
}
