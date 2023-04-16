package c5.p;
import d5.a$a;
import c5.k;
import c5.n;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import i5.e;
import java.lang.Object;
import android.graphics.Path;
import android.graphics.RectF;
import c5.b;
import d5.a;
import h5.m;
import h5.f;
import h5.b;
import java.util.List;
import c5.c;
import c5.t;
import com.airbnb.lottie.ex.model.content.ShapeTrimPath$Type;
import n5.c;
import a5.j;
import g5.d;
import m5.e;
import java.lang.String;
import android.graphics.PointF;
import d5.c;
import java.lang.Math;

public class p implements a$a, k, n	// class@000cdc
{
    public final Path a;
    public final RectF b;
    public final String c;
    public final boolean d;
    public final f e;
    public final a f;
    public final a g;
    public final a h;
    public b i;
    public boolean j;

    public void p(f p0,a p1,e p2){
       super();
       this.a = new Path();
       this.b = new RectF();
       this.i = new b();
       this.c = p2.a;
       this.d = p2.e;
       this.e = p0;
       a uoa = p2.b.a();
       this.f = uoa;
       a uoa1 = p2.c.a();
       this.g = uoa1;
       a uoa2 = p2.d.a();
       this.h = uoa2;
       p1.d(uoa);
       p1.d(uoa1);
       p1.d(uoa2);
       uoa.a(this);
       uoa1.a(this);
       uoa2.a(this);
    }
    public void b(List p0,List p1){
       int i = 0;
       while (i < p0.size()) {
          c uoc = p0.get(i);
          if (uoc instanceof t && uoc.i() == ShapeTrimPath$Type.SIMULTANEOUSLY) {
             this.i.a(uoc);
             uoc.d(this);
          }
          i++;
       }
       return;
    }
    public void e(){
       this.j = false;
       this.e.invalidateSelf();
    }
    public void f(Object p0,c p1){
       if (p0 == j.h) {
          this.g.l(p1);
       }else if(p0 == j.j){
          this.f.l(p1);
       }else if(p0 == j.i){
          this.h.l(p1);
       }
       return;
    }
    public void g(d p0,int p1,List p2,d p3){
       e.f(p0, p1, p2, p3, this);
    }
    public String getName(){
       return this.c;
    }
    public Path getPath(){
       float f6;
       PointF x1;
       float f8;
       PointF y1;
       float f9;
       p op = this;
       if (op.j != null) {
          return op.a;
       }
       op.a.reset();
       if (op.d != null) {
          op.j = true;
          return op.a;
       }else {
          PointF pointF = op.g.h();
          float f = 2.00f;
          float f1 = pointF.x / f;
          float f2 = pointF.y / f;
          p h = op.h;
          float f3 = 0;
          float f4 = (h == null)? 0: h.m();
          float f5 = Math.min(f1, f2);
          if (f4 - f5 > 0) {
             f4 = f5;
          }
          PointF pointF1 = op.f.h();
          op.a.moveTo((pointF1.x + f1), ((pointF1.y - f2) + f4));
          op.a.lineTo((pointF1.x + f1), ((pointF1.y + f2) - f4));
          if ((v10 = f4 - f3) > 0) {
             PointF x = pointF1.x;
             f6 = f4 * f;
             float f7 = (x + f1) - f6;
             PointF y = pointF1.y;
             op.b.set(f7, ((y + f2) - f6), (x + f1), (y + f2));
             op.a.arcTo(op.b, f3, 90.00f, false);
          }
          op.a.lineTo(((pointF1.x - f1) + f4), (pointF1.y + f2));
          if (v10 > 0) {
             x1 = pointF1.x;
             f8 = x1 - f1;
             y1 = pointF1.y;
             f9 = f4 * f;
             op.b.set(f8, ((y1 + f2) - f9), ((x1 - f1) + f9), (y1 + f2));
             op.a.arcTo(op.b, 90.00f, 90.00f, false);
          }
          op.a.lineTo((pointF1.x - f1), ((pointF1.y - f2) + f4));
          if (v10 > 0) {
             x1 = pointF1.x;
             f8 = x1 - f1;
             y1 = pointF1.y;
             f6 = y1 - f2;
             f9 = f4 * f;
             op.b.set(f8, f6, ((x1 - f1) + f9), ((y1 - f2) + f9));
             op.a.arcTo(op.b, 180.00f, 90.00f, false);
          }
          op.a.lineTo(((pointF1.x + f1) - f4), (pointF1.y - f2));
          if (v10 > 0) {
             PointF x2 = pointF1.x;
             f4 = f4 * f;
             PointF y2 = pointF1.y;
             f5 = y2 - f2;
             op.b.set(((x2 + f1) - f4), f5, (x2 + f1), ((y2 - f2) + f4));
             op.a.arcTo(op.b, 270.00f, 90.00f, false);
          }
          op.a.close();
          op.i.b(op.a);
          op.j = true;
          return op.a;
       }
    }
}
