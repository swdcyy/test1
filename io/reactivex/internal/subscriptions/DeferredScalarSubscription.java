package io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import cxd.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public class DeferredScalarSubscription extends BasicIntQueueSubscription	// class@0014c1
{
    public final c actual;
    public Object value;
    public static final long serialVersionUID = 0xe2251e4ec8e822bf;

    public void DeferredScalarSubscription(c p0){
       super();
       this.actual = p0;
    }
    public void cancel(){
       this.set(4);
       this.value = null;
    }
    public final void clear(){
       this.lazySet(32);
       this.value = null;
    }
    public final void complete(Object p0){
       DeferredScalarSubscription tactual;
       int i = this.get();
       while (true) {
          if (i == 8) {
             this.value = p0;
             this.lazySet(16);
             tactual = this.actual;
             tactual.onNext(p0);
             if (this.get() != 4) {
                tactual.onComplete();
             }
             return;
          }else {
             int i1 = i & 0xfd;
             if (i1) {
                return;
             }
             if (i == 2) {
                this.lazySet(3);
                tactual = this.actual;
                tactual.onNext(p0);
                if (this.get() != 4) {
                   tactual.onComplete();
                   break ;
                }
                break ;
             }else {
                this.value = p0;
                if (this.compareAndSet(0, 1)) {
                   return;
                }
                i = this.get();
                if (i == 4) {
                   this.value = null;
                   return;
                }
             }
          }
       }
       return;
    }
    public final boolean isCancelled(){
       boolean b = (this.get() == 4)? true: false;
       return b;
    }
    public final boolean isEmpty(){
       boolean b = (this.get() != 16)? true: false;
       return b;
    }
    public final Object poll(){
       if (this.get() != 16) {
          return null;
       }
       this.lazySet(32);
       DeferredScalarSubscription tvalue = this.value;
       this.value = null;
       return tvalue;
    }
    public final void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          while (true) {
             int i = this.get();
             int i1 = i & 0xfe;
             if (i1) {
                return;
             }
             i1 = 1;
             if (i == i1) {
                if (this.compareAndSet(i1, 3)) {
                   DeferredScalarSubscription tvalue = this.value;
                   if (tvalue != null) {
                      this.value = null;
                      DeferredScalarSubscription tactual = this.actual;
                      tactual.onNext(tvalue);
                      if (this.get() != 4) {
                         tactual.onComplete();
                      }
                   }
                }
                return;
             }else if(this.compareAndSet(0, 2)){
             }
          }
       }
       return;
    }
    public final int requestFusion(int p0){
       if (!(p0 & 2)) {
          return 0;
       }
       this.lazySet(8);
       return 2;
    }
    public final boolean tryCancel(){
       boolean i = 4;
       i = (this.getAndSet(i) != i)? true: false;
       return i;
    }
}
