package androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.r$a;
import java.lang.Object;
import java.util.List;
import androidx.recyclerview.widget.a$b;

public class r	// class@000931
{
    public final r$a a;

    public void r(r$a p0){
       super();
       this.a = p0;
    }
    public final int a(List p0){
       int i = p0.size() - 1;
       int i1 = 0;
       while (true) {
          if (i < 0) {
             return -1;
          }
          if (p0.get(i).a == 8) {
             if (i1) {
                break ;
             }
          }else {
             i1 = 1;
          }
          i = i - 1;
       }
       return i;
    }
    public void b(List p0){
       int i = this.a(p0);
       while (i != -1) {
          int i1 = i + 1;
          this.d(p0, i, i1);
       }
       return;
    }
    public final void c(List p0,int p1,a$b p2,int p3,a$b p4){
       a$b d = p2.d;
       a$b b = p4.b;
       int i = (d < b)? -1: 0;
       a$b b1 = p2.b;
       if (b1 < b) {
          i = i + 1;
       }
       if (b <= b1) {
          p2.b = b1 + p4.d;
       }
       b = p4.b;
       if (b <= d) {
          p2.d = d + p4.d;
       }
       p4.b = b + i;
       p0.set(p1, p4);
       p0.set(p3, p2);
       return;
    }
    public final void d(List p0,int p1,int p2){
       Object obj = p0.get(p1);
       Object obj1 = p0.get(p2);
       a$b a = obj1.a;
       if (a != 1) {
          if (a != 2) {
             if (a == 4) {
                this.f(p0, p1, obj, p2, obj1);
             }
          }else {
             this.e(p0, p1, obj, p2, obj1);
          }
       }else {
          this.c(p0, p1, obj, p2, obj1);
       }
       return;
    }
    public void e(List p0,int p1,a$b p2,int p3,a$b p4){
       int i2;
       a$b uob;
       a$b b = p2.b;
       a$b d = p2.d;
       int i = 0;
       int i1 = 1;
       if (b < d) {
          if (p4.b == b && p4.d == (d - b)) {
          label_0021 :
             i2 = i;
             i = 1;
          }else {
             i2 = null;
          }
       }else if(p4.b == (d + 1) && p4.d == (b - d)){
          i = 1;
          goto label_0021 ;
       }else {
          i2 = 1;
       }
       a$b b1 = p4.b;
       if (d < b1) {
          p4.b = b1 - i1;
       }else {
          uob = p4.d;
          if (d < (b1 + uob)) {
             p4.d = uob - i1;
             p2.a = 2;
             p2.d = i1;
             if (p4.d == null) {
                p0.remove(p3);
                this.a.a(p4);
             }
             return;
          }
       }
       d = p2.b;
       b1 = p4.b;
       uob = null;
       if (d <= b1) {
          p4.b = b1 + i1;
       }else {
          int i3 = b1 + p4.d;
          if (d < i3) {
             uob = this.a.b(2, (d + i1), (i3 - d), uob);
             p4.d = p2.b - p4.b;
          }
       }
       if (i) {
          p0.set(p1, p4);
          p0.remove(p3);
          this.a.a(p2);
          return;
       }else if(i2){
          if (uob != null) {
             b = p2.b;
             if (b > uob.b) {
                p2.b = b - uob.d;
             }
             b = p2.d;
             if (b > uob.b) {
                p2.d = b - uob.d;
             }
          }
          b = p2.b;
          if (b > p4.b) {
             p2.b = b - p4.d;
          }
          b = p2.d;
          if (b > p4.b) {
             p2.d = b - p4.d;
          }
       }else if(uob != null){
          b = p2.b;
          if (b >= uob.b) {
             p2.b = b - uob.d;
          }
          b = p2.d;
          if (b >= uob.b) {
             p2.d = b - uob.d;
          }
       }
       b = p2.b;
       if (b >= p4.b) {
          p2.b = b - p4.d;
       }
       b = p2.d;
       if (b >= p4.b) {
          p2.d = b - p4.d;
       }
       p0.set(p1, p4);
       if (p2.b != p2.d) {
          p0.set(p3, p2);
       }else {
          p0.remove(p3);
       }
       if (uob != null) {
          p0.add(p1, uob);
       }
       return;
    }
    public void f(List p0,int p1,a$b p2,int p3,a$b p4){
       a$b d = p2.d;
       a$b b = p4.b;
       a$b uob = null;
       int i = 1;
       if (d < b) {
          p4.b = b - i;
       }else {
          a$b b1 = p4.d;
          if (d < (b + b1)) {
             p4.d = b1 - i;
             d = this.a.b(4, p2.b, i, p4.c);
          label_0021 :
             b = p2.b;
             b1 = p4.b;
             if (b <= b1) {
                p4.b = b1 + i;
             }else {
                int i1 = b1 + p4.d;
                if (b < i1) {
                   i1 = i1 - b;
                   uob = this.a.b(4, (b + i), i1, p4.c);
                   p4.d = p4.d - i1;
                }
             }
             p0.set(p3, p2);
             if (p4.d > null) {
                p0.set(p1, p4);
             }else {
                p0.remove(p1);
                this.a.a(p4);
             }
             if (d != null) {
                p0.add(p1, d);
             }
             if (uob != null) {
                p0.add(p1, uob);
             }
             return;
          }
       }
       d = uob;
       goto label_0021 ;
    }
}
