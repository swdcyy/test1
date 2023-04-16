package io.reactivex.internal.operators.flowable.FlowableFromIterable$BaseRangeSubscription;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.util.b;

public abstract class FlowableFromIterable$BaseRangeSubscription extends BasicQueueSubscription	// class@001236
{
    public boolean cancelled;
    public Iterator it;
    public boolean once;
    public static final long serialVersionUID = 0xe0bbd582deedcd1b;

    public void FlowableFromIterable$BaseRangeSubscription(Iterator p0){
       super();
       this.it = p0;
    }
    public final void cancel(){
       this.cancelled = true;
    }
    public final void clear(){
       this.it = null;
    }
    public abstract void fastPath();
    public final boolean isEmpty(){
       FlowableFromIterable$BaseRangeSubscription tit = this.it;
       boolean b = (tit == null || !tit.hasNext())? true: false;
       return b;
    }
    public final Object poll(){
       FlowableFromIterable$BaseRangeSubscription tit = this.it;
       Object obj = null;
       if (tit == null) {
          return obj;
       }
       if (this.once == null) {
          this.once = true;
       }else if(!tit.hasNext()){
          return obj;
       }
       Object obj1 = this.it.next();
       a.c(obj1, "Iterator.next\(\) returned a null value");
       return obj1;
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
