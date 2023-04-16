package io.reactivex.internal.operators.flowable.FlowableCreate$BufferAsyncEmitter;
import io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter;
import cxd.c;
import io.reactivex.internal.queue.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.util.b;
import java.lang.NullPointerException;
import java.lang.String;

public final class FlowableCreate$BufferAsyncEmitter extends FlowableCreate$BaseEmitter	// class@001222
{
    public boolean done;
    public Throwable error;
    public final a queue;
    public final AtomicInteger wip;
    public static final long serialVersionUID = 0x21aef8f9f7f1cbc3;

    public void FlowableCreate$BufferAsyncEmitter(c p0,int p1){
       super(p0);
       this.queue = new a(p1);
       this.wip = new AtomicInteger();
    }
    public void drain(){
       FlowableCreate$BufferAsyncEmitter terror;
       boolean b;
       if (this.wip.getAndIncrement()) {
          return;
       }
       FlowableCreate$BaseEmitter tactual = this.actual;
       FlowableCreate$BufferAsyncEmitter tqueue = this.queue;
       int i = 1;
    label_000f :
       long l = this.get();
       long l1 = 0;
       while (true) {
          if (v10 = l1 - l) {
             if (this.isCancelled()) {
                tqueue.clear();
                return;
             }else {
                FlowableCreate$BufferAsyncEmitter tdone = this.done;
                Object obj = tqueue.poll();
                int i1 = (obj == null)? 1: 0;
                if (tdone != null && i1) {
                   terror = this.error;
                   if (terror != null) {
                      this.error(terror);
                   }else {
                      this.complete();
                   }
                   return;
                }else if(i1){
                label_0049 :
                   if (!v10) {
                      if (this.isCancelled()) {
                         tqueue.clear();
                         return;
                      }else {
                         b = tqueue.isEmpty();
                         if (this.done != null && b) {
                            terror = this.error;
                            if (terror != null) {
                               this.error(terror);
                               break ;
                            }else {
                               this.complete();
                               break ;
                            }
                         }
                      }
                   }
                   if (l1) {
                      b.c(this, l1);
                   }
                   i = - i;
                   if (!this.wip.addAndGet(i)) {
                      return;
                   }else {
                      goto label_000f ;
                   }
                }else {
                   tactual.onNext(obj);
                   l1 = l1 + 1;
                }
             }
          }else {
             goto label_0049 ;
          }
       }
       return;
    }
    public void onComplete(){
       this.done = true;
       this.drain();
    }
    public void onNext(Object p0){
       if (this.done == null && !this.isCancelled()) {
          if (p0 == null) {
             this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
             return;
          }else {
             this.queue.offer(p0);
             this.drain();
          }
       }
       return;
    }
    public void onRequested(){
       this.drain();
    }
    public void onUnsubscribed(){
       if (!this.wip.getAndIncrement()) {
          this.queue.clear();
       }
       return;
    }
    public boolean tryOnError(Throwable p0){
       NullPointerException nullPointerE;
       if (this.done != null || this.isCancelled()) {
          return false;
       }
       if (p0 == null) {
          nullPointerE = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       }
       this.error = nullPointerE;
       this.done = true;
       this.drain();
       return true;
    }
}
