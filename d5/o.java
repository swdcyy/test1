package d5.o;
import h5.l;
import java.lang.Object;
import android.graphics.Matrix;
import h5.e;
import d5.a;
import h5.m;
import h5.g;
import h5.b;
import d5.c;
import h5.d;
import com.airbnb.lottie.ex.model.layer.a;
import d5.a$a;
import n5.c;
import a5.j;
import d5.p;
import android.graphics.PointF;
import n5.d;
import java.lang.Float;
import java.lang.Integer;
import n5.a;
import java.util.List;
import java.util.Collections;
import java.lang.Math;

public class o	// class@001e0c
{
    public final Matrix a;
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public a f;
    public a g;
    public a h;
    public a i;
    public a j;
    public c k;
    public c l;
    public a m;
    public a n;

    public void o(l p0){
       super();
       this.a = new Matrix();
       a uoa = (p0.c() == null)? null: p0.c().a();
       this.f = uoa;
       uoa = (p0.f() == null)? null: p0.f().a();
       this.g = uoa;
       uoa = (p0.h() == null)? null: p0.h().a();
       this.h = uoa;
       uoa = (p0.g() == null)? null: p0.g().a();
       this.i = uoa;
       c uoc = (p0.i() == null)? null: p0.i().a();
       this.k = uoc;
       if (uoc != null) {
          this.b = new Matrix();
          this.c = new Matrix();
          this.d = new Matrix();
          float[] uofloatArray = new float[9];
          this.e = uofloatArray;
       }else {
          this.b = null;
          this.c = null;
          this.d = null;
          this.e = null;
       }
       uoc = (p0.j() == null)? null: p0.j().a();
       this.l = uoc;
       if (p0.e() != null) {
          this.j = p0.e().a();
       }
       this.m = (p0.k() != null)? p0.k().a(): null;
       this.n = (p0.d() != null)? p0.d().a(): null;
       return;
    }
    public void a(a p0){
       p0.d(this.j);
       p0.d(this.m);
       p0.d(this.n);
       p0.d(this.f);
       p0.d(this.g);
       p0.d(this.h);
       p0.d(this.i);
       p0.d(this.k);
       p0.d(this.l);
    }
    public void b(a$a p0){
       o tj = this.j;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.m;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.n;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.f;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.g;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.h;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.i;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.k;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.l;
       if (tj != null) {
          tj.a(p0);
       }
       return;
    }
    public boolean c(Object p0,c p1){
       o tm;
       if (p0 == j.e) {
          p0 = this.f;
          if (p0 == null) {
             this.f = new p(p1, new PointF());
          }else {
             p0.l(p1);
          }
       }else if(p0 == j.f){
          p0 = this.g;
          if (p0 == null) {
             this.g = new p(p1, new PointF());
          }else {
             p0.l(p1);
          }
       }else if(p0 == j.k){
          p0 = this.h;
          if (p0 == null) {
             this.h = new p(p1, new d());
          }else {
             p0.l(p1);
          }
       }else {
          float f = 0;
          if (p0 == j.l) {
             p0 = this.i;
             if (p0 == null) {
                this.i = new p(p1, Float.valueOf(f));
             }else {
                p0.l(p1);
             }
          }else if(p0 == j.c){
             p0 = this.j;
             if (p0 == null) {
                this.j = new p(p1, Integer.valueOf(100));
             }else {
                p0.l(p1);
             }
          }else if(p0 == j.y){
             tm = this.m;
             if (tm != null) {
                if (tm == null) {
                   this.m = new p(p1, Integer.valueOf(100));
                }else {
                   tm.l(p1);
                }
             }
          }
          if (p0 == j.z) {
             tm = this.n;
             if (tm != null) {
                if (tm == null) {
                   this.n = new p(p1, Integer.valueOf(100));
                }else {
                   tm.l(p1);
                }
             }
          }
          if (p0 == j.m) {
             tm = this.k;
             if (tm != null) {
                if (tm == null) {
                   this.k = new c(Collections.singletonList(new a(Float.valueOf(f))));
                }
                this.k.l(p1);
             }
          }
          if (p0 == j.n) {
             p0 = this.l;
             if (p0 != null) {
                if (p0 == null) {
                   this.l = new c(Collections.singletonList(new a(Float.valueOf(f))));
                }
                this.l.l(p1);
             }
          }
          return false;
       }
       return true;
    }
    public final void d(){
       for (int i = 0; i < 9; i = i + 1) {
          this.e[i] = 0;
       }
       return;
    }
    public Matrix e(){
       PointF pointF;
       PointF x;
       this.a.reset();
       o tg = this.g;
       o oo = null;
       if (tg != null) {
          pointF = tg.h();
          x = pointF.x;
          if (x - oo || pointF.y - oo) {
             this.a.preTranslate(x, pointF.y);
          }
       }
       tg = this.i;
       if (tg != null) {
          float f = (tg instanceof p)? tg.h().floatValue(): tg.m();
          if (f - oo) {
             this.a.preRotate(f);
          }
       }
       int i = 0x3f800000;
       if (this.k != null) {
          tg = this.l;
          float f1 = 90.00f;
          int i1 = (tg == null)? 0: (float)Math.cos(Math.toRadians((double)((- tg.m()) + f1)));
          o tl = this.l;
          int i2 = (tl == null)? 0x3f800000: (float)Math.sin(Math.toRadians((double)((- tl.m()) + f1)));
          this.d();
          o te = this.e;
          te[0] = i1;
          te[1] = i2;
          float f2 = - i2;
          te[3] = f2;
          te[4] = i1;
          te[8] = i;
          this.b.setValues(te);
          this.d();
          te = this.e;
          te[0] = i;
          te[3] = (float)Math.tan(Math.toRadians((double)this.k.m()));
          te[4] = i;
          te[8] = i;
          this.c.setValues(te);
          this.d();
          tl = this.e;
          tl[0] = i1;
          tl[1] = f2;
          tl[3] = i2;
          tl[4] = i1;
          tl[8] = i;
          this.d.setValues(tl);
          this.c.preConcat(this.b);
          this.d.preConcat(this.c);
          this.a.preConcat(this.d);
       }
       tg = this.h;
       if (tg != null) {
          d uod = tg.h();
          if (uod.a() - i || uod.b() - i) {
             this.a.preScale(uod.a(), uod.b());
          }
       }
       tg = this.f;
       if (tg != null) {
          pointF = tg.h();
          x = pointF.x;
          if (x - oo || pointF.y - oo) {
             this.a.preTranslate((- x), (- pointF.y));
          }
       }
       return this.a;
    }
    public Matrix f(float p0){
       o tg = this.g;
       PointF pointF = null;
       PointF pointF1 = (tg == null)? pointF: tg.h();
       o th = this.h;
       d uod = (th == null)? pointF: th.h();
       this.a.reset();
       if (pointF1 != null) {
          this.a.preTranslate((pointF1.x * p0), (pointF1.y * p0));
       }
       if (uod != null) {
          double d = (double)p0;
          this.a.preScale((float)Math.pow((double)uod.a(), d), (float)Math.pow((double)uod.b(), d));
       }
       tg = this.i;
       if (tg != null) {
          float f = tg.h().floatValue();
          th = this.f;
          if (th != null) {
             pointF = th.h();
          }
          th = this.a;
          f = f * p0;
          p0 = 0;
          float f1 = (pointF == null)? 0: pointF.x;
          if (pointF != null) {
             PointF y = pointF.y;
          }
          th.preRotate(f, f1, p0);
       }
       return this.a;
    }
    public a g(){
       return this.j;
    }
}
