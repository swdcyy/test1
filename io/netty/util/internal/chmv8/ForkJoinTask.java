package io.netty.util.internal.chmv8.ForkJoinTask;
import java.util.concurrent.Future;
import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.ref.ReferenceQueue;
import io.netty.util.internal.chmv8.ForkJoinTask$b;
import sun.misc.Unsafe;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Error;
import java.lang.Throwable;
import java.lang.Object;
import io.netty.util.internal.chmv8.ForkJoinTask$a;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.lang.RuntimeException;
import java.security.PrivilegedActionException;
import java.lang.Runnable;
import io.netty.util.internal.chmv8.ForkJoinTask$AdaptedRunnableAction;
import io.netty.util.internal.chmv8.ForkJoinTask$AdaptedRunnable;
import java.util.concurrent.Callable;
import io.netty.util.internal.chmv8.ForkJoinTask$AdaptedCallable;
import io.netty.util.internal.chmv8.ForkJoinPool;
import java.lang.Thread;
import io.netty.util.internal.chmv8.a;
import io.netty.util.internal.chmv8.ForkJoinPool$g;
import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;
import java.lang.NullPointerException;
import java.util.Objects;
import java.io.ObjectInputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.System;
import java.io.ObjectOutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import io.netty.util.internal.chmv8.CountedCompleter;
import java.lang.InterruptedException;
import java.util.concurrent.TimeoutException;

public abstract class ForkJoinTask implements Future, Serializable	// class@00117a
{
    public int status;
    public static final ForkJoinTask$b[] b;
    public static final ReentrantLock c;
    public static final Unsafe d;
    public static final long e;
    public static final ReferenceQueue exceptionTableRefQueue;
    public static final long serialVersionUID;

    static {
       ForkJoinTask.c = new ReentrantLock();
       ForkJoinTask.exceptionTableRefQueue = new ReferenceQueue();
       ForkJoinTask$b[] uobArray = new ForkJoinTask$b[32];
       try{
          ForkJoinTask.b = uobArray;
          Unsafe unsafe = ForkJoinTask.D();
          ForkJoinTask.d = unsafe;
          ForkJoinTask.e = unsafe.objectFieldOffset(ForkJoinTask.class.getDeclaredField("status"));
       }catch(java.lang.Exception e0){
          throw new Error(e0);
       }
    }
    public void ForkJoinTask(){
       super();
    }
    public static Unsafe D(){
       try{
          return Unsafe.getUnsafe();
       }catch(java.lang.SecurityException e0){
          try{
             return AccessController.doPrivileged(new ForkJoinTask$a());
          }catch(java.security.PrivilegedActionException e0){
             throw new RuntimeException("Could not initialize intrinsics", e0.getCause());
          }
       }
    }
    public static ForkJoinTask adapt(Runnable p0){
       return new ForkJoinTask$AdaptedRunnableAction(p0);
    }
    public static ForkJoinTask adapt(Runnable p0,Object p1){
       return new ForkJoinTask$AdaptedRunnable(p0, p1);
    }
    public static ForkJoinTask adapt(Callable p0){
       return new ForkJoinTask$AdaptedCallable(p0);
    }
    public static final void cancelIgnoringExceptions(ForkJoinTask p0){
       if (p0 != null && p0.status >= null) {
          p0.cancel(false);
       }
       return;
    }
    public static ForkJoinPool getPool(){
       Thread thread = Thread.currentThread();
       a b = (thread instanceof a)? thread.b: null;
       return b;
    }
    public static int getQueuedTaskCount(){
       Thread thread = Thread.currentThread();
       a c = (thread instanceof a)? thread.c: ForkJoinPool.f();
       int i = (c == null)? 0: c.m();
       return i;
    }
    public static int getSurplusQueuedTaskCount(){
       Thread thread = Thread.currentThread();
       int i = 0;
       if (thread instanceof a) {
          a b = thread.b;
          ForkJoinPool m = b.m;
          a c = thread.c;
          int i1 = c.p - c.o;
          int i2 = (int)(b.j >> 48) + m;
          int i3 = 1;
          int i4 = m >> i3;
          if (i2 <= i4) {
             i = i4 >> 1;
             if (i2 > i) {
                i = 1;
             }else {
                i = i >> i3;
                if (i2 > i) {
                   i = 2;
                }else if(i2 > (i >> 1)){
                   i = 4;
                }else {
                   i = 8;
                }
             }
          }
          i = i1 - i;
       }
       return i;
    }
    public static final void helpExpungeStaleExceptions(){
       ReentrantLock c = ForkJoinTask.c;
       if (c.tryLock()) {
          ForkJoinTask.t();
          c.unlock();
       }
       return;
    }
    public static void helpQuiesce(){
       Thread thread = Thread.currentThread();
       if (thread instanceof a) {
          thread.b.o(thread.c);
       }else {
          ForkJoinPool.H.c(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
       }
       return;
    }
    public static boolean inForkJoinPool(){
       return Thread.currentThread() instanceof a;
    }
    public static Collection invokeAll(Collection p0){
       if (!p0 instanceof RandomAccess || !p0 instanceof List) {
          ForkJoinTask[] uForkJoinTas = new ForkJoinTask[p0.size()];
          ForkJoinTask.invokeAll(p0.toArray(uForkJoinTas));
          return p0;
       }else {
          List list = p0;
          NullPointerException nullPointerE = null;
          int i = 1;
          int i1 = list.size() - i;
          int i2 = i1;
          while (i2 >= 0) {
             ForkJoinTask uForkJoinTas1 = list.get(i2);
             if (uForkJoinTas1 == null) {
                if (nullPointerE == null) {
                   nullPointerE = new NullPointerException();
                }
             }else if(i2){
                uForkJoinTas1.fork();
             }else if(uForkJoinTas1.m() < 0xf0000000 && nullPointerE == null){
                nullPointerE = uForkJoinTas1.getException();
             }
             i2 = i2 - 1;
          }
          while (i <= i1) {
             ForkJoinTask uForkJoinTas2 = list.get(i);
             if (uForkJoinTas2 != null) {
                if (nullPointerE != null) {
                   uForkJoinTas2.cancel(false);
                }else if(uForkJoinTas2.q() < 0xf0000000){
                   nullPointerE = uForkJoinTas2.getException();
                }
             }
             i = i + 1;
          }
          if (nullPointerE != null) {
             ForkJoinTask.rethrow(nullPointerE);
          }
          return p0;
       }
    }
    public static void invokeAll(ForkJoinTask p0,ForkJoinTask p1){
       p1.fork();
       int i = p0.m() & 0xf0000000;
       if (i != 0xf0000000) {
          p0.E(i);
       }
       int i1 = p1.q() & 0xf0000000;
       if (i1 != 0xf0000000) {
          p1.E(i1);
       }
       return;
    }
    public static void invokeAll(ForkJoinTask[] p0){
       int i = 1;
       int i1 = p0.length - i;
       NullPointerException nullPointerE = null;
       int i2 = i1;
       while (i2 >= 0) {
          object oobject = p0[i2];
          if (oobject == null) {
             if (nullPointerE == null) {
                nullPointerE = new NullPointerException();
             }
          }else if(i2){
             oobject.fork();
          }else if(oobject.m() < 0xf0000000 && nullPointerE == null){
             nullPointerE = oobject.getException();
          }
          i2 = i2 - 1;
       }
       while (i <= i1) {
          object oobject1 = p0[i];
          if (oobject1 != null) {
             if (nullPointerE != null) {
                oobject1.cancel(false);
             }else if(oobject1.q() < 0xf0000000){
                nullPointerE = oobject1.getException();
             }
          }
          i = i + 1;
       }
       if (nullPointerE != null) {
          ForkJoinTask.rethrow(nullPointerE);
       }
       return;
    }
    public static ForkJoinTask peekNextLocalTask(){
       Thread thread = Thread.currentThread();
       a c = (thread instanceof a)? thread.c: ForkJoinPool.f();
       ForkJoinTask uForkJoinTas = (c == null)? null: c.g();
       return uForkJoinTas;
    }
    public static ForkJoinTask pollNextLocalTask(){
       Thread thread = Thread.currentThread();
       ForkJoinTask uForkJoinTas = (thread instanceof a)? thread.c.f(): null;
       return uForkJoinTas;
    }
    public static ForkJoinTask pollTask(){
       Thread thread = Thread.currentThread();
       ForkJoinTask uForkJoinTas = null;
       if (thread instanceof a) {
          a b = thread.b;
          a c = thread.c;
          Objects.requireNonNull(b);
          while (true) {
             ForkJoinTask uForkJoinTas1 = c.f();
             if (uForkJoinTas1 == null) {
                ForkJoinPool$g og = b.j();
                if (og != null) {
                   ForkJoinPool$g o = og.o;
                   int i = o - og.p;
                   if (i < 0) {
                      uForkJoinTas1 = og.j(o);
                      if (uForkJoinTas1 == null) {
                         continue ;
                      }
                   }
                }
             }
             uForkJoinTas = uForkJoinTas1;
             break ;
          }
       }
       return uForkJoinTas;
    }
    private void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       p0 = p0.readObject();
       if (p0 != null) {
          this.G(p0);
       }
       return;
    }
    public static void rethrow(Throwable p0){
       if (p0 != null) {
          ForkJoinTask.uncheckedThrow(p0);
       }
       return;
    }
    public static void t(){
       Reference reference = ForkJoinTask.exceptionTableRefQueue.poll();
       while (reference != null) {
          if (reference instanceof ForkJoinTask$b) {
             ForkJoinTask$b[] b = ForkJoinTask.b;
             int i = b.length - 1;
             int i1 = System.identityHashCode(reference.get()) & i;
             object oobject1 = null;
             for (object oobject = b[i1]; oobject != null; oobject = b1) {
                ForkJoinTask$b b1 = oobject.b;
                if (oobject == reference) {
                   if (oobject1 == null) {
                      b[i1] = b1;
                   }else {
                      oobject1.b = b1;
                   }
                }else {
                   oobject1 = oobject;
                }
             }
          }
       }
       return;
    }
    public static void uncheckedThrow(Throwable p0){
       throw p0;
    }
    private void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeObject(this.getException());
    }
    public final Throwable B(){
       if ((this.status & 0xf0000000) != Integer.MIN_VALUE) {
          return null;
       }
       ReentrantLock c = ForkJoinTask.c;
       c.lock();
       ForkJoinTask.t();
       ForkJoinTask$b[] b = ForkJoinTask.b;
       object oobject = b[(System.identityHashCode(this) & (b.length - 1))];
       while (oobject != null && oobject.get() != this) {
          oobject = oobject.b;
       }
       c.unlock();
       if (oobject != null) {
          ForkJoinTask$b a = oobject.a;
          if (a != null) {
             return a;
          }
       }
       return null;
    }
    public final void E(int p0){
       if (p0 == 0xc0000000) {
          throw new CancellationException();
       }
       if (p0 == Integer.MIN_VALUE) {
          ForkJoinTask.rethrow(this.B());
       }
       return;
    }
    public final int F(int p0){
       while (true) {
          ForkJoinTask tstatus = this.status;
          if (tstatus < null) {
             return tstatus;
          }
          int i = tstatus | p0;
          if (ForkJoinTask.d.compareAndSwapInt(this, ForkJoinTask.e, tstatus, i)) {
             if (tstatus >> 16) {
                _monitor_enter(this);
                this.notifyAll();
                _monitor_exit(this);
                break ;
             }
             break ;
          }
       }
       return p0;
    }
    public final int G(Throwable p0){
       int i = this.recordExceptionalCompletion(p0);
       if ((0xf0000000 & i) == Integer.MIN_VALUE) {
          this.internalPropagateException(p0);
       }
       return i;
    }
    public boolean cancel(boolean p0){
       int i = 0xc0000000;
       i = ((this.F(i) & 0xf0000000) == i)? true: false;
       return i;
    }
    public final boolean compareAndSetForkJoinTaskTag(short p0,short p1){
       while (true) {
          ForkJoinTask tstatus = this.status;
          if ((short)tstatus != p0) {
             return false;
          }
          int i = 0xffff0000 & tstatus;
          int i1 = 0xffff & p1;
          i1 = i1 | i;
          if (ForkJoinTask.d.compareAndSwapInt(this, ForkJoinTask.e, tstatus, i1)) {
             break ;
          }
       }
       return true;
    }
    public void complete(Object p0){
       this.setRawResult(p0);
       this.F(0xf0000000);
    }
    public void completeExceptionally(Throwable p0){
       if (!p0 instanceof RuntimeException && !p0 instanceof Error) {
          RuntimeException runtimeExcep = new RuntimeException(p0);
       }
       this.G(p0);
       return;
    }
    public final int doExec(){
       ForkJoinTask tstatus = this.status;
       if (tstatus >= null && this.exec()) {
          tstatus = this.F(0xf0000000);
       }
    label_0016 :
       return tstatus;
    }
    public abstract boolean exec();
    public final ForkJoinTask fork(){
       Thread thread = Thread.currentThread();
       if (thread instanceof a) {
          thread.c.l(this);
       }else {
          ForkJoinPool.H.i(this);
       }
       return this;
    }
    public final Object get(){
       int i = (Thread.currentThread() instanceof a)? this.q(): this.x();
       i = i & 0xf0000000;
       if (i != 0xc0000000) {
          if (i == Integer.MIN_VALUE) {
             Throwable throwable = this.B();
             if (throwable != null) {
                throw new ExecutionException(throwable);
             }
          }
          return this.getRawResult();
       }else {
          throw new CancellationException();
       }
    }
    public final Object get(long p0,TimeUnit p1){
       a uoa1;
       a uoa2;
       int i3;
       ForkJoinTask uForkJoinTas = this;
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       long l = p1.toNanos(p0);
       ForkJoinTask status = uForkJoinTas.status;
       if (status >= null && l > 0) {
          long l1 = System.nanoTime() + l;
          Thread thread = Thread.currentThread();
          a uoa = null;
          if (thread instanceof a) {
             uoa = thread.b;
             a c = thread.c;
             Objects.requireNonNull(uoa);
             if (c != null) {
                ForkJoinTask status1 = uForkJoinTas.status;
                if (status1 >= null) {
                   ForkJoinPool$g u = c.u;
                   c.u = uForkJoinTas;
                   while (c.o(uForkJoinTas)) {
                      status1 = uForkJoinTas.status;
                      if (status1 < null) {
                         break ;
                      }
                   }
                   if (status1 >= null) {
                      if (uForkJoinTas instanceof CountedCompleter) {
                         uoa.n(c, uForkJoinTas);
                      }
                      do {
                      } while (uForkJoinTas.status < null || uoa.z(c, uForkJoinTas) <= 0);
                   }
                   c.u = u;
                }
             }
             uoa1 = c;
             uoa2 = uoa;
          }else {
             ForkJoinPool h = ForkJoinPool.H;
             if (h != null) {
                if (uForkJoinTas instanceof CountedCompleter) {
                   h.h(uForkJoinTas);
                }else if(h.y(uForkJoinTas)){
                   this.doExec();
                }
             }
             uoa2 = uoa;
             uoa1 = uoa2;
          }
          int i = 0;
          int i1 = 0;
          while (true) {
             ForkJoinTask status2 = uForkJoinTas.status;
             if (status2 >= null) {
                if (uoa1 != null && uoa1.n < null) {
                   ForkJoinTask.cancelIgnoringExceptions(this);
                }else if(!i){
                   if (uoa2 == null || uoa2.x(uoa2.j)) {
                      i = 1;
                   }
                }else {
                   long l2 = TimeUnit.NANOSECONDS.toMillis(l);
                   if (l2 > 0) {
                      int i2 = status2 | 0x10000;
                      i3 = i;
                      long l3 = l2;
                      if (ForkJoinTask.d.compareAndSwapInt(this, ForkJoinTask.e, status2, i2)) {
                         _monitor_enter(this);
                         if (uForkJoinTas.status >= null) {
                            try{
                               uForkJoinTas.wait(l3);
                            }catch(java.lang.InterruptedException e0){
                               if (!uoa2) {
                                  i1 = 1;
                               }
                            }
                         }else {
                            this.notifyAll();
                         }
                      }
                   }else {
                      i3 = i;
                   }
                   ForkJoinTask status3 = uForkJoinTas.status;
                   if (status3 >= null && !i1) {
                      long l4 = l1 - System.nanoTime();
                      if (l4 > 0) {
                         i = i3;
                         l = l4;
                      }
                   }
                   status = status3;
                label_00ee :
                   if (uoa2 != null && i3) {
                      uoa2.q();
                   }
                   if (i1) {
                      throw new InterruptedException();
                   }
                }
             }else {
                i3 = i;
                status = status2;
                goto label_00ee ;
             }
          }
       }
    label_0109 :
       int i4 = 0xf0000000;
       int i5 = status & i4;
       if (i5 != i4) {
          if (i5 != 0xc0000000) {
             if (i5 == Integer.MIN_VALUE) {
                Throwable throwable = this.B();
                if (throwable != null) {
                   throw new ExecutionException(throwable);
                }
             }else {
                throw new TimeoutException();
             }
          }else {
             throw new CancellationException();
          }
       }
       return this.getRawResult();
    }
    public final Throwable getException(){
       Throwable throwable;
       int i = 0xf0000000;
       int i1 = this.status & i;
       if (i1 >= i) {
          throwable = null;
       }else if(i1 == 0xc0000000){
          throwable = new CancellationException();
       }else {
          throwable = this.B();
       }
       return throwable;
    }
    public final short getForkJoinTaskTag(){
       return (short)this.status;
    }
    public abstract Object getRawResult();
    public void internalPropagateException(Throwable p0){
    }
    public final Object invoke(){
       int i = this.m() & 0xf0000000;
       if (i != 0xf0000000) {
          this.E(i);
       }
       return this.getRawResult();
    }
    public final boolean isCancelled(){
       boolean b = ((this.status & 0xf0000000) == 0xc0000000)? true: false;
       return b;
    }
    public final boolean isCompletedAbnormally(){
       boolean b = (this.status < 0xf0000000)? true: false;
       return b;
    }
    public final boolean isCompletedNormally(){
       boolean b = ((this.status & 0xf0000000) == 0xf0000000)? true: false;
       return b;
    }
    public final boolean isDone(){
       boolean b = (this.status < null)? true: false;
       return b;
    }
    public final Object join(){
       int i = this.q() & 0xf0000000;
       if (i != 0xf0000000) {
          this.E(i);
       }
       return this.getRawResult();
    }
    public final int m(){
       int i = this.doExec();
       if (i < 0) {
       }else {
          Thread thread = Thread.currentThread();
          i = (thread instanceof a)? thread.b.b(thread.c, this): this.w();
       }
       return i;
    }
    public final int q(){
       ForkJoinTask tstatus = this.status;
       if (tstatus < null) {
       }else {
          Thread thread = Thread.currentThread();
          if (thread instanceof a) {
             a c = thread.c;
             if (c.p(this)) {
                int i = this.doExec();
                if (i < 0) {
                   tstatus = i;
                }
             }
             tstatus = thread.b.b(c, this);
          }else {
             tstatus = this.w();
          }
       }
       return tstatus;
    }
    public final void quietlyComplete(){
       this.F(0xf0000000);
    }
    public final void quietlyInvoke(){
       this.m();
    }
    public final void quietlyJoin(){
       this.q();
    }
    public final int recordExceptionalCompletion(Throwable p0){
       int i;
       ForkJoinTask tstatus = this.status;
       if (tstatus >= null) {
          ReentrantLock c = ForkJoinTask.c;
          c.lock();
          ForkJoinTask.t();
          ForkJoinTask$b[] b = ForkJoinTask.b;
          i = System.identityHashCode(this) & (b.length - 1);
          object oobject = b[i];
          while (true) {
             if (oobject == null) {
                b[i] = new ForkJoinTask$b(this, p0, b[i]);
                break ;
             }else if(oobject.get() == this){
                break ;
             }else {
                oobject = oobject.b;
             }
          }
          c.unlock();
          i = this.F(Integer.MIN_VALUE);
       }
       return i;
    }
    public void reinitialize(){
       if ((this.status & 0xf0000000) == Integer.MIN_VALUE) {
          ReentrantLock c = ForkJoinTask.c;
          c.lock();
          ForkJoinTask$b[] b = ForkJoinTask.b;
          int i = System.identityHashCode(this) & (b.length - 1);
          object oobject1 = null;
          for (object oobject = b[i]; oobject != null; oobject = b1) {
             ForkJoinTask$b b1 = oobject.b;
             if (oobject.get() == this) {
                if (oobject1 == null) {
                   b[i] = b1;
                   break ;
                }else {
                   oobject1.b = b1;
                   break ;
                }
             }
             oobject1 = oobject;
          }
          ForkJoinTask.t();
          this.status = 0;
          c.unlock();
       }else {
          this.status = 0;
       }
       return;
    }
    public final short setForkJoinTaskTag(short p0){
       ForkJoinTask tstatus;
       int i2;
       do {
          tstatus = this.status;
          int i = 0xffff0000 & tstatus;
          int i1 = 0xffff & p0;
          i2 = i | i1;
       } while (ForkJoinTask.d.compareAndSwapInt(this, ForkJoinTask.e, tstatus, i2));
       return (short)tstatus;
    }
    public abstract void setRawResult(Object p0);
    public final boolean trySetSignal(){
       ForkJoinTask tstatus = this.status;
       boolean b = (tstatus >= null && ForkJoinTask.d.compareAndSwapInt(this, ForkJoinTask.e, tstatus, (tstatus | 0x10000)))? true: false;
       return b;
    }
    public boolean tryUnfork(){
       Thread thread = Thread.currentThread();
       boolean b = (thread instanceof a)? thread.c.p(this): ForkJoinPool.H.y(this);
       return b;
    }
    public final int w(){
       ForkJoinPool h = ForkJoinPool.H;
       ForkJoinTask tstatus = this.status;
       if (tstatus >= null) {
          if (h != null) {
             if (this instanceof CountedCompleter) {
                tstatus = h.h(this);
             }else if(h.y(this)){
                tstatus = this.doExec();
             }
          }
          if (tstatus >= 0) {
             tstatus = this.status;
             if (tstatus >= null) {
                Thread thread = null;
                ForkJoinTask uForkJoinTas = tstatus;
                do {
                   int i = uForkJoinTas | 0x10000;
                   if (ForkJoinTask.d.compareAndSwapInt(this, ForkJoinTask.e, uForkJoinTas, i)) {
                      _monitor_enter(this);
                      if (this.status >= null) {
                         try{
                            this.wait();
                         }catch(java.lang.InterruptedException e0){
                            thread = 1;
                         }
                      }else {
                         this.notifyAll();
                      }
                   }
                   uForkJoinTas = this.status;
                } while (uForkJoinTas < null);
                if (thread) {
                   Thread.currentThread().interrupt();
                }
                tstatus = uForkJoinTas;
             }
          }
       }
    label_0056 :
       return tstatus;
    }
    public final int x(){
       ForkJoinPool h = ForkJoinPool.H;
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       if (this.status >= null && h != null) {
          if (this instanceof CountedCompleter) {
             h.h(this);
          }else if(h.y(this)){
             this.doExec();
          }
       }
       ForkJoinTask tstatus = this.status;
       while (tstatus >= null) {
          int i = tstatus | 0x10000;
          if (ForkJoinTask.d.compareAndSwapInt(this, ForkJoinTask.e, tstatus, i)) {
             _monitor_enter(this);
             if (this.status >= null) {
                this.wait();
             }else {
                this.notifyAll();
             }
             _monitor_exit(this);
          }
       }
       return tstatus;
    }
}
