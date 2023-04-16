package io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$a;
import java.lang.Runnable;
import cxd.d;
import java.lang.Object;

public final class FlowableSubscribeOn$SubscribeOnSubscriber$a implements Runnable	// class@00125b
{
    public final d b;
    public final long c;

    public void FlowableSubscribeOn$SubscribeOnSubscriber$a(d p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       this.b.request(this.c);
    }
}
