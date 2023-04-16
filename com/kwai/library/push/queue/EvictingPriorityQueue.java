package com.kwai.library.push.queue.EvictingPriorityQueue;
import java.util.PriorityQueue;
import java.util.Comparator;
import msd.l;
import com.kwai.library.push.queue.EvictingPriorityQueue$revertQueue$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import qrd.l1;

public final class EvictingPriorityQueue extends PriorityQueue	// class@0008d7
{
    public final int capacity;
    public final Comparator comparator;
    public final l onDiscard;
    public final p revertQueue$delegate;

    public void EvictingPriorityQueue(int p0,Comparator p1,l p2){
       super(p0, p1);
       this.capacity = p0;
       this.comparator = p1;
       this.onDiscard = p2;
       this.revertQueue$delegate = s.c(new EvictingPriorityQueue$revertQueue$2(this));
    }
    public final PriorityQueue b(){
       return this.revertQueue$delegate.getValue();
    }
    public void clear(){
       super.clear();
       this.b().clear();
    }
    public int getSize(){
       return super.size();
    }
    public boolean offer(Object p0){
       this.b().offer(p0);
       boolean b = super.offer(p0);
       if (b && this.size() > this.capacity) {
          Object obj = this.b().poll();
          if (obj != null) {
             this.remove(obj);
             EvictingPriorityQueue tonDiscard = this.onDiscard;
             if (tonDiscard != null) {
                tonDiscard.invoke(obj);
             }
          }
       }
       return b;
    }
    public Object poll(){
       Object obj = super.poll();
       this.b().remove(obj);
       return obj;
    }
    public boolean remove(Object p0){
       this.b().remove(p0);
       return super.remove(p0);
    }
    public final int size(){
       return this.getSize();
    }
}
