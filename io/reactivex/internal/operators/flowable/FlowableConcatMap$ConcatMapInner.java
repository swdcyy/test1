package io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner;
import brd.k;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$b;
import java.lang.Throwable;
import java.lang.Object;
import cxd.d;

public final class FlowableConcatMap$ConcatMapInner extends SubscriptionArbiter implements k	// class@00121c
{
    public final FlowableConcatMap$b parent;
    public long produced;
    public static final long serialVersionUID = 0xc75368d015d6d3d;

    public void FlowableConcatMap$ConcatMapInner(FlowableConcatMap$b p0){
       super();
       this.parent = p0;
    }
    public void onComplete(){
       FlowableConcatMap$ConcatMapInner tproduced = this.produced;
       if (tproduced) {
          this.produced = 0;
          this.produced(tproduced);
       }
       this.parent.innerComplete();
       return;
    }
    public void onError(Throwable p0){
       FlowableConcatMap$ConcatMapInner tproduced = this.produced;
       if (tproduced) {
          this.produced = 0;
          this.produced(tproduced);
       }
       this.parent.innerError(p0);
       return;
    }
    public void onNext(Object p0){
       this.produced = this.produced + 1;
       this.parent.innerNext(p0);
    }
    public void onSubscribe(d p0){
       this.setSubscription(p0);
    }
}
