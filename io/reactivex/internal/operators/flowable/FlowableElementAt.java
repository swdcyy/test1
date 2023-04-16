package io.reactivex.internal.operators.flowable.FlowableElementAt;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import java.lang.Object;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableElementAt$ElementAtSubscriber;
import brd.k;

public final class FlowableElementAt extends a	// class@00122c
{
    public final long d;
    public final Object e;
    public final boolean f;

    public void FlowableElementAt(h p0,long p1,Object p2,boolean p3){
       super(p0);
       this.d = p1;
       this.e = p2;
       this.f = p3;
    }
    public void D(c p0){
       FlowableElementAt$ElementAtSubscriber uElementAtSu = new FlowableElementAt$ElementAtSubscriber(p0, this.d, this.e, this.f);
       this.c.C(v7);
    }
}
