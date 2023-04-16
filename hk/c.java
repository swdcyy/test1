package hk.c;
import q1.d;
import android.graphics.drawable.Drawable;
import hk.e;
import android.graphics.Paint;
import android.graphics.Matrix;
import hk.d;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Region;
import android.graphics.Paint$Style;
import android.graphics.PorterDuff$Mode;
import java.lang.Math;
import hk.b;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import hk.a;
import android.graphics.Rect;
import android.graphics.Region$Op;
import android.content.res.ColorStateList;
import java.lang.Object;
import java.util.Objects;
import android.graphics.PorterDuffColorFilter;

public class c extends Drawable implements d	// class@002138
{
    public ColorStateList A;
    public final Paint b;
    public final Matrix[] c;
    public final Matrix[] d;
    public final d[] e;
    public final Matrix f;
    public final Path g;
    public final PointF h;
    public final d i;
    public final Region j;
    public final Region k;
    public final float[] l;
    public final float[] m;
    public e n;
    public boolean o;
    public boolean p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;
    public float v;
    public float w;
    public Paint$Style x;
    public PorterDuffColorFilter y;
    public PorterDuff$Mode z;

    public void c(){
       super(null);
    }
    public void c(e p0){
       super();
       this.b = new Paint();
       Matrix[] matrixArray = new Matrix[4];
       this.c = matrixArray;
       matrixArray = new Matrix[4];
       this.d = matrixArray;
       d[] uodArray = new d[4];
       this.e = uodArray;
       this.f = new Matrix();
       this.g = new Path();
       this.h = new PointF();
       this.i = new d();
       this.j = new Region();
       this.k = new Region();
       float[] uofloatArray = new float[2];
       this.l = uofloatArray;
       float[] uofloatArray1 = new float[2];
       this.m = uofloatArray1;
       e uoe = null;
       this.n = uoe;
       boolean b = false;
       this.o = b;
       this.p = b;
       this.q = 0x3f800000;
       this.r = 0xff000000;
       this.s = 5;
       this.t = 10;
       this.u = 255;
       this.v = 0x3f800000;
       this.w = 0;
       this.x = Paint$Style.FILL_AND_STROKE;
       this.z = PorterDuff$Mode.SRC_IN;
       this.A = uoe;
       this.n = p0;
       for (; b < 4; b = b + 1) {
          p0[b] = new Matrix();
          p0[b] = new Matrix();
          p0[b] = new d();
       }
       return;
    }
    public static int l(int p0,int p1){
       return ((p0 * (p1 + (p1 >> 7))) >> 8);
    }
    public final float a(int p0,int p1,int p2){
       this.e((((p0 - 1) + 4) % 4), p1, p2, this.h);
       c th = this.h;
       this.e(((p0 + 1) % 4), p1, p2, th);
       th = this.h;
       this.e(p0, p1, p2, th);
       c th1 = this.h;
       PointF x = th1.x;
       PointF y = th1.y;
       float f = th.x - x;
       float f1 = th.y - y;
       float f2 = (float)Math.atan2((double)(th.y - y), (double)(th.x - x)) - (float)Math.atan2((double)f1, (double)f);
       if (f2 < 0) {
          f2 = (float)((double)f2 + 0x401921fb54442d18);
       }
       return f2;
    }
    public final float b(int p0,int p1,int p2){
       this.e(p0, p1, p2, this.h);
       c th = this.h;
       this.e(((p0 + 1) % 4), p1, p2, th);
       th = this.h;
       return (float)Math.atan2((double)(th.y - th.y), (double)(th.x - th.x));
    }
    public final void c(int p0,Path p1){
       c tl = this.l;
       c te = this.e;
       tl[0] = te[p0].a;
       tl[1] = te[p0].b;
       this.c[p0].mapPoints(tl);
       if (!p0) {
          tl = this.l;
          p1.moveTo(tl[0], tl[1]);
       }else {
          tl = this.l;
          p1.lineTo(tl[0], tl[1]);
       }
       this.e[p0].b(this.c[p0], p1);
       return;
    }
    public final void d(int p0,Path p1){
       int i = (p0 + 1) % 4;
       c tl = this.l;
       c te = this.e;
       tl[0] = te[p0].c;
       tl[1] = te[p0].d;
       this.c[p0].mapPoints(tl);
       tl = this.m;
       te = this.e;
       tl[0] = te[i].a;
       tl[1] = te[i].b;
       this.c[i].mapPoints(tl);
       c tl1 = this.l;
       te = this.m;
       this.i.d(0, 0);
       this.g(p0).a((float)Math.hypot((double)(tl1[0] - te[0]), (double)(tl1[1] - te[1])), this.q, this.i);
       this.i.b(this.d[p0], p1);
    }
    public void draw(Canvas p0){
       this.b.setColorFilter(this.y);
       int alpha = this.b.getAlpha();
       this.b.setAlpha(c.l(alpha, this.u));
       this.b.setStrokeWidth(this.w);
       this.b.setStyle(this.x);
       c ts = this.s;
       if (ts > null && this.o != null) {
          this.b.setShadowLayer((float)this.t, 0, (float)ts, this.r);
       }
       if (this.n != null) {
          this.i(p0.getWidth(), p0.getHeight(), this.g);
          p0.drawPath(this.g, this.b);
       }else {
          p0.drawRect(0, 0, (float)p0.getWidth(), (float)p0.getHeight(), this.b);
       }
       this.b.setAlpha(alpha);
       return;
    }
    public final void e(int p0,int p1,int p2,PointF p3){
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                p3.set(0, 0);
             }else {
                p3.set(0, (float)p2);
             }
          }else {
             p3.set((float)p1, (float)p2);
          }
       }else {
          p3.set((float)p1, 0);
       }
       return;
    }
    public final a f(int p0){
       if (p0 == 1) {
          return this.n.h();
       }
       if (p0 == 2) {
          return this.n.c();
       }
       if (p0 != 3) {
          return this.n.g();
       }
       return this.n.b();
    }
    public final b g(int p0){
       if (p0 == 1) {
          return this.n.e();
       }
       if (p0 == 2) {
          return this.n.a();
       }
       if (p0 != 3) {
          return this.n.f();
       }
       return this.n.d();
    }
    public int getOpacity(){
       return -3;
    }
    public Region getTransparentRegion(){
       Rect bounds = this.getBounds();
       this.j.set(bounds);
       int i = bounds.width();
       this.i(i, bounds.height(), this.g);
       this.k.setPath(this.g, this.j);
       this.j.op(this.k, Region$Op.DIFFERENCE);
       return this.j;
    }
    public float h(){
       return this.q;
    }
    public final void i(int p0,int p1,Path p2){
       this.j(p0, p1, p2);
       if (!this.v - 0x3f800000) {
          return;
       }
       this.f.reset();
       this.f.setScale(this.v, this.v, (float)(p0 / 2), (float)(p1 / 2));
       p2.transform(this.f);
       return;
    }
    public void j(int p0,int p1,Path p2){
       p2.rewind();
       if (this.n == null) {
          return;
       }
       int i = 0;
       for (int i1 = 0; i1 < 4; i1 = i1 + 1) {
          this.m(i1, p0, p1);
          this.n(i1, p0, p1);
       }
       for (; i < 4; i = i + 1) {
          this.c(i, p2);
          this.d(i, p2);
       }
       p2.close();
       return;
    }
    public ColorStateList k(){
       return this.A;
    }
    public final void m(int p0,int p1,int p2){
       this.e(p0, p1, p2, this.h);
       this.a(p0, p1, p2);
       Objects.requireNonNull(this.f(p0));
       this.c[p0].reset();
       c th = this.h;
       this.c[p0].setTranslate(th.x, th.y);
       this.c[p0].preRotate((float)Math.toDegrees((double)(this.b((((p0 - 1) + 4) % 4), p1, p2) + 0x3fc90fdb)));
    }
    public final void n(int p0,int p1,int p2){
       c tl = this.l;
       c te = this.e;
       tl[0] = te[p0].c;
       tl[1] = te[p0].d;
       this.c[p0].mapPoints(tl);
       this.d[p0].reset();
       tl = this.l;
       this.d[p0].setTranslate(tl[0], tl[1]);
       this.d[p0].preRotate((float)Math.toDegrees((double)this.b(p0, p1, p2)));
    }
    public void o(float p0){
       this.q = p0;
       this.invalidateSelf();
    }
    public void p(Paint$Style p0){
       this.x = p0;
       this.invalidateSelf();
    }
    public void q(boolean p0){
       this.o = p0;
       this.invalidateSelf();
    }
    public final void r(){
       c tA = this.A;
       if (tA == null || this.z == null) {
          this.y = null;
          return;
       }else {
          int colorForStat = tA.getColorForState(this.getState(), 0);
          this.y = new PorterDuffColorFilter(colorForStat, this.z);
          if (this.p != null) {
             this.r = colorForStat;
          }
          return;
       }
    }
    public void setAlpha(int p0){
       this.u = p0;
       this.invalidateSelf();
    }
    public void setColorFilter(ColorFilter p0){
       this.b.setColorFilter(p0);
       this.invalidateSelf();
    }
    public void setTint(int p0){
       this.setTintList(ColorStateList.valueOf(p0));
    }
    public void setTintList(ColorStateList p0){
       this.A = p0;
       this.r();
       this.invalidateSelf();
    }
    public void setTintMode(PorterDuff$Mode p0){
       this.z = p0;
       this.r();
       this.invalidateSelf();
    }
}
