package com.google.common.util.concurrent.AbstractFuture;
import xk.a;
import com.google.common.util.concurrent.AbstractFuture$j;
import java.lang.String;
import java.lang.System;
import java.lang.Boolean;
import java.lang.Class;
import java.util.logging.Logger;
import com.google.common.util.concurrent.AbstractFuture$i;
import com.google.common.util.concurrent.AbstractFuture$a;
import com.google.common.util.concurrent.AbstractFuture$e;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import com.google.common.util.concurrent.AbstractFuture$d;
import java.lang.Object;
import com.google.common.util.concurrent.AbstractFuture$g;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.lang.Throwable;
import xk.d;
import com.google.common.util.concurrent.AbstractFuture$h;
import com.google.common.util.concurrent.AbstractFuture$c;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.d;
import com.google.common.util.concurrent.AbstractFuture$Failure;
import java.util.concurrent.ExecutionException;
import java.lang.StringBuilder;
import com.google.common.util.concurrent.AbstractFuture$b;
import com.google.common.util.concurrent.AbstractFuture$f;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ok.n;
import java.lang.InterruptedException;
import java.util.concurrent.TimeoutException;
import ok.a;
import ok.w;

public abstract class AbstractFuture extends a	// class@00192d
{
    public Object b;
    public AbstractFuture$d c;
    public AbstractFuture$j d;
    public static final boolean e;
    public static final Logger f;
    public static final AbstractFuture$b g;
    public static final Object h;

    static {
       AbstractFuture.e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
       AbstractFuture.f = Logger.getLogger(AbstractFuture.class.getName());
       AbstractFuture$i oi = new AbstractFuture$i(null);
       AbstractFuture$a uoa = null;
       AbstractFuture.g = oi;
       if (null != null) {
          Logger f = AbstractFuture.f;
          Level sEVERE = Level.SEVERE;
          f.log(sEVERE, "UnsafeAtomicHelper is broken!", uoa);
          f.log(sEVERE, "SafeAtomicHelper is broken!", null);
       }
       AbstractFuture.h = new Object();
    }
    public void AbstractFuture(){
       super();
    }
    public static Object B(d p0){
       AbstractFuture$Failure uFailure;
       AbstractFuture$c uoc;
       if (p0 instanceof AbstractFuture$h) {
          AbstractFuture b = p0.b;
          if (b instanceof AbstractFuture$c) {
             AbstractFuture uAbstractFut = b;
             if (uAbstractFut.a != null) {
                b = (uAbstractFut.b != null)? new AbstractFuture$c(false, uAbstractFut.b): AbstractFuture$c.d;
             }
          }
          return b;
       }else {
          try{
             p0 = d.a(p0);
             if (p0 == null) {
                uoc = AbstractFuture.h;
             }
             return uoc;
          }catch(java.util.concurrent.ExecutionException e3){
             uFailure = new AbstractFuture$Failure(e3.getCause());
          }catch(java.util.concurrent.CancellationException e3){
             uFailure = new AbstractFuture$c(false, e3);
          }
          uoc = uFailure;
          goto label_0045 ;
       }
    }
    private String H(Object p0){
       if (p0 == this) {
          return "this future";
       }
       return String.valueOf(p0);
    }
    private void m(StringBuilder p0){
       String str = "]";
       try{
          p0+"SUCCESS, result=["+this.H(d.a(this))+str;
       }catch(java.util.concurrent.ExecutionException e1){
          p0+"SUCCESS, result=["+this.H(d.a(this))+"FAILURE, cause=["+e1.getCause()+str;
       }catch(java.util.concurrent.CancellationException e0){
          p0+"SUCCESS, result=["+this.H(d.a(this))+"CANCELLED";
       }catch(java.lang.RuntimeException e0){
          p0+"SUCCESS, result=["+this.H(d.a(this))+"UNKNOWN, cause=["+e0.getClass()+" thrown from get\(\)]";
       }
       return;
    }
    public static void t(AbstractFuture p0){
       AbstractFuture$d c;
       int i = 0;
       while (true) {
          AbstractFuture d = p0.d;
          if (AbstractFuture.g.c(p0, d, AbstractFuture$j.c)) {
             while (d != null) {
                AbstractFuture$j a = d.a;
                if (a != null) {
                   d.a = null;
                   LockSupport.unpark(a);
                }
                d = d.b;
             }
             p0.q();
             do {
                d = p0.c;
             } while (AbstractFuture.g.a(p0, d, AbstractFuture$d.d));
             AbstractFuture$d uod = i;
             AbstractFuture uAbstractFut = d;
             while (uAbstractFut != null) {
                c = uAbstractFut.c;
                uAbstractFut.c = uod;
             }
             while (uod != null) {
                i = uod.c;
                c = uod.a;
                if (c instanceof AbstractFuture$f) {
                   AbstractFuture$f b = c.b;
                   if (b.b == c && AbstractFuture.g.b(b, c, AbstractFuture.B(c.c))) {
                      continue ;
                   }
                }else {
                   AbstractFuture.w(c, uod.b);
                }
                uod = i;
             }
             return;
          }
       }
    }
    public static void w(Runnable p0,Executor p1){
       try{
          p1.execute(p0);
       }catch(java.lang.RuntimeException e0){
          AbstractFuture.f.log(Level.SEVERE, "RuntimeException while executing runnable "+p0+" with executor "+p1, e0);
       }
       return;
    }
    private Object x(Object p0){
       if (!p0 instanceof AbstractFuture$c) {
          if (p0 instanceof AbstractFuture$Failure) {
             throw new ExecutionException(p0.a);
          }
          if (p0 == AbstractFuture.h) {
             p0 = null;
          }
          return p0;
       }else {
          CancellationException uCancellatio = new CancellationException("Task was cancelled.");
          uCancellatio.initCause(p0.b);
          throw uCancellatio;
       }
    }
    public String D(){
       AbstractFuture tb = this.b;
       if (tb instanceof AbstractFuture$f) {
          return "setFuture=["+this.H(tb.c)+"]";
       }
       if (this instanceof ScheduledFuture) {
          return "remaining delay=["+this.getDelay(TimeUnit.MILLISECONDS)+" ms]";
       }
       return null;
    }
    public final void E(AbstractFuture$j p0){
       p0.a = null;
       while (true) {
          AbstractFuture td = this.d;
          if (td == AbstractFuture$j.c) {
          }else {
             Thread thread = null;
             while (true) {
                if (td == null) {
                   return;
                }
                AbstractFuture$j b = td.b;
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
    public boolean F(Object p0){
       if (p0 == null) {
          p0 = AbstractFuture.h;
       }
       if (AbstractFuture.g.b(this, null, p0)) {
          AbstractFuture.t(this);
          return true;
       }else {
          return false;
       }
    }
    public boolean G(Throwable p0){
       n.j(p0);
       if (!AbstractFuture.g.b(this, null, new AbstractFuture$Failure(p0))) {
          return false;
       }
       AbstractFuture.t(this);
       return true;
    }
    public boolean cancel(boolean p0){
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
                AbstractFuture.t(uAbstractFut);
                if (tb instanceof AbstractFuture$f) {
                   AbstractFuture$f c = tb.c;
                   if (c instanceof AbstractFuture$h) {
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
    public Object get(){
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       AbstractFuture tb = this.b;
       int i = (tb != null)? 1: 0;
       if (i & (tb instanceof AbstractFuture$f ^ 1)) {
          return this.x(tb);
       }else {
          tb = this.d;
          if (tb != AbstractFuture$j.c) {
             AbstractFuture$j oj = new AbstractFuture$j();
             do {
                oj.a(tb);
                if (AbstractFuture.g.c(this, tb, oj)) {
                label_0030 :
                   LockSupport.park(this);
                   if (!Thread.interrupted()) {
                      tb = this.b;
                      int i1 = (tb != null)? 1: 0;
                      int i2 = tb instanceof AbstractFuture$f ^ 1;
                      i1 = i1 & i2;
                      if (i1) {
                         return this.x(tb);
                      }else {
                         goto label_0030 ;
                      }
                   }else {
                      this.E(oj);
                      throw new InterruptedException();
                   }
                }
                tb = this.d;
             } while (tb == AbstractFuture$j.c);
          }
          return this.x(this.b);
       }
    }
    public Object get(long p0,TimeUnit p1){
       long l2;
       AbstractFuture b1;
       int i3;
       int i4;
       AbstractFuture uAbstractFut = this;
       long l = p0;
       long l1 = p1.toNanos(l);
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       AbstractFuture b = uAbstractFut.b;
       int i = 1;
       int i1 = (b != null)? 1: 0;
       int i2 = b instanceof AbstractFuture$f ^ i;
       i1 = i1 & i2;
       if (i1) {
          return uAbstractFut.x(b);
       }else if(l1 > 0){
          l2 = System.nanoTime() + l1;
       }else {
          l2 = 0;
       }
       if (l1 - 1000 >= 0) {
          b = uAbstractFut.d;
          if (b != AbstractFuture$j.c) {
             AbstractFuture$j oj = new AbstractFuture$j();
             do {
                oj.a(b);
                if (AbstractFuture.g.c(uAbstractFut, b, oj)) {
                   while (true) {
                      LockSupport.parkNanos(uAbstractFut, l1);
                      if (!Thread.interrupted()) {
                         b1 = uAbstractFut.b;
                         i3 = (b1 != null)? 1: 0;
                         i4 = b1 instanceof AbstractFuture$f ^ i;
                         i3 = i3 & i4;
                         if (i3) {
                         }else {
                            l1 = l2 - System.nanoTime();
                            if (l1 - 1000 < 0) {
                               uAbstractFut.E(oj);
                            }else {
                               continue ;
                            }
                         }
                      }else {
                         uAbstractFut.E(oj);
                         throw new InterruptedException();
                      }
                   }
                   return uAbstractFut.x(b1);
                }
                b = uAbstractFut.d;
             } while (b == AbstractFuture$j.c);
          }
          return uAbstractFut.x(uAbstractFut.b);
       }
       while (true) {
          if (l1 > 0) {
             b1 = uAbstractFut.b;
             i3 = (b1 != null)? 1: 0;
             i4 = b1 instanceof AbstractFuture$f ^ i;
             i3 = i3 & i4;
             if (i3) {
                break ;
             }else if(!Thread.interrupted()){
                l1 = l2 - System.nanoTime();
             }else {
                throw new InterruptedException();
             }
          }else {
             String str = this.toString();
             if (this.isDone()) {
                throw new TimeoutException("Waited "+l+" "+a.c(p1.toString())+" but future completed as timeout expired");
             }else {
                throw new TimeoutException("Waited "+l+" "+a.c(p1.toString())+" for "+str);
             }
          }
       }
       return uAbstractFut.x(b1);
    }
    public boolean isCancelled(){
       return this.b instanceof AbstractFuture$c;
    }
    public boolean isDone(){
       AbstractFuture tb = this.b;
       int i = (tb != null)? 1: 0;
       return ((tb instanceof AbstractFuture$f ^ 1) & i);
    }
    public void q(){
    }
    public String toString(){
       String str1;
       StringBuilder str = super.toString()+"[status=";
       if (this.isCancelled()) {
          str = str+"CANCELLED";
       }else if(this.isDone()){
          try{
             str1 = this.D();
          }catch(java.lang.RuntimeException e1){
             str1 = "Exception thrown from implementation: "+e1.getClass();
          }
          if (!w.a(str1)) {
             str = str+"PENDING, info=["+str1+"]";
          }else if(this.isDone()){
             this.m(str);
          }else {
             str = str+"PENDING";
          }
       }
       return str+"]";
    }
    public void u(Runnable p0,Executor p1){
       n.k(p0, "Runnable was null.");
       n.k(p1, "Executor was null.");
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
       AbstractFuture.w(p0, p1);
       return;
    }
}
