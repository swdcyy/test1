package io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode;
import java.lang.String;
import java.util.Objects;

public final class MpscLinkedQueue implements n	// class@001925
{
    public final AtomicReference b;
    public final AtomicReference c;

    public void MpscLinkedQueue(){
       super();
       this.b = new AtomicReference();
       this.c = new AtomicReference();
       MpscLinkedQueue$LinkedQueueNode linkedQueueN = new MpscLinkedQueue$LinkedQueueNode();
       this.e(linkedQueueN);
       this.f(linkedQueueN);
    }
    public void clear(){
       do {
       } while (this.poll() != null && !this.isEmpty());
       return;
    }
    public MpscLinkedQueue$LinkedQueueNode d(){
       return this.b.get();
    }
    public void e(MpscLinkedQueue$LinkedQueueNode p0){
       this.c.lazySet(p0);
    }
    public MpscLinkedQueue$LinkedQueueNode f(MpscLinkedQueue$LinkedQueueNode p0){
       return this.b.getAndSet(p0);
    }
    public boolean isEmpty(){
       boolean b = (this.c.get() == this.d())? true: false;
       return b;
    }
    public boolean offer(Object p0){
       Objects.requireNonNull(p0, "Null is not a valid element");
       MpscLinkedQueue$LinkedQueueNode linkedQueueN = new MpscLinkedQueue$LinkedQueueNode(p0);
       this.f(linkedQueueN).soNext(linkedQueueN);
       return true;
    }
    public boolean offer(Object p0,Object p1){
       this.offer(p0);
       this.offer(p1);
       return true;
    }
    public Object poll(){
       MpscLinkedQueue$LinkedQueueNode linkedQueueN = this.c.get();
       MpscLinkedQueue$LinkedQueueNode linkedQueueN1 = linkedQueueN.lvNext();
       if (linkedQueueN1 != null) {
          this.e(linkedQueueN1);
          return linkedQueueN1.getAndNullValue();
       }else if(linkedQueueN != this.d()){
          do {
             linkedQueueN1 = linkedQueueN.lvNext();
          } while (linkedQueueN1 == null);
          this.e(linkedQueueN1);
          return linkedQueueN1.getAndNullValue();
       }else {
          return null;
       }
    }
}
