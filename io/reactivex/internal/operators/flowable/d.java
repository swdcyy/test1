package io.reactivex.internal.operators.flowable.d;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import java.util.concurrent.TimeUnit;
import brd.z;
import cxd.c;
import nrd.a;
import brd.z$c;
import io.reactivex.internal.operators.flowable.d$a;
import brd.k;

public final class d extends a	// class@00126d
{
    public final long d;
    public final TimeUnit e;
    public final z f;
    public final boolean g;

    public void d(h p0,long p1,TimeUnit p2,z p3,boolean p4){
       super(p0);
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
    }
    public void D(c p0){
       c uoc = (this.g != null)? p0: new a(p0);
       d$a uoa = new d$a(uoc, this.d, this.e, this.f.b(), this.g);
       this.c.C(v0);
       return;
    }
}
