package io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.fuseable.n;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.String;
import java.lang.Integer;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;
import java.lang.Object;
import java.util.Objects;

public final class SpscArrayQueue extends AtomicReferenceArray implements n	// class@00149e
{
    public final AtomicLong consumerIndex;
    public final int lookAheadStep;
    public final int mask;
    public final AtomicLong producerIndex;
    public long producerLookAhead;
    public static final Integer b;
    public static final long serialVersionUID;

    static {
       SpscArrayQueue.b = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    }
    public void SpscArrayQueue(int p0){
       super(k.a(p0));
       this.mask = this.length() - 1;
       this.producerIndex = new AtomicLong();
       this.consumerIndex = new AtomicLong();
       this.lookAheadStep = Math.min((p0 / 4), SpscArrayQueue.b.intValue());
    }
    public int calcElementOffset(long p0){
       return (this.mask & (int)p0);
    }
    public int calcElementOffset(long p0,int p1){
       return ((int)p0 & p1);
    }
    public void clear(){
       do {
          if (this.poll() == null) {
          }
       } while (!this.isEmpty());
       return;
    }
    public boolean isEmpty(){
       boolean b = (!this.producerIndex.get() - this.consumerIndex.get())? true: false;
       return b;
    }
    public Object lvElement(int p0){
       return this.get(p0);
    }
    public boolean offer(Object p0){
       Objects.requireNonNull(p0, "Null is not a valid element");
       SpscArrayQueue tmask = this.mask;
       long l = this.producerIndex.get();
       int i = this.calcElementOffset(l, tmask);
       if (l - this.producerLookAhead >= 0) {
          long l1 = (long)this.lookAheadStep + l;
          if (this.lvElement(this.calcElementOffset(l1, tmask)) == null) {
             this.producerLookAhead = l1;
          }else if(this.lvElement(i) != null){
             return false;
          }
       }
       this.soElement(i, p0);
       this.soProducerIndex((l + 1));
       return true;
    }
    public boolean offer(Object p0,Object p1){
       boolean b = (this.offer(p0) && this.offer(p1))? true: false;
       return b;
    }
    public Object poll(){
       long l = this.consumerIndex.get();
       int i = this.calcElementOffset(l);
       Object obj = this.lvElement(i);
       if (obj == null) {
          return null;
       }
       this.soConsumerIndex((l + 1));
       this.soElement(i, null);
       return obj;
    }
    public void soConsumerIndex(long p0){
       this.consumerIndex.lazySet(p0);
    }
    public void soElement(int p0,Object p1){
       this.lazySet(p0, p1);
    }
    public void soProducerIndex(long p0){
       this.producerIndex.lazySet(p0);
    }
}
