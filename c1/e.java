package c1.e;
import android.graphics.drawable.Drawable;
import java.lang.Math;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Path$FillType;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint;
import android.graphics.LinearGradient;
import android.graphics.Canvas;
import c1.e$a;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;

public class e extends Drawable	// class@000cc1
{
    public final int a;
    public Paint b;
    public Paint c;
    public Paint d;
    public final RectF e;
    public float f;
    public Path g;
    public float h;
    public float i;
    public float j;
    public ColorStateList k;
    public boolean l;
    public final int m;
    public final int n;
    public boolean o;
    public boolean p;
    public static final double q;
    public static e$a r;

    static {
       e.q = Math.cos(Math.toRadians(45.00f));
    }
    public static float c(float p0,float p1,boolean p2){
       if (p2) {
          p0 = (float)((double)p0 + ((0x3ff0000000000000 - e.q) * (double)p1));
       }
       return p0;
    }
    public static float d(float p0,float p1,boolean p2){
       float f = 0x3fc00000;
       if (p2) {
          return (float)((double)(p0 * f) + ((0x3ff0000000000000 - e.q) * (double)p1));
       }
       return (p0 * f);
    }
    public final void a(Rect p0){
       e th = this.h;
       float f = 0x3fc00000 * th;
       this.e.set(((float)p0.left + th), ((float)p0.top + f), ((float)p0.right - th), ((float)p0.bottom - f));
       this.b();
    }
    public final void b(){
       e m;
       e m1;
       e uoe = this;
       e f = uoe.f;
       RectF rectF = new RectF((- f), (- f), f, f);
       RectF rectF1 = new RectF(rectF);
       e i = uoe.i;
       float f1 = - i;
       rectF1.inset(f1, (- i));
       i = uoe.g;
       if (i == null) {
          uoe.g = new Path();
       }else {
          i.reset();
       }
       uoe.g.setFillType(Path$FillType.EVEN_ODD);
       uoe.g.moveTo((- uoe.f), 0);
       uoe.g.rLineTo((- uoe.i), 0);
       uoe.g.arcTo(rectF1, 180.00f, 90.00f, false);
       uoe.g.arcTo(rectF, 270.00f, -90.00f, false);
       uoe.g.close();
       e f2 = uoe.f;
       int[] ointArray = new int[]{m,m,uoe.n};
       m = uoe.m;
       float[] uofloatArray = new float[]{0,f2 / (uoe.i + f2),0x3f800000};
       RadialGradient radialGradie = new RadialGradient(0, 0, (uoe.f + uoe.i), ointArray, uofloatArray, Shader$TileMode.CLAMP);
       uoe.c.setShader(i);
       i = uoe.f;
       m = uoe.i;
       int[] ointArray1 = new int[]{m1,m1,uoe.n};
       m1 = uoe.m;
       LinearGradient linearGradie = new LinearGradient(0, ((- i) + m), 0, ((- i) - m), ointArray1, new float[3]{0,0x3f000000,0x3f800000}, Shader$TileMode.CLAMP);
       uoe.d.setShader(rectF1);
       uoe.d.setAntiAlias(false);
       return;
    }
    public void draw(Canvas p0){
       if (this.l != null) {
          this.a(this.getBounds());
          this.l = false;
       }
       p0.translate(0, (this.j / 2.00f));
       this.e(p0);
       p0.translate(0, ((- this.j) / 2.00f));
       e.r.a(p0, this.e, this.f, this.b);
       return;
    }
    public final void e(Canvas p0){
       e tf = this.f;
       float f = (- tf) - this.i;
       float f1 = (tf + (float)this.a) + (this.j / 2.00f);
       float f2 = f1 * 2.00f;
       int i = 0;
       e uoe = ((this.e.width() - f2) - i > 0)? 1: null;
       int i1 = ((this.e.height() - f2) - i > 0)? 1: 0;
       int i2 = p0.save();
       e te = this.e;
       p0.translate((te.left + f1), (te.top + f1));
       p0.drawPath(this.g, this.c);
       if (uoe) {
          p0.drawRect(0, f, (this.e.width() - f2), (- this.f), this.d);
       }
       p0.restoreToCount(i2);
       i2 = p0.save();
       te = this.e;
       p0.translate((te.right - f1), (te.bottom - f1));
       p0.rotate(180.00f);
       p0.drawPath(this.g, this.c);
       if (uoe) {
          p0.drawRect(0, f, (this.e.width() - f2), ((- this.f) + this.i), this.d);
       }
       p0.restoreToCount(i2);
       int i3 = p0.save();
       te = this.e;
       p0.translate((te.left + f1), (te.bottom - f1));
       p0.rotate(270.00f);
       p0.drawPath(this.g, this.c);
       if (i1) {
          p0.drawRect(0, f, (this.e.height() - f2), (- this.f), this.d);
       }
       p0.restoreToCount(i3);
       i3 = p0.save();
       te = this.e;
       p0.translate((te.right - f1), (te.top + f1));
       p0.rotate(90.00f);
       p0.drawPath(this.g, this.c);
       if (i1) {
          p0.drawRect(0, f, (this.e.height() - f2), (- this.f), this.d);
       }
       p0.restoreToCount(i3);
       return;
    }
    public int getOpacity(){
       return -3;
    }
    public boolean getPadding(Rect p0){
       p0.set((int)Math.ceil((double)e.c(this.h, this.f, this.o)), (int)Math.ceil((double)e.d(this.h, this.f, this.o)), (int)Math.ceil((double)e.c(this.h, this.f, this.o)), (int)Math.ceil((double)e.d(this.h, this.f, this.o)));
       return true;
    }
    public boolean isStateful(){
       e tk = this.k;
       boolean b = (tk == null || (tk.isStateful() || super.isStateful()))? true: false;
       return b;
    }
    public void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       this.l = true;
    }
    public boolean onStateChange(int[] p0){
       e tk = this.k;
       int colorForStat = tk.getColorForState(p0, tk.getDefaultColor());
       if (this.b.getColor() == colorForStat) {
          return false;
       }
       this.b.setColor(colorForStat);
       this.l = true;
       this.invalidateSelf();
       return true;
    }
    public void setAlpha(int p0){
       this.b.setAlpha(p0);
       this.c.setAlpha(p0);
       this.d.setAlpha(p0);
    }
    public void setColorFilter(ColorFilter p0){
       this.b.setColorFilter(p0);
    }
}
