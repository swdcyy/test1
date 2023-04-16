package gk.a;
import s0.c;
import java.lang.Math;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Path;
import android.graphics.Path$FillType;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Canvas;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class a extends c	// class@0020ba
{
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public float f;
    public Path g;
    public float h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public final int m;
    public final int n;
    public final int o;
    public boolean p;
    public float q;
    public boolean r;
    public static final double s;

    static {
       a.s = Math.cos(Math.toRadians(45.00f));
    }
    public void a(Context p0,Drawable p1,float p2,float p3,float p4){
       super(p1);
       this.l = true;
       this.p = true;
       this.r = false;
       this.m = ContextCompat.getColor(p0, 0x7f06095a);
       this.n = ContextCompat.getColor(p0, 0x7f060959);
       this.o = ContextCompat.getColor(p0, 0x7f060958);
       Paint paint = new Paint(5);
       this.c = paint;
       paint.setStyle(Paint$Style.FILL);
       this.f = (float)Math.round(p2);
       this.e = new RectF();
       Paint paint1 = new Paint(paint);
       this.d = paint1;
       paint1.setAntiAlias(false);
       this.l(p3, p4);
    }
    public static float e(float p0,float p1,boolean p2){
       if (p2) {
          p0 = (float)((double)p0 + ((0x3ff0000000000000 - a.s) * (double)p1));
       }
       return p0;
    }
    public static float f(float p0,float p1,boolean p2){
       float f = 0x3fc00000;
       if (p2) {
          return (float)((double)(p0 * f) + ((0x3ff0000000000000 - a.s) * (double)p1));
       }
       return (p0 * f);
    }
    public static int m(float p0){
       int i = Math.round(p0);
       if ((i % 2) == 1) {
          i--;
       }
       return i;
    }
    public final void c(Rect p0){
       a ti = this.i;
       float f = 0x3fc00000 * ti;
       this.e.set(((float)p0.left + ti), ((float)p0.top + f), ((float)p0.right - ti), ((float)p0.bottom - f));
       ti = this.e;
       this.a().setBounds((int)ti.left, (int)ti.top, (int)ti.right, (int)ti.bottom);
       this.d();
    }
    public final void d(){
       a uoa = this;
       a f = uoa.f;
       RectF rectF = new RectF((- f), (- f), f, f);
       RectF rectF1 = new RectF(rectF);
       a j = uoa.j;
       float f1 = - j;
       rectF1.inset(f1, (- j));
       j = uoa.g;
       if (j == null) {
          uoa.g = new Path();
       }else {
          j.reset();
       }
       uoa.g.setFillType(Path$FillType.EVEN_ODD);
       float f2 = 0;
       uoa.g.moveTo((- uoa.f), f2);
       uoa.g.rLineTo((- uoa.j), f2);
       uoa.g.arcTo(rectF1, 180.00f, 90.00f, false);
       uoa.g.arcTo(rectF, 270.00f, -90.00f, false);
       uoa.g.close();
       float f3 = - rectF1.top;
       int i = 2;
       if (f3 - f2 > 0) {
          float f4 = uoa.f / f3;
          int[] ointArray = new int[]{false,uoa.m,uoa.n,uoa.o};
          float[] uofloatArray = new float[]{f2,f4,((0x3f800000 - f4) / 2.00f) + f4,0x3f800000};
          RadialGradient radialGradie = v14;
          RadialGradient radialGradie1 = v14;
          radialGradie = new RadialGradient(0, 0, f3, ointArray, uofloatArray, Shader$TileMode.CLAMP);
          uoa.c.setShader(radialGradie1);
       }
       int[] ointArray1 = new int[]{uoa.m,uoa.n,uoa.o};
       LinearGradient linearGradie = new LinearGradient(0, rectF.top, 0, rectF1.top, ointArray1, new float[3]{0,0x3f000000,0x3f800000}, Shader$TileMode.CLAMP);
       uoa.d.setShader(f2);
       uoa.d.setAntiAlias(false);
       return;
    }
    public void draw(Canvas p0){
       if (this.l != null) {
          this.c(this.getBounds());
          this.l = false;
       }
       this.g(p0);
       super.draw(p0);
       return;
    }
    public final void g(Canvas p0){
       int i3;
       float f10;
       int i4;
       float f11;
       float f12;
       a uoa = this;
       Canvas uCanvas = p0;
       int i = p0.save();
       uCanvas.rotate(uoa.q, uoa.e.centerX(), uoa.e.centerY());
       a f = uoa.f;
       float f1 = (- f) - uoa.j;
       float f2 = f * 2.00f;
       float f3 = 0;
       a uoa1 = ((uoa.e.width() - f2) - f3 > 0)? 1: null;
       int i1 = ((uoa.e.height() - f2) - f3 > 0)? 1: 0;
       a k = uoa.k;
       float f4 = k - (0.25f * k);
       float f5 = k - (0x3f000000 * k);
       float f6 = 0x3f800000;
       float f7 = f / (f5 + f);
       float f8 = f / (f4 + f);
       float f9 = f / ((k - (k * f6)) + f);
       int i2 = p0.save();
       k = uoa.e;
       uCanvas.translate((k.left + f), (k.top + f));
       uCanvas.scale(f7, f8);
       uCanvas.drawPath(uoa.g, uoa.c);
       if (uoa1) {
          uCanvas.scale((f6 / f7), f6);
          i3 = i2;
          f10 = f9;
          i4 = i;
          f11 = f8;
          p0.drawRect(0, f1, (uoa.e.width() - f2), (- uoa.f), uoa.d);
       }else {
          i3 = i2;
          f10 = f9;
          i4 = i;
          f11 = f8;
       }
       uCanvas.restoreToCount(i3);
       i3 = p0.save();
       k = uoa.e;
       uCanvas.translate((k.right - f), (k.bottom - f));
       f8 = f10;
       uCanvas.scale(f7, f8);
       uCanvas.rotate(180.00f);
       uCanvas.drawPath(uoa.g, uoa.c);
       if (uoa1) {
          uCanvas.scale((0x3f800000 / f7), 0x3f800000);
          f12 = f11;
          f11 = f8;
          p0.drawRect(0, f1, (uoa.e.width() - f2), ((- uoa.f) + uoa.j), uoa.d);
       }else {
          f12 = f11;
          f11 = f8;
       }
       uCanvas.restoreToCount(i3);
       int i5 = p0.save();
       k = uoa.e;
       uCanvas.translate((k.left + f), (k.bottom - f));
       uCanvas.scale(f7, f11);
       uCanvas.rotate(270.00f);
       uCanvas.drawPath(uoa.g, uoa.c);
       if (i1) {
          uCanvas.scale((0x3f800000 / f11), 0x3f800000);
          p0.drawRect(0, f1, (uoa.e.height() - f2), (- uoa.f), uoa.d);
       }
       uCanvas.restoreToCount(i5);
       i = p0.save();
       k = uoa.e;
       uCanvas.translate((k.right - f), (k.top + f));
       float f13 = f12;
       uCanvas.scale(f7, f13);
       uCanvas.rotate(90.00f);
       uCanvas.drawPath(uoa.g, uoa.c);
       if (i1) {
          uCanvas.scale((0x3f800000 / f13), 0x3f800000);
          p0.drawRect(0, f1, (uoa.e.height() - f2), (- uoa.f), uoa.d);
       }
       uCanvas.restoreToCount(i);
       uCanvas.restoreToCount(i4);
       return;
    }
    public int getOpacity(){
       return -3;
    }
    public boolean getPadding(Rect p0){
       p0.set((int)Math.ceil((double)a.e(this.i, this.f, this.p)), (int)Math.ceil((double)a.f(this.i, this.f, this.p)), (int)Math.ceil((double)a.e(this.i, this.f, this.p)), (int)Math.ceil((double)a.f(this.i, this.f, this.p)));
       return true;
    }
    public float h(){
       return this.k;
    }
    public void i(boolean p0){
       this.p = p0;
       this.invalidateSelf();
    }
    public final void j(float p0){
       if (this.q - p0) {
          this.q = p0;
          this.invalidateSelf();
       }
       return;
    }
    public void k(float p0){
       this.l(p0, this.i);
    }
    public void l(float p0,float p1){
       int i = 0;
       if (p0 - i < 0 || p1 - i < 0) {
          throw new IllegalArgumentException("invalid shadow size");
       }
       p0 = (float)a.m(p0);
       p1 = (float)a.m(p1);
       if (p0 - p1 > 0) {
          if (this.r == null) {
             this.r = true;
          }
          p0 = p1;
       }
       if (!this.k - p0 && !this.i - p1) {
          return;
       }else {
          this.k = p0;
          this.i = p1;
          this.j = (float)Math.round((p0 * 0x3fc00000));
          this.h = p1;
          this.l = true;
          this.invalidateSelf();
          return;
       }
    }
    public void onBoundsChange(Rect p0){
       this.l = true;
    }
    public void setAlpha(int p0){
       super.setAlpha(p0);
       this.c.setAlpha(p0);
       this.d.setAlpha(p0);
    }
}
