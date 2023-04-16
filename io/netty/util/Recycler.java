package io.netty.util.Recycler;
import java.lang.Class;
import ard.b;
import ard.c;
import io.netty.util.Recycler$a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import zqd.x;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Math;
import io.netty.util.Recycler$c;
import io.netty.util.Recycler$b;
import io.netty.util.Recycler$e;
import io.netty.util.concurrent.e;
import io.netty.util.Recycler$f;
import io.netty.util.Recycler$WeakOrderQueue;
import java.lang.ref.WeakReference;
import io.netty.util.Recycler$WeakOrderQueue$Link;
import io.netty.util.Recycler$d;
import java.lang.IllegalStateException;

public abstract class Recycler	// class@0010e8
{
    public final int a;
    public final e b;
    public static final b c;
    public static final Recycler$e d;
    public static final AtomicInteger e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final e i;

    static {
       b uob = c.a(Recycler.class);
       Recycler.c = uob;
       Recycler.d = new Recycler$a();
       AtomicInteger uAtomicInteg = new AtomicInteger(Integer.MIN_VALUE);
       Recycler.e = uAtomicInteg;
       Recycler.f = uAtomicInteg.getAndIncrement();
       int i = 0x40000;
       int i1 = x.d("io.netty.recycler.maxCapacity", i);
       if (i1 <= 0) {
       }else {
          i = i1;
       }
       Recycler.g = i;
       if (uob.isDebugEnabled()) {
          if (!i) {
             uob.debug("-Dio.netty.recycler.maxCapacity.maxCapacity: disabled");
          }else {
             uob.debug("-Dio.netty.recycler.maxCapacity.maxCapacity: {}", Integer.valueOf(i));
          }
       }
       Recycler.h = Math.min(i, 256);
       Recycler.i = new Recycler$c();
    }
    public void Recycler(){
       super(Recycler.g);
    }
    public void Recycler(int p0){
       super();
       this.b = new Recycler$b(this);
       this.a = Math.max(0, p0);
    }
    public final Object a(){
       Recycler$d uod;
       Recycler$d uod1;
       Recycler$WeakOrderQueue weakOrderQue;
       if (this.a == null) {
          return this.b(Recycler.d);
       }
       Recycler$f uof = this.b.b();
       Recycler$f e = uof.e;
       if (e == null) {
          e = uof.g;
          Recycler$f uof1 = 1;
          if (e == null) {
             e = uof.f;
             if (e == null) {
                uod = null;
             label_0061 :
                uod1 = null;
                if (!uod) {
                   uof.h = uod1;
                   uof.g = uof.f;
                   uof1 = null;
                }
                if (!uof1) {
                label_0084 :
                   if (uod1 == null) {
                      uod1 = new Recycler$d(uof);
                      uod1.d = this.b(uod1);
                   }
                   return uod1.d;
                }else {
                   e = uof.e;
                }
             }
          }
          Recycler$f h = uof.h;
          uod = null;
          while (true) {
             if (e.a(uof)) {
                uod = 1;
                break ;
             }else {
                Recycler$WeakOrderQueue c = e.c;
                if (e.d.get() == null) {
                   Recycler$WeakOrderQueue b = e.b;
                   boolean b1 = (b.readIndex != b.get())? true: false;
                   if (b1) {
                      while (e.a(uof)) {
                         uod = 1;
                      }
                   }
                   if (h != null) {
                      h.c = c;
                   }
                }else {
                   h = e;
                }
                if (c == null || uod) {
                   weakOrderQue = c;
                   break ;
                }else {
                   weakOrderQue = c;
                }
             }
          }
          uof.h = h;
          uof.g = e;
          goto label_0061 ;
       }
       int i = e - 1;
       object oobject = uof.c[i];
       if (oobject.a == oobject.b) {
          oobject.b = 0;
          oobject.a = 0;
          uof.e = i;
          uod1 = oobject;
          goto label_0084 ;
       }else {
          throw new IllegalStateException("recycled multiple times");
       }
    }
    public abstract Object b(Recycler$e p0);
    public final boolean c(Object p0,Recycler$e p1){
       if (p1 == Recycler.d) {
          return false;
       }
       if (p1.c.a != this) {
          return false;
       }
       p1.a(p0);
       return true;
    }
}
