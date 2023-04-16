package ck.a;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.graphics.RectF;
import ck.a$b;
import ck.a$a;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import p1.a;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$ConstantState;
import java.lang.Math;
import android.graphics.ColorFilter;

public class a extends Drawable	// class@000d16
{
    public final Paint a;
    public final Rect b;
    public final RectF c;
    public final a$b d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ColorStateList j;
    public int k;
    public boolean l;
    public float m;

    public void a(){
       super();
       this.b = new Rect();
       this.c = new RectF();
       this.d = new a$b(this, null);
       this.l = true;
       Paint paint = new Paint(true);
       this.a = paint;
       paint.setStyle(Paint$Style.STROKE);
    }
    public final Shader a(){
       a tb = this.b;
       this.copyBounds(tb);
       float f = this.e / (float)tb.height();
       int[] ointArray = new int[]{a.b(this.f, this.k),a.b(this.g, this.k),a.b(a.d(this.g, 0), this.k),a.b(a.d(this.i, 0), this.k),a.b(this.i, this.k),a.b(this.h, this.k)};
       float[] uofloatArray = new float[]{0,f,0x3f000000,0x3f000000,0x3f800000 - f,0x3f800000};
       LinearGradient linearGradie = new LinearGradient(0, (float)tb.top, 0, (float)tb.bottom, ointArray, uofloatArray, Shader$TileMode.CLAMP);
       return f;
    }
    public void b(ColorStateList p0){
       if (p0 != null) {
          this.k = p0.getColorForState(this.getState(), this.k);
       }
       this.j = p0;
       this.l = true;
       this.invalidateSelf();
       return;
    }
    public void c(float p0){
       if (this.e - p0) {
          this.e = p0;
          this.a.setStrokeWidth((p0 * 0x3faaa993));
          this.l = true;
          this.invalidateSelf();
       }
       return;
    }
    public void d(int p0,int p1,int p2,int p3){
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
    }
    public void draw(Canvas p0){
       if (this.l != null) {
          this.a.setShader(this.a());
          this.l = false;
       }
       float f = this.a.getStrokeWidth() / 2.00f;
       a tc = this.c;
       this.copyBounds(this.b);
       tc.set(this.b);
       tc.left = tc.left + f;
       tc.top = tc.top + f;
       tc.right = tc.right - f;
       tc.bottom = tc.bottom - f;
       p0.save();
       p0.rotate(this.m, tc.centerX(), tc.centerY());
       p0.drawOval(tc, this.a);
       p0.restore();
       return;
    }
    public final void e(float p0){
       if (p0 - this.m) {
          this.m = p0;
          this.invalidateSelf();
       }
       return;
    }
    public Drawable$ConstantState getConstantState(){
       return this.d;
    }
    public int getOpacity(){
       int i = (this.e > 0)? -3: -2;
       return i;
    }
    public boolean getPadding(Rect p0){
       p0.set(Math.round(this.e), Math.round(this.e), Math.round(this.e), Math.round(this.e));
       return true;
    }
    public boolean isStateful(){
       a tj = this.j;
       boolean b = (tj == null || (tj.isStateful() || super.isStateful()))? true: false;
       return b;
    }
    public void onBoundsChange(Rect p0){
       this.l = true;
    }
    public boolean onStateChange(int[] p0){
       a tj = this.j;
       if (tj != null) {
          int colorForStat = tj.getColorForState(p0, this.k);
          if (colorForStat != this.k) {
             this.l = true;
             this.k = colorForStat;
          }
       }
       if (this.l != null) {
          this.invalidateSelf();
       }
       return this.l;
    }
    public void setAlpha(int p0){
       this.a.setAlpha(p0);
       this.invalidateSelf();
    }
    public void setColorFilter(ColorFilter p0){
       this.a.setColorFilter(p0);
       this.invalidateSelf();
    }
}
