package io.netty.util.internal.chmv8.ForkJoinPool$g;
import sun.misc.Unsafe;
import io.netty.util.internal.chmv8.ForkJoinPool;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Error;
import java.lang.Throwable;
import io.netty.util.internal.chmv8.a;
import java.lang.Object;
import io.netty.util.internal.chmv8.CountedCompleter;
import java.util.concurrent.RejectedExecutionException;
import java.lang.Thread;
import io.netty.util.internal.chmv8.ForkJoinPool$EmptyTask;

public final class ForkJoinPool$g	// class@001172
{
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public int k;
    public short l;
    public final short m;
    public int n;
    public int o;
    public int p;
    public ForkJoinTask[] q;
    public final ForkJoinPool r;
    public final a s;
    public Thread t;
    public ForkJoinTask u;
    public ForkJoinTask v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;
    public static final Unsafe K;
    public static final long L;
    public static final long M;
    public static final int N;
    public static final int O;

    static {
       try{
          Unsafe unsafe = ForkJoinPool.m();
          ForkJoinPool$g.K = unsafe;
          ForkJoinPool$g.L = unsafe.objectFieldOffset(ForkJoinPool$g.class.getDeclaredField("o"));
          ForkJoinPool$g.M = unsafe.objectFieldOffset(ForkJoinPool$g.class.getDeclaredField("n"));
          ForkJoinPool$g.N = unsafe.arrayBaseOffset(ForkJoinTask[].class);
          int i = unsafe.arrayIndexScale(ForkJoinTask[].class);
          if (!((i - 1) & i)) {
             ForkJoinPool$g.O = Integer.numberOfLeadingZeros(i) - 31;
          }
          throw new Error("data type scale not a power of two");
       }catch(java.lang.Exception e0){
          throw new Error(e0);
       }
    }
    public void ForkJoinPool$g(ForkJoinPool p0,a p1,int p2,int p3){
       super();
       this.r = p0;
       this.s = p1;
       this.m = (short)p2;
       this.k = p3;
       this.p = 4096;
       this.o = 4096;
    }
    public final void a(){
       ForkJoinTask.cancelIgnoringExceptions(this.u);
       ForkJoinTask.cancelIgnoringExceptions(this.v);
       ForkJoinTask uForkJoinTas = this.h();
       while (uForkJoinTas != null) {
          ForkJoinTask.cancelIgnoringExceptions(uForkJoinTas);
       }
       return;
    }
    public final boolean b(CountedCompleter p0){
       int i2;
       ForkJoinPool$g og = this;
       ForkJoinPool$g p = og.p;
       if ((og.o - p) < 0) {
          ForkJoinPool$g q = og.q;
          if (q != null) {
             int i = p - 1;
             long l = (long)((((q.length - 1) & i) << ForkJoinPool$g.O) + ForkJoinPool$g.N);
             Object object = ForkJoinPool$g.K.getObject(q, l);
             if (object instanceof CountedCompleter) {
                Object obj = object;
                int i1 = p0;
                CountedCompleter uCountedComp = obj;
                while (true) {
                   if (uCountedComp == i1) {
                      Unsafe k = ForkJoinPool$g.K;
                      if (k.compareAndSwapInt(this, ForkJoinPool$g.M, 0, 1)) {
                         if (og.p == p && og.q == q) {
                            i2 = i;
                            if (k.compareAndSwapObject(q, l, obj, false)) {
                               og.p = i2;
                               og.n = 0;
                               obj.doExec();
                            }
                         }
                         og.n = 0;
                      }
                      return 1;
                   }else {
                      i2 = i;
                      uCountedComp = uCountedComp.completer;
                      if (uCountedComp != null) {
                         i = i2;
                      }
                   }
                }
             }
          }
       }
       return 0;
    }
    public final ForkJoinTask[] c(){
       ForkJoinPool$g tq = this.q;
       int i = (tq != null)? tq.length << 1: 8192;
       if (i <= 0x4000000) {
          ForkJoinTask[] uForkJoinTas = new ForkJoinTask[i];
          this.q = uForkJoinTas;
          if (tq != null) {
             int i1 = tq.length - 1;
             if (i1 >= 0) {
                ForkJoinPool$g tp = this.p;
                ForkJoinPool$g to = this.o;
                if ((tp - to) > 0) {
                   int i2 = i - 1;
                   ForkJoinPool$g og = to;
                   do {
                      i = og & i1;
                      int o = ForkJoinPool$g.O;
                      i = i << o;
                      int n = ForkJoinPool$g.N;
                      i = i + n;
                      int i3 = og & i2;
                      o = i3 << o;
                      int i4 = o + n;
                      Unsafe k = ForkJoinPool$g.K;
                      long l = (long)i;
                      Object obj = k.getObjectVolatile(tq, l);
                      if (obj != null && k.compareAndSwapObject(tq, l, obj, null)) {
                         k.putObjectVolatile(uForkJoinTas, (long)i4, obj);
                      }
                      og = og + 1;
                   } while (og == tp);
                }
             }
          }
          return uForkJoinTas;
       }else {
          throw new RejectedExecutionException("Queue capacity exceeded");
       }
    }
    public final boolean d(CountedCompleter p0){
       ForkJoinPool$g tp = this.p;
       if ((this.o - tp) < 0) {
          ForkJoinPool$g tq = this.q;
          if (tq != null) {
             int i = tp - 1;
             long l = (long)((((tq.length - 1) & i) << ForkJoinPool$g.O) + ForkJoinPool$g.N);
             Object object = ForkJoinPool$g.K.getObject(tq, l);
             if (object instanceof CountedCompleter) {
                CountedCompleter uCountedComp = object;
                while (true) {
                   if (uCountedComp == p0) {
                      if (ForkJoinPool$g.K.compareAndSwapObject(tq, l, object, null)) {
                         this.p = i;
                         object.doExec();
                         break ;
                      }
                      break ;
                   }else {
                      uCountedComp = uCountedComp.completer;
                      if (uCountedComp != null) {
                         continue ;
                      }
                   }
                }
                return 1;
             }
          }
       }
       return false;
    }
    public final boolean e(){
       ForkJoinPool$g tp = this.p;
       int i = this.o - tp;
       int i1 = 1;
       if (i < 0) {
          if (i == -1) {
             ForkJoinPool$g tq = this.q;
             if (tq != null) {
                int i2 = tq.length - i1;
                if (i2 >= 0 && ForkJoinPool$g.K.getObject(tq, ((long)(((tp - i1) & i2) << ForkJoinPool$g.O) + (long)ForkJoinPool$g.N)) != null) {
                }
             }
          }else {
          }
       }
    label_0027 :
       return i1;
    }
    public final ForkJoinTask f(){
       ForkJoinTask uForkJoinTas = (this.m == null)? this.k(): this.h();
       return uForkJoinTas;
    }
    public final ForkJoinTask g(){
       ForkJoinPool$g tq = this.q;
       if (tq != null) {
          int i = tq.length - 1;
          if (i >= 0) {
             int i1 = (this.m == null)? this.p - 1: this.o;
             return ForkJoinPool$g.K.getObjectVolatile(tq, (long)(((i & i1) << ForkJoinPool$g.O) + ForkJoinPool$g.N));
          }
       }
       return null;
    }
    public final ForkJoinTask h(){
       ForkJoinPool$g to = this.o;
       int i = to - this.p;
       while (i < 0) {
          ForkJoinPool$g tq = this.q;
          if (tq != null) {
             i = tq.length - 1;
             i = i & to;
             i = i << ForkJoinPool$g.O;
             i = i + ForkJoinPool$g.N;
             Unsafe k = ForkJoinPool$g.K;
             long l = (long)i;
             ForkJoinTask objectVolati = k.getObjectVolatile(tq, l);
             if (objectVolati != null) {
                if (k.compareAndSwapObject(tq, l, objectVolati, null)) {
                   k.putOrderedInt(this, ForkJoinPool$g.L, (to + 1));
                   return objectVolati;
                }
             }else if(this.o == to){
                int i1 = to + 1;
                if (i1 == this.p) {
                   break ;
                }else {
                   Thread.yield();
                }
             }
          }else {
             break ;
          }
       }
       return null;
    }
    public final boolean i(CountedCompleter p0){
       ForkJoinPool$g to = this.o;
       if ((to - this.p) < 0) {
          ForkJoinPool$g tq = this.q;
          if (tq != null) {
             long l = (long)((((tq.length - 1) & to) << ForkJoinPool$g.O) + ForkJoinPool$g.N);
             Object objectVolati = ForkJoinPool$g.K.getObjectVolatile(tq, l);
             if (objectVolati == null) {
                return 1;
             }else if(objectVolati instanceof CountedCompleter){
                CountedCompleter uCountedComp = objectVolati;
                while (true) {
                   if (uCountedComp == p0) {
                      if (this.o == to) {
                         Unsafe k = ForkJoinPool$g.K;
                         if (k.compareAndSwapObject(tq, l, objectVolati, null)) {
                            k.putOrderedInt(this, ForkJoinPool$g.L, (to + 1));
                            objectVolati.doExec();
                            break ;
                         }
                      }
                      break ;
                   }else {
                      uCountedComp = uCountedComp.completer;
                      if (uCountedComp != null) {
                         continue ;
                      }
                   }
                }
                return 1;
             }
          }
       }
       return false;
    }
    public final ForkJoinTask j(int p0){
       ForkJoinPool$g tq = this.q;
       if (tq != null) {
          Unsafe k = ForkJoinPool$g.K;
          long l = (long)((((tq.length - 1) & p0) << ForkJoinPool$g.O) + ForkJoinPool$g.N);
          Object obj = k.getObjectVolatile(tq, l);
          if (obj != null && (this.o == p0 && k.compareAndSwapObject(tq, l, obj, null))) {
             p0++;
             k.putOrderedInt(this, ForkJoinPool$g.L, p0);
             return obj;
          }
       }
       return null;
    }
    public final ForkJoinTask k(){
       ForkJoinPool$g tq = this.q;
       if (tq != null) {
          int i = tq.length - 1;
          if (i >= 0) {
             int i1 = this.p - 1;
             int i2 = i1 - this.o;
             while (i2 >= 0) {
                i2 = i & i1;
                i2 = i2 << ForkJoinPool$g.O;
                i2 = i2 + ForkJoinPool$g.N;
                long l = (long)i2;
                Unsafe k = ForkJoinPool$g.K;
                Object obj = k.getObject(tq, l);
                if (obj != null) {
                   if (k.compareAndSwapObject(tq, l, obj, null)) {
                      this.p = i1;
                      return obj;
                   }
                }
             }
          }
       }
       return null;
    }
    public final void l(ForkJoinTask p0){
       ForkJoinPool$g tp = this.p;
       ForkJoinPool$g tq = this.q;
       if (tq != null) {
          int i = tq.length - 1;
          ForkJoinPool$g.K.putOrderedObject(tq, (long)(((i & tp) << ForkJoinPool$g.O) + ForkJoinPool$g.N), p0);
          int i1 = tp + 1;
          this.p = i1;
          i1 = i1 - this.o;
          if (i1 <= 2) {
             ForkJoinPool$g tr = this.r;
             tr.v(tr.o, this);
          }else if(i1 >= i){
             this.c();
          }
       }
       return;
    }
    public final int m(){
       int i = this.o - this.p;
       i = (i >= 0)? 0: - i;
       return i;
    }
    public final void n(ForkJoinTask p0){
       this.v = p0;
       p0.doExec();
       ForkJoinPool$g tq = this.q;
       this.j = this.j + 1;
       this.v = null;
       if (this.m != null) {
          tq = this.h();
          while (tq != null) {
             tq.doExec();
          }
       }else if(tq != null){
          int i = tq.length - 1;
          int i1 = this.p - 1;
          int i2 = i1 - this.o;
          while (i2 >= 0) {
             i2 = i & i1;
             i2 = i2 << ForkJoinPool$g.O;
             i2 = i2 + ForkJoinPool$g.N;
             long l = (long)i2;
             Unsafe k = ForkJoinPool$g.K;
             Object obj = k.getObject(tq, l);
             if (obj != null) {
                if (k.compareAndSwapObject(tq, l, obj, null)) {
                   this.p = i1;
                   obj.doExec();
                }
             }
          }
       }
       return;
    }
    public final boolean o(ForkJoinTask p0){
       ForkJoinPool$g tq = this.q;
       boolean b = false;
       if (tq != null) {
          int i = 1;
          int i1 = tq.length - i;
          if (i1 >= 0) {
             ForkJoinPool$g tp = this.p;
             ForkJoinPool$g to = this.o;
             int i2 = tp - to;
             if (i2 > 0) {
                ForkJoinPool$EmptyTask uEmptyTask = 1;
                int i3 = tp - 1;
                int i4 = i3 & i1;
                i4 = i4 << ForkJoinPool$g.O;
                i4 = i4 + ForkJoinPool$g.N;
                long l = (long)i4;
                Unsafe k = ForkJoinPool$g.K;
                ForkJoinTask object = k.getObject(tq, l);
                while (object != null) {
                   if (object == p0) {
                      if ((i3 + 1) == this.p) {
                         if (!k.compareAndSwapObject(tq, l, p0, null)) {
                            break ;
                         }else {
                            this.p = i3;
                            b = 1;
                            break ;
                         }
                      }else if(this.o == to){
                         b = k.compareAndSwapObject(tq, l, p0, new ForkJoinPool$EmptyTask());
                         break ;
                      }else if(b){
                         p0.doExec();
                      }
                      b = i;
                   }else if(object.status >= null){
                      uEmptyTask = null;
                   }else {
                      int i5 = i3 + 1;
                      if (i5 == this.p) {
                         if (k.compareAndSwapObject(tq, l, object, null)) {
                            this.p = i3;
                            goto label_0075 ;
                         }else {
                            goto label_0075 ;
                         }
                      }
                   }
                   i2 = i2 - 1;
                   if (!i2) {
                      if (uEmptyTask == null && this.o == to) {
                         i = 0;
                         goto label_0075 ;
                      }else {
                         goto label_0075 ;
                      }
                   }
                   i4 = i3;
                }
             }
          }
       }
       return b;
    }
    public final boolean p(ForkJoinTask p0){
       ForkJoinPool$g tq = this.q;
       if (tq != null) {
          ForkJoinPool$g tp = this.p;
          if (tp != this.o) {
             int i = tp - 1;
             if (ForkJoinPool$g.K.compareAndSwapObject(tq, (long)((((tq.length - 1) & i) << ForkJoinPool$g.O) + ForkJoinPool$g.N), p0, null)) {
                this.p = i;
                return 1;
             }
          }
       }
       return false;
    }
}
