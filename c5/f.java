package c5.f;
import c5.n;
import d5.a$a;
import c5.k;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import i5.a;
import java.lang.Object;
import android.graphics.Path;
import c5.b;
import d5.a;
import h5.f;
import h5.m;
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

public class f implements n, a$a, k	// class@000cd0
{
    public final Path a;
    public final String b;
    public final f c;
    public final a d;
    public final a e;
    public final a f;
    public b g;
    public boolean h;

    public void f(f p0,a p1,a p2){
       super();
       this.a = new Path();
       this.g = new b();
       this.b = p2.a;
       this.c = p0;
       a uoa = p2.c.a();
       this.d = uoa;
       a uoa1 = p2.b.a();
       this.e = uoa1;
       this.f = p2;
       p1.d(uoa);
       p1.d(uoa1);
       uoa.a(this);
       uoa1.a(this);
    }
    public void b(List p0,List p1){
       int i = 0;
       while (i < p0.size()) {
          c uoc = p0.get(i);
          if (uoc instanceof t && uoc.i() == ShapeTrimPath$Type.SIMULTANEOUSLY) {
             this.g.a(uoc);
             uoc.d(this);
          }
          i++;
       }
       return;
    }
    public void e(){
       this.h = false;
       this.c.invalidateSelf();
    }
    public void f(Object p0,c p1){
       if (p0 == j.g) {
          this.d.l(p1);
       }else if(p0 == j.j){
          this.e.l(p1);
       }
       return;
    }
    public void g(d p0,int p1,List p2,d p3){
       e.f(p0, p1, p2, p3, this);
    }
    public String getName(){
       return this.b;
    }
    public Path getPath(){
       float f8;
       f uof = this;
       if (uof.h != null) {
          return uof.a;
       }
       uof.a.reset();
       if (uof.f.e != null) {
          uof.h = true;
          return uof.a;
       }else {
          PointF pointF = uof.d.h();
          float f = pointF.x / 2.00f;
          float f1 = pointF.y / 2.00f;
          float f2 = f * 0x3f0d6239;
          float f3 = 0x3f0d6239 * f1;
          uof.a.reset();
          if (uof.f.d != null) {
             float f4 = - f1;
             uof.a.moveTo(0, f4);
             float f5 = 0 - f2;
             float f6 = - f;
             float f7 = 0 - f3;
             uof.a.cubicTo(f5, f4, f6, f7, f6, 0);
             f3 = f3 + 0;
             f8 = f4;
             uof.a.cubicTo(f6, f3, f5, f1, 0, f1);
             f2 = f2 + 0;
             uof.a.cubicTo(f2, f1, f, f3, f, 0);
             uof.a.cubicTo(f, f7, f2, f8, 0, f8);
          }else {
             float f9 = - f1;
             uof.a.moveTo(0, f9);
             f8 = f2 + 0;
             float f10 = 0 - f3;
             uof.a.cubicTo(f8, f9, f, f10, f, 0);
             f3 = f3 + 0;
             uof.a.cubicTo(f, f3, f8, f1, 0, f1);
             float f11 = 0 - f2;
             f = - f;
             uof.a.cubicTo(f11, f1, f, f3, f, 0);
             f1 = f9;
             uof.a.cubicTo(f, f10, f11, f1, 0, f1);
          }
          pointF = uof.e.h();
          uof.a.offset(pointF.x, pointF.y);
          uof.a.close();
          uof.g.b(uof.a);
          uof.h = true;
          return uof.a;
       }
    }
}
