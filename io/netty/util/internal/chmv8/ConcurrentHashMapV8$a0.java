package io.netty.util.internal.chmv8.ConcurrentHashMapV8$a0;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import sun.misc.Unsafe;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Error;
import java.lang.Throwable;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b0;
import java.lang.Object;
import java.lang.Thread;
import java.util.concurrent.locks.LockSupport;

public final class ConcurrentHashMapV8$a0 extends ConcurrentHashMapV8$r	// class@00114a
{
    public ConcurrentHashMapV8$b0 f;
    public ConcurrentHashMapV8$b0 g;
    public Thread h;
    public int i;
    public static final Unsafe j;
    public static final long k;
    public static final boolean l;

    static {
       ConcurrentHashMapV8 uConcurrentH = ConcurrentHashMapV8.class;
       try{
          Unsafe unsafe = ConcurrentHashMapV8.getUnsafe();
          ConcurrentHashMapV8$a0.j = unsafe;
          ConcurrentHashMapV8$a0.k = unsafe.objectFieldOffset(ConcurrentHashMapV8$a0.class.getDeclaredField("i"));
       }catch(java.lang.Exception e0){
          throw new Error(e0);
       }
    }
    public void ConcurrentHashMapV8$a0(ConcurrentHashMapV8$b0 p0){
       int i;
       super(-2, null, null, null);
       this.g = p0;
       ConcurrentHashMapV8$b0 uob0 = null;
       while (p0 != null) {
          ConcurrentHashMapV8$r e = p0.e;
          p0.h = null;
          p0.g = null;
          if (uob0 == null) {
             p0.f = null;
             p0.j = false;
          }else {
             ConcurrentHashMapV8$r c = p0.c;
             ConcurrentHashMapV8$r b = p0.b;
             ConcurrentHashMapV8$b0 uob01 = uob0;
             Class uClass = null;
             while (true) {
                ConcurrentHashMapV8$r b1 = uob01.b;
                if (b1 > b) {
                   b1 = -1;
                label_003c :
                   ConcurrentHashMapV8$b0 g = (b1 <= 0)? uob01.g: uob01.h;
                   if (g == null) {
                      p0.f = uob01;
                      uob01.g = (b1 <= 0)? p0: p0;
                      p0 = ConcurrentHashMapV8$a0.c(uob0, p0);
                   }else {
                      uob01 = g;
                   }
                }else if(b1 < b){
                   b1 = 1;
                   goto label_003c ;
                }else if(uClass == null){
                   uClass = ConcurrentHashMapV8.comparableClassFor(c);
                   if (uClass == null) {
                      i = null;
                      goto label_003c ;
                   }
                }
                i = ConcurrentHashMapV8.compareComparables(uClass, c, uob01.c);
                goto label_003c ;
             }
          }
          uob0 = p0;
          ConcurrentHashMapV8$r or = e;
       }
       this.f = uob0;
       return;
    }
    public static ConcurrentHashMapV8$b0 b(ConcurrentHashMapV8$b0 p0,ConcurrentHashMapV8$b0 p1){
       ConcurrentHashMapV8$b0 g1;
       ConcurrentHashMapV8$b0 h;
       boolean b;
       while (true) {
          if (p1 == null || p1 == p0) {
             return p0;
          }
          ConcurrentHashMapV8$b0 f = p1.f;
          if (f == null) {
             p1.j = false;
             return p1;
          }else if(p1.j != null){
             break ;
          }else {
             ConcurrentHashMapV8$b0 g = f.g;
             ConcurrentHashMapV8$b0 uob0 = null;
             if (g == p1) {
                g = f.h;
                if (g != null && g.j != null) {
                   g.j = false;
                   f.j = true;
                   p0 = ConcurrentHashMapV8$a0.h(p0, f);
                   f = p1.f;
                   g = (f == null)? uob0: f.h;
                }
             label_0033 :
                if (g == null) {
                label_00de :
                   p1 = f;
                }else {
                   g1 = g.g;
                   h = g.h;
                   if (h == null || (h.j == null && (g1 == null || g1.j == null))) {
                      g.j = true;
                      goto label_00de ;
                   }else if(h == null || h.j == null){
                      if (g1 != null) {
                         g1.j = false;
                      }
                      g.j = true;
                      p0 = ConcurrentHashMapV8$a0.i(p0, g);
                      f = p1.f;
                      if (f != null) {
                         uob0 = f.h;
                      }
                      g = uob0;
                   }
                   if (g != null) {
                      b = (f == null)? false: f.j;
                      g.j = b;
                      b = g.h;
                      if (b != null) {
                         b.j = false;
                      }
                   }
                   if (f != null) {
                      f.j = false;
                      p0 = ConcurrentHashMapV8$a0.h(p0, f);
                   }
                }
             }else if(g != null && g.j != null){
                g.j = false;
                f.j = true;
                p0 = ConcurrentHashMapV8$a0.i(p0, f);
                f = p1.f;
                g = (f == null)? uob0: f.g;
             }
          label_0094 :
             if (g == null) {
                goto label_00de ;
             }else {
                g1 = g.g;
                h = g.h;
                if (g1 == null || (g1.j == null && (h == null || h.j == null))) {
                   g.j = true;
                   goto label_00de ;
                }else if(g1 == null || g1.j == null){
                   if (h != null) {
                      h.j = false;
                   }
                   g.j = true;
                   p0 = ConcurrentHashMapV8$a0.h(p0, g);
                   f = p1.f;
                   if (f != null) {
                      uob0 = f.g;
                   }
                   g = uob0;
                }
                if (g != null) {
                   b = (f == null)? false: f.j;
                   g.j = b;
                   b = g.g;
                   if (b != null) {
                      b.j = false;
                   }
                }
                if (f != null) {
                   f.j = false;
                   p0 = ConcurrentHashMapV8$a0.i(p0, f);
                }
             }
             b = p0;
             p0 = b;
          }
       }
       p1.j = false;
       return p0;
    }
    public static ConcurrentHashMapV8$b0 c(ConcurrentHashMapV8$b0 p0,ConcurrentHashMapV8$b0 p1){
       p1.j = true;
       while (true) {
          ConcurrentHashMapV8$b0 f = p1.f;
          if (f == null) {
             p1.j = false;
             return p1;
          }else if(f.j != null){
             ConcurrentHashMapV8$b0 f1 = f.f;
             if (f1 != null) {
                ConcurrentHashMapV8$b0 g = f1.g;
                if (f == g) {
                   g = f1.h;
                   if (g != null && g.j != null) {
                      g.j = false;
                      f.j = false;
                      f1.j = true;
                   }else if(p1 == f.h){
                      p0 = ConcurrentHashMapV8$a0.h(p0, f);
                      p1 = f.f;
                      f1 = (p1 == null)? null: p1.f;
                      f = p1;
                      p1 = f;
                   }
                   if (f != null) {
                      f.j = false;
                      if (f1 != null) {
                         f1.j = true;
                         p0 = ConcurrentHashMapV8$a0.i(p0, f1);
                      }
                   }
                }else if(g != null && g.j != null){
                   g.j = false;
                   f.j = false;
                   f1.j = true;
                }else if(p1 == f.g){
                   p0 = ConcurrentHashMapV8$a0.i(p0, f);
                   p1 = f.f;
                   f1 = (p1 == null)? null: p1.f;
                   f = p1;
                   p1 = f;
                }
                if (f != null) {
                   f.j = false;
                   if (f1 != null) {
                      f1.j = true;
                      p0 = ConcurrentHashMapV8$a0.h(p0, f1);
                   }
                }
                p1 = f1;
             }
          }
          break ;
       }
       return p0;
    }
    public static ConcurrentHashMapV8$b0 h(ConcurrentHashMapV8$b0 p0,ConcurrentHashMapV8$b0 p1){
       ConcurrentHashMapV8$b0 h = p1.h;
       if (h != null) {
          ConcurrentHashMapV8$b0 g = h.g;
          p1.h = g;
          if (g != null) {
             g.f = p1;
          }
          g = p1.f;
          h.f = g;
          if (g == null) {
             h.j = false;
             p0 = h;
          }else if(g.g == p1){
             g.g = h;
          }else {
             g.h = h;
          }
          h.g = p1;
          p1.f = h;
       }
       return p0;
    }
    public static ConcurrentHashMapV8$b0 i(ConcurrentHashMapV8$b0 p0,ConcurrentHashMapV8$b0 p1){
       ConcurrentHashMapV8$b0 g = p1.g;
       if (g != null) {
          ConcurrentHashMapV8$b0 h = g.h;
          p1.g = h;
          if (h != null) {
             h.f = p1;
          }
          h = p1.f;
          g.f = h;
          if (h == null) {
             g.j = false;
             p0 = g;
          }else if(h.h == p1){
             h.h = g;
          }else {
             h.g = g;
          }
          g.h = p1;
          p1.f = g;
       }
       return p0;
    }
    public final ConcurrentHashMapV8$r a(int p0,Object p1){
       ConcurrentHashMapV8$r or;
       ConcurrentHashMapV8$a0 ti1;
       int i2;
       ConcurrentHashMapV8$a0 tg = this.g;
       while (true) {
          or = null;
          if (tg == null) {
             return or;
          }
          ConcurrentHashMapV8$a0 ti = this.i;
          int i = ti & 0x03;
          if (i) {
             if (tg.b == p0) {
                or = tg.c;
                if (or == p1 || (or != null && p1.equals(or))) {
                   return tg;
                }
             }
          }else {
             int i1 = ti + 4;
             if (ConcurrentHashMapV8$a0.j.compareAndSwapInt(this, ConcurrentHashMapV8$a0.k, ti, i1)) {
                tg = this.f;
                if (tg != null) {
                   or = tg.b(p0, p1, or);
                }
                do {
                   ti1 = this.i;
                   i2 = ti1 - 4;
                } while (ConcurrentHashMapV8$a0.j.compareAndSwapInt(this, ConcurrentHashMapV8$a0.k, ti1, i2));
                if (ti1 == 6) {
                   ti1 = this.h;
                   if (ti1 != null) {
                      LockSupport.unpark(ti1);
                   }
                }
             }
          }
          tg = tg.e;
       }
       return or;
    }
    public final void d(){
       ConcurrentHashMapV8$a0 ti;
       Thread thread = null;
       do {
          ti = this.i;
          int i = ti & 0x01;
          if (!i) {
          }else {
             i = ti & 0x02;
             if (!i) {
                int i1 = ti | 0x02;
                if (ConcurrentHashMapV8$a0.j.compareAndSwapInt(this, ConcurrentHashMapV8$a0.k, ti, i1)) {
                   this.h = Thread.currentThread();
                   thread = 1;
                }
             }else if(thread != null){
                LockSupport.park(this);
             }
          }
       } while (ConcurrentHashMapV8$a0.j.compareAndSwapInt(this, ConcurrentHashMapV8$a0.k, ti, 1));
       if (thread) {
          this.h = null;
       }
       return;
    }
    public final void e(){
       if (!ConcurrentHashMapV8$a0.j.compareAndSwapInt(this, ConcurrentHashMapV8$a0.k, 0, 1)) {
          this.d();
       }
       return;
    }
    public final ConcurrentHashMapV8$b0 f(int p0,Object p1,Object p2){
       ConcurrentHashMapV8$b0 uob0;
       int i;
       ConcurrentHashMapV8$a0 tf = this.f;
       Class uClass = null;
       while (true) {
          if (tf == null) {
             uob0 = new ConcurrentHashMapV8$b0(p0, p1, p2, null, null);
             this.f = tf;
             this.g = tf;
             break ;
          }else {
             ConcurrentHashMapV8$r b = tf.b;
             boolean b1 = true;
             if (b <= p0) {
                if (b >= p0) {
                   b = tf.c;
                   if (b == p1 || (b != null && p1.equals(b))) {
                      return tf;
                   }else if(uClass == null){
                      uClass = ConcurrentHashMapV8.comparableClassFor(p1);
                      if (uClass == null) {
                      label_003f :
                         if (tf.g != null) {
                            uob0 = tf.h;
                            if (uob0 != null) {
                               uob0 = uob0.b(p0, p1, uClass);
                               if (uob0 != null) {
                                  return uob0;
                               }
                            }
                         }
                      }
                   }
                   int i1 = ConcurrentHashMapV8.compareComparables(uClass, p1, b);
                   if (!i1) {
                      goto label_003f ;
                   }else {
                      i = i1;
                   label_0051 :
                      uob0 = (i < 0)? tf.g: tf.h;
                      if (uob0 == null) {
                         ConcurrentHashMapV8$a0 tg = this.g;
                         ConcurrentHashMapV8$b0 uob01 = new ConcurrentHashMapV8$b0(p0, p1, p2, tg, tf);
                         this.g = v11;
                         if (tg != null) {
                            tg.i = v11;
                         }
                         tf.g = (i < 0)? v11: v11;
                         if (tf.j == null) {
                            v11.j = b1;
                            break ;
                         }else {
                            this.e();
                            this.f = ConcurrentHashMapV8$a0.c(this.f, v11);
                            this.j();
                            break ;
                         }
                      }else {
                         tf = uob0;
                      }
                   }
                }
                i = 1;
                goto label_0051 ;
             }
          label_001d :
             i = -1;
             goto label_0051 ;
          }
       }
       return null;
    }
    public final boolean g(ConcurrentHashMapV8$b0 p0){
       ConcurrentHashMapV8$b0 f1;
       ConcurrentHashMapV8$r e = p0.e;
       ConcurrentHashMapV8$b0 i = p0.i;
       if (i == null) {
          this.g = e;
       }else {
          i.e = e;
       }
       if (e != null) {
          e.i = i;
       }
       boolean b = true;
       if (this.g == null) {
          this.f = null;
          return b;
       }else {
          ConcurrentHashMapV8$a0 tf = this.f;
          if (tf != null && tf.h != null) {
             ConcurrentHashMapV8$b0 g = tf.g;
             if (g != null && g.g != null) {
                this.e();
                i = p0.g;
                g = p0.h;
                if (i != null && g != null) {
                   ConcurrentHashMapV8$b0 uob0 = g;
                   ConcurrentHashMapV8$b0 g1 = uob0.g;
                   while (g1 != null) {
                      uob0 = g1;
                   }
                   g1 = uob0.j;
                   uob0.j = p0.j;
                   p0.j = g1;
                   g1 = uob0.h;
                   ConcurrentHashMapV8$b0 f = p0.f;
                   if (uob0 == g) {
                      p0.f = uob0;
                      uob0.h = p0;
                   }else {
                      ConcurrentHashMapV8$b0 f2 = uob0.f;
                      p0.f = f2;
                      if (f2 != null) {
                         f2.g = (uob0 == f2.g)? p0: p0;
                      }
                   label_0060 :
                      uob0.h = g;
                      g.f = uob0;
                   }
                   p0.g = null;
                   uob0.g = i;
                   i.f = uob0;
                   p0.h = g1;
                   if (g1 != null) {
                      g1.f = p0;
                   }
                   uob0.f = f;
                   if (f == null) {
                      tf = uob0;
                   }else if(p0 == f.g){
                      f.g = uob0;
                   }else {
                      f.h = uob0;
                   }
                   if (g1 != null) {
                      i = g1;
                   }else {
                   label_008a :
                      b = p0;
                   }
                }else if(i != null){
                   if (g != null) {
                      i = g;
                   }else {
                      goto label_008a ;
                   }
                }
                if (i != p0) {
                   g = p0.f;
                   i.f = g;
                   if (g == null) {
                      tf = i;
                   }else if(p0 == g.g){
                      g.g = i;
                   }else {
                      g.h = i;
                   }
                   p0.f = null;
                   p0.h = null;
                   p0.g = null;
                }
                if (p0.j == null) {
                   f1 = ConcurrentHashMapV8$a0.b(tf, i);
                }
                this.f = tf;
                if (p0 == i) {
                   f1 = p0.f;
                   if (f1 != null) {
                      if (p0 == f1.g) {
                         f1.g = null;
                      }else if(p0 == f1.h){
                         f1.h = null;
                      }
                      p0.f = null;
                   }
                }
                this.j();
                return false;
             }
          }
          return b;
       }
    }
    public final void j(){
       this.i = 0;
    }
}
