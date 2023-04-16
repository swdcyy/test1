package com.google.common.cache.LocalCache$e;
import java.util.AbstractQueue;
import com.google.common.cache.LocalCache$e$a;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache;
import java.lang.Object;
import com.google.common.cache.LocalCache$NullEntry;
import java.util.Iterator;
import com.google.common.cache.LocalCache$e$b;

public final class LocalCache$e extends AbstractQueue	// class@00175e
{
    public final d b;

    public void LocalCache$e(){
       super();
       this.b = new LocalCache$e$a(this);
    }
    public d b(){
       d nextInAccess = this.b.getNextInAccessQueue();
       if (nextInAccess == this.b) {
          nextInAccess = null;
       }
       return nextInAccess;
    }
    public void clear(){
       d nextInAccess = this.b.getNextInAccessQueue();
       LocalCache$e tb = this.b;
       while (nextInAccess != tb) {
          LocalCache.q(nextInAccess);
          nextInAccess = nextInAccess.getNextInAccessQueue();
       }
       tb.setNextInAccessQueue(tb);
       this.b.setPreviousInAccessQueue(this.b);
       return;
    }
    public boolean contains(Object p0){
       boolean b = (p0.getNextInAccessQueue() != LocalCache$NullEntry.INSTANCE)? true: false;
       return b;
    }
    public boolean isEmpty(){
       boolean b = (this.b.getNextInAccessQueue() == this.b)? true: false;
       return b;
    }
    public Iterator iterator(){
       return new LocalCache$e$b(this, this.b());
    }
    public boolean offer(Object p0){
       LocalCache.a(p0.getPreviousInAccessQueue(), p0.getNextInAccessQueue());
       LocalCache.a(this.b.getPreviousInAccessQueue(), p0);
       LocalCache.a(p0, this.b);
       return true;
    }
    public Object peek(){
       return this.b();
    }
    public Object poll(){
       d nextInAccess = this.b.getNextInAccessQueue();
       if (nextInAccess == this.b) {
          nextInAccess = null;
       }else {
          this.remove(nextInAccess);
       }
       return nextInAccess;
    }
    public boolean remove(Object p0){
       d nextInAccess = p0.getNextInAccessQueue();
       LocalCache.a(p0.getPreviousInAccessQueue(), nextInAccess);
       LocalCache.q(p0);
       boolean b = (nextInAccess != LocalCache$NullEntry.INSTANCE)? true: false;
       return b;
    }
    public int size(){
       int i = 0;
       for (d nextInAccess = this.b.getNextInAccessQueue(); nextInAccess != this.b; nextInAccess = nextInAccess.getNextInAccessQueue()) {
          i = i + 1;
       }
       return i;
    }
}
