package io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher$a;
import cxd.d;
import io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLongArray;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicInteger;

public final class ParallelFromPublisher$ParallelDispatcher$a implements d	// class@001445
{
    public final int b;
    public final int c;
    public final ParallelFromPublisher$ParallelDispatcher d;

    public void ParallelFromPublisher$ParallelDispatcher$a(ParallelFromPublisher$ParallelDispatcher p0,int p1,int p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void cancel(){
       if (this.d.requests.compareAndSet((this.b + this.c), 0, 1)) {
          this.d.cancel((this.c + this.c));
       }
       return;
    }
    public void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          ParallelFromPublisher$ParallelDispatcher requests = this.d.requests;
          while (true) {
             long l = requests.get(this.b);
             if (!l - Long.MAX_VALUE) {
                return;
             }
             if (requests.compareAndSet(this.b, l, b.b(l, p0))) {
                if (this.d.subscriberCount.get() == this.c) {
                   this.d.drain();
                   break ;
                }
             }
          }
       }
       return;
    }
}
