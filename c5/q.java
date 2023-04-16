package c5.q;
import c5.e;
import c5.n;
import c5.j;
import d5.a$a;
import c5.k;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import i5.f;
import java.lang.Object;
import android.graphics.Matrix;
import android.graphics.Path;
import d5.a;
import h5.b;
import d5.o;
import h5.l;
import android.graphics.Canvas;
import java.lang.Float;
import m5.e;
import c5.d;
import java.util.List;
import android.graphics.RectF;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;
import n5.c;
import a5.j;
import g5.d;

public class q implements e, n, j, a$a, k	// class@000cdd
{
    public final Matrix a;
    public final Path b;
    public final f c;
    public final a d;
    public final String e;
    public final boolean f;
    public final a g;
    public final a h;
    public final o i;
    public d j;

    public void q(f p0,a p1,f p2){
       super();
       this.a = new Matrix();
       this.b = new Path();
       this.c = p0;
       this.d = p1;
       this.e = p2.a;
       this.f = p2.e;
       a uoa = p2.b.a();
       this.g = uoa;
       p1.d(uoa);
       uoa.a(this);
       uoa = p2.c.a();
       this.h = uoa;
       p1.d(uoa);
       uoa.a(this);
       o oo = p2.d.b();
       this.i = oo;
       oo.a(p1);
       oo.b(this);
    }
    public void a(Canvas p0,Matrix p1,int p2){
       float f = this.g.h().floatValue();
       float f1 = this.h.h().floatValue();
       float f2 = this.i.m.h().floatValue() / 100.00f;
       float f3 = this.i.n.h().floatValue() / 100.00f;
       for (int i = (int)f - 1; i >= 0; i = i - 1) {
          this.a.set(p1);
          float f4 = (float)i;
          float f5 = f4 + f1;
          this.a.preConcat(this.i.f(f5));
          f4 = f4 / f;
          float f6 = (float)p2 * e.e(f2, f3, f4);
          this.j.a(p0, this.a, (int)f6);
       }
       return;
    }
    public void b(List p0,List p1){
       this.j.b(p0, p1);
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       this.j.c(p0, p1, p2);
    }
    public void d(ListIterator p0){
       if (this.j != null) {
          return;
       }
       do {
       } while (p0.hasPrevious() && p0.previous() != this);
       ArrayList uArrayList = new ArrayList();
       while (p0.hasPrevious()) {
          uArrayList.add(p0.previous());
          p0.remove();
       }
       Collections.reverse(uArrayList);
       d uod = new d(this.c, this.d, "Repeater", this.f, uArrayList, null);
       this.j = p0;
       return;
    }
    public void e(){
       this.c.invalidateSelf();
    }
    public void f(Object p0,c p1){
       if (this.i.c(p0, p1)) {
          return;
       }
       if (p0 == j.q) {
          this.g.l(p1);
       }else if(p0 == j.r){
          this.h.l(p1);
       }
       return;
    }
    public void g(d p0,int p1,List p2,d p3){
       e.f(p0, p1, p2, p3, this);
    }
    public String getName(){
       return this.e;
    }
    public Path getPath(){
       Path path = this.j.getPath();
       this.b.reset();
       float f = this.h.h().floatValue();
       for (int i = (int)this.g.h().floatValue() - 1; i >= 0; i = i - 1) {
          float f1 = (float)i + f;
          this.a.set(this.i.f(f1));
          this.b.addPath(path, this.a);
       }
       return this.b;
    }
}
