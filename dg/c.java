package dg.c;
import dg.i;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Map;
import dg.e;
import java.util.Set;
import java.lang.StringBuilder;
import java.util.Iterator;
import dg.k;
import dg.f;
import dg.e$b;
import dg.h;

public class c	// class@001e5f
{
    public final Map a;
    public final Set b;
    public final i c;
    public final CopyOnWriteArraySet d;
    public boolean e;

    public void c(i p0){
       super();
       this.a = new HashMap();
       this.b = new CopyOnWriteArraySet();
       this.d = new CopyOnWriteArraySet();
       this.e = true;
       if (p0 == null) {
          throw new IllegalArgumentException("springLooper is required");
       }
       this.c = p0;
       p0.a = this;
       return;
    }
    public void a(String p0){
       e uoe = this.a.get(p0);
       if (uoe == null) {
          throw new IllegalArgumentException("springId "+p0+" does not reference a registered spring");
       }
       this.b.add(uoe);
       if (this.e != null) {
          this.e = false;
          this.c.a();
       }
       return;
    }
    public e b(){
       e uoe = new e(this);
       if (this.a.containsKey(uoe.c())) {
          throw new IllegalArgumentException("spring is already registered");
       }
       this.a.put(uoe.c(), uoe);
       return uoe;
    }
    public void c(double p0){
       double d3;
       e e;
       boolean b3;
       c uoc = this;
       Iterator iterator = uoc.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(uoc);
       }
       iterator = uoc.b.iterator();
       while (true) {
          c uoc1 = uoc;
          while (true) {
             if (iterator.hasNext()) {
                e uoe = iterator.next();
                e uoe1 = (!uoe.d() || uoe.i == null)? 1: null;
                if (uoe1) {
                   double d = p0 / 0x408f400000000000;
                   boolean b = uoe.d();
                   if (b && uoe.i != null) {
                      continue ;
                   }else {
                      e uoe2 = 0x3fb0624dd2f1a9fc;
                      if (d - uoe2 > 0) {
                         d = uoe2;
                      }
                      double d1 = uoe.m + d;
                      uoe.m = d1;
                      uoe1 = uoe.a;
                      uoe1 = uoe.d;
                      e$b a = uoe1.a;
                      e$b b1 = uoe1.b;
                      uoe1 = uoe.f;
                      f uof = uoe1.b;
                      e$b a1 = uoe1.a;
                      e$b b2 = uoe1.b;
                      f uof1 = uoe1.a;
                      e m = uoe.m;
                      double d2 = 0x3f50624dd2f1a9fc;
                      while (m - d2 >= 0) {
                         d3 = m - d2;
                         uoe.m = d3;
                         if (d3 - d2 < 0) {
                            e = uoe.e;
                            e.a = a;
                            e.b = b1;
                         }
                         e = uoe.h;
                         double d4 = e - a1;
                         d4 = d4 * uof;
                         d3 = uof1 * b1;
                         d4 = d4 - d3;
                         d3 = b1 * d2;
                         d3 = d3 * 0x3fe0000000000000;
                         d3 = d3 + a;
                         double d5 = d4 * d2;
                         d5 = d5 * 0x3fe0000000000000;
                         d5 = b1 + d5;
                         d3 = e - d3;
                         d3 = d3 * uof;
                         double d6 = uof1 * d5;
                         d3 = d3 - d6;
                         d6 = d5 * d2;
                         d6 = d6 * 0x3fe0000000000000;
                         d6 = a + d6;
                         double d7 = d3 * d2;
                         d7 = d7 * 0x3fe0000000000000;
                         d7 = b1 + d7;
                         double d8 = e - d6;
                         d8 = d8 * uof;
                         d6 = uof1 * d7;
                         d8 = d8 - d6;
                         d6 = d7 * d2;
                         d6 = a + d6;
                         double d9 = d8 * d2;
                         d9 = b1 + d9;
                         double d10 = e - d6;
                         d10 = d10 * uof;
                         double d11 = uof1 * d9;
                         d10 = d10 - d11;
                         d5 = d5 + d7;
                         d5 = d5 * 2.00f;
                         d5 = b1 + d5;
                         d5 = d5 + d9;
                         d5 = d5 * 0x3fc5555555555555;
                         d3 = d3 + d8;
                         d3 = d3 * 2.00f;
                         d4 = d4 + d3;
                         d4 = d4 + d10;
                         d4 = d4 * 0x3fc5555555555555;
                         d5 = d5 * d2;
                         a = a + d5;
                         d4 = d4 * d2;
                         b1 = b1 + d4;
                         d4 = d6;
                         d10 = d9;
                      }
                      e f = uoe.f;
                      f.a = a1;
                      f.b = b2;
                      e = uoe.d;
                      e.a = a;
                      e.b = b1;
                      if (m - null > 0) {
                         d3 = m / d2;
                         double d12 = a * d3;
                         e e1 = uoe.e;
                         d2 = 0x3ff0000000000000 - d3;
                         double d13 = e1.a * d2;
                         d12 = d12 + d13;
                         e.a = d12;
                         double d14 = b1 * d3;
                         d13 = e1.b * d2;
                         d14 = d14 + d13;
                         e.b = d14;
                      }
                      if (!uoe.d()) {
                         if (uoe.b != null) {
                            d3 = (uoe.a.b - null > 0 && (uoe.g - uoe.h >= 0 || (uoe.b() - uoe.h > 0 || (uoe.g - uoe.h > 0 && uoe.b() - uoe.h < 0))))? 1: 0;
                            if (d3) {
                            label_015a :
                               if (uof - null > 0) {
                                  e = uoe.h;
                                  uoe.g = e;
                                  uoe.d.a = e;
                               }else {
                                  b2 = uoe.d.a;
                                  uoe.h = b2;
                                  uoe.g = b2;
                               }
                               e d15 = uoe.d;
                               a1 = null;
                               if (a1 - d15.b) {
                                  d15.b = a1;
                                  uoe.n.a(uoe.c());
                               }
                               b = true;
                            }
                         }
                      }else {
                         goto label_015a ;
                      }
                      if (uoe.i != null) {
                         b3 = false;
                         uoe.i = b3;
                         b2 = 1;
                      }else {
                         b3 = false;
                         b2 = null;
                      }
                      if (b) {
                         uoe.i = true;
                         b3 = true;
                      }
                      Iterator iterator1 = uoe.l.iterator();
                      while (iterator1.hasNext()) {
                         h oh = iterator1.next();
                         if (b2) {
                            oh.d(uoe);
                         }
                         oh.b(uoe);
                         if (b3) {
                            oh.c(uoe);
                         }else {
                            continue ;
                         }
                      }
                   }
                }else {
                   uoc1.b.remove(uoe);
                }
             }else if(uoc.b.isEmpty()){
                uoc.e = true;
             }
             iterator = uoc.d.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(uoc);
             }
             if (uoc.e != null) {
                uoc.c.b();
             }
          }
          return;
       }
    }
}
