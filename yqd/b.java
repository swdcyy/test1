package yqd.b;
import yqd.a;
import yqd.f;
import yqd.n;
import java.lang.Object;
import java.util.Queue;
import java.lang.Runnable;
import yqd.b$b;
import java.util.concurrent.AbstractExecutorService;
import yqd.m;
import yqd.b$a;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Callable;
import java.lang.String;
import zqd.o;
import yqd.l;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.util.concurrent.Executors;

public abstract class b extends a	// class@002a91
{
    public Queue d;
    public static final boolean e;

    static {
    }
    public void b(){
       super();
    }
    public void b(f p0){
       super(p0);
    }
    public static long d(){
       return n.a1();
    }
    public final boolean b(){
       b td = this.d;
       n on = (td == null)? null: td.peek();
       boolean b = (on != null && on.V0() - b.d() <= 0)? true: false;
       return b;
    }
    public final n m(){
       b td = this.d;
       if (td == null) {
          return null;
       }
       return td.peek();
    }
    public final Runnable n(long p0){
       b td = this.d;
       n on = (td == null)? null: td.peek();
       if (on == null) {
          return null;
       }else if(on.V0() - p0 <= 0){
          td.remove();
          return on;
       }else {
          return null;
       }
    }
    public final void p(n p0){
       if (this.q0()) {
          this.r().remove(p0);
       }else {
          this.execute(new b$b(this, p0));
       }
       return;
    }
    public m q(n p0){
       if (this.q0()) {
          this.r().add(p0);
       }else {
          this.execute(new b$a(this, p0));
       }
       return p0;
    }
    public Queue r(){
       if (this.d == null) {
          this.d = new PriorityQueue();
       }
       return this.d;
    }
    public ScheduledFuture schedule(Runnable p0,long p1,TimeUnit p2){
       return this.schedule(p0, p1, p2);
    }
    public ScheduledFuture schedule(Callable p0,long p1,TimeUnit p2){
       return this.schedule(p0, p1, p2);
    }
    public m schedule(Runnable p0,long p1,TimeUnit p2){
       o.a(p0, "command");
       o.a(p2, "unit");
       if (p1 - null >= 0) {
          n on = new n(this, l.Q0(p0, null), n.X0(p2.toNanos(p1)));
          this.q(on);
          return on;
       }else {
          Object[] objArray = new Object[]{Long.valueOf(p1)};
          throw new IllegalArgumentException(String.format("delay: %d \(expected: >= 0\)", objArray));
       }
    }
    public m schedule(Callable p0,long p1,TimeUnit p2){
       o.a(p0, "callable");
       o.a(p2, "unit");
       if (p1 - null >= 0) {
          n on = new n(this, p0, n.X0(p2.toNanos(p1)));
          this.q(on);
          return on;
       }else {
          Object[] objArray = new Object[]{Long.valueOf(p1)};
          throw new IllegalArgumentException(String.format("delay: %d \(expected: >= 0\)", objArray));
       }
    }
    public ScheduledFuture scheduleAtFixedRate(Runnable p0,long p1,long p2,TimeUnit p3){
       return this.scheduleAtFixedRate(p0, p1, p2, p3);
    }
    public m scheduleAtFixedRate(Runnable p0,long p1,long p2,TimeUnit p3){
       Object obj = p0;
       long l = p1;
       long l1 = p2;
       Object obj1 = p3;
       o.a(obj, "command");
       o.a(obj1, "unit");
       n on = null;
       int i = 1;
       if (l >= 0) {
          if (l1 > 0) {
             n on1 = new n(this, Executors.callable(obj, null), n.X0(obj1.toNanos(l)), obj1.toNanos(l1));
             this.q(on);
             return on;
          }else {
             Object[] objArray = new Object[i];
             objArray[on] = Long.valueOf(p2);
             throw new IllegalArgumentException(String.format("period: %d \(expected: > 0\)", objArray));
          }
       }else {
          Object[] objArray1 = new Object[i];
          objArray1[on] = Long.valueOf(p1);
          throw new IllegalArgumentException(String.format("initialDelay: %d \(expected: >= 0\)", objArray1));
       }
    }
    public ScheduledFuture scheduleWithFixedDelay(Runnable p0,long p1,long p2,TimeUnit p3){
       return this.scheduleWithFixedDelay(p0, p1, p2, p3);
    }
    public m scheduleWithFixedDelay(Runnable p0,long p1,long p2,TimeUnit p3){
       Object obj = p0;
       long l = p1;
       long l1 = p2;
       Object obj1 = p3;
       o.a(obj, "command");
       o.a(obj1, "unit");
       n on = null;
       int i = 1;
       if (l >= 0) {
          if (l1 > 0) {
             n on1 = new n(this, Executors.callable(obj, null), n.X0(obj1.toNanos(l)), (- obj1.toNanos(l1)));
             this.q(on);
             return on;
          }else {
             Object[] objArray = new Object[i];
             objArray[on] = Long.valueOf(p2);
             throw new IllegalArgumentException(String.format("delay: %d \(expected: > 0\)", objArray));
          }
       }else {
          Object[] objArray1 = new Object[i];
          objArray1[on] = Long.valueOf(p1);
          throw new IllegalArgumentException(String.format("initialDelay: %d \(expected: >= 0\)", objArray1));
       }
    }
}
