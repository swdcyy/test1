package io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.subjects.UnicastSubject;
import io.reactivex.internal.queue.a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public final class UnicastSubject$UnicastQueueDisposable extends BasicIntQueueDisposable	// class@0014f5
{
    public final UnicastSubject this$0;
    public static final long serialVersionUID = 0x6e022e8b5b1c1e37;

    public void UnicastSubject$UnicastQueueDisposable(UnicastSubject p0){
       this.this$0 = p0;
       super();
    }
    public void clear(){
       this.this$0.b.clear();
    }
    public void dispose(){
       if (this.this$0.e == null) {
          this.this$0.e = true;
          this.this$0.i();
          this.this$0.actual.lazySet(null);
          if (!this.this$0.i.getAndIncrement()) {
             this.this$0.actual.lazySet(null);
             this.this$0.b.clear();
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.this$0.e;
    }
    public boolean isEmpty(){
       return this.this$0.b.isEmpty();
    }
    public Object poll(){
       return this.this$0.b.poll();
    }
    public int requestFusion(int p0){
       if (!(p0 & 2)) {
          return 0;
       }
       p0.j = true;
       return 2;
    }
}
