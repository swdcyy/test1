package io.netty.util.internal.chmv8.ForkJoinPool;
import java.util.concurrent.AbstractExecutorService;
import sun.misc.Unsafe;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Thread;
import io.netty.util.internal.chmv8.ForkJoinPool$g;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Integer;
import java.lang.ThreadLocal;
import io.netty.util.internal.chmv8.ForkJoinPool$c;
import java.lang.RuntimePermission;
import io.netty.util.internal.chmv8.ForkJoinPool$a;
import java.security.PrivilegedAction;
import java.lang.Object;
import java.security.AccessController;
import java.lang.Error;
import java.lang.Throwable;
import java.lang.Runtime;
import java.lang.Math;
import io.netty.util.internal.chmv8.ForkJoinPool$d;
import java.lang.Thread$UncaughtExceptionHandler;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.SecurityManager;
import java.lang.System;
import java.security.Permission;
import io.netty.util.internal.chmv8.ForkJoinPool$f;
import io.netty.util.internal.chmv8.ForkJoinPool$b;
import java.security.PrivilegedExceptionAction;
import java.lang.RuntimeException;
import java.security.PrivilegedActionException;
import io.netty.util.internal.ThreadLocalRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.a;
import java.lang.Runnable;
import io.netty.util.internal.chmv8.ForkJoinTask$RunnableExecuteAction;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import io.netty.util.internal.chmv8.ForkJoinTask$AdaptedCallable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import io.netty.util.internal.chmv8.ForkJoinTask$AdaptedRunnable;
import java.util.Arrays;
import java.util.Collections;
import io.netty.util.internal.chmv8.ForkJoinTask$AdaptedRunnableAction;
import java.lang.Thread$State;

public class ForkJoinPool extends AbstractExecutorService	// class@001173
{
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public final short m;
    public final short n;
    public ForkJoinPool$g[] o;
    public final ForkJoinPool$d p;
    public final Thread$UncaughtExceptionHandler q;
    public final String r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;
    public static final ThreadLocal E;
    public static final ForkJoinPool$d F;
    public static final RuntimePermission G;
    public static final ForkJoinPool H;
    public static final int I;
    public static int J;
    public static final Unsafe K;
    public static final long L;
    public static final long M;
    public static final int N;
    public static final int O;
    public static final long P;
    public static final long Q;
    public static final long R;
    public static final long S;
    public static final long T;

    static {
       int i;
       try{
          Unsafe unsafe = ForkJoinPool.m();
          ForkJoinPool.K = unsafe;
          ForkJoinPool.L = unsafe.objectFieldOffset(ForkJoinPool.class.getDeclaredField("j"));
          ForkJoinPool.P = unsafe.objectFieldOffset(ForkJoinPool.class.getDeclaredField("i"));
          ForkJoinPool.Q = unsafe.objectFieldOffset(ForkJoinPool.class.getDeclaredField("k"));
          ForkJoinPool.R = unsafe.objectFieldOffset(ForkJoinPool.class.getDeclaredField("l"));
          ForkJoinPool.M = unsafe.objectFieldOffset(Thread.class.getDeclaredField("parkBlocker"));
          ForkJoinPool.S = unsafe.objectFieldOffset(ForkJoinPool$g.class.getDeclaredField("o"));
          ForkJoinPool.T = unsafe.objectFieldOffset(ForkJoinPool$g.class.getDeclaredField("n"));
          ForkJoinPool.N = unsafe.arrayBaseOffset(ForkJoinTask[].class);
          i = unsafe.arrayIndexScale(ForkJoinTask[].class);
          if ((i - 1) & i) {
             throw new Error("data type scale not a power of two");
          }
          ForkJoinPool.O = Integer.numberOfLeadingZeros(i) - 31;
          ForkJoinPool.E = new ThreadLocal();
          ForkJoinPool.F = new ForkJoinPool$c();
          ForkJoinPool.G = new RuntimePermission("modifyThread");
          ForkJoinPool uForkJoinPoo = AccessController.doPrivileged(new ForkJoinPool$a());
          ForkJoinPool.H = uForkJoinPoo;
          uForkJoinPoo = uForkJoinPoo.m;
          if (uForkJoinPoo <= null) {
             i = 1;
          }
          ForkJoinPool.I = uForkJoinPoo;
       }catch(java.lang.Exception e0){
          throw new Error(e0);
       }
    }
    public void ForkJoinPool(){
       super(Math.min(0x7fff, Runtime.getRuntime().availableProcessors()), ForkJoinPool.F, null, false);
    }
    public void ForkJoinPool(int p0){
       super(p0, ForkJoinPool.F, null, false);
    }
    public void ForkJoinPool(int p0,ForkJoinPool$d p1,Thread$UncaughtExceptionHandler p2,int p3,String p4){
       super();
       this.r = p4;
       this.p = p1;
       this.q = p2;
       this.n = (short)p3;
       this.m = (short)p0;
       long l = (long)(- p0);
       this.j = ((l << 32) & 0xffff00000000) | ((l << 48) & 0xffff000000000000);
    }
    public void ForkJoinPool(int p0,ForkJoinPool$d p1,Thread$UncaughtExceptionHandler p2,boolean p3){
       if (p0 <= 0 || p0 > 0x7fff) {
          throw new IllegalArgumentException();
       }
       Objects.requireNonNull(p1);
       _monitor_enter(ForkJoinPool.class);
       int i = ForkJoinPool.J + 1;
       ForkJoinPool.J = i;
       _monitor_exit(ForkJoinPool.class);
       super(p0, p1, null, p3, "ForkJoinPool-"+i+"-worker-");
       ForkJoinPool.e();
       return;
    }
    public static void e(){
       SecurityManager securityMana = System.getSecurityManager();
       if (securityMana != null) {
          securityMana.checkPermission(ForkJoinPool.G);
       }
       return;
    }
    public static ForkJoinPool$g f(){
       object oobject;
       ForkJoinPool$f uof = ForkJoinPool.E.get();
       if (uof != null) {
          ForkJoinPool h = ForkJoinPool.H;
          if (h != null) {
             h = h.o;
             if (h != null) {
                int i = h.length - 1;
                if (i >= 0) {
                   oobject = h[((uof.a & i) & 0x7e)];
                label_0020 :
                   return oobject;
                }
             }
          }
       }
       oobject = null;
       goto label_0020 ;
    }
    public static Unsafe m(){
       try{
          return Unsafe.getUnsafe();
       }catch(java.lang.SecurityException e0){
          try{
             return AccessController.doPrivileged(new ForkJoinPool$b());
          }catch(java.security.PrivilegedActionException e0){
             throw new RuntimeException("Could not initialize intrinsics", e0.getCause());
          }
       }
    }
    public final boolean A(boolean p0,boolean p1){
       int i1;
       int i2;
       int i3;
       ForkJoinPool o;
       object oobject;
       object this;
       object oobject2;
       ForkJoinPool uForkJoinPoo = this;
       boolean b = false;
       if (uForkJoinPoo == ForkJoinPool.H) {
          return b;
       }
       ForkJoinPool k = uForkJoinPoo.k;
       int i = Integer.MIN_VALUE;
       if (k >= null) {
          if (!p1) {
             return b;
          }else {
             i1 = k & 0x02;
             if (!i1) {
                i2 = k + 2;
                if (ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.Q, k, i2)) {
                   i3 = i2;
                label_002f :
                   i1 = i3 + 2;
                   i1 = i1 & Integer.MAX_VALUE;
                   i2 = i1 | i;
                   if (!ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.Q, i3, i2)) {
                      uForkJoinPoo.t(i2);
                   }
                }
             }
             i3 = this.a();
             goto label_002f ;
          }
       }
       while (true) {
          k = uForkJoinPoo.j;
          long l = 0x80000000;
          long l1 = k & l;
          int b1 = true;
          if (l1) {
             if (((short)(int)(k >> 32) + uForkJoinPoo.m) <= 0) {
                _monitor_enter(this);
                this.notifyAll();
                _monitor_exit(this);
             }
          }else if(!p0){
             l1 = k >> 48;
             int i4 = (int)l1;
             i4 = i4 + uForkJoinPoo.m;
             if (i4 > 0) {
                return b;
             }else {
                o = uForkJoinPoo.o;
                if (o != null) {
                   i4 = 0;
                   while (true) {
                      if (i4 < o.length) {
                         oobject = o[i4];
                         if (oobject != null) {
                            if (oobject.e()) {
                               int i5 = i4 & 0x01;
                               if (!i5 || oobject.h < null) {
                               label_0094 :
                                  i4 = i4 + 1;
                               }
                            }
                         }else {
                            goto label_0094 ;
                         }
                      }
                   }
                   return b1;
                }
             }
          }
          long l2 = k | l;
          if (ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, k, l2)) {
             int i6 = 0;
             while (i6 < 3) {
                ForkJoinPool o1 = uForkJoinPoo.o;
                if (o1 != null) {
                   int len = o1.length;
                   i1 = 0;
                   i2 = -1;
                   while (i1 < len) {
                      this = o1[i1];
                      if (this != null) {
                         this.n = i2;
                         if (i6 > 0) {
                            this.a();
                            if (i6 > b1) {
                               ForkJoinPool$g this1 = this.s;
                               if (this1 != null) {
                                  if (!this1.isInterrupted()) {
                                     this1.interrupt();
                                  }
                                  ForkJoinPool.K.unpark(this1);
                               }
                            }
                         }
                      }
                      i1 = i1 + 1;
                   }
                   while (true) {
                      k = uForkJoinPoo.j;
                      int i7 = (int)k & Integer.MAX_VALUE;
                      if (i7) {
                         i1 = i7 & 0xffff;
                         if (i1 < len && i1 >= 0) {
                            object oobject1 = o1[i1];
                            if (oobject1 != null) {
                               i1 = oobject1.i & Integer.MAX_VALUE;
                               l1 = 0x1000000000000 + k;
                               l1 = l1 & 0xffff000000000000;
                               l = (long)i1 | l1;
                               l1 = 0xffff80000000 & k;
                               long l3 = l | l1;
                               int this2 = i7 | i;
                               if (oobject1.h == this2) {
                                  Unsafe k1 = ForkJoinPool.K;
                                  Unsafe unsafe = k1;
                                  Unsafe unsafe1 = k1;
                                  oobject2 = oobject1;
                                  b1 = -1;
                                  if (unsafe.compareAndSwapLong(this, ForkJoinPool.L, k, l3)) {
                                     i7 = i7 + 0x10000;
                                     i1 = i7 & Integer.MAX_VALUE;
                                     oobject2.h = i1;
                                     oobject2.n = b1;
                                     ForkJoinPool$g t = oobject2.t;
                                     if (t != null) {
                                        unsafe1.unpark(t);
                                     }
                                  }
                               }else {
                                  b1 = -1;
                               }
                               i = Integer.MIN_VALUE;
                               b1 = 1;
                            }
                         }
                      }
                   }
                   uForkJoinPoo.v(o, oobject);
                   return b;
                }
                i6 = i6 + 1;
                i = Integer.MIN_VALUE;
                oobject2 = null;
                b1 = true;
             }
          }else {
             continue ;
          }
       }
    }
    public final int a(){
       int i2;
       int i = 256;
       while (true) {
          ForkJoinPool tk = this.k;
          int i1 = tk & 0x02;
          if (!i1) {
             i2 = tk + 2;
             if (ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.Q, tk, i2)) {
                break ;
             }else if(i >= 0){
                if (ThreadLocalRandom.current().nextInt() >= 0) {
                   i = i - 1;
                }
             }else {
                int i3 = tk | 0x01;
                if (ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.Q, tk, i3)) {
                   _monitor_enter(this);
                   i1 = this.k & 0x01;
                   if (!i1) {
                      this.notifyAll();
                   }
                   _monitor_exit(this);
                }
             }
          }else {
             goto label_0018 ;
          }
       }
       return i2;
    }
    public boolean awaitTermination(long p0,TimeUnit p1){
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       if (this == ForkJoinPool.H) {
          this.c(p0, p1);
          return false;
       }else {
          p0 = p1.toNanos(p0);
          if (this.isTerminated()) {
             return true;
          }
          if (p0 <= 0) {
             return false;
          }
          long l = System.nanoTime() + p0;
          _monitor_enter(this);
          while (true) {
             if (this.isTerminated()) {
                _monitor_exit(this);
                return true;
             }else if(p0 <= 0){
                break ;
             }else {
                p0 = TimeUnit.NANOSECONDS.toMillis(p0);
                if (p0 <= 0) {
                   p0 = 1;
                }
                this.wait(p0);
                p0 = l - System.nanoTime();
             }
          }
          _monitor_exit(this);
          return false;
       }
    }
    public final int b(ForkJoinPool$g p0,ForkJoinTask p1){
       ForkJoinTask uForkJoinTas1;
       ForkJoinPool j;
       long l1;
       long l2;
       ForkJoinPool uForkJoinPoo = this;
       ForkJoinPool$g og = p0;
       ForkJoinTask uForkJoinTas = p1;
       ForkJoinTask status = uForkJoinTas.status;
       if (status >= null && og) {
          ForkJoinPool$g u = og.u;
          og.u = uForkJoinTas;
          while (p0.o(p1)) {
             status = uForkJoinTas.status;
             if (status < null) {
                break ;
             }
          }
          if (status >= null && uForkJoinTas instanceof CountedCompleter) {
             status = uForkJoinPoo.n(og, uForkJoinTas);
          }
          long l = false;
          while (true) {
             if (status >= null) {
                status = uForkJoinTas.status;
                if (status >= null) {
                   status = this.z(p0, p1);
                   if (!status) {
                      status = uForkJoinTas.status;
                      if (status >= null) {
                         if (!uForkJoinPoo.x(l)) {
                            l = uForkJoinPoo.j;
                         }else if(p1.trySetSignal()){
                            status = uForkJoinTas.status;
                            if (status >= null) {
                               _monitor_enter(p1);
                               if (uForkJoinTas.status >= null) {
                                  try{
                                     p1.wait();
                                  }catch(java.lang.InterruptedException e0){
                                  }
                               }else {
                                  p1.notifyAll();
                               }
                               _monitor_exit(p1);
                            }
                         }
                      }
                   }
                }else {
                label_007d :
                   og.u = u;
                   break ;
                }
             }else {
                goto label_007d ;
             }
          }
       }
       return status;
    }
    public boolean c(long p0,TimeUnit p1){
       ForkJoinPool uForkJoinPoo;
       p0 = p1.toNanos(p0);
       Thread thread = Thread.currentThread();
       if (thread instanceof a && thread.b == this) {
          this.o(thread.c);
          return true;
       }else {
          long l = System.nanoTime();
          int i = 1;
          int i1 = 0;
          while (true) {
             long l1 = this.j >> 48;
             int i2 = this.m + (int)l1;
             if (i2 <= 0) {
                uForkJoinPoo = 1;
             label_002e :
                if (!uForkJoinPoo) {
                   uForkJoinPoo = this.o;
                   if (uForkJoinPoo != null) {
                      int i3 = uForkJoinPoo.length - true;
                      if (i3 >= 0) {
                         if (!i) {
                            long l2 = System.nanoTime() - l;
                            if (l2 - p0 > 0) {
                               return false;
                            }else {
                               Thread.yield();
                            }
                         }
                         i = i3 + 1;
                         i = i << 2;
                         while (true) {
                            if (i >= 0) {
                               int i4 = i1 + 1;
                               i1 = i1 & i3;
                               object oobject = uForkJoinPoo[i1];
                               if (oobject != null) {
                                  ForkJoinPool$g o = oobject.o;
                                  int i5 = o - oobject.p;
                                  if (i5 < 0) {
                                     ForkJoinTask uForkJoinTas = oobject.j(o);
                                     if (uForkJoinTas != null) {
                                        uForkJoinTas.doExec();
                                     }
                                     i1 = i4;
                                     i = 1;
                                  }
                               }
                               i = i - 1;
                               i1 = i4;
                            }else {
                               i = 0;
                               continue ;
                            }
                         }
                      }
                   }
                }
                break ;
             }else {
                uForkJoinPoo = null;
                goto label_002e ;
             }
          }
          return true;
       }
    }
    public final int d(ForkJoinPool$g p0,long p1,int p2){
       ForkJoinPool i4;
       long l2;
       long l3;
       long l4;
       ForkJoinPool uForkJoinPoo = this;
       ForkJoinPool$g og = p0;
       long l = p1;
       int i = p2;
       ForkJoinPool$g n = og.n;
       if (n >= null && (og.h == i && (!uForkJoinPoo.j - l && !Thread.interrupted()))) {
          int i1 = (int)l;
          long l1 = 32;
          int i2 = (int)(l >> l1);
          int i3 = (i2 >> 16) + uForkJoinPoo.m;
          if (i1 >= 0) {
             int b = false;
             if (i3 > 0 || !uForkJoinPoo.A(b, b)) {
                ForkJoinPool$g j = og.j;
                if (j != null) {
                   og.j = b;
                   do {
                      i4 = uForkJoinPoo.i;
                      l2 = (long)j + i4;
                   } while (ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.P, i4, l2));
                }else if(i3 > 0 || i != (i1 | Integer.MIN_VALUE)){
                   b = 0;
                }else {
                   long l6 = ((long)(0x10000 + i2) << l1) | (long)(og.i & Integer.MAX_VALUE);
                }
                if (b) {
                   i1 = - (short)i2;
                   l3 = (i1 < 0)? 0xbebc200: (long)(i1 + 1) * 0x77359400;
                   l4 = (System.nanoTime() + l3) - 0x1e8480;
                }else {
                   l3 = 0;
                   l4 = l3;
                }
                if (og.h == i) {
                   ForkJoinPool uForkJoinPoo1 = this;
                   long l5 = b;
                   if (!uForkJoinPoo1.j - l) {
                      Thread thread = Thread.currentThread();
                      Unsafe k = ForkJoinPool.K;
                      long m = ForkJoinPool.M;
                      k.putObject(thread, m, uForkJoinPoo1);
                      og.t = thread;
                      if (og.h == i && !uForkJoinPoo1.j - l) {
                         k.park(false, l3);
                      }
                      int i5 = p0;
                      i5.t = null;
                      k.putObject(thread, m, null);
                      m = 0;
                      if (l3 - m && (!uForkJoinPoo1.j - l && ((l4 - System.nanoTime()) - m <= 0 && k.compareAndSwapLong(this, ForkJoinPool.L, p1, l5)))) {
                         i5.n = -1;
                      label_00e6 :
                         n = -1;
                      }
                   }
                }
             }
          }
          og.n = -1;
          goto label_00e6 ;
       }
    label_00e7 :
       return n;
    }
    public void execute(Runnable p0){
       Objects.requireNonNull(p0);
       if (p0 instanceof ForkJoinTask) {
       }else {
          ForkJoinTask$RunnableExecuteAction runnableExec = new ForkJoinTask$RunnableExecuteAction(p0);
       }
       this.i(p0);
       return;
    }
    public final void g(a p0,Throwable p1){
       Unsafe k;
       ForkJoinPool i;
       long l;
       int i2;
       ForkJoinPool$g l1;
       int this;
       ForkJoinPool uForkJoinPoo = this;
       a uoa = p0;
       object oobject = null;
       if (uoa) {
          uoa = uoa.c;
          if (uoa != null) {
             uoa.n = -1;
             do {
                k = ForkJoinPool.K;
                i = uForkJoinPoo.i;
                l = i + (long)uoa.j;
             } while (k.compareAndSwapLong(this, ForkJoinPool.P, i, l));
             i = uForkJoinPoo.k;
             if (!(i & 0x02)) {
                int i1 = i + 2;
                if (k.compareAndSwapInt(this, ForkJoinPool.Q, i, i1)) {
                   i2 = i1;
                label_0043 :
                   i1 = (i2 & Integer.MIN_VALUE) | ((i2 + 2) & Integer.MAX_VALUE);
                   l1 = uoa.l;
                   ForkJoinPool o = uForkJoinPoo.o;
                   if (o != null && (l1 >= null && (l1 < o.length && o[l1] == uoa))) {
                      o[l1] = oobject;
                   }
                label_005b :
                   if (!k.compareAndSwapInt(this, ForkJoinPool.Q, i2, i1)) {
                      uForkJoinPoo.t(i1);
                   }
                }
             }
             i2 = this.a();
             goto label_0043 ;
          }
          oobject = uoa;
       }
       do {
          i = uForkJoinPoo.j;
          l = i - 0x1000000000000;
          l = l & 0xffff000000000000;
          long l2 = i - 0x100000000;
          l2 = l2 & 0xffff00000000;
          l = l | l2;
          l2 = 0xffffffff & i;
          l = l | l2;
       } while (ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, i, l));
       if (!uForkJoinPoo.A(false, false) && (oobject != null && oobject.q != null)) {
          oobject.a();
          i = uForkJoinPoo.j;
          long l3 = 32;
          long l4 = i >> l3;
          this = (int)l4;
          while (this < 0) {
             int i3 = (int)i;
             if (i3 >= 0) {
                if (i3 > 0) {
                   ForkJoinPool o1 = uForkJoinPoo.o;
                   if (o1 != null) {
                      int i4 = 0xffff & i3;
                      if (i4 < o1.length) {
                         object oobject1 = o1[i4];
                         if (oobject1 != null) {
                            int i5 = oobject1.i & Integer.MAX_VALUE;
                            long l5 = (long)i5;
                            this = this + 0x10000;
                            l3 = (long)this << l3;
                            l = l5 | l3;
                            i5 = i3 | Integer.MIN_VALUE;
                            if (oobject1.h == i5) {
                               Unsafe k1 = ForkJoinPool.K;
                               if (k1.compareAndSwapLong(this, ForkJoinPool.L, i, l)) {
                                  oobject1.h = (i3 + 0x10000) & Integer.MAX_VALUE;
                                  l1 = oobject1.t;
                                  if (l1 != null) {
                                     k1.unpark(l1);
                                     break ;
                                  }
                               }
                            }
                         }
                      }
                   }
                }else if((short)this < 0){
                   this.w();
                   break ;
                }
             }
          }
       }
       if (p1 == null) {
          ForkJoinTask.helpExpungeStaleExceptions();
       }else {
          ForkJoinTask.rethrow(p1);
       }
       return;
    }
    public final int h(CountedCompleter p0){
       ForkJoinTask status;
       ForkJoinPool$f uof = ForkJoinPool.E.get();
       ForkJoinPool to = this.o;
       if (uof != null && to != null) {
          int i = to.length - 1;
          if (i >= 0) {
             uof = uof.a;
             object oobject = to[((uof & i) & 0x7e)];
             if (oobject != null) {
                int i1 = (i + i) + 1;
                int i2 = 0;
                int i3 = uof | 0x01;
                int i4 = i1;
                status = p0.status;
                while (status >= null) {
                   if (oobject.b(p0)) {
                   label_0043 :
                      i4 = i1;
                   }else {
                      status = p0.status;
                      if (status >= null) {
                         int i5 = i3 & i;
                         object oobject1 = to[i5];
                         if (oobject1 != null && oobject1.i(p0)) {
                            goto label_0043 ;
                         }else {
                            i4 = i4 - 1;
                            if (i4 < 0) {
                               ForkJoinPool tj = this.j;
                               if (i2 - tj) {
                                  i4 = i1;
                                  i2 = tj;
                               }
                            }
                         }
                      }
                   }
                   i3 = i3 + 2;
                }
             }else {
             label_0055 :
                status = 0;
             }
          }else {
             goto label_0055 ;
          }
       }else {
          goto label_0055 ;
       }
       return status;
    }
    public final void i(ForkJoinTask p0){
       ForkJoinPool$f uof = ForkJoinPool.E.get();
       ForkJoinPool tk = this.k;
       ForkJoinPool to = this.o;
       if (uof != null && (tk > null && to != null)) {
          int i = to.length - 1;
          if (i >= 0) {
             uof = uof.a;
             object oobject = to[((i & uof) & 0x7e)];
             if (oobject != null && uof != null) {
                Unsafe k = ForkJoinPool.K;
                if (k.compareAndSwapInt(oobject, ForkJoinPool.T, 0, 1)) {
                   ForkJoinPool$g q = oobject.q;
                   if (q != null) {
                      int i1 = q.length - 1;
                      ForkJoinPool$g p = oobject.p;
                      int i2 = p - oobject.o;
                      if (i1 > i2) {
                         k.putOrderedObject(q, (long)(((i1 & p) << ForkJoinPool.O) + ForkJoinPool.N), p0);
                         oobject.p = p + 1;
                         oobject.n = 0;
                         if (i2 <= 1) {
                            this.v(to, oobject);
                         }
                         return;
                      }
                   }
                   oobject.n = 0;
                }
             }
          }
       }
       this.k(p0);
       return;
    }
    public List invokeAll(Collection p0){
       ArrayList uArrayList = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ForkJoinTask$AdaptedCallable uAdaptedCall = new ForkJoinTask$AdaptedCallable(iterator.next());
          uArrayList.add(uAdaptedCall);
          this.i(uAdaptedCall);
       }
       int i = uArrayList.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uArrayList.get(i1).quietlyJoin();
       }
       return uArrayList;
    }
    public boolean isShutdown(){
       boolean b = (this.k < null)? true: false;
       return b;
    }
    public boolean isTerminated(){
       ForkJoinPool tj = this.j;
       boolean b = ((0x80000000 & tj) && ((short)(int)(tj >> 32) + this.m) <= 0)? true: false;
       return b;
    }
    public final ForkJoinPool$g j(){
       ForkJoinPool tk;
       object oobject;
       int i = ThreadLocalRandom.current().nextInt();
       do {
          tk = this.k;
          ForkJoinPool to = this.o;
          if (to != null) {
             int i1 = to.length - 1;
             if (i1 >= 0) {
                int i2 = i1 + 1;
                i2 = i2 << 2;
                while (true) {
                   if (i2 >= 0) {
                      int i3 = i - i2;
                      i3 = i3 << 1;
                      i3 = i3 | 0x01;
                      i3 = i3 & i1;
                      oobject = to[i3];
                      if (oobject != null) {
                         int i4 = oobject.o - oobject.p;
                         if (i4 < 0) {
                            break ;
                         }
                      }
                      i2 = i2 - 1;
                   }
                }
                return oobject;
             }
          }
          if (this.k == tk) {
             return null;
          }
          continue ;
       } while (this.k == tk);
    }
    public final void k(ForkJoinTask p0){
       int i1;
       ForkJoinPool$f uof1;
       ForkJoinPool k;
       ForkJoinPool$g[] this;
       int i3;
       int i5;
       int i7;
       int this1;
       object oobject;
       Unsafe k1;
       ForkJoinPool$g q;
       ForkJoinPool$g p;
       ForkJoinPool uForkJoinPoo = this;
       ForkJoinPool$f uof = ForkJoinPool.E.get();
       int i = 0;
       while (true) {
          Unsafe unsafe = null;
          break ;
       }
       while (true) {
          if (!uof) {
             ForkJoinPool l = uForkJoinPoo.l;
             i1 = l + 0x61c88647;
             if (ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.R, l, i1) && i1) {
                uof1 = new ForkJoinPool$f(i1);
                ForkJoinPool.E.set(uof1);
                uof = uof1;
             label_0040 :
                k = uForkJoinPoo.k;
                if (k >= null) {
                   int i2 = Integer.MAX_VALUE;
                   this = null;
                   i3 = 1;
                   if (k != null) {
                      k = uForkJoinPoo.o;
                      if (k != null) {
                         int i4 = k.length - i3;
                         if (i4 < 0) {
                         label_00f8 :
                            k = uForkJoinPoo.m;
                            i5 = (k > i3)? k - 1: 1;
                            i4 = i5 >> 1;
                            i5 = i5 | i4;
                            i4 = i5 >> 2;
                            i5 = i5 | i4;
                            i4 = i5 >> 4;
                            i5 = i5 | i4;
                            i4 = i5 >> 8;
                            i5 = i5 | i4;
                            i4 = i5 >> 16;
                            i5 = i5 | i4;
                            i5 = i5 + i3;
                            i5 = i5 << i3;
                            ForkJoinPool o = uForkJoinPoo.o;
                            if (o == null || !o.length) {
                               this = new ForkJoinPool$g[i5];
                            }
                            ForkJoinPool$g[] ogArray = this;
                            l = uForkJoinPoo.k;
                            i5 = l & 0x02;
                            if (!i5) {
                               int i6 = l + 2;
                               if (ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.Q, l, i6)) {
                                  i7 = i6;
                               label_013a :
                                  k = uForkJoinPoo.o;
                                  if (k == null || (!k.length && ogArray != null)) {
                                     uForkJoinPoo.o = ogArray;
                                  }
                                  i5 = i7 & Integer.MIN_VALUE;
                                  this1 = i7 + 2;
                                  this1 = this1 & i2;
                                  i2 = i5 | this1;
                                  if (!ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.Q, i7, i2)) {
                                     uForkJoinPoo.t(i2);
                                  }
                               }
                            }
                            i7 = this.a();
                            goto label_013a ;
                         }else {
                            i4 = i4 & i1;
                            int i8 = i4 & 0x7e;
                            oobject = k[i8];
                            if (oobject != null) {
                               if (oobject.n == null) {
                                  k1 = ForkJoinPool.K;
                                  if (k1.compareAndSwapInt(oobject, ForkJoinPool.T, 0, 1)) {
                                     q = oobject.q;
                                     p = oobject.p;
                                     if (q == null || q.length <= ((p + 1) - oobject.o)) {
                                        q = oobject.c();
                                        break ;
                                     }
                                     break ;
                                  }
                               }
                               int i9 = p0;
                            }else {
                               i5 = uForkJoinPoo.k & 0x02;
                               if (!i5) {
                                  ForkJoinPool$g og = new ForkJoinPool$g(uForkJoinPoo, this, -1, i1);
                                  og.l = (short)i8;
                                  l = uForkJoinPoo.k;
                                  i5 = l & 0x02;
                                  if (!i5) {
                                     int i10 = l + 2;
                                     if (ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.Q, l, i10)) {
                                        i7 = i10;
                                     label_00d2 :
                                        k = uForkJoinPoo.o;
                                        if (k != null && (i8 < k.length && k[i8] == null)) {
                                           k[i8] = og;
                                        }
                                     label_00df :
                                        i5 = i7 & Integer.MIN_VALUE;
                                        this1 = i7 + 2;
                                        this1 = this1 & i2;
                                        i2 = i5 | this1;
                                        if (!ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.Q, i7, i2)) {
                                           uForkJoinPoo.t(i2);
                                        }
                                     }
                                  }
                                  i7 = this.a();
                                  goto label_00d2 ;
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }else {
                         goto label_00f8 ;
                      }
                   }else {
                      goto label_00f8 ;
                   }
                   i5 = i1;
                }else {
                   throw new RejectedExecutionException();
                }
             }else {
                goto label_0040 ;
             }
          }else if(!unsafe){
             uof1 = uof.a;
             this1 = uof1 << 13;
             i5 = uof1 ^ this1;
             this1 = i5 >> 17;
             i5 = i5 ^ this1;
             this1 = i5 << 5;
             i5 = i5 ^ this1;
             uof.a = i5;
          }
          i1 = i5;
          goto label_0040 ;
       }
       k1.putOrderedObject(q, (long)((((q.length - i3) & p) << ForkJoinPool.O) + ForkJoinPool.N), p0);
       oobject.p = p + i3;
       oobject.n = i;
       uForkJoinPoo.v(k, oobject);
       return;
    }
    public final int n(ForkJoinPool$g p0,CountedCompleter p1){
       ForkJoinTask status;
       ForkJoinPool to = this.o;
       if (to != null) {
          int i = to.length - 1;
          if (i >= 0) {
             ForkJoinPool$g l = p0.l;
             int i1 = (i + i) + 1;
             int i2 = 0;
             int i3 = i1;
             status = p1.status;
             while (status >= null) {
                if (p0.d(p1)) {
                label_002f :
                   i3 = i1;
                }else {
                   status = p1.status;
                   if (status >= null) {
                      int i4 = l & i;
                      object oobject = to[i4];
                      if (oobject != null && oobject.i(p1)) {
                         goto label_002f ;
                      }else {
                         i3 = i3 - 1;
                         if (i3 < 0) {
                            ForkJoinPool tj = this.j;
                            if (i2 - tj) {
                               i3 = i1;
                               i2 = tj;
                            }
                         }
                      }
                   }
                }
                l = l + 2;
             }
          }else {
          label_0041 :
             status = 0;
          }
       }else {
          goto label_0041 ;
       }
       return status;
    }
    public RunnableFuture newTaskFor(Runnable p0,Object p1){
       return new ForkJoinTask$AdaptedRunnable(p0, p1);
    }
    public RunnableFuture newTaskFor(Callable p0){
       return new ForkJoinTask$AdaptedCallable(p0);
    }
    public final void o(ForkJoinPool$g p0){
       ForkJoinPool j;
       long l1;
       int i1;
       ForkJoinPool uForkJoinPoo = this;
       ForkJoinPool$g og = p0;
       ForkJoinPool$g v = og.v;
       int i = 1;
       ForkJoinTask uForkJoinTas = p0.f();
       while (uForkJoinTas != null) {
          uForkJoinTas.doExec();
       }
       ForkJoinPool$g og1 = this.j();
       long l = 0xffff000000000000;
       if (og1 != null) {
          if (!i) {
             do {
                j = uForkJoinPoo.j;
                l1 = j & 0xffffffffffff;
                long l2 = j & l;
                l2 = l2 + 0x1000000000000;
                l1 = l1 | l2;
             } while (ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, j, l1));
             i = 1;
          }
          ForkJoinPool$g o = og1.o;
          i1 = o - og1.p;
          if (i1 < 0) {
             uForkJoinTas = og1.j(o);
             if (uForkJoinTas != null) {
                og.v = uForkJoinTas;
                uForkJoinTas.doExec();
                og.v = v;
                goto label_0008 ;
             }else {
                goto label_0008 ;
             }
          }else {
             goto label_0008 ;
          }
       }else {
          long l3 = 48;
          if (i) {
             j = uForkJoinPoo.j;
             long l4 = j & 0xffffffffffff;
             l1 = j & l;
             l1 = l1 - 0x1000000000000;
             l1 = l1 | l4;
             l3 = l1 >> l3;
             i1 = (int)l3;
             i1 = i1 + uForkJoinPoo.m;
             if (i1) {
                if (ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, j, l1)) {
                   i = 0;
                   goto label_0008 ;
                }else {
                   goto label_0008 ;
                }
             }
          }else {
             j = uForkJoinPoo.j;
             l3 = j >> l3;
             i1 = (int)l3;
             i1 = i1 + uForkJoinPoo.m;
             if (i1 <= 0) {
                l1 = j & 0xffffffffffff;
                l = j & l;
                l = l + 0x1000000000000;
                l1 = l1 | l;
                if (!ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, j, l1)) {
                }
             }else {
                goto label_0008 ;
             }
          }
          return;
       }
    }
    public final void p(long p0,ForkJoinPool$g[] p1,ForkJoinPool$g p2,ForkJoinPool$g p3,int p4){
       long l = p0;
       int i = p1;
       ForkJoinPool$g og = p2;
       if (og.h < null) {
          int i1 = (int)l;
          if (i1 > 0) {
             int i2 = 0xffff & i1;
             if (i.length > i2) {
                object oobject = i[i2];
                if (oobject != null) {
                   if (!this.j - l) {
                      long l1 = (long)(oobject.i & Integer.MAX_VALUE) | ((long)((int)(l >> 32) + 0x10000) << 32);
                      int i3 = (0x10000 + i1) & Integer.MAX_VALUE;
                      if (p3.o == p4 && (og.h < null && oobject.h == (Integer.MIN_VALUE | i1))) {
                         Unsafe k = ForkJoinPool.K;
                         if (k.compareAndSwapLong(this, ForkJoinPool.L, p0, l1)) {
                            oobject.h = i3;
                            ForkJoinPool$g t = oobject.t;
                            if (t != null) {
                               k.unpark(t);
                            }
                         }
                      }
                   }
                }else {
                label_005c :
                   int i4 = this;
                }
             }else {
                goto label_005c ;
             }
          }else {
             goto label_005c ;
          }
       }else {
          goto label_005c ;
       }
       return;
    }
    public final void q(){
       ForkJoinPool tj;
       long l;
       do {
          tj = this.j;
          l = 0xffffffffffff & tj;
          long l1 = 0xffff000000000000 & tj;
          l1 = l1 + 0x1000000000000;
          l = l | l1;
       } while (ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, tj, l));
       return;
    }
    public final ForkJoinPool$g r(a p0){
       Unsafe k;
       ForkJoinPool tl;
       int i;
       int i2;
       int i8;
       boolean b = true;
       p0.setDaemon(b);
       ForkJoinPool tq = this.q;
       if (tq != null) {
          p0.setUncaughtExceptionHandler(tq);
       }
       do {
          k = ForkJoinPool.K;
          tl = this.l;
          i = tl + 0x61c88647;
          if (k.compareAndSwapInt(this, ForkJoinPool.R, tl, i)) {
          }
       } while (i);
       ForkJoinPool$g og = new ForkJoinPool$g(this, p0, this.n, i);
       tl = this.k;
       int i1 = tl & 0x02;
       if (!i1) {
          i2 = tl + 2;
          if (k.compareAndSwapInt(this, ForkJoinPool.Q, tl, i2)) {
          label_003f :
             int i3 = i2;
             int i4 = Integer.MIN_VALUE & i3;
             i1 = i3 + 2;
             i1 = i1 & Integer.MAX_VALUE;
             int i5 = i4 | i1;
             tq = this.o;
             if (tq != null) {
                i1 = tq.length;
                int i6 = i1 - 1;
                int i7 = i << 1;
                i7 = i7 | b;
                i7 = i7 & i6;
                if (tq[i7] != null) {
                   i = 2;
                   if (i1 > 4) {
                      i8 = i1 >> 1;
                      i8 = i8 & 0xfffe;
                      i = i + i8;
                   }
                   while (true) {
                      i8 = 0;
                      break ;
                   }
                   while (true) {
                      i7 = i7 + i;
                      i7 = i7 & i6;
                      if (tq[i7] != null) {
                         i8 = i8 + b;
                         if (i8 >= i1) {
                            i1 = i1 << 1;
                            ForkJoinPool$g[] ogArray = Arrays.copyOf(tq, i1);
                            this.o = ogArray;
                            i6 = i1 - 1;
                         }
                      }
                   }
                }
                og.l = (short)i7;
                og.h = i7;
                tq[i7] = og;
             }
             if (!ForkJoinPool.K.compareAndSwapInt(this, ForkJoinPool.Q, i3, i5)) {
                this.t(i5);
             }
             p0.setName((this.r).concat(Integer.toString((og.l >> 1))));
             return og;
          }
       }
       i2 = this.a();
       goto label_003f ;
    }
    public void shutdown(){
       ForkJoinPool.e();
       this.A(false, true);
    }
    public List shutdownNow(){
       ForkJoinPool.e();
       this.A(true, true);
       return Collections.emptyList();
    }
    public Future submit(Runnable p0){
       Objects.requireNonNull(p0);
       if (p0 instanceof ForkJoinTask) {
       }else {
          ForkJoinTask$AdaptedRunnableAction uAdaptedRunn = new ForkJoinTask$AdaptedRunnableAction(p0);
       }
       this.i(p0);
       return p0;
    }
    public Future submit(Runnable p0,Object p1){
       ForkJoinTask$AdaptedRunnable uAdaptedRunn = new ForkJoinTask$AdaptedRunnable(p0, p1);
       this.i(uAdaptedRunn);
       return uAdaptedRunn;
    }
    public Future submit(Callable p0){
       ForkJoinTask$AdaptedCallable uAdaptedCall = new ForkJoinTask$AdaptedCallable(p0);
       this.i(uAdaptedCall);
       return uAdaptedCall;
    }
    public final void t(int p0){
       this.k = p0;
       _monitor_enter(this);
       this.notifyAll();
       _monitor_exit(this);
    }
    public String toString(){
       long l;
       long l1;
       int i2;
       int i3;
       long l2;
       String str;
       ForkJoinPool uForkJoinPoo = this;
       ForkJoinPool i = uForkJoinPoo.i;
       ForkJoinPool j = uForkJoinPoo.j;
       ForkJoinPool o = uForkJoinPoo.o;
       if (o != null) {
          int i1 = 0;
          l = 0;
          l1 = 0;
          i2 = 0;
          while (i1 < o.length) {
             object oobject = o[i1];
             if (oobject != null) {
                i3 = oobject.m();
                int i4 = i1 & 0x01;
                if (!i4) {
                   l1 = l1 + (long)i3;
                }else {
                   l = l + (long)i3;
                   i = i + (long)oobject.j;
                   if (oobject.h >= null) {
                      ForkJoinPool$g s = oobject.s;
                      if (s != null) {
                         Thread$State state = s.getState();
                         if (state != Thread$State.BLOCKED && (state != Thread$State.WAITING && state != Thread$State.TIMED_WAITING)) {
                            l2 = 1;
                         label_0043 :
                            if (l2) {
                               i2 = i2 + 1;
                            }
                         }
                      }
                   }
                   l2 = 0;
                   goto label_0043 ;
                }
             }
             i1 = i1 + 1;
          }
       }else {
          l = 0;
          l1 = 0;
          i2 = 0;
       }
       o = uForkJoinPoo.m;
       int i5 = (short)(int)(j >> 32) + o;
       i3 = (int)(j >> 48) + o;
       if (i3 < 0) {
          i3 = 0;
       }
       if (j & 0x80000000) {
          str = (!i5)? "Terminated": "Terminating";
       }else if(uForkJoinPoo.k < null){
          str = "Shutting down";
       }else {
          str = "Running";
       }
       return super.toString()+"["+str+", parallelism = "+o+", size = "+i5+", active = "+i3+", running = "+i2+", steals = "+i+", tasks = "+l+", submissions = "+l1+"]";
    }
    public final int u(ForkJoinPool$g p0,int p1){
       ForkJoinPool uForkJoinPoo = this;
       ForkJoinPool$g og = p0;
       ForkJoinPool j = uForkJoinPoo.j;
       ForkJoinPool o = uForkJoinPoo.o;
       if (o != null) {
          int i = o.length - 1;
          if (i >= 0) {
             int i1 = (i + i) + 1;
             ForkJoinPool$g h = og.h;
             while (true) {
                int i2 = p1 - i1;
                i2 = i2 & i;
                object oobject = o[i2];
                if (oobject != null) {
                   ForkJoinPool$g o1 = oobject.o;
                   i2 = o1 - oobject.p;
                   if (i2 < 0) {
                      ForkJoinPool$g q = oobject.q;
                      if (q != null) {
                         long l = (long)((((q.length - 1) & o1) << ForkJoinPool.O) + ForkJoinPool.N);
                         Unsafe k = ForkJoinPool.K;
                         ForkJoinTask objectVolati = k.getObjectVolatile(q, l);
                         if (objectVolati != null) {
                            if (h < null) {
                               this.p(j, o, p0, oobject, o1);
                               break ;
                            }else if(oobject.o == o1 && k.compareAndSwapObject(q, l, objectVolati, null)){
                               int i3 = o1 + 1;
                               k.putOrderedInt(oobject, ForkJoinPool.S, i3);
                               if ((i3 - oobject.p) < 0) {
                                  uForkJoinPoo.v(o, oobject);
                               }
                               og.n(objectVolati);
                               break ;
                            }
                         }
                      }
                   }
                }
                i1 = i1 - 1;
                if (i1 < 0) {
                   i = (int)j;
                   if ((h | i) < 0) {
                      return uForkJoinPoo.d(og, j, h);
                   }else if(!uForkJoinPoo.j - j){
                      og.i = i;
                      og.h = Integer.MIN_VALUE | h;
                      if (!ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, j, (((j - 0x1000000000000) & 0xffffffff00000000) | (long)h))) {
                         og.h = h;
                         break ;
                      }
                   }
                }
             }
          }
       }
    label_00a0 :
       return 0;
    }
    public final void v(ForkJoinPool$g[] p0,ForkJoinPool$g p1){
       ForkJoinPool tj = this.j;
       long l = 32;
       long l1 = tj >> l;
       int i = (int)l1;
       while (i < 0) {
          int i1 = (int)tj;
          if (i1 <= 0) {
             if ((short)i < 0) {
                this.w();
                break ;
             }else {
                break ;
             }
          }else if(p0 != null){
             int i2 = 0xffff & i1;
             if (p0.length > i2) {
                object oobject = p0[i2];
                if (oobject == null) {
                   break ;
                }else {
                   i2 = Integer.MAX_VALUE;
                   int i3 = oobject.i & i2;
                   long l2 = (long)i3;
                   i = i + 0x10000;
                   long l3 = (long)i << l;
                   l2 = l2 | l3;
                   i3 = 0x10000 + i1;
                   int i4 = i3 & i2;
                   i1 = i1 | Integer.MIN_VALUE;
                   if (oobject.h == i1) {
                      Unsafe k = ForkJoinPool.K;
                      if (k.compareAndSwapLong(this, ForkJoinPool.L, tj, l2)) {
                         oobject.h = i4;
                         ForkJoinPool$g t = oobject.t;
                         if (t != null) {
                            k.unpark(t);
                            break ;
                         }else {
                            break ;
                         }
                      }
                   }
                   if (p1.o >= p1.p) {
                      break ;
                   }
                }
             }else {
                break ;
             }
          }else {
             break ;
          }
       }
       return;
    }
    public final void w(){
       ForkJoinPool this;
       a this1;
       ForkJoinPool tj = this.j;
       long l = 32;
       long l1 = tj >> l;
       int i = (int)l1;
       while (i < 0) {
          int i1 = 0x8000 & i;
          if (i1) {
             i1 = (int)tj;
             if (i1 >= 0) {
                int i2 = i + 1;
                i2 = i2 & 0xffff;
                i = i + 0x10000;
                i = i & 0xffff0000;
                i = i | i2;
                long l2 = (long)i << l;
                long l3 = l2 | (long)i1;
                if (ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, tj, l3)) {
                   this = this.p;
                   if (this != null) {
                      this1 = this.a(this);
                      if (this1 != null) {
                         this1.start();
                         break ;
                      }
                   }else {
                      this1 = null;
                   }
                   this.g(this1, null);
                   break ;
                }
             }else {
                break ;
             }
          }else {
             break ;
          }
       }
       return;
    }
    public final boolean x(long p0){
       a this;
       ForkJoinPool to = this.o;
       ForkJoinPool tm = this.m;
       int i = (int)p0;
       if (to != null) {
          int i1 = to.length - 1;
          if (i1 >= 0 && (i >= 0 && !this.j - p0)) {
             object oobject = to[(i1 & i)];
             if (i && oobject != null) {
                long l = (long)(oobject.i & Integer.MAX_VALUE) | (0xffffffff00000000 & p0);
                int i2 = (0x10000 + i) & Integer.MAX_VALUE;
                if (oobject.h == (i | Integer.MIN_VALUE)) {
                   Unsafe k = ForkJoinPool.K;
                   if (k.compareAndSwapLong(this, ForkJoinPool.L, p0, l)) {
                      oobject.h = i2;
                      ForkJoinPool$g t = oobject.t;
                      if (t != null) {
                         k.unpark(t);
                      }
                      return 1;
                   }
                }
             }else {
                short s = (short)(int)(p0 >> 32);
                if (s >= 0 && ((int)(p0 >> 48) + tm) > 1) {
                   if (ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, p0, (((p0 - 0x1000000000000) & 0xffff000000000000) | (0xffffffffffff & p0)))) {
                      return 1;
                   }
                }else if((s + tm) < 0x7fff && ForkJoinPool.K.compareAndSwapLong(this, ForkJoinPool.L, p0, (((0x100000000 + p0) & 0xffff00000000) | (0xffff0000ffffffff & p0)))){
                   to = this.p;
                   if (to != null) {
                      this = to.a(this);
                      if (this != null) {
                         this.start();
                         return 1;
                      }
                   }else {
                      this = null;
                   }
                   this.g(this, null);
                }
             }
          }
       }
       return false;
    }
    public final boolean y(ForkJoinTask p0){
       ForkJoinPool$f uof = ForkJoinPool.E.get();
       ForkJoinPool o = this.o;
       int i = 0;
       if (uof != null && o != null) {
          int i1 = 1;
          int i2 = o.length - i1;
          if (i2 >= 0) {
             object oobject = o[((uof.a & i2) & 0x7e)];
             if (oobject != null) {
                ForkJoinPool$g p = oobject.p;
                if (oobject.o != p) {
                   ForkJoinPool$g q = oobject.q;
                   if (q != null) {
                      int i3 = p - 1;
                      long l = (long)((((q.length - i1) & i3) << ForkJoinPool.O) + ForkJoinPool.N);
                      Unsafe k = ForkJoinPool.K;
                      if (k.getObject(q, l) == p0 && k.compareAndSwapInt(oobject, ForkJoinPool.T, 0, 1)) {
                         if (oobject.p == p && (oobject.q == q && k.compareAndSwapObject(q, l, p0, null))) {
                            oobject.p = i3;
                         }else {
                            i1 = 0;
                         }
                         oobject.n = i;
                         i = i1;
                      }
                   }
                }
             }
          }
       }
       return i;
    }
    public final int z(ForkJoinPool$g p0,ForkJoinTask p1){
       ForkJoinPool$g og = p0;
       ForkJoinTask uForkJoinTas = p1;
       ForkJoinPool$g og1 = null;
       int i = 1;
       if ((og.o - og.p) >= 0) {
          long l = 0;
          while (true) {
             ForkJoinPool$g og2 = og;
             ForkJoinTask uForkJoinTas1 = uForkJoinTas;
             while (true) {
                ForkJoinTask status = uForkJoinTas.status;
                if (status < null) {
                   og1 = status;
                label_0015 :
                   int i1 = this;
                }else {
                   ForkJoinPool o = this.o;
                   if (o != null) {
                      int i2 = o.length - i;
                      if (i2 > 0) {
                         int i3 = og2.k | i;
                         i3 = i3 & i2;
                         object oobject = o[i3];
                         if (oobject == null || oobject.v != uForkJoinTas1) {
                            int i4 = i3;
                            while (true) {
                               i4 = i4 + 2;
                               i4 = i4 & i2;
                               int i5 = i4 & 0x0f;
                               if (i5 == i && (uForkJoinTas1.status < null || og2.u != uForkJoinTas1)) {
                                  continue ;
                               }else {
                                  object oobject1 = o[i4];
                                  if (oobject1 != null && oobject1.v == uForkJoinTas1) {
                                     og2.k = i4;
                                     oobject = oobject1;
                                  }else {
                                     if (i4 != i3) {
                                        continue ;
                                     }
                                  }
                               }
                            }
                         label_00d1 :
                            return i;
                         }
                         while (true) {
                            if (uForkJoinTas1.status < null) {
                               continue ;
                            }else {
                               ForkJoinPool$g o1 = oobject.o;
                               i2 = o1 - oobject.p;
                               if (i2 < 0) {
                                  ForkJoinPool$g q = oobject.q;
                                  if (q != null) {
                                     i2 = q.length - i;
                                     i2 = i2 & o1;
                                     i2 = i2 << ForkJoinPool.O;
                                     i2 = i2 + ForkJoinPool.N;
                                     Unsafe k = ForkJoinPool.K;
                                     long l1 = (long)i2;
                                     ForkJoinTask objectVolati = k.getObjectVolatile(q, l1);
                                     if (uForkJoinTas1.status >= null && (og2.u != uForkJoinTas1 || oobject.v != uForkJoinTas1)) {
                                        continue ;
                                     }else if(oobject.o == o1){
                                        if (objectVolati == null) {
                                           goto label_00d1 ;
                                        }else if(k.compareAndSwapObject(q, l1, objectVolati, null)){
                                           k.putOrderedInt(oobject, ForkJoinPool.S, (o1 + i));
                                           ForkJoinPool$g v = og.v;
                                           og1 = og.p;
                                           og.v = objectVolati;
                                           objectVolati.doExec();
                                           while (uForkJoinTas.status >= null && og.p != og1) {
                                              objectVolati = p0.k();
                                              if (objectVolati == null) {
                                              }else {
                                                 continue ;
                                              }
                                           }
                                           og.v = v;
                                           goto label_00d1 ;
                                        }
                                     }
                                     og1 = 1;
                                  }
                               }
                               o1 = oobject.u;
                               if (uForkJoinTas1.status >= null && (og2.u != uForkJoinTas1 || oobject.v != uForkJoinTas1)) {
                                  continue ;
                               }else if(o1 != null){
                                  int i6 = l + 1;
                                  if (i6 != 64) {
                                     uForkJoinTas1 = o1;
                                     og2 = oobject;
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }else {
          goto label_0015 ;
       }
       i = og1;
       goto label_00d1 ;
    }
}
