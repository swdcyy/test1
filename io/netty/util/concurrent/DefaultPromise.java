package io.netty.util.concurrent.DefaultPromise;
import io.netty.util.concurrent.l;
import io.netty.util.concurrent.b;
import java.lang.Class;
import ard.b;
import ard.c;
import java.lang.StringBuilder;
import java.lang.String;
import io.netty.util.Signal;
import io.netty.util.concurrent.DefaultPromise$f;
import java.util.concurrent.CancellationException;
import java.lang.Throwable;
import zqd.b;
import java.lang.StackTraceElement;
import yqd.e;
import java.lang.Object;
import java.util.Objects;
import io.netty.util.concurrent.f;
import io.netty.util.concurrent.g;
import yqd.c;
import io.netty.util.concurrent.j;
import io.netty.util.concurrent.h;
import java.lang.Runnable;
import java.util.concurrent.ScheduledExecutorService;
import zqd.d;
import io.netty.util.concurrent.DefaultPromise$c;
import io.netty.util.concurrent.DefaultPromise$a;
import io.netty.util.concurrent.DefaultPromise$b;
import io.netty.util.concurrent.DefaultPromise$d;
import io.netty.util.concurrent.DefaultPromise$e;
import io.netty.util.internal.PlatformDependent;
import zqd.w;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import java.lang.InterruptedException;
import java.util.Arrays;
import java.lang.System;
import java.lang.InternalError;
import io.netty.util.concurrent.BlockingOperationException;
import java.util.ArrayDeque;
import io.netty.util.concurrent.DefaultPromise$LateListeners;
import io.netty.util.concurrent.DefaultPromise$g;

public class DefaultPromise extends b implements l	// class@001100
{
    public final e b;
    public Object c;
    public Object d;
    public DefaultPromise$LateListeners e;
    public short f;
    public static final b g;
    public static final b h;
    public static final Signal i;
    public static final Signal j;
    public static final DefaultPromise$f k;

    static {
       DefaultPromise.g = c.a(DefaultPromise.class);
       DefaultPromise.h = c.b(DefaultPromise.class.getName()+".rejectedExecution");
       DefaultPromise.i = Signal.valueOf(DefaultPromise.class, "SUCCESS");
       DefaultPromise.j = Signal.valueOf(DefaultPromise.class, "UNCANCELLABLE");
       DefaultPromise$f uof = new DefaultPromise$f(new CancellationException());
       DefaultPromise.k = uof;
       uof.a.setStackTrace(b.l);
    }
    public void DefaultPromise(){
       super();
       this.b = null;
    }
    public void DefaultPromise(e p0){
       super();
       Objects.requireNonNull(p0, "executor");
       this.b = p0;
    }
    public static void A0(f p0,g p1){
       p1.a(p0);
       return;
    }
    public static void E0(f p0,c p1){
       g[] ogArray = p1.a();
       p1 = p1.b;
       for (int i = 0; i < p1; i = i + 1) {
          DefaultPromise.A0(p0, ogArray[i]);
       }
       return;
    }
    public static void F0(j p0,h p1,long p2,long p3){
       p1.b(p0, p2, p3);
       return;
    }
    public static void H0(j p0,h[] p1,long p2,long p3){
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          if (oobject == null) {
             break ;
          }else {
             DefaultPromise.F0(p0, oobject, p2, p3);
          }
       }
       return;
    }
    public static void r0(e p0,Runnable p1){
       p0.execute(p1);
       return;
    }
    public static boolean v0(Object p0){
       boolean b = (p0 instanceof DefaultPromise$f && p0.a instanceof CancellationException)? true: false;
       return b;
    }
    public static boolean w0(Object p0){
       boolean b = (p0 != null && p0 != DefaultPromise.j)? true: false;
       return b;
    }
    public static void y0(e p0,f p1,g p2){
       if (p0.q0()) {
          d uod = d.b();
          int i = uod.a();
          if (i < 8) {
             uod.g((i + 1));
             DefaultPromise.A0(p1, p2);
             uod.g(i);
             return;
          }
       }
       DefaultPromise.r0(p0, new DefaultPromise$c(p1, p2));
       return;
    }
    public Object A(){
       DefaultPromise tc = this.c;
       if (tc instanceof DefaultPromise$f || tc == DefaultPromise.i) {
          return null;
       }
       return tc;
    }
    public final void B0(){
       DefaultPromise td = this.d;
       if (td == null) {
          return;
       }
       e uoe = this.s0();
       if (uoe.q0()) {
          d uod = d.b();
          int i = uod.a();
          if (i < 8) {
             uod.g((i + 1));
             if (td instanceof c) {
                DefaultPromise.E0(this, td);
             }else {
                DefaultPromise.A0(this, td);
             }
             this.d = null;
             uod.g(i);
             return;
          }
       }
       if (td instanceof c) {
          DefaultPromise.r0(uoe, new DefaultPromise$a(this, td));
       }else {
          DefaultPromise.r0(uoe, new DefaultPromise$b(this, td));
       }
       return;
    }
    public void G0(long p0,long p1){
       c c;
       g[] ogArray;
       _monitor_enter(this);
       DefaultPromise td = this.d;
       boolean b = false;
       if (td == null) {
          _monitor_exit(this);
       }else if(td instanceof c){
          c = td.c;
          if (c != null) {
             int i = 0;
             if (c != 1) {
                ogArray = td.a();
                b = new h[c];
                int i1 = 0;
                while (i < c) {
                   object oobject = ogArray[i1];
                   if (oobject instanceof h) {
                      int i2 = i + 1;
                      b[i] = oobject;
                      i = i2;
                   }
                   i1 = i1 + 1;
                }
                _monitor_exit(this);
             }else {
                ogArray = td.a();
                int len = ogArray.length;
                while (true) {
                   if (i < len) {
                      object oobject1 = ogArray[i];
                      if (oobject1 instanceof h) {
                         _monitor_exit(this);
                         td = oobject1;
                      label_0050 :
                         if (td == null) {
                            return;
                         }else {
                            j oj = this;
                            e uoe = this.s0();
                            if (uoe.q0()) {
                               if (td instanceof h[]) {
                                  DefaultPromise.H0(oj, td, p0, p1);
                                  break ;
                               }else {
                                  DefaultPromise.F0(oj, td, p0, p1);
                                  break ;
                               }
                            }else if(td instanceof h[]){
                               DefaultPromise$d uod = new DefaultPromise$d(this, oj, td, p0, p1);
                               DefaultPromise.r0(uoe, td);
                               break ;
                            }else {
                               DefaultPromise$e uoe1 = new DefaultPromise$e(this, oj, td, p0, p1);
                               DefaultPromise.r0(uoe, td);
                               break ;
                            }
                         }
                      }else {
                         i = i + 1;
                      }
                   }else {
                      _monitor_exit(this);
                   }
                }
                return;
             }
          }else {
             _monitor_exit(this);
          }
       }else if(td instanceof h){
          _monitor_exit(this);
          goto label_0050 ;
       }else {
          _monitor_exit(this);
       }
       td = b;
       goto label_0050 ;
    }
    public final void J0(){
       Throwable throwable = this.z();
       if (throwable == null) {
          return;
       }
       PlatformDependent.H(throwable);
       return;
    }
    public final boolean K0(Throwable p0){
       Objects.requireNonNull(p0, "cause");
       if (this.isDone()) {
          return false;
       }
       _monitor_enter(this);
       if (this.isDone()) {
          _monitor_exit(this);
          return false;
       }else {
          this.c = new DefaultPromise$f(p0);
          if (this.t0()) {
             this.notifyAll();
          }
          _monitor_exit(this);
          return true;
       }
    }
    public final boolean L0(Object p0){
       if (this.isDone()) {
          return false;
       }
       _monitor_enter(this);
       if (this.isDone()) {
          _monitor_exit(this);
          return false;
       }else if(p0 == null){
          this.c = DefaultPromise.i;
       }else {
          this.c = p0;
       }
       if (this.t0()) {
          this.notifyAll();
       }
       _monitor_exit(this);
       return true;
    }
    public StringBuilder M0(){
       StringBuilder str = new StringBuilder(64)+w.b(this)+64+Integer.toHexString(this.hashCode());
       DefaultPromise tc = this.c;
       if (tc == DefaultPromise.i) {
          str = str+"\(success\)";
       }else if(tc == DefaultPromise.j){
          str = str+"\(uncancellable\)";
       }else if(tc instanceof DefaultPromise$f){
          str = str+"\(failure: "+tc.a+')';
       }else if(tc != null){
          str = str+"\(success: "+tc+')';
       }else {
          str = str+"\(incomplete\)";
       }
       return str;
    }
    public l a(Throwable p0){
       if (!this.K0(p0)) {
          throw new IllegalStateException("complete already: "+this, p0);
       }
       this.B0();
       return this;
    }
    public boolean await(long p0,TimeUnit p1){
       return this.o0(p1.toNanos(p0), true);
    }
    public f c(){
       return this.c();
    }
    public l c(){
       if (this.isDone()) {
          return this;
       }
       if (Thread.interrupted()) {
          throw new InterruptedException(this.toString());
       }
       _monitor_enter(this);
       while (!this.isDone()) {
          this.p0();
          this.u0();
          this.wait();
          this.q0();
       }
       _monitor_exit(this);
       return this;
    }
    public boolean cancel(boolean p0){
       DefaultPromise tc = this.c;
       if (!DefaultPromise.w0(tc)) {
          Signal j = DefaultPromise.j;
          if (tc != j) {
             _monitor_enter(this);
             tc = this.c;
             if (DefaultPromise.w0(tc) || tc == j) {
                _monitor_exit(this);
                return false;
             }else {
                this.c = DefaultPromise.k;
                if (this.t0()) {
                   this.notifyAll();
                }
                _monitor_exit(this);
                this.B0();
                return true;
             }
          }
       }
       return false;
    }
    public f e(){
       return this.e();
    }
    public l e(){
       this.c();
       this.J0();
       return this;
    }
    public f f(g p0){
       return this.f(p0);
    }
    public l f(g p0){
       Objects.requireNonNull(p0, "listener");
       if (this.isDone()) {
          this.x0(p0);
          return this;
       }else {
          _monitor_enter(this);
          if (!this.isDone()) {
             DefaultPromise td = this.d;
             if (td == null) {
                this.d = p0;
             }else if(td instanceof c){
                c a = td.a;
                c b = td.b;
                if (b == a.length) {
                   a = Arrays.copyOf(a, (b << 1));
                   td.a = a;
                }
                a[b] = p0;
                td.b = b + 1;
                if (p0 instanceof h) {
                   td.c = td.c + 1;
                }
             }else {
                this.d = new c(td, p0);
             }
             _monitor_exit(this);
             return this;
          }else {
             _monitor_exit(this);
             this.x0(p0);
             return this;
          }
       }
    }
    public f g(g[] p0){
       return this.g(p0);
    }
    public l g(g[] p0){
       Objects.requireNonNull(p0, "listeners");
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          if (oobject == null) {
             break ;
          }else {
             this.f(oobject);
          }
       }
       return this;
    }
    public f h(g[] p0){
       return this.h(p0);
    }
    public l h(g[] p0){
       Objects.requireNonNull(p0, "listeners");
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          if (oobject == null) {
             break ;
          }else {
             this.i(oobject);
          }
       }
       return this;
    }
    public boolean h0(Object p0){
       if (!this.L0(p0)) {
          return false;
       }
       this.B0();
       return true;
    }
    public f i(g p0){
       return this.i(p0);
    }
    public l i(g p0){
       Objects.requireNonNull(p0, "listener");
       if (this.isDone()) {
          return this;
       }
       _monitor_enter(this);
       if (!this.isDone()) {
          DefaultPromise td = this.d;
          if (td instanceof c) {
             c a = td.a;
             c b = td.b;
             int i = 0;
             while (i < b) {
                if (a[i] == p0) {
                   int i1 = (b - i) - 1;
                   if (i1 > 0) {
                      System.arraycopy(a, (i + 1), a, i, i1);
                   }
                   int i2 = b - 1;
                   a[i2] = null;
                   td.b = i2;
                   if (p0 instanceof h) {
                      td.c = td.c - 1;
                      break ;
                   }
                }
                i = i + 1;
             }
          }else if(td == p0){
             this.d = null;
          }
       }
       _monitor_exit(this);
       return this;
    }
    public boolean isCancelled(){
       return DefaultPromise.v0(this.c);
    }
    public boolean isDone(){
       return DefaultPromise.w0(this.c);
    }
    public boolean isSuccess(){
       DefaultPromise tc = this.c;
       if (tc == null || tc == DefaultPromise.j) {
          return false;
       }
       return (tc instanceof DefaultPromise$f ^ 0x01);
    }
    public f j(){
       return this.j();
    }
    public l j(){
       if (this.isDone()) {
          return this;
       }
       Thread thread = null;
       _monitor_enter(this);
       while (!this.isDone()) {
          this.p0();
          try{
             this.u0();
             this.wait();
          }catch(java.lang.InterruptedException e0){
             thread = 1;
          }
          this.q0();
       }
       _monitor_exit(this);
       if (thread) {
          Thread.currentThread().interrupt();
       }
       return this;
    }
    public boolean j0(long p0){
       try{
          return this.o0(TimeUnit.MILLISECONDS.toNanos(p0), false);
       }catch(java.lang.InterruptedException e0){
          throw new InternalError();
       }
    }
    public f k(){
       return this.k();
    }
    public l k(){
       this.j();
       this.J0();
       return this;
    }
    public boolean k0(){
       DefaultPromise tc = this.c;
       int i = 1;
       if (DefaultPromise.w0(tc)) {
          return (DefaultPromise.v0(tc) ^ i);
       }
       _monitor_enter(this);
       tc = this.c;
       if (DefaultPromise.w0(tc)) {
          if (DefaultPromise.v0(tc)) {
             i = false;
          }
          _monitor_exit(this);
          return i;
       }else {
          this.c = DefaultPromise.j;
          _monitor_exit(this);
          return i;
       }
    }
    public boolean l0(long p0,TimeUnit p1){
       try{
          return this.o0(p1.toNanos(p0), false);
       }catch(java.lang.InterruptedException e0){
          throw new InternalError();
       }
    }
    public boolean n0(long p0){
       return this.o0(TimeUnit.MILLISECONDS.toNanos(p0), true);
    }
    public final boolean o0(long p0,boolean p1){
       boolean b1;
       boolean b = true;
       if (this.isDone()) {
          return b;
       }
       if ((v0 = p0) <= 0) {
          return this.isDone();
       }
       if (p1 && Thread.interrupted()) {
          throw new InterruptedException(this.toString());
       }
       long l = System.nanoTime();
       _monitor_enter(this);
       if (this.isDone()) {
          _monitor_exit(this);
          return b;
       }else if(v0 <= 0){
          _monitor_exit(this);
          return this.isDone();
       }else {
          this.p0();
          this.u0();
          long l1 = p0;
          while (true) {
             long l2 = 0xf4240;
             try{
                long l3 = l1 / l2;
                l1 = l1 % l2;
                this.wait(l3, (int)l1);
             }catch(java.lang.InterruptedException e0){
                if (p1) {
                   throw e0;
                }
                int i = 1;
             }
             if (this.isDone()) {
                this.q0();
                _monitor_exit(this);
                if (i) {
                   Thread.currentThread().interrupt();
                }
                return b;
             }else {
                l1 = System.nanoTime() - l;
                l1 = p0 - l1;
                if (l1 <= 0) {
                   b1 = this.isDone();
                   this.q0();
                   _monitor_exit(this);
                   if (i) {
                      Thread.currentThread().interrupt();
                      break ;
                   }
                   break ;
                }
             }
          }
          return b1;
       }
    }
    public l p(Object p0){
       if (!this.L0(p0)) {
          throw new IllegalStateException("complete already: "+this);
       }
       this.B0();
       return this;
    }
    public void p0(){
       e uoe = this.s0();
       if (uoe == null || !uoe.q0()) {
          return;
       }
       throw new BlockingOperationException(this.toString());
    }
    public final void q0(){
       this.f = (short)(this.f - 1);
    }
    public boolean s(){
       boolean b = (this.c == null)? true: false;
       return b;
    }
    public e s0(){
       return this.b;
    }
    public final boolean t0(){
       boolean b = (this.f > null)? true: false;
       return b;
    }
    public String toString(){
       return this.M0();
    }
    public final void u0(){
       DefaultPromise tf = this.f;
       if (tf == 0x7fff) {
          throw new IllegalStateException("too many waiters: "+this);
       }
       this.f = (short)(tf + 1);
       return;
    }
    public final void x0(g p0){
       DefaultPromise te;
       DefaultPromise$LateListeners lateListener;
       e uoe = this.s0();
       if (uoe.q0()) {
          if (this.d == null) {
             te = this.e;
             if (te == null || te.isEmpty()) {
                d uod = d.b();
                int i = uod.a();
                if (i < 8) {
                   uod.g((i + 1));
                   DefaultPromise.A0(this, p0);
                   uod.g(i);
                   return;
                }
             }
          }
          te = this.e;
          if (te == null) {
             lateListener = new DefaultPromise$LateListeners(this);
             this.e = lateListener;
          }
          lateListener.add(p0);
          DefaultPromise.r0(uoe, lateListener);
          return;
       }
       DefaultPromise.r0(uoe, new DefaultPromise$g(this, p0));
       return;
    }
    public boolean y(Throwable p0){
       if (!this.K0(p0)) {
          return false;
       }
       this.B0();
       return true;
    }
    public Throwable z(){
       DefaultPromise tc = this.c;
       if (tc instanceof DefaultPromise$f) {
          return tc.a;
       }
       return null;
    }
}
