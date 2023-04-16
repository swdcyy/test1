package androidx.work.impl.utils.futures.AbstractFuture;
import xk.d;
import androidx.work.impl.utils.futures.AbstractFuture$h;
import java.lang.String;
import java.lang.System;
import java.lang.Boolean;
import java.lang.Class;
import java.util.logging.Logger;
import androidx.work.impl.utils.futures.AbstractFuture$e;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import androidx.work.impl.utils.futures.AbstractFuture$d;
import java.lang.Object;
import androidx.work.impl.utils.futures.AbstractFuture$g;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.lang.Throwable;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.lang.StringBuilder;
import androidx.work.impl.utils.futures.AbstractFuture$c;
import java.util.concurrent.Future;
import androidx.work.impl.utils.futures.AbstractFuture$Failure;
import java.lang.IllegalArgumentException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.Objects;
import androidx.work.impl.utils.futures.AbstractFuture$f;
import androidx.work.impl.utils.futures.AbstractFuture$b;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import androidx.work.impl.utils.futures.DirectExecutor;
import java.lang.InterruptedException;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

public abstract class AbstractFuture implements d	// class@000a9e
{
    public Object b;
    public AbstractFuture$d c;
    public AbstractFuture$h d;
    public static final boolean e;
    public static final Logger f;
    public static final AbstractFuture$b g;
    public static final Object h;

    static {
       AbstractFuture.e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
       AbstractFuture.f = Logger.getLogger(AbstractFuture.class.getName());
       AbstractFuture$e uoe = new AbstractFuture$e(AtomicReferenceFieldUpdater.newUpdater(AbstractFuture$h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture$h.class, AbstractFuture$h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, AbstractFuture$h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, AbstractFuture$d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
       Throwable throwable = null;
       AbstractFuture.g = v1;
       if (throwable) {
          AbstractFuture.f.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable);
       }
       AbstractFuture.h = new Object();
    }
    public void AbstractFuture(){
       super();
    }
    public static void B(Runnable p0,Executor p1){
       try{
          p1.execute(p0);
       }catch(java.lang.RuntimeException e0){
          AbstractFuture.f.log(Level.SEVERE, "RuntimeException while executing runnable "+p0+" with executor "+p1, e0);
       }
       return;
    }
    public static Object E(d p0){
       if (p0 instanceof AbstractFuture) {
          AbstractFuture b = p0.b;
          if (b instanceof AbstractFuture$c) {
             AbstractFuture uAbstractFut = b;
             if (uAbstractFut.a != null) {
                b = (uAbstractFut.b != null)? new AbstractFuture$c(false, uAbstractFut.b): AbstractFuture$c.d;
             }
          }
          return b;
       }else if((AbstractFuture.e ^ 0x01) & p0.isCancelled()){
          return AbstractFuture$c.d;
       }else {
          try{
             Object obj = AbstractFuture.F(p0);
             if (obj == null) {
                obj = AbstractFuture.h;
             }
             return obj;
          }catch(java.util.concurrent.ExecutionException e5){
             return new AbstractFuture$Failure(e5.getCause());
          }catch(java.util.concurrent.CancellationException e2){
             if (!p0.isCancelled()) {
                return new AbstractFuture$Failure(new IllegalArgumentException("get\(\) threw CancellationException, despite reporting isCancelled\(\) == false: "+p0, e2));
             }else {
                return new AbstractFuture$c(false, e2);
             }
          }
       }
    }
    public static Object F(Future p0){
       Thread thread = null;
       try{
       label_0001 :
          p0 = p0.get();
          if (thread) {
             Thread.currentThread().interrupt();
          }
          return p0;
       }catch(java.lang.InterruptedException e0){
          thread = 1;
          goto label_0001 ;
       }
    }
    public static CancellationException q(String p0,Throwable p1){
       CancellationException uCancellatio = new CancellationException(p0);
       uCancellatio.initCause(p1);
       return uCancellatio;
    }
    public static Object t(Object p0){
       Objects.requireNonNull(p0);
       return p0;
    }
    public static void x(AbstractFuture p0){
       AbstractFuture$d uod = null;
       while (true) {
          p0.H();
          AbstractFuture$d uod1 = p0.w(uod);
          while (uod1 != null) {
             uod = uod1.c;
             AbstractFuture$d a = uod1.a;
             if (a instanceof AbstractFuture$f) {
                AbstractFuture$f b = a.b;
                if (b.b == a && AbstractFuture.g.b(b, a, AbstractFuture.E(a.c))) {
                   continue ;
                }
             }else {
                AbstractFuture.B(a, uod1.b);
             }
             uod1 = uod;
          }
          return;
       }
    }
    public final Object D(Object p0){
       if (p0 instanceof AbstractFuture$c) {
          throw AbstractFuture.q("Task was cancelled.", p0.b);
       }
       if (p0 instanceof AbstractFuture$Failure) {
          throw new ExecutionException(p0.a);
       }
       if (p0 == AbstractFuture.h) {
          p0 = null;
       }
       return p0;
    }
    public String G(){
       AbstractFuture tb = this.b;
       if (tb instanceof AbstractFuture$f) {
          return "setFuture=["+this.M(tb.c)+"]";
       }
       if (this instanceof ScheduledFuture) {
          return "remaining delay=["+this.getDelay(TimeUnit.MILLISECONDS)+" ms]";
       }
       return null;
    }
    public final void H(){
       AbstractFuture td;
       do {
          td = this.d;
       } while (AbstractFuture.g.c(this, td, AbstractFuture$h.c));
       while (td != null) {
          td.b();
          td = td.b;
       }
       return;
    }
    public final void I(AbstractFuture$h p0){
       p0.a = null;
       while (true) {
          AbstractFuture td = this.d;
          if (td == AbstractFuture$h.c) {
          }else {
             Thread thread = null;
             while (true) {
                if (td == null) {
                   return;
                }
                AbstractFuture$h b = td.b;
                if (td.a != null) {
                   thread = td;
                }else if(thread != null){
                   thread.b = b;
                   if (thread.a == null) {
                   }
                }else if(!AbstractFuture.g.c(this, td, b)){
                   continue ;
                }
                td = b;
             }
             return;
          }
       }
    }
    public boolean J(Object p0){
       if (p0 == null) {
          p0 = AbstractFuture.h;
       }
       if (AbstractFuture.g.b(this, null, p0)) {
          AbstractFuture.x(this);
          return true;
       }else {
          return false;
       }
    }
    public boolean K(Throwable p0){
       AbstractFuture.t(p0);
       if (!AbstractFuture.g.b(this, null, new AbstractFuture$Failure(p0))) {
          return false;
       }
       AbstractFuture.x(this);
       return true;
    }
    public boolean L(d p0){
       AbstractFuture.t(p0);
       AbstractFuture tb = this.b;
       boolean b = false;
       if (tb == null) {
          boolean b1 = true;
          Object obj = null;
          if (p0.isDone()) {
             if (AbstractFuture.g.b(this, obj, AbstractFuture.E(p0))) {
                AbstractFuture.x(this);
                return b1;
             }else {
                return b;
             }
          }else {
             AbstractFuture$f uof = new AbstractFuture$f(this, p0);
             if (AbstractFuture.g.b(this, obj, uof)) {
                p0.u(uof, DirectExecutor.INSTANCE);
                return b1;
             }else {
                tb = this.b;
             }
          }
       }
       if (tb instanceof AbstractFuture$c) {
          p0.cancel(tb.a);
       }
       return b;
    }
    public final String M(Object p0){
       if (p0 == this) {
          return "this future";
       }
       return String.valueOf(p0);
    }
    public final boolean cancel(boolean p0){
       AbstractFuture$c uoc;
       AbstractFuture tb = this.b;
       boolean b = true;
       int i = (tb == null)? 1: 0;
       if (i | tb instanceof AbstractFuture$f) {
          if (AbstractFuture.e) {
             uoc = new AbstractFuture$c(p0, new CancellationException("Future.cancel\(\) was called."));
          }else if(p0){
             uoc = AbstractFuture$c.c;
          }else {
             uoc = AbstractFuture$c.d;
          }
          int i1 = 0;
          AbstractFuture uAbstractFut = this;
          while (true) {
             if (AbstractFuture.g.b(uAbstractFut, tb, uoc)) {
                AbstractFuture.x(uAbstractFut);
                if (tb instanceof AbstractFuture$f) {
                   AbstractFuture$f c = tb.c;
                   if (c instanceof AbstractFuture) {
                      uAbstractFut = c;
                      tb = uAbstractFut.b;
                      i1 = (tb == null)? 1: 0;
                      i1 = i1 | tb instanceof AbstractFuture$f;
                      if (i1) {
                         i1 = 1;
                      }
                   }else {
                      c.cancel(p0);
                      break ;
                   }
                }
             }else {
                tb = uAbstractFut.b;
                if (!tb instanceof AbstractFuture$f) {
                   b = i1;
                   break ;
                }
             }
          }
       }else {
          b = false;
       }
       return b;
    }
    public final Object get(){
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       AbstractFuture tb = this.b;
       int i = (tb != null)? 1: 0;
       if (i & (tb instanceof AbstractFuture$f ^ 1)) {
          return this.D(tb);
       }else {
          tb = this.d;
          if (tb != AbstractFuture$h.c) {
             AbstractFuture$h oh = new AbstractFuture$h();
             do {
                oh.a(tb);
                if (AbstractFuture.g.c(this, tb, oh)) {
                label_0030 :
                   LockSupport.park(this);
                   if (!Thread.interrupted()) {
                      tb = this.b;
                      int i1 = (tb != null)? 1: 0;
                      int i2 = tb instanceof AbstractFuture$f ^ 1;
                      i1 = i1 & i2;
                      if (i1) {
                         return this.D(tb);
                      }else {
                         goto label_0030 ;
                      }
                   }else {
                      this.I(oh);
                      throw new InterruptedException();
                   }
                }
                tb = this.d;
             } while (tb == AbstractFuture$h.c);
          }
          return this.D(this.b);
       }
    }
    public final Object get(long p0,TimeUnit p1){
       AbstractFuture b1;
       int i2;
       int i3;
       AbstractFuture uAbstractFut = this;
       long l = p0;
       TimeUnit timeUnit = p1;
       long l1 = timeUnit.toNanos(l);
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       AbstractFuture b = uAbstractFut.b;
       int i = (b != null)? 1: 0;
       int i1 = b instanceof AbstractFuture$f ^ 1;
       i = i & i1;
       if (i) {
          return uAbstractFut.D(b);
       }else {
          i = 0;
          long l2 = (l1 - i > 0)? System.nanoTime() + l1: i;
          if (l1 - 1000 >= 0) {
             b = uAbstractFut.d;
             if (b != AbstractFuture$h.c) {
                AbstractFuture$h oh = new AbstractFuture$h();
                do {
                   oh.a(b);
                   if (AbstractFuture.g.c(uAbstractFut, b, oh)) {
                      while (true) {
                         LockSupport.parkNanos(uAbstractFut, l1);
                         if (!Thread.interrupted()) {
                            b1 = uAbstractFut.b;
                            i2 = (b1 != null)? 1: 0;
                            i3 = b1 instanceof AbstractFuture$f ^ 1;
                            i2 = i2 & i3;
                            if (i2) {
                            }else {
                               l1 = l2 - System.nanoTime();
                               if (l1 - 1000 < 0) {
                                  uAbstractFut.I(oh);
                               }else {
                                  continue ;
                               }
                            }
                         }else {
                            uAbstractFut.I(oh);
                            throw new InterruptedException();
                         }
                      }
                      return uAbstractFut.D(b1);
                   }
                   b = uAbstractFut.d;
                } while (b == AbstractFuture$h.c);
             }
             return uAbstractFut.D(uAbstractFut.b);
          }
          while (true) {
             if (l1 - i > 0) {
                b1 = uAbstractFut.b;
                i2 = (b1 != null)? 1: 0;
                i3 = b1 instanceof AbstractFuture$f ^ 1;
                i2 = i2 & i3;
                if (i2) {
                   break ;
                }else if(!Thread.interrupted()){
                   l1 = l2 - System.nanoTime();
                }else {
                   throw new InterruptedException();
                }
             }else {
                String str = this.toString();
                Locale rOOT = Locale.ROOT;
                String str1 = (p1.toString()).toLowerCase(rOOT);
                String str2 = " ";
                String str3 = "Waited "+l+str2+(p1.toString()).toLowerCase(rOOT);
                if ((l1 + 1000) - i < 0) {
                   str3 = str3+" \(plus ";
                   l1 = - l1;
                   l2 = timeUnit.convert(l1, TimeUnit.NANOSECONDS);
                   l1 = l1 - timeUnit.toNanos(l2);
                   v3 = l2 - i;
                   int i4 = (!timeUnit || l1 - 1000 > 0)? 1: 0;
                   if (timeUnit > 0) {
                      str3 = str3+l2+str2+str1;
                      if (i4) {
                         str3 = str3+",";
                      }
                      str3 = str3+str2;
                   }
                   if (i4) {
                      str3 = str3+l1+" nanoseconds ";
                   }
                   str3 = str3+"delay\)";
                }
                if (this.isDone()) {
                   throw new TimeoutException(str3+" but future completed as timeout expired");
                }else {
                   throw new TimeoutException(str3+" for "+str);
                }
             }
          }
          return uAbstractFut.D(b1);
       }
    }
    public final boolean isCancelled(){
       return this.b instanceof AbstractFuture$c;
    }
    public final boolean isDone(){
       AbstractFuture tb = this.b;
       int i = (tb != null)? 1: 0;
       return ((tb instanceof AbstractFuture$f ^ 1) & i);
    }
    public final void m(StringBuilder p0){
       String str = "]";
       try{
          p0+"SUCCESS, result=["+this.M(AbstractFuture.F(this))+str;
       }catch(java.util.concurrent.ExecutionException e1){
          p0+"SUCCESS, result=["+this.M(AbstractFuture.F(this))+"FAILURE, cause=["+e1.getCause()+str;
       }catch(java.util.concurrent.CancellationException e0){
          p0+"SUCCESS, result=["+this.M(AbstractFuture.F(this))+"CANCELLED";
       }catch(java.lang.RuntimeException e0){
          p0+"SUCCESS, result=["+this.M(AbstractFuture.F(this))+"UNKNOWN, cause=["+e0.getClass()+" thrown from get\(\)]";
       }
       return;
    }
    public String toString(){
       String str1;
       StringBuilder str = super.toString()+"[status=";
       if (this.isCancelled()) {
          str = str+"CANCELLED";
       }else if(this.isDone()){
          try{
             str1 = this.G();
          }catch(java.lang.RuntimeException e1){
             str1 = "Exception thrown from implementation: "+e1.getClass();
          }
          if (str1 != null && !str1.isEmpty()) {
             str = str+"PENDING, info=["+str1+"]";
          }else if(this.isDone()){
             this.m(str);
          }else {
             str = str+"PENDING";
          }
       }
       return str+"]";
    }
    public final void u(Runnable p0,Executor p1){
       AbstractFuture.t(p0);
       AbstractFuture.t(p1);
       AbstractFuture tc = this.c;
       if (tc != AbstractFuture$d.d) {
          AbstractFuture$d uod = new AbstractFuture$d(p0, p1);
          while (true) {
             uod.c = tc;
             if (AbstractFuture.g.a(this, tc, uod)) {
                return;
             }
             tc = this.c;
             if (tc != AbstractFuture$d.d) {
             }
          }
       }
       AbstractFuture.B(p0, p1);
       return;
    }
    public final AbstractFuture$d w(AbstractFuture$d p0){
       AbstractFuture tc;
       do {
          tc = this.c;
       } while (AbstractFuture.g.a(this, tc, AbstractFuture$d.d));
       AbstractFuture$d uod = p0;
       for (AbstractFuture uAbstractFut = tc; uAbstractFut != null; uAbstractFut = c) {
          AbstractFuture$d c = uAbstractFut.c;
          uAbstractFut.c = uod;
          uod = uAbstractFut;
       }
       return uod;
    }
}
