package c5.i;
import c5.a;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import com.airbnb.lottie.ex.model.content.a;
import android.graphics.Paint$Cap;
import com.airbnb.lottie.ex.model.content.ShapeStroke$LineCapType;
import android.graphics.Paint$Join;
import com.airbnb.lottie.ex.model.content.ShapeStroke$LineJoinType;
import h5.d;
import h5.b;
import java.util.List;
import androidx.collection.LongSparseArray;
import android.graphics.RectF;
import a5.e;
import d5.a;
import h5.c;
import d5.a$a;
import h5.f;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.airbnb.lottie.ex.model.content.GradientType;
import java.lang.Object;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import i5.c;
import android.graphics.Shader$TileMode;
import android.graphics.RadialGradient;
import java.lang.Math;
import android.graphics.Shader;
import android.graphics.Paint;
import d5.p;
import java.lang.Integer;
import n5.c;
import a5.j;
import java.lang.String;

public class i extends a	// class@000cd3
{
    public final String o;
    public final boolean p;
    public final LongSparseArray q;
    public final LongSparseArray r;
    public final RectF s;
    public final GradientType t;
    public final int u;
    public final a v;
    public final a w;
    public final a x;
    public p y;

    public void i(f p0,a p1,a p2){
       super(p0, p1, p2.h.toPaintCap(), p2.i.toPaintJoin(), p2.j, p2.d, p2.g, p2.k, p2.l);
       this.q = new LongSparseArray();
       this.r = new LongSparseArray();
       this.s = new RectF();
       this.o = p2.a;
       this.t = p2.b;
       this.p = p2.m;
       this.u = (int)(p0.g().d() / 32.00f);
       a uoa = p2.c.a();
       this.v = uoa;
       uoa.a(this);
       p1.d(uoa);
       uoa = p2.e.a();
       this.w = uoa;
       uoa.a(this);
       p1.d(uoa);
       uoa = p2.f.a();
       this.x = uoa;
       uoa.a(this);
       p1.d(uoa);
    }
    public void a(Canvas p0,Matrix p1,int p2){
       long l;
       LinearGradient linearGradie;
       PointF pointF;
       PointF pointF1;
       c uoc;
       i s;
       i s1;
       i s2;
       i oi = this;
       if (oi.p != null) {
          return;
       }
       oi.c(oi.s, p1, false);
       float f = 2.00f;
       if (oi.t == GradientType.LINEAR) {
          l = (long)this.h();
          linearGradie = oi.q.get(l);
          if (linearGradie == null) {
             pointF = oi.w.h();
             pointF1 = oi.x.h();
             uoc = oi.v.h();
             float[] uofloatArray = uoc.b();
             s = oi.s;
             s1 = oi.s;
             s1 = oi.s;
             s2 = oi.s;
             LinearGradient linearGradie1 = new LinearGradient((float)(int)((s.left + (s.width() / f)) + pointF.x), (float)(int)((s1.top + (s1.height() / f)) + pointF.y), (float)(int)((s1.left + (s1.width() / f)) + pointF1.x), (float)(int)((s2.top + (s2.height() / f)) + pointF1.y), oi.d(uoc.a()), uofloatArray, Shader$TileMode.CLAMP);
             oi.q.put(l, f);
             linearGradie = f;
          }
       }else {
          l = (long)this.h();
          linearGradie = oi.r.get(l);
          if (linearGradie == null) {
             pointF = oi.w.h();
             pointF1 = oi.x.h();
             uoc = oi.v.h();
             float[] uofloatArray1 = uoc.b();
             s = oi.s;
             int i = (int)((s.left + (s.width() / f)) + pointF.x);
             s1 = oi.s;
             int i1 = (int)((s1.top + (s1.height() / f)) + pointF.y);
             s1 = oi.s;
             s2 = oi.s;
             RadialGradient radialGradie = new RadialGradient((float)i, (float)i1, (float)Math.hypot((double)((int)((s1.left + (s1.width() / f)) + pointF1.x) - i), (double)((int)((s2.top + (s2.height() / f)) + pointF1.y) - i1)), oi.d(uoc.a()), uofloatArray1, Shader$TileMode.CLAMP);
             oi.r.put(l, pointF1);
             linearGradie = pointF1;
          }
       }
       oi.i.setShader(linearGradie);
       super.a(p0, p1, p2);
       return;
    }
    public final int[] d(int[] p0){
       int i;
       i ty = this.y;
       if (ty != null) {
          Integer[] integerArray = ty.h();
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
    public void f(Object p0,c p1){
       super.f(p0, p1);
       if (p0 == j.C) {
          if (p1 == null) {
             p0 = this.y;
             if (p0 != null) {
                this.f.p(p0);
             }
             this.y = null;
          }else {
             p0 = new p(p1);
             this.y = p0;
             p0.a(this);
             this.f.d(this.y);
          }
       }
       return;
    }
    public String getName(){
       return this.o;
    }
    public final int h(){
       int i = Math.round((this.w.f() * (float)this.u));
       int i1 = Math.round((this.x.f() * (float)this.u));
       int i2 = Math.round((this.v.f() * (float)this.u));
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
