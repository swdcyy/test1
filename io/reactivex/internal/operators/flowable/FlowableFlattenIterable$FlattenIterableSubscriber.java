package io.reactivex.internal.operators.flowable.FlowableFlattenIterable$FlattenIterableSubscriber;
import brd.k;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import cxd.c;
import erd.o;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.fuseable.o;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.Iterable;
import java.util.Iterator;
import drd.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import ird.a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.fuseable.l;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.b;

public final class FlowableFlattenIterable$FlattenIterableSubscriber extends BasicIntQueueSubscription implements k	// class@001230
{
    public final c actual;
    public boolean cancelled;
    public int consumed;
    public Iterator current;
    public boolean done;
    public final AtomicReference error;
    public int fusionMode;
    public final int limit;
    public final o mapper;
    public final int prefetch;
    public o queue;
    public final AtomicLong requested;
    public d s;
    public static final long serialVersionUID = 0xd508cc0e16fce595;

    public void FlowableFlattenIterable$FlattenIterableSubscriber(c p0,o p1,int p2){
       super();
       this.actual = p0;
       this.mapper = p1;
       this.prefetch = p2;
       this.limit = p2 - (p2 >> 2);
       this.error = new AtomicReference();
       this.requested = new AtomicLong();
    }
    public void cancel(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.s.cancel();
          if (!this.getAndIncrement()) {
             this.queue.clear();
          }
       }
       return;
    }
    public boolean checkTerminated(boolean p0,boolean p1,c p2,o p3){
       if (this.cancelled != null) {
          this.current = null;
          p3.clear();
          return true;
       }else if(p0){
          if (this.error.get() != null) {
             this.current = null;
             p3.clear();
             p2.onError(ExceptionHelper.b(this.error));
             return true;
          }else if(p1){
             p2.onComplete();
             return true;
          }
       }
       return false;
    }
    public void clear(){
       this.current = null;
       this.queue.clear();
    }
    public void consumedOne(boolean p0){
       if (p0) {
          int i = this.consumed + 1;
          if (i == this.limit) {
             this.consumed = 0;
             this.s.request((long)i);
          }else {
             this.consumed = i;
          }
       }
       return;
    }
    public void drain(){
       String str;
       FlowableFlattenIterable$FlattenIterableSubscriber uFlattenIter = this;
       if (this.getAndIncrement()) {
          return;
       }
       FlowableFlattenIterable$FlattenIterableSubscriber actual = uFlattenIter.actual;
       FlowableFlattenIterable$FlattenIterableSubscriber queue = uFlattenIter.queue;
       boolean b = (uFlattenIter.fusionMode != 1)? true: false;
       FlowableFlattenIterable$FlattenIterableSubscriber current = uFlattenIter.current;
       int i = 1;
       while (true) {
          if (current == null) {
             FlowableFlattenIterable$FlattenIterableSubscriber done = uFlattenIter.done;
             Object obj = queue.poll();
             boolean b1 = (obj == null)? true: false;
             if (uFlattenIter.checkTerminated(done, b1, actual, queue)) {
                return;
             }else if(obj != null){
                current = uFlattenIter.mapper.apply(obj).iterator();
                if (!current.hasNext()) {
                   uFlattenIter.consumedOne(b);
                   current = null;
                }else {
                   uFlattenIter.current = current;
                label_0080 :
                   if (current != null) {
                      long l = uFlattenIter.requested.get();
                      b1 = false;
                      long l1 = b1;
                      while (true) {
                         if (l1 - l) {
                            if (uFlattenIter.checkTerminated(uFlattenIter.done, false, actual, queue)) {
                               return;
                            }else {
                               Object obj1 = current.next();
                               a.c(obj1, "The iterator returned a null value");
                               actual.onNext(obj1);
                               if (uFlattenIter.checkTerminated(uFlattenIter.done, false, actual, queue)) {
                                  return;
                               }else {
                                  l1 = l1 + 1;
                                  if (!current.hasNext()) {
                                     uFlattenIter.consumedOne(b);
                                     uFlattenIter.current = null;
                                     current = null;
                                  label_00f5 :
                                     if (!l1 - l) {
                                        FlowableFlattenIterable$FlattenIterableSubscriber done1 = uFlattenIter.done;
                                        boolean b2 = (queue.isEmpty() && current == null)? true: false;
                                        if (uFlattenIter.checkTerminated(done1, b2, actual, queue)) {
                                           return;
                                        }
                                     }
                                     if (l1 - b1 && l - Long.MAX_VALUE) {
                                        l = - l1;
                                        uFlattenIter.requested.addAndGet(l);
                                     }
                                     if (current == null) {
                                     label_012b :
                                        str = 1;
                                     }
                                  }else {
                                     str = 1;
                                  }
                               }
                            }
                         }else {
                            goto label_00f5 ;
                         }
                      }
                      return;
                   }
                   int i1 = - i;
                   if (!uFlattenIter.addAndGet(i1)) {
                      goto label_012a ;
                   }else {
                      goto label_012b ;
                   }
                }
             }else {
                goto label_0080 ;
             }
          }else {
             goto label_0080 ;
          }
       }
    }
    public boolean isEmpty(){
       boolean b = (this.current == null && this.queue.isEmpty())? true: false;
       return b;
    }
    public void onComplete(){
       if (this.done != null) {
          return;
       }
       this.done = true;
       this.drain();
       return;
    }
    public void onError(Throwable p0){
       if (this.done == null && ExceptionHelper.a(this.error, p0)) {
          this.done = true;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.done != null) {
          return;
       }
       if (this.fusionMode == null && !this.queue.offer(p0)) {
          this.onError(new MissingBackpressureException("Queue is full?!"));
          return;
       }else {
          this.drain();
          return;
       }
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.s, p0)) {
          this.s = p0;
          if (p0 instanceof l) {
             k ok = p0;
             int i = ok.requestFusion(3);
             boolean b = true;
             if (i == b) {
                this.fusionMode = i;
                this.queue = ok;
                this.done = b;
                this.actual.onSubscribe(this);
                return;
             }else if(i == 2){
                this.fusionMode = i;
                this.queue = ok;
                this.actual.onSubscribe(this);
                p0.request((long)this.prefetch);
                return;
             }
          }
          this.queue = new SpscArrayQueue(this.prefetch);
          this.actual.onSubscribe(this);
          p0.request((long)this.prefetch);
       }
       return;
    }
    public Object poll(){
       Object obj2;
       FlowableFlattenIterable$FlattenIterableSubscriber tcurrent = this.current;
       Object obj = null;
       while (true) {
          if (tcurrent == null) {
             Iterator obj1 = this.queue.poll();
             if (obj1 == null) {
                return obj;
             }
             obj1 = this.mapper.apply(obj1).iterator();
             if (!obj1.hasNext()) {
                tcurrent = obj;
             }else {
                this.current = obj1;
             label_0024 :
                obj2 = obj1.next();
                a.c(obj2, "The iterator returned a null value");
                if (!obj1.hasNext()) {
                   this.current = obj;
                   break ;
                }
                break ;
             }
          }else {
             goto label_0024 ;
          }
       }
       return obj2;
    }
    public void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          b.a(this.requested, p0);
          this.drain();
       }
       return;
    }
    public int requestFusion(int p0){
       if ((p0 & 1) && this.fusionMode == 1) {
          return 1;
       }
       return 0;
    }
}
