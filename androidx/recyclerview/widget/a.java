package androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.r$a;
import androidx.recyclerview.widget.a$a;
import java.lang.Object;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.a$b;
import z1.f;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import java.lang.Runnable;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class a implements r$a	// class@0008e7
{
    public f a;
    public final ArrayList b;
    public final ArrayList c;
    public final a$a d;
    public Runnable e;
    public final boolean f;
    public final r g;
    public int h;

    public void a(a$a p0){
       super(p0, false);
    }
    public void a(a$a p0,boolean p1){
       super();
       this.a = new Pools$SimplePool(30);
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.h = 0;
       this.d = p0;
       this.f = p1;
       this.g = new r(this);
    }
    public void a(a$b p0){
       if (this.f == null) {
          p0.c = null;
          this.a.a(p0);
       }
       return;
    }
    public a$b b(int p0,int p1,int p2,Object p3){
       a$b uob = this.a.q();
       if (uob == null) {
          uob = new a$b(p0, p1, p2, p3);
       }else {
          uob.a = p0;
          uob.b = p1;
          uob.d = p2;
          uob.c = p3;
       }
       return uob;
    }
    public final void c(a$b p0){
       this.v(p0);
    }
    public final void d(a$b p0){
       this.v(p0);
    }
    public int e(int p0){
       int i = this.b.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return p0;
          }
          a$b uob = this.b.get(i1);
          a$b a = uob.a;
          if (a != 1) {
             if (a != 2) {
                if (a == 8) {
                   a = uob.b;
                   if (a == p0) {
                      a$b d = uob.d;
                   }else if(a < p0){
                      p0--;
                   }
                   if (uob.d <= p0) {
                      p0++;
                   }
                }
             }else {
                a = uob.b;
                if (a <= p0) {
                   uob = uob.d;
                   int i2 = a + uob;
                   if (i2 > p0) {
                      break ;
                   }else {
                      p0 = p0 - uob;
                   }
                }
             }
          }else if(uob.b <= p0){
             p0 = p0 + uob.d;
          }
          i1 = i1 + 1;
       }
       return -1;
    }
    public final void f(a$b p0){
       a$b b = p0.b;
       int i = p0.d + b;
       a$b uob = -1;
       a$b uob1 = b;
       int i1 = 0;
       Object obj = null;
       while (uob1 < i) {
          if (this.d.f(uob1) != null || this.h(uob1)) {
             if (!uob) {
                this.k(this.b(2, b, i1, obj));
                uob = 1;
             }else {
                uob = 0;
             }
             obj = 1;
          }else if(uob == 1){
             this.v(this.b(2, b, i1, obj));
             uob = 1;
          }else {
             uob = 0;
          }
          obj = null;
          if (uob) {
             uob1 = uob1 - i1;
             i = i - i1;
             i1 = 1;
          }else {
             i1 = i1 + 1;
          }
          uob1 = uob1 + 1;
          uob = obj;
       }
       if (i1 != p0.d) {
          this.a(p0);
          p0 = this.b(2, b, i1, obj);
       }
       if (uob == null) {
          this.k(p0);
       }else {
          this.v(p0);
       }
       return;
    }
    public final void g(a$b p0){
       a$b b = p0.b;
       int i = p0.d + b;
       a$b uob = b;
       a$b uob1 = -1;
       int i1 = 0;
       for (; b < i; b = b + 1) {
          if (this.d.f(b) != null || this.h(b)) {
             if (!uob1) {
                this.k(this.b(4, uob, i1, p0.c));
                uob = b;
                i1 = 0;
             }
             uob1 = 1;
          }else if(uob1 == 1){
             this.v(this.b(4, uob, i1, p0.c));
             uob = b;
             i1 = 0;
          }
          uob1 = null;
          i1 = i1 + 1;
       }
       if (i1 != p0.d) {
          this.a(p0);
          p0 = this.b(4, uob, i1, p0.c);
       }
       if (uob1 == null) {
          this.k(p0);
       }else {
          this.v(p0);
       }
       return;
    }
    public final boolean h(int p0){
       int i2;
       int i = this.c.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             a$b uob = this.c.get(i1);
             a$b a = uob.a;
             if (a == 8) {
                i2 = i1 + 1;
                if (this.n(uob.d, i2) == p0) {
                }
             }else if(a == true){
                a = uob.b;
                int i3 = uob.d + a;
                while (true) {
                   if (a < i3) {
                      int i4 = i1 + 1;
                      if (this.n(a, i4) == p0) {
                         return true;
                      }else {
                         i2 = a + 1;
                      }
                   }
                }
                return false;
             }
             i1 = i1 + 1;
          }else {
             goto label_003c ;
          }
       }
       return true;
    }
    public void i(){
       int i = this.c.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.d.c(this.c.get(i1));
       }
       this.x(this.c);
       this.h = 0;
       return;
    }
    public void j(){
       this.i();
       int i = this.b.size();
       int i1 = 0;
       while (i1 < i) {
          a$b uob = this.b.get(i1);
          a$b a = uob.a;
          if (a != 1) {
             if (a != 2) {
                if (a != 4) {
                   if (a == 8) {
                      this.d.c(uob);
                      this.d.a(uob.b, uob.d);
                   }
                }else {
                   this.d.c(uob);
                   this.d.e(uob.b, uob.d, uob.c);
                }
             }else {
                this.d.c(uob);
                this.d.d(uob.b, uob.d);
             }
          }else {
             this.d.c(uob);
             this.d.g(uob.b, uob.d);
          }
          a te = this.e;
          if (te != null) {
             te.run();
          }
          i1 = i1 + 1;
       }
       this.x(this.b);
       this.h = 0;
       return;
    }
    public final void k(a$b p0){
       int i1;
       int i6;
       a$b a = p0.a;
       if (a == 1 || a == 8) {
          throw new IllegalArgumentException("should not dispatch add or move for pre layout");
       }
       int i = this.z(p0.b, a);
       a$b b = p0.b;
       a$b a1 = p0.a;
       if (a1 != 2) {
          if (a1 == 4) {
             i1 = 1;
          }else {
             throw new IllegalArgumentException("op should be remove or update."+p0);
          }
       }else {
          i1 = 0;
       }
       int i2 = 1;
       int i3 = 1;
       while (i2 < p0.d) {
          int i4 = i1 * i2;
          int i5 = p0.b + i4;
          i5 = this.z(i5, p0.a);
          a$b a2 = p0.a;
          if (a2 != 2) {
             if (a2 == 4) {
                i6 = i + 1;
                if (i5 == i6) {
                label_0053 :
                   i6 = 1;
                label_0056 :
                   if (i6) {
                      i3 = i3 + 1;
                   }else {
                      a = this.b(a2, i, i3, p0.c);
                      this.l(a, b);
                      this.a(a);
                      if (p0.a == 4) {
                         b = b + i3;
                      }
                      i = i5;
                      i3 = 1;
                   }
                   i2 = i2 + 1;
                }
             }
          }else if(i5 == i){
             goto label_0053 ;
          }
          i6 = 0;
          goto label_0056 ;
       }
       a$b c = p0.c;
       this.a(p0);
       if (i3 > 0) {
          p0 = this.b(p0.a, i, i3, c);
          this.l(p0, b);
          this.a(p0);
       }
       return;
    }
    public void l(a$b p0,int p1){
       this.d.b(p0);
       a$b a = p0.a;
       if (a != 2) {
          if (a == 4) {
             this.d.e(p1, p0.d, p0.c);
          }else {
             throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
          }
       }else {
          this.d.d(p1, p0.d);
       }
       return;
    }
    public int m(int p0){
       return this.n(p0, 0);
    }
    public int n(int p0,int p1){
       int i = this.c.size();
       while (true) {
          if (p1 >= i) {
             return p0;
          }
          a$b uob = this.c.get(p1);
          a$b a = uob.a;
          if (a == 8) {
             a = uob.b;
             if (a == p0) {
                a$b d = uob.d;
             }else if(a < p0){
                p0--;
             }
             if (uob.d <= p0) {
                p0++;
             }
          }else {
             a$b b = uob.b;
             if (b <= p0) {
                if (a == 2) {
                   uob = uob.d;
                   int i1 = b + uob;
                   if (p0 < i1) {
                      break ;
                   }else {
                      p0 = p0 - uob;
                   }
                }else if(a == 1){
                   p0 = p0 + uob.d;
                }
             }
          }
          p1++;
       }
       return -1;
    }
    public boolean o(int p0){
       boolean b = (p0 & this.h)? true: false;
       return b;
    }
    public boolean p(){
       boolean b = (this.b.size() > 0)? true: false;
       return b;
    }
    public boolean q(){
       boolean b = (!this.c.isEmpty() && !this.b.isEmpty())? true: false;
       return b;
    }
    public boolean r(int p0,int p1,Object p2){
       boolean b = false;
       if (p1 < 1) {
          return b;
       }
       this.b.add(this.b(4, p0, p1, p2));
       this.h = this.h | 4;
       if (this.b.size() == 1) {
          b = true;
       }
       return b;
    }
    public boolean s(int p0,int p1){
       boolean b = false;
       if (p1 < 1) {
          return b;
       }
       this.b.add(this.b(1, p0, p1, null));
       this.h = this.h | 1;
       if (this.b.size() == 1) {
          b = true;
       }
       return b;
    }
    public boolean t(int p0,int p1,int p2){
       boolean b = false;
       if (p0 == p1) {
          return b;
       }
       if (p2 != 1) {
          throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
       }
       this.b.add(this.b(8, p0, p1, null));
       this.h = this.h | 8;
       if (this.b.size() == 1) {
          b = true;
       }
       return b;
    }
    public boolean u(int p0,int p1){
       boolean b = false;
       if (p1 < 1) {
          return b;
       }
       this.b.add(this.b(2, p0, p1, null));
       this.h = this.h | 2;
       if (this.b.size() == 1) {
          b = true;
       }
       return b;
    }
    public final void v(a$b p0){
       this.c.add(p0);
       a$b a = p0.a;
       if (a != 1) {
          if (a != 2) {
             if (a != 4) {
                if (a == 8) {
                   this.d.a(p0.b, p0.d);
                }else {
                   throw new IllegalArgumentException("Unknown update op type for "+p0);
                }
             }else {
                this.d.e(p0.b, p0.d, p0.c);
             }
          }else {
             this.d.h(p0.b, p0.d);
          }
       }else {
          this.d.g(p0.b, p0.d);
       }
       return;
    }
    public void w(){
       this.g.b(this.b);
       int i = this.b.size();
       int i1 = 0;
       while (i1 < i) {
          a$b uob = this.b.get(i1);
          a$b a = uob.a;
          if (a != 1) {
             if (a != 2) {
                if (a != 4) {
                   if (a == 8) {
                      this.d(uob);
                   }
                }else {
                   this.g(uob);
                }
             }else {
                this.f(uob);
             }
          }else {
             this.c(uob);
          }
          a te = this.e;
          if (te != null) {
             te.run();
          }
          i1 = i1 + 1;
       }
       this.b.clear();
       return;
    }
    public void x(List p0){
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.a(p0.get(i1));
       }
       p0.clear();
       return;
    }
    public void y(){
       this.x(this.b);
       this.x(this.c);
       this.h = 0;
    }
    public final int z(int p0,int p1){
       a$b uob2;
       a$b uob3;
       int i2;
       int i3;
       int i = 1;
       int i1 = this.c.size() - i;
       a$b uob = 8;
       while (i1 >= 0) {
          a$b uob1 = this.c.get(i1);
          a$b a = uob1.a;
          if (a == uob) {
             uob = uob1.b;
             a = uob1.d;
             if (uob < a) {
                uob2 = uob;
                uob3 = a;
             }else {
                uob3 = uob;
                uob2 = a;
             }
             if (p0 >= uob2 && p0 <= uob3) {
                if (uob2 == uob) {
                   if (p1 == i) {
                      i2 = a + 1;
                      uob1.d = i2;
                   }else if(p1 == 2){
                      i2 = a - 1;
                      uob1.d = i2;
                   }
                   p0++;
                }else if(p1 == i){
                   i3 = uob + 1;
                   uob1.b = i3;
                }else if(p1 == 2){
                   i3 = uob - 1;
                   uob1.b = i3;
                }
                p0--;
             }else if(p0 < uob){
                if (p1 == i) {
                   i3 = uob + 1;
                   uob1.b = i3;
                   i2 = a + 1;
                   uob1.d = i2;
                }else if(p1 == 2){
                   i3 = uob - 1;
                   uob1.b = i3;
                   i2 = a - 1;
                   uob1.d = i2;
                }
             }
          }else {
             uob = uob1.b;
             if (uob <= p0) {
                if (a == i) {
                   p0 = p0 - uob1.d;
                }else if(a == 2){
                   p0 = p0 + uob1.d;
                }
             }else if(p1 == i){
                i3 = uob + 1;
                uob1.b = i3;
             }else if(p1 == 2){
                i3 = uob - 1;
                uob1.b = i3;
             }
          }
          i1 = i1 - 1;
       }
       p1 = this.c.size() - i;
       while (p1 >= 0) {
          a$b uob4 = this.c.get(p1);
          if (uob4.a == uob) {
             a$b d = uob4.d;
             if (d == uob4.b || d < null) {
                this.c.remove(p1);
                this.a(uob4);
             }
          }else if(uob4.d <= null){
             this.c.remove(p1);
             this.a(uob4);
          }
          p1--;
       }
       return p0;
    }
}
