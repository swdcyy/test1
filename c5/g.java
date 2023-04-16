package c5.g;
import c5.e;
import d5.a$a;
import c5.k;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import i5.h;
import java.lang.Object;
import android.graphics.Path;
import b5.a;
import java.util.ArrayList;
import h5.a;
import h5.d;
import android.graphics.Path$FillType;
import d5.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.lang.String;
import a5.d;
import d5.b;
import android.graphics.Paint;
import java.lang.Integer;
import m5.e;
import android.graphics.ColorFilter;
import java.util.List;
import c5.n;
import c5.c;
import android.graphics.RectF;
import n5.c;
import a5.j;
import d5.p;
import g5.d;

public class g implements e, a$a, k	// class@000cd1
{
    public final Path a;
    public final Paint b;
    public final a c;
    public final String d;
    public final boolean e;
    public final List f;
    public final a g;
    public final a h;
    public a i;
    public final f j;

    public void g(f p0,a p1,h p2){
       super();
       Path path = new Path();
       this.a = path;
       this.b = new a(1);
       this.f = new ArrayList();
       this.c = p1;
       this.d = p2.c;
       this.e = p2.f;
       this.j = p0;
       if (p2.b() == null || p2.c() == null) {
          this.g = null;
          this.h = null;
          return;
       }else {
          path.setFillType(p2.b);
          a uoa = p2.b().a();
          this.g = uoa;
          uoa.a(this);
          p1.d(uoa);
          uoa = p2.c().a();
          this.h = uoa;
          uoa.a(this);
          p1.d(uoa);
          return;
       }
    }
    public void a(Canvas p0,Matrix p1,int p2){
       if (this.e != null) {
          return;
       }
       d.a("FillContent#draw");
       this.b.setColor(this.g.m());
       int i = 0;
       this.b.setAlpha(e.c((int)(((((float)p2 / 0x437f0000) * (float)this.h.h().intValue()) / 100.00f) * 0x437f0000), i, 255));
       g ti = this.i;
       if (ti != null) {
          this.b.setColorFilter(ti.h());
       }
       this.a.reset();
       for (; i < this.f.size(); i = i + 1) {
          this.a.addPath(this.f.get(i).getPath(), p1);
       }
       p0.drawPath(this.a, this.b);
       d.b("FillContent#draw");
       return;
    }
    public void b(List p0,List p1){
       int i = 0;
       while (i < p1.size()) {
          c uoc = p1.get(i);
          if (uoc instanceof n) {
             this.f.add(uoc);
          }
          i++;
       }
       return;
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       this.a.reset();
       p2 = false;
       for (int i = 0; i < this.f.size(); i = i + 1) {
          this.a.addPath(this.f.get(i).getPath(), p1);
       }
       this.a.computeBounds(p0, p2);
       p0.set((p0.left - 0x3f800000), (p0.top - 0x3f800000), (p0.right + 0x3f800000), (p0.bottom + 0x3f800000));
       return;
    }
    public void e(){
       this.j.invalidateSelf();
    }
    public void f(Object p0,c p1){
       if (p0 == j.a) {
          this.g.l(p1);
       }else if(p0 == j.d){
          this.h.l(p1);
       }else if(p0 == j.B){
          if (p1 == null) {
             this.i = null;
          }else {
             p0 = new p(p1);
             this.i = p0;
             p0.a(this);
             this.c.d(this.i);
          }
       }
       return;
    }
    public void g(d p0,int p1,List p2,d p3){
       e.f(p0, p1, p2, p3, this);
    }
    public String getName(){
       return this.d;
    }
}
