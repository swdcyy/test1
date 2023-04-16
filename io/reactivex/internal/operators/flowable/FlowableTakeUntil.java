package io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import cxd.b;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil$TakeUntilMainSubscriber;
import cxd.d;
import brd.k;

public final class FlowableTakeUntil extends a	// class@001262
{
    public final b d;

    public void FlowableTakeUntil(h p0,b p1){
       super(p0);
       this.d = p1;
    }
    public void D(c p0){
       FlowableTakeUntil$TakeUntilMainSubscriber takeUntilMai = new FlowableTakeUntil$TakeUntilMainSubscriber(p0);
       p0.onSubscribe(takeUntilMai);
       this.d.subscribe(takeUntilMai.other);
       this.c.C(takeUntilMai);
    }
}
