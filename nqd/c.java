package nqd.c;
import io.netty.channel.f0;
import java.lang.Class;
import ard.b;
import ard.c;
import java.lang.String;
import zqd.x;
import java.lang.System;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import nqd.d;
import java.util.concurrent.Executor;
import java.nio.channels.spi.SelectorProvider;
import lqd.n;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Objects;
import java.nio.channels.Selector;
import nqd.e;
import java.nio.channels.SelectionKey;
import java.lang.Throwable;
import java.nio.channels.SelectableChannel;
import nqd.b;
import nqd.b$b;
import io.netty.channel.r;
import io.netty.channel.d$a;
import java.util.Queue;
import io.netty.util.internal.PlatformDependent;
import java.lang.Runnable;
import io.netty.util.concurrent.m;
import java.lang.Thread;
import yqd.n;
import yqd.b;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import java.lang.StringBuilder;
import java.nio.channels.CancelledKeyException;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.nio.channels.spi.AbstractSelector;
import nqd.f;
import java.lang.ClassLoader;
import java.lang.reflect.Field;
import io.netty.channel.ChannelException;
import yqd.a;
import nqd.c$a;

public final class c extends f0	// class@001eb2
{
    public Selector B;
    public f C;
    public final SelectorProvider D;
    public final AtomicBoolean E;
    public int F;
    public int G;
    public boolean H;
    public static final b I;
    public static final boolean J;
    public static final int K;

    static {
       String str;
       c.I = c.a(c.class);
       boolean b = false;
       c.J = x.c("io.netty.noKeySetOptimization", b);
       try{
          str = "sun.nio.ch.bugLevel";
          if (x.a(str) == null) {
             System.setProperty(str, "");
          }
       }catch(java.lang.SecurityException e2){
          b i = c.I;
          if (i.isDebugEnabled()) {
             i.debug("Unable to get/set System Property: {}", str, e2);
          }
       }
       int i1 = x.d("io.netty.selectorAutoRebuildThreshold", 512);
       if (i1 >= 3) {
          b = i1;
       }
       c.K = b;
       b i2 = c.I;
       if (i2.isDebugEnabled()) {
          i2.debug("-Dio.netty.noKeySetOptimization: {}", Boolean.valueOf(c.J));
          i2.debug("-Dio.netty.selectorAutoRebuildThreshold: {}", Integer.valueOf(b));
       }
    }
    public void c(d p0,Executor p1,SelectorProvider p2){
       super(p0, p1, false);
       this.E = new AtomicBoolean();
       this.F = 50;
       Objects.requireNonNull(p2, "selectorProvider");
       this.D = p2;
       this.B = this.m0();
    }
    public static void g0(e p0,SelectionKey p1,Throwable p2){
       try{
          p0.b(p1.channel(), p2);
       }catch(java.lang.Exception e0){
          c.I.warn("Unexpected exception while running NioTask.channelUnregistered\(\)", e0);
       }
       return;
    }
    public static void r0(SelectionKey p0,b p1){
       b$b uob = p1.s0();
       if (!p0.isValid()) {
          uob.M(uob.a0());
          return;
       }else {
          try{
             int i = p0.readyOps();
             if ((i & 0x11) || !i) {
                uob.read();
                if (!p1.isOpen()) {
                   return;
                }else if(i & 0x04){
                   p1.s0().a();
                }
                if (i & 0x08) {
                   p0.interestOps((p0.interestOps() & 0xf7));
                   uob.c();
                }
             }else {
                goto label_0026 ;
             }
          }catch(java.nio.channels.CancelledKeyException e0){
             e0.M(e0.a0());
          }
          return;
       }
    }
    public static void s0(SelectionKey p0,e p1){
       Throwable throwable = null;
       try{
          p1.a(p0.channel(), p0);
          if (!p0.isValid()) {
             c.g0(p1, p0, throwable);
          }
       }catch(java.lang.Exception e1){
          p0.cancel();
          c.g0(p1, p0, e1);
       }
       return;
    }
    public Queue E(){
       return PlatformDependent.y();
    }
    public Runnable F(){
       Runnable runnable = super.F();
       if (this.H != null) {
          this.R0();
       }
       return runnable;
    }
    public void H(){
       do {
          int b = false;
          boolean andSet = this.E.getAndSet(b);
          if (this.D()) {
             this.T0();
          }else {
             this.L0(andSet);
             if (this.E.get()) {
                this.B.wakeup();
             }
          }
          this.G = b;
          this.H = b;
          c tF = this.F;
          if (tF == 100) {
             this.w0();
             this.N();
          }else {
             this.w0();
             long l = System.nanoTime() - System.nanoTime();
             b = tF - 100;
             l = l * (long)b;
             l = l / (long)tF;
             this.a0(l);
          }
          if (this.Q2()) {
          }
          this.e0();
       } while (this.v());
       return;
    }
    public final void L0(boolean p0){
       long y;
       b i2;
       c tB = this.B;
       int i = 0;
       try{
          long l = System.nanoTime();
          n on = this.m();
          if (on == null) {
             y = m.y;
          label_001f :
             y = y + l;
             while (true) {
                long l1 = y - l;
                l1 = l1 + 0x7a120;
                l1 = l1 / 0xf4240;
                if (l1 <= 0) {
                   if (!i) {
                      tB.selectNow();
                   label_0034 :
                      i = 1;
                      break ;
                   }else if(i > 3){
                      i2 = c.I;
                      if (i2.isDebugEnabled()) {
                         i2.debug("Selector.select\(\) returned prematurely {} times in a row.", Integer.valueOf((i - 1)));
                      }
                   }
                }else {
                   i = i + 1;
                   if (!tB.select(l1) && (!p0 && (!this.E.get() && (this.D() || this.b())))) {
                      goto label_0097 ;
                   }else if(Thread.interrupted()){
                      i2 = c.I;
                      if (i2.isDebugEnabled()) {
                         i2.debug("Selector.select\(\) returned prematurely because Thread.currentThread\(\).interrupt\(\) was called. Use NioEventLoop.shutdownGracefully\(\) to shutdown the NioEventLoop.");
                         goto label_0034 ;
                      }else {
                         goto label_0034 ;
                      }
                   }else {
                      long l2 = System.nanoTime();
                      l1 = l2 - TimeUnit.MILLISECONDS.toNanos(l1);
                      if (l1 - l >= 0) {
                         i = 1;
                      }else {
                         int k = c.K;
                         if (k > 0 && i >= k) {
                            c.I.warn("Selector.select\(\) returned prematurely {} times in a row; rebuilding selector.", Integer.valueOf(i));
                            this.z0();
                            this.B.selectNow();
                            goto label_0034 ;
                         }
                      }
                      l = l2;
                   }
                }
             }
          }else {
             y = Math.max(0, (on.V0() - (l - n.q)));
             goto label_001f ;
          }
       }catch(java.nio.channels.CancelledKeyException e15){
          b i1 = c.I;
          if (i1.isDebugEnabled()) {
             i1.debug(CancelledKeyException.class.getSimpleName()+" raised by a Selector - JDK bug?", e15);
          }
       }
       return;
    }
    public final void R0(){
       this.H = false;
       this.B.selectNow();
       return;
    }
    public void T0(){
       this.B.selectNow();
       if (this.E.get()) {
          this.B.wakeup();
       }
       return;
    }
    public void d0(boolean p0){
       if (!p0 && this.E.compareAndSet(false, true)) {
          this.B.wakeup();
       }
       return;
    }
    public final void e0(){
       this.R0();
       Set set = this.B.keys();
       ArrayList uArrayList = new ArrayList(set.size());
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          SelectionKey selectionKey = iterator.next();
          Object obj = selectionKey.attachment();
          if (obj instanceof b) {
             uArrayList.add(obj);
          }else {
             selectionKey.cancel();
             c.g0(obj, selectionKey, null);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          b$b uob1 = uob.s0();
          uob1.M(uob.s0().a0());
       }
       return;
    }
    public final Selector m0(){
       try{
          AbstractSelector uAbstractSel = this.D.openSelector();
          if (c.J) {
             return uAbstractSel;
          }
          f uof = new f();
          Class uClass = Class.forName("sun.nio.ch.SelectorImpl", false, PlatformDependent.p());
          if (!uClass.isAssignableFrom(uAbstractSel.getClass())) {
             return uAbstractSel;
          }
          Field declaredFiel = uClass.getDeclaredField("selectedKeys");
          Field declaredFiel1 = uClass.getDeclaredField("publicSelectedKeys");
          declaredFiel.setAccessible(true);
          declaredFiel1.setAccessible(true);
          declaredFiel.set(uAbstractSel, uof);
          declaredFiel1.set(uAbstractSel, uof);
          this.C = uof;
          c.I.trace("Instrumented an optimized java.util.Set into: {}", uAbstractSel);
          return uAbstractSel;
       }catch(java.io.IOException e0){
          throw new ChannelException("failed to open a new selector", e0);
       }
    }
    public void u(){
       try{
          this.B.close();
       }catch(java.io.IOException e0){
          c.I.warn("Failed to close a selector.", e0);
       }
       return;
    }
    public final void w0(){
       c tC = this.C;
       if (tC != null) {
          SelectionKey[] selectionKey = tC.b();
          int i = 0;
          object oobject = selectionKey[i];
          while (oobject != null) {
             selectionKey[i] = null;
             Object obj = oobject.attachment();
             if (obj instanceof b) {
                c.r0(oobject, obj);
             }else {
                c.s0(oobject, obj);
             }
             if (this.H != null) {
                i = i + 1;
                while (selectionKey[i] != null) {
                   selectionKey[i] = null;
                }
                this.R0();
                selectionKey = this.C.b();
                i = -1;
             }
             i = i + 1;
          }
       }else {
          Set set = this.B.selectedKeys();
          if (!set.isEmpty()) {
             Iterator iterator = set.iterator();
             while (true) {
                SelectionKey selectionKey1 = iterator.next();
                Object obj1 = selectionKey1.attachment();
                iterator.remove();
                if (obj1 instanceof b) {
                   c.r0(selectionKey1, obj1);
                label_006d :
                   if (iterator.hasNext()) {
                      if (this.H != null) {
                         this.R0();
                         set = this.B.selectedKeys();
                         if (!set.isEmpty()) {
                            iterator = set.iterator();
                         }
                      }
                   }
                }else {
                   c.s0(selectionKey1, obj1);
                   goto label_006d ;
                }
             }
          }
       }
       return;
    }
    public void z0(){
       if (!this.q0()) {
          this.execute(new c$a(this));
          return;
       }else {
          c tB = this.B;
          if (tB == null) {
             return;
          }
          try{
             Selector selector = this.m0();
             int i = 0;
             try{
                Iterator iterator = tB.keys().iterator();
                while (iterator.hasNext()) {
                   SelectionKey selectionKey = iterator.next();
                   Object obj = selectionKey.attachment();
                   try{
                      if (!selectionKey.isValid() || selectionKey.channel().keyFor(selector) != null) {
                         continue ;
                      }else {
                         selectionKey.cancel();
                         SelectionKey selectionKey1 = selectionKey.channel().register(selector, selectionKey.interestOps(), obj);
                         if (obj instanceof b) {
                            obj.x = selectionKey1;
                         }
                         i = i + 1;
                      }
                   }catch(java.lang.Exception e6){
                      try{
                         c.I.warn("Failed to re-register a Channel to the new Selector.", e6);
                         if (obj instanceof b) {
                            obj.s0().M(obj.s0().a0());
                            goto label_0021 ;
                         }else {
                            c.g0(obj, selectionKey, e6);
                            goto label_0021 ;
                         }
                      }catch(java.util.ConcurrentModificationException e0){
                      }
                   }
                }
                this.B = selector;
                tB.close();
                c.I.info("Migrated "+i+" channel\(s\) to the new Selector.");
                return;
             }catch(java.util.ConcurrentModificationException e0){
             }
          }catch(java.lang.Exception e0){
             c.I.warn("Failed to create a new Selector.", e0);
             return;
          }
       }
    }
}
