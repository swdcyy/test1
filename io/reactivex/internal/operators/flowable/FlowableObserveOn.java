package io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import brd.z;
import cxd.c;
import brd.z$c;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnConditionalSubscriber;
import brd.k;
import io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnSubscriber;

public final class FlowableObserveOn extends a	// class@001244
{
    public final z d;
    public final boolean e;
    public final int f;

    public void FlowableObserveOn(h p0,z p1,boolean p2,int p3){
       super(p0);
       this.d = p1;
       this.e = p2;
       this.f = p3;
    }
    public void D(c p0){
       z$c uoc = this.d.b();
       if (p0 instanceof a) {
          this.c.C(new FlowableObserveOn$ObserveOnConditionalSubscriber(p0, uoc, this.e, this.f));
       }else {
          this.c.C(new FlowableObserveOn$ObserveOnSubscriber(p0, uoc, this.e, this.f));
       }
       return;
    }
}
