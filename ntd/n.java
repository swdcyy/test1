package ntd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ntd.i;
import ntd.j;
import java.lang.Thread;
import ntd.e;
import ltd.q;
import ntd.l;
import ntd.m;

public final class n	// class@001eef
{
    public final AtomicReferenceArray a;
    public int blockingTasksInBuffer;
    public int consumerIndex;
    public Object lastScheduledTask;
    public int producerIndex;
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicIntegerFieldUpdater c;
    public static final AtomicIntegerFieldUpdater d;
    public static final AtomicIntegerFieldUpdater e;

    static {
       n.b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");
       n.c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");
       n.d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");
       n.e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");
    }
    public void n(){
       super();
       this.a = new AtomicReferenceArray(128);
       this.lastScheduledTask = null;
       this.producerIndex = 0;
       this.consumerIndex = 0;
       this.blockingTasksInBuffer = 0;
    }
    public static i b(n p0,i p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return p0.a(p1, p2);
    }
    public final i a(i p0,boolean p1){
       if (p1) {
          return this.c(p0);
       }
       p0 = n.b.getAndSet(this, p0);
       if (p0 != null) {
          return this.c(p0);
       }
       return null;
    }
    public final i c(i p0){
       int i = 1;
       if (p0.c.r() == i) {
       }else {
          i = 0;
       }
       if (i) {
          n.e.incrementAndGet(this);
       }
       i = 127;
       if (this.e() == i) {
          return p0;
       }else {
          int i1 = this.producerIndex & i;
          while (this.a.get(i1) != null) {
             Thread.yield();
          }
          this.a.lazySet(i1, p0);
          n.c.incrementAndGet(this);
          return null;
       }
    }
    public final void d(i p0){
       if (p0 != null) {
          int i = 1;
          if (p0.c.r() != i) {
             i = 0;
          }
          if (i) {
             n.e.decrementAndGet(this);
          }
       }
       return;
    }
    public final int e(){
       return (this.producerIndex - this.consumerIndex);
    }
    public final int f(){
       int i = (this.lastScheduledTask != null)? this.e() + 1: this.e();
       return i;
    }
    public final void g(e p0){
       i andSet = n.b.getAndSet(this, null);
       if (andSet != null) {
          p0.a(andSet);
       }
       do {
       } while (this.j(p0));
       return;
    }
    public final i h(){
       i andSet = n.b.getAndSet(this, null);
       if (andSet != null) {
       }else {
          andSet = this.i();
       }
       return andSet;
    }
    public final i i(){
       i andSet;
       while (true) {
          n tconsumerInd = this.consumerIndex;
          int i = tconsumerInd - this.producerIndex;
          if (!i) {
             return null;
          }
          i = tconsumerInd & 0x7f;
          int i1 = tconsumerInd + 1;
          if (n.d.compareAndSet(this, tconsumerInd, i1)) {
             andSet = this.a.getAndSet(i, null);
             if (andSet != null) {
                break ;
             }
          }
       }
       this.d(andSet);
       return andSet;
    }
    public final boolean j(e p0){
       i oi = this.i();
       if (oi == null) {
          return false;
       }
       p0.a(oi);
       return true;
    }
    public final long k(n p0){
       n consumerInde = p0.consumerIndex;
       n producerInde = p0.producerIndex;
       n a = p0.a;
       boolean b = true;
       while (consumerInde != producerInde) {
          int i = consumerInde & 0x7f;
          if (p0.blockingTasksInBuffer == null) {
             break ;
          }else {
             i oi = a.get(i);
             if (oi != null) {
                if (oi.c.r() != b) {
                   b = false;
                }
                if (b) {
                   Object obj = null;
                   if (a.compareAndSet(i, oi, obj)) {
                      n.e.decrementAndGet(p0);
                      n.b(this, oi, false, 2, obj);
                      return -1;
                   }
                }
             }
          label_0038 :
             consumerInde = consumerInde + 1;
          }
       }
       return this.m(p0, b);
    }
    public final long l(n p0){
       i oi = p0.i();
       if (oi == null) {
          return this.m(p0, false);
       }
       n.b(this, oi, false, 2, null);
       return -1;
    }
    public final long m(n p0,boolean p1){
       long l;
       while (true) {
          n lastSchedule = p0.lastScheduledTask;
          l = -2;
          if (lastSchedule == null) {
             return l;
          }
          if (p1) {
             int i = 1;
             if (lastSchedule.c.r() != i) {
                i = 0;
             }
             if (!i) {
                break ;
             }
          }
          l = l.f.a() - lastSchedule.b;
          long a = l.a;
          if (l - a < 0) {
             return (a - l);
          }else if(n.b.compareAndSet(p0, lastSchedule, null)){
             n.b(this, lastSchedule, false, 2, null);
             return -1;
          }
       }
       return l;
    }
}
