package androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h$b;
import java.util.List;
import java.lang.Object;
import java.util.Arrays;
import java.util.Collection;
import androidx.recyclerview.widget.h$g;
import java.util.Iterator;
import androidx.recyclerview.widget.h$d;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.b;
import u2.f;
import u2.a;
import java.util.ArrayDeque;

public class h$e	// class@00090d
{
    public final List a;
    public final int[] b;
    public final int[] c;
    public final h$b d;
    public final int e;
    public final int f;
    public final boolean g;

    public void h$e(h$b p0,List p1,int[] p2,int[] p3,boolean p4){
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       Arrays.fill(p2, 0);
       Arrays.fill(p3, 0);
       this.d = p0;
       this.e = p0.e();
       this.f = p0.d();
       this.g = p4;
       this.a();
       this.g();
    }
    public static h$g i(Collection p0,int p1,boolean p2){
       h$g og;
       int i;
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             og = iterator.next();
             if (og.a == p1 && og.c == p2) {
                iterator.remove();
             }
          }else {
             og = null;
          }
          while (iterator.hasNext()) {
             h$g og1 = iterator.next();
             if (p2) {
                i = og1.b - 1;
                og1.b = i;
             }else {
                i = og1.b + 1;
                og1.b = i;
                continue ;
             }
          }
          return og;
       }
    }
    public final void a(){
       h$d uod = (this.a.isEmpty())? null: this.a.get(0);
       if (uod != null && (uod.a != null || uod.b != null)) {
          this.a.add(0, new h$d(0, 0, 0));
       }
       this.a.add(new h$d(this.e, this.f, 0));
       return;
    }
    public int b(int p0){
       if (p0 < 0 || p0 >= this.f) {
          throw new IndexOutOfBoundsException("Index out of bounds - passed position = "+p0+", new list size = "+this.f);
       }
       p0 = this.c[p0];
       if (!(p0 & 0x0f)) {
          return -1;
       }
       return (p0 >> 4);
    }
    public int c(int p0){
       if (p0 < 0 || p0 >= this.e) {
          throw new IndexOutOfBoundsException("Index out of bounds - passed position = "+p0+", old list size = "+this.e);
       }
       p0 = this.b[p0];
       if (!(p0 & 0x0f)) {
          return -1;
       }
       return (p0 >> 4);
    }
    public void d(RecyclerView$Adapter p0){
       this.e(new b(p0));
    }
    public void e(f p0){
       int i3;
       int i4;
       h$d a;
       if (p0 instanceof a) {
       }else {
          a uoa = new a(p0);
       }
       h$e te = this.e;
       ArrayDeque uArrayDeque = new ArrayDeque();
       h$e te1 = this.e;
       h$e tf = this.f;
       for (int i = this.a.size() - 1; i >= 0; i = i - 1) {
          h$d uod = this.a.get(i);
          int i1 = uod.a();
          int i2 = uod.b();
          int b = false;
          while (te1 > i1) {
             te1 = te1 - 1;
             i3 = this.b[te1];
             i4 = i3 & 0x0c;
             if (i4) {
                i4 = i3 >> 4;
                h$g og = h$e.i(uArrayDeque, i4, b);
                if (og != null) {
                   b = te - og.b;
                   b = b - 1;
                   p0.d(te1, b);
                   i3 = i3 & 0x04;
                   if (i3) {
                      p0.b(b, 1, this.d.c(te1, i4));
                   }
                }else {
                   i3 = te - te1;
                   i3 = i3 - 1;
                   uArrayDeque.add(new h$g(te1, i3, 1));
                }
             }else {
                p0.a(te1, 1);
                te = te - 1;
             }
          }
          while (tf > i2) {
             tf = tf - 1;
             i1 = this.c[tf];
             i3 = i1 & 0x0c;
             if (i3) {
                i3 = i1 >> 4;
                h$g og1 = h$e.i(uArrayDeque, i3, 1);
                if (og1 == null) {
                   i3 = te - te1;
                   uArrayDeque.add(new h$g(tf, i3, b));
                }else {
                   i4 = te - og1.b;
                   i4 = i4 - 1;
                   p0.d(i4, te1);
                   i1 = i1 & 0x04;
                   if (i1) {
                      p0.b(te1, 1, this.d.c(i3, tf));
                   }
                }
             }else {
                p0.c(te1, 1);
                te = te + 1;
             }
          }
          a = uod.a;
          h$d b1 = uod.b;
          for (; b < uod.c; b = b + 1) {
             i1 = this.b[a] & 0x0f;
             if (i1 == 2) {
                p0.b(a, 1, this.d.c(a, b1));
             }
             a = a + 1;
             b1 = b1 + 1;
          }
          a = uod.a;
          b1 = uod.b;
       }
       p0.e();
       return;
    }
    public final void f(int p0){
       int i = this.a.size();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i1 >= i) {
             return;
          }
          h$d uod = this.a.get(i1);
          while (true) {
             if (i2 < uod.b) {
                if (!this.c[i2] && this.d.b(p0, i2)) {
                   i = (this.d.a(p0, i2))? 8: 4;
                   break ;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                i2 = uod.b();
                i1 = i1 + 1;
             }
          }
          this.b[p0] = (i2 << 4) | i;
          this.c[i2] = (p0 << 4) | i;
          return;
       }
    }
    public final void g(){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          h$d uod = iterator.next();
          for (int i = 0; i < uod.c; i = i + 1) {
             int i1 = uod.a + i;
             int i2 = uod.b + i;
             int i3 = (this.d.a(i1, i2))? 1: 2;
             int i4 = i2 << 4;
             i4 = i4 | i3;
             this.b[i1] = i4;
             i1 = i1 << 4;
             i1 = i1 | i3;
             this.c[i2] = i1;
          }
       }
       if (this.g != null) {
          this.h();
       }
       return;
    }
    public final void h(){
       Iterator iterator = this.a.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          h$d uod = iterator.next();
          while (i < uod.a) {
             if (!this.b[i]) {
                this.f(i);
             }
             i = i + 1;
          }
          i = uod.a();
       }
       return;
    }
}
