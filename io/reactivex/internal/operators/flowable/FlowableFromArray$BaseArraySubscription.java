package io.reactivex.internal.operators.flowable.FlowableFromArray$BaseArraySubscription;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.util.b;

public abstract class FlowableFromArray$BaseArraySubscription extends BasicQueueSubscription	// class@001234
{
    public final Object[] array;
    public boolean cancelled;
    public int index;
    public static final long serialVersionUID = 0xe0bbd582deedcd1b;

    public void FlowableFromArray$BaseArraySubscription(Object[] p0){
       super();
       this.array = p0;
    }
    public final void cancel(){
       this.cancelled = true;
    }
    public final void clear(){
       this.index = this.array.length;
    }
    public abstract void fastPath();
    public final boolean isEmpty(){
       boolean b = (this.index == this.array.length)? true: false;
       return b;
    }
    public final Object poll(){
       FlowableFromArray$BaseArraySubscription tindex = this.index;
       FlowableFromArray$BaseArraySubscription tarray = this.array;
       if (tindex == tarray.length) {
          return null;
       }
       this.index = tindex + 1;
       object oobject = tarray[tindex];
       a.c(oobject, "array element is null");
       return oobject;
    }
    public final void request(long p0){
       if (SubscriptionHelper.validate(p0) && !b.a(this, p0)) {
          if (!p0 - Long.MAX_VALUE) {
             this.fastPath();
          }else {
             this.slowPath(p0);
          }
       }
       return;
    }
    public final int requestFusion(int p0){
       return (p0 & 0x01);
    }
    public abstract void slowPath(long p0);
}
