package com.kwai.library.push.queue.EvictingPriorityQueue$revertQueue$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.library.push.queue.EvictingPriorityQueue;
import java.lang.Object;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Collections;

public final class EvictingPriorityQueue$revertQueue$2 extends Lambda implements a	// class@0008d6
{
    public final EvictingPriorityQueue this$0;

    public void EvictingPriorityQueue$revertQueue$2(EvictingPriorityQueue p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final PriorityQueue invoke(){
       EvictingPriorityQueue$revertQueue$2 tthis$0 = this.this$0;
       EvictingPriorityQueue capacity = tthis$0.capacity;
       EvictingPriorityQueue comparator = tthis$0.comparator;
       Comparator uComparator = (comparator != null)? Collections.reverseOrder(comparator): null;
       return new PriorityQueue(capacity, uComparator);
    }
}
