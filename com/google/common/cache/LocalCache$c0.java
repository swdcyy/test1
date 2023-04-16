package com.google.common.cache.LocalCache$c0;
import java.util.AbstractQueue;
import com.google.common.cache.LocalCache$c0$a;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache;
import java.lang.Object;
import com.google.common.cache.LocalCache$NullEntry;
import java.util.Iterator;
import com.google.common.cache.LocalCache$c0$b;

public final class LocalCache$c0 extends AbstractQueue	// class@001758
{
    public final d b;

    public void LocalCache$c0(){
       super();
       this.b = new LocalCache$c0$a(this);
    }
    public d b(){
       d nextInWriteQ = this.b.getNextInWriteQueue();
       if (nextInWriteQ == this.b) {
          nextInWriteQ = null;
       }
       return nextInWriteQ;
    }
    public void clear(){
       d nextInWriteQ = this.b.getNextInWriteQueue();
       LocalCache$c0 tb = this.b;
       while (nextInWriteQ != tb) {
          LocalCache.t(nextInWriteQ);
          nextInWriteQ = nextInWriteQ.getNextInWriteQueue();
       }
       tb.setNextInWriteQueue(tb);
       this.b.setPreviousInWriteQueue(this.b);
       return;
    }
    public boolean contains(Object p0){
       boolean b = (p0.getNextInWriteQueue() != LocalCache$NullEntry.INSTANCE)? true: false;
       return b;
    }
    public boolean isEmpty(){
       boolean b = (this.b.getNextInWriteQueue() == this.b)? true: false;
       return b;
    }
    public Iterator iterator(){
       return new LocalCache$c0$b(this, this.b());
    }
    public boolean offer(Object p0){
       LocalCache.c(p0.getPreviousInWriteQueue(), p0.getNextInWriteQueue());
       LocalCache.c(this.b.getPreviousInWriteQueue(), p0);
       LocalCache.c(p0, this.b);
       return true;
    }
    public Object peek(){
       return this.b();
    }
    public Object poll(){
       d nextInWriteQ = this.b.getNextInWriteQueue();
       if (nextInWriteQ == this.b) {
          nextInWriteQ = null;
       }else {
          this.remove(nextInWriteQ);
       }
       return nextInWriteQ;
    }
    public boolean remove(Object p0){
       d nextInWriteQ = p0.getNextInWriteQueue();
       LocalCache.c(p0.getPreviousInWriteQueue(), nextInWriteQ);
       LocalCache.t(p0);
       boolean b = (nextInWriteQ != LocalCache$NullEntry.INSTANCE)? true: false;
       return b;
    }
    public int size(){
       int i = 0;
       for (d nextInWriteQ = this.b.getNextInWriteQueue(); nextInWriteQ != this.b; nextInWriteQ = nextInWriteQ.getNextInWriteQueue()) {
          i = i + 1;
       }
       return i;
    }
}
