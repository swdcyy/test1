package c5.h;
import c5.e;
import d5.a$a;
import c5.k;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import i5.d;
import java.lang.Object;
import androidx.collection.LongSparseArray;
import android.graphics.Matrix;
import android.graphics.Path;
import b5.a;
import android.graphics.RectF;
import java.util.ArrayList;
import android.graphics.Path$FillType;
import a5.e;
import d5.a;
import h5.c;
import h5.d;
import h5.f;
import android.graphics.Canvas;
import java.lang.String;
import a5.d;
import java.util.List;
import c5.n;
import com.airbnb.lottie.ex.model.content.GradientType;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import i5.c;
import android.graphics.Shader$TileMode;
import android.graphics.RadialGradient;
import java.lang.Math;
import android.graphics.Shader;
import android.graphics.Paint;
import android.graphics.ColorFilter;
import java.lang.Integer;
import m5.e;
import c5.c;
import d5.p;
import n5.c;
import a5.j;
import g5.d;

public class h implements e, a$a, k	// class@000cd2
{
    public final String a;
    public final boolean b;
    public final a c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final Matrix f;
    public final Path g;
    public final Paint h;
    public final RectF i;
    public final List j;
    public final GradientType k;
    public final a l;
    public final a m;
    public final a n;
    public final a o;
    public a p;
    public p q;
    public final f r;
    public final int s;

    public void h(f p0,a p1,d p2){
       super();
       this.d = new LongSparseArray();
       this.e = new LongSparseArray();
       this.f = new Matrix();
       Path path = new Path();
       this.g = path;
       this.h = new a(1);
       this.i = new RectF();
       this.j = new ArrayList();
       this.c = p1;
       this.a = p2.g;
       this.b = p2.j;
       this.r = p0;
       this.k = p2.a;
       path.setFillType(p2.b);
       this.s = (int)(p0.g().d() / 32.00f);
       a uoa = p2.c.a();
       this.l = uoa;
       uoa.a(this);
       p1.d(uoa);
       uoa = p2.d.a();
       this.m = uoa;
       uoa.a(this);
       p1.d(uoa);
       uoa = p2.e.a();
       this.n = uoa;
       uoa.a(this);
       p1.d(uoa);
       uoa = p2.f.a();
       this.o = uoa;
       uoa.a(this);
       p1.d(uoa);
    }
    public void a(Canvas p0,Matrix p1,int p2){
       long l;
       LinearGradient linearGradie;
       PointF pointF;
       PointF pointF1;
       c uoc;
       h oh = this;
       Matrix matrix = p1;
       if (oh.b != null) {
          return;
       }
       d.a("GradientFillContent#draw");
       oh.g.reset();
       boolean b = false;
       for (int i = 0; i < oh.j.size(); i = i + 1) {
          oh.g.addPath(oh.j.get(i).getPath(), matrix);
       }
       oh.g.computeBounds(oh.i, b);
       if (oh.k == GradientType.LINEAR) {
          l = (long)this.h();
          linearGradie = oh.d.get(l);
          if (linearGradie == null) {
             pointF = oh.n.h();
             pointF1 = oh.o.h();
             uoc = oh.l.h();
             float[] uofloatArray = uoc.b();
             LinearGradient linearGradie1 = new LinearGradient(pointF.x, pointF.y, pointF1.x, pointF1.y, oh.d(uoc.a()), uofloatArray, Shader$TileMode.CLAMP);
             oh.d.put(l, uoc);
             linearGradie = uoc;
          }
       }else {
          l = (long)this.h();
          linearGradie = oh.e.get(l);
          if (linearGradie == null) {
             pointF = oh.n.h();
             pointF1 = oh.o.h();
             uoc = oh.l.h();
             int[] ointArray = oh.d(uoc.a());
             float[] uofloatArray1 = uoc.b();
             PointF x = pointF.x;
             PointF y = pointF.y;
             float f = (float)Math.hypot((double)(pointF1.x - x), (double)(pointF1.y - y));
             float f1 = (f <= 0)? 0x3a83126f: f;
             RadialGradient radialGradie = new RadialGradient(x, y, f1, ointArray, uofloatArray1, Shader$TileMode.CLAMP);
             oh.e.put(l, f);
          }
       }
       oh.f.set(matrix);
       linearGradie.setLocalMatrix(oh.f);
       oh.h.setShader(linearGradie);
       h p = oh.p;
       if (p != null) {
          oh.h.setColorFilter(p.h());
       }
       oh.h.setAlpha(e.c((int)(((((float)p2 / 0x437f0000) * (float)oh.m.h().intValue()) / 100.00f) * 0x437f0000), b, 255));
       p0.drawPath(oh.g, oh.h);
       d.b("GradientFillContent#draw");
       return;
    }
    public void b(List p0,List p1){
       int i = 0;
       while (i < p1.size()) {
          c uoc = p1.get(i);
          if (uoc instanceof n) {
             this.j.add(uoc);
          }
          i++;
       }
       return;
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       this.g.reset();
       p2 = false;
       for (int i = 0; i < this.j.size(); i = i + 1) {
          this.g.addPath(this.j.get(i).getPath(), p1);
       }
       this.g.computeBounds(p0, p2);
       p0.set((p0.left - 0x3f800000), (p0.top - 0x3f800000), (p0.right + 0x3f800000), (p0.bottom + 0x3f800000));
       return;
    }
    public final int[] d(int[] p0){
       int i;
       h tq = this.q;
       if (tq != null) {
          Integer[] integerArray = tq.h();
          if (p0.length == integerArray.length) {
             for (i = 0; i < p0.length; i = i + 1) {
                p0[i] = integerArray[i].intValue();
             }
          }else {
             p0 = new int[integerArray.length];
             for (; i < integerArray.length; i = i + 1) {
                p0[i] = integerArray[i].intValue();
             }
          }
       }
       return p0;
    }
    public void e(){
       this.r.invalidateSelf();
    }
    public void f(Object p0,c p1){
       if (p0 == j.d) {
          this.m.l(p1);
       }else if(p0 == j.B){
          if (p1 == null) {
             this.p = null;
          }else {
             p0 = new p(p1);
             this.p = p0;
             p0.a(this);
             this.c.d(this.p);
          }
       }else if(p0 == j.C){
          if (p1 == null) {
             p0 = this.q;
             if (p0 != null) {
                this.c.p(p0);
             }
             this.q = null;
          }else {
             p0 = new p(p1);
             this.q = p0;
             p0.a(this);
             this.c.d(this.q);
          }
       }
       return;
    }
    public void g(d p0,int p1,List p2,d p3){
       e.f(p0, p1, p2, p3, this);
    }
    public String getName(){
       return this.a;
    }
    public final int h(){
       int i = Math.round((this.n.f() * (float)this.s));
       int i1 = Math.round((this.o.f() * (float)this.s));
       int i2 = Math.round((this.l.f() * (float)this.s));
       int i3 = (i)? 527 * i: 17;
       if (i1) {
          i3 = (i3 * 31) * i1;
       }
       if (i2) {
          i3 = (i3 * 31) * i2;
       }
       return i3;
    }
}
