package io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import brd.z;
import cxd.c;
import brd.z$c;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber;
import cxd.b;
import cxd.d;
import java.lang.Runnable;
import crd.b;

public final class FlowableSubscribeOn extends a	// class@00125d
{
    public final z d;
    public final boolean e;

    public void FlowableSubscribeOn(h p0,z p1,boolean p2){
       super(p0);
       this.d = p1;
       this.e = p2;
    }
    public void D(c p0){
       z$c uoc = this.d.b();
       FlowableSubscribeOn$SubscribeOnSubscriber subscribeOnS = new FlowableSubscribeOn$SubscribeOnSubscriber(p0, uoc, this.c, this.e);
       p0.onSubscribe(subscribeOnS);
       uoc.b(subscribeOnS);
    }
}
