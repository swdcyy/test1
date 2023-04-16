package ptd.f;
import ptd.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ptd.g;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import asd.c;
import qrd.l1;
import csd.b;
import java.lang.Math;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ftd.l;
import ftd.n;
import ftd.k;
import kotlin.Result;
import dsd.e;
import kotlinx.coroutines.sync.SemaphoreKt;
import ltd.b0;
import ltd.c0;
import ltd.g;
import ltd.f;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ptd.a;
import msd.l;
import java.lang.IllegalStateException;

public final class f implements e	// class@0021fd
{
    public int _availablePermits;
    public final int a;
    public long deqIdx;
    public long enqIdx;
    public Object head;
    public Object tail;
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicLongFieldUpdater c;
    public static final AtomicReferenceFieldUpdater d;
    public static final AtomicLongFieldUpdater e;
    public static final AtomicIntegerFieldUpdater f;

    static {
       f.b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "head");
       f.c = AtomicLongFieldUpdater.newUpdater(f.class, "deqIdx");
       f.d = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "tail");
       f.e = AtomicLongFieldUpdater.newUpdater(f.class, "enqIdx");
       f.f = AtomicIntegerFieldUpdater.newUpdater(f.class, "_availablePermits");
    }
    public void f(int p0,int p1){
       super();
       this.a = p0;
       long l = 0;
       this.deqIdx = l;
       this.enqIdx = l;
       g og = 1;
       int i = (p0 > 0)? 1: 0;
       if (i) {
          if (p1 < 0 || p0 < p1) {
             og = null;
          }
          if (og) {
             og = new g(l, null, 2);
             this.head = og;
             this.tail = og;
             this._availablePermits = p0 - p1;
             return;
          }else {
             throw new IllegalArgumentException("The number of acquired permits should be in 0.."+p0.toString());
          }
       }else {
          throw new IllegalArgumentException("Semaphore should have at least 1 permit, but had "+p0.toString());
       }
    }
    public Object a(c p0){
       if (f.f.getAndDecrement(this) > 0) {
          return l1.a;
       }
       p0 = this.d(p0);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public boolean b(){
       while (true) {
          f t_availableP = this._availablePermits;
          if (t_availableP <= null) {
             return false;
          }
          int i = t_availableP - 1;
          if (f.f.compareAndSet(this, t_availableP, i)) {
             break ;
          }
       }
       return true;
    }
    public int c(){
       return Math.max(this._availablePermits, 0);
    }
    public final Object d(c p0){
       Object obj;
       l ol = n.b(IntrinsicsKt__IntrinsicsJvmKt.d(p0));
       while (true) {
          if (!this.e(ol)) {
             if (f.f.getAndDecrement(this) > 0) {
                ol.resumeWith(Result.constructor-impl(l1.a));
             }
          }
          obj = ol.r();
          if (obj == b.h()) {
             e.c(p0);
             break ;
          }
          break ;
       }
       return obj;
    }
    public final boolean e(k p0){
       Object obj1;
       boolean b;
       boolean b1;
       long l1;
       g og1;
       int i;
       f uof = this;
       Object obj = p0;
       f tail = uof.tail;
       long andIncrement = f.e.getAndIncrement(uof);
       long l = andIncrement / (long)SemaphoreKt.f;
       do {
          f uof1 = tail;
          while (true) {
             if (uof1.n() - l < 0 || uof1.f()) {
                g og = uof1.d();
                e0 a = f.a;
                if (og == a) {
                   obj1 = c0.b(a);
                label_0034 :
                   b = false;
                   b1 = true;
                   if (!c0.g(obj1)) {
                      b0 uob0 = c0.e(obj1);
                      while (true) {
                         f tail1 = uof.tail;
                         if (tail1.n() - uob0.n() >= 0) {
                         label_0050 :
                            l1 = 1;
                         }else if(!uob0.q()){
                            l1 = 0;
                         }else if(f.d.compareAndSet(uof, tail1, uob0)){
                            if (tail1.m()) {
                               tail1.k();
                               goto label_0050 ;
                            }else {
                               goto label_0050 ;
                            }
                         }else if(uob0.m()){
                            uob0.k();
                         }else {
                            continue ;
                         }
                      }
                      if (!l1) {
                         continue ;
                      }
                   }
                }else if(og != null){
                   l1 = uof1.n() + 1;
                   og = SemaphoreKt.i(l1, uof1);
                   if (uof1.l(og)) {
                      if (uof1.f()) {
                         uof1.k();
                      }
                   }
                }
                uof1 = og;
             }else {
                obj1 = c0.b(uof1);
                goto label_0034 ;
             }
          }
          obj.w(new a(og1, i));
          return b1;
       } while (l1);
       og1 = c0.e(obj1);
       i = (int)(andIncrement % (long)SemaphoreKt.f);
       if (og1.e.compareAndSet(i, null, obj)) {
          goto label_008d ;
       }else if(og1.e.compareAndSet(i, SemaphoreKt.b, SemaphoreKt.c)){
          obj.resumeWith(Result.constructor-impl(l1.a));
          return b1;
       }else {
          return b;
       }
    }
    public final boolean f(){
       Object obj;
       boolean b;
       boolean b1;
       long l1;
       f thead = this.head;
       long andIncrement = f.c.getAndIncrement(this);
       long l = andIncrement / (long)SemaphoreKt.f;
       do {
          f uof = thead;
          while (true) {
             if (uof.n() - l < 0 || uof.f()) {
                g og = uof.d();
                e0 a = f.a;
                if (og == a) {
                   obj = c0.b(a);
                label_0030 :
                   b = false;
                   b1 = true;
                   if (!c0.g(obj)) {
                      b0 uob0 = c0.e(obj);
                      while (true) {
                         f thead1 = this.head;
                         if (thead1.n() - uob0.n() >= 0) {
                         label_004c :
                            l1 = 1;
                         }else if(!uob0.q()){
                            l1 = 0;
                         }else if(f.b.compareAndSet(this, thead1, uob0)){
                            if (thead1.m()) {
                               thead1.k();
                               goto label_004c ;
                            }else {
                               goto label_004c ;
                            }
                         }else if(uob0.m()){
                            uob0.k();
                         }else {
                            continue ;
                         }
                      }
                      if (!l1) {
                         continue ;
                      }
                   }
                }else if(og != null){
                   l1 = uof.n() + 1;
                   og = SemaphoreKt.i(l1, uof);
                   if (uof.l(og)) {
                      if (uof.f()) {
                         uof.k();
                      }
                   }
                }
                uof = og;
             }else {
                obj = c0.b(uof);
                goto label_0030 ;
             }
          }
          return b;
       } while (l1);
       g og1 = c0.e(obj);
       og1.a();
       if (og1.n() - l > 0) {
          goto label_0086 ;
       }else {
          int i = (int)(andIncrement % (long)SemaphoreKt.f);
          Object andSet = og1.e.getAndSet(i, SemaphoreKt.b);
          if (andSet == null) {
             int a1 = SemaphoreKt.a;
             while (true) {
                if (b >= a1) {
                   return (og1.e.compareAndSet(i, SemaphoreKt.b, SemaphoreKt.d) ^ b1);
                }
                if (og1.e.get(i) == SemaphoreKt.c) {
                }else {
                   b = b + 1;
                }
             }
             return b1;
          }else if(andSet == SemaphoreKt.e){
             return b;
          }else {
             return SemaphoreKt.j(andSet);
          }
       }
    }
    public void release(){
       while (true) {
          f t_availableP = this._availablePermits;
          int i = (t_availableP < this.a)? 1: 0;
          if (i) {
             i = t_availableP + 1;
             if (f.f.compareAndSet(this, t_availableP, i)) {
                if (t_availableP >= null) {
                   break ;
                }else {
                   if (this.f()) {
                      return;
                   }
                   continue ;
                }
             }
          }else {
             throw new IllegalStateException("The number of released permits cannot be greater than "+this.a.toString());
          }
       }
       return;
    }
}
