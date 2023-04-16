package c1.d;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import c1.e;
import java.lang.Math;

public class d extends Drawable	// class@000cbf
{
    public float a;
    public final Paint b;
    public final RectF c;
    public final Rect d;
    public float e;
    public boolean f;
    public boolean g;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public PorterDuff$Mode k;

    public void d(ColorStateList p0,float p1){
       super();
       this.f = false;
       this.g = true;
       this.k = PorterDuff$Mode.SRC_IN;
       this.a = p1;
       this.b = new Paint(5);
       this.e(p0);
       this.c = new RectF();
       this.d = new Rect();
    }
    public final PorterDuffColorFilter a(ColorStateList p0,PorterDuff$Mode p1){
       if (p0 == null || p1 == null) {
          return null;
       }
       return new PorterDuffColorFilter(p0.getColorForState(this.getState(), 0), p1);
    }
    public ColorStateList b(){
       return this.h;
    }
    public float c(){
       return this.e;
    }
    public float d(){
       return this.a;
    }
    public void draw(Canvas p0){
       int i;
       d tb = this.b;
       if (this.i != null && tb.getColorFilter() == null) {
          tb.setColorFilter(this.i);
          i = 1;
       }else {
          i = 0;
       }
       p0.drawRoundRect(this.c, this.a, this.a, tb);
       if (i) {
          tb.setColorFilter(null);
       }
       return;
    }
    public final void e(ColorStateList p0){
       if (p0 == null) {
          p0 = ColorStateList.valueOf(0);
       }
       this.h = p0;
       this.b.setColor(p0.getColorForState(this.getState(), this.h.getDefaultColor()));
       return;
    }
    public void f(ColorStateList p0){
       this.e(p0);
       this.invalidateSelf();
    }
    public void g(float p0,boolean p1,boolean p2){
       if (!p0 - this.e && (this.f == p1 && this.g == p2)) {
          return;
       }
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.i(null);
       this.invalidateSelf();
       return;
    }
    public int getOpacity(){
       return -3;
    }
    public void getOutline(Outline p0){
       p0.setRoundRect(this.d, this.a);
    }
    public void h(float p0){
       if (!p0 - this.a) {
          return;
       }
       this.a = p0;
       this.i(null);
       this.invalidateSelf();
       return;
    }
    public final void i(Rect p0){
       if (p0 == null) {
          p0 = this.getBounds();
       }
       this.c.set((float)p0.left, (float)p0.top, (float)p0.right, (float)p0.bottom);
       this.d.set(p0);
       if (this.f != null) {
          this.d.inset((int)Math.ceil((double)e.c(this.e, this.a, this.g)), (int)Math.ceil((double)e.d(this.e, this.a, this.g)));
          this.c.set(this.d);
       }
       return;
    }
    public boolean isStateful(){
       boolean b;
       d tj = this.j;
       if (tj == null || !tj.isStateful()) {
          tj = this.h;
          if (tj != null && (!tj.isStateful() && !super.isStateful())) {
             b = false;
          label_001d :
             return b;
          }
       }
       b = true;
       goto label_001d ;
    }
    public void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       this.i(p0);
    }
    public boolean onStateChange(int[] p0){
       d th = this.h;
       int colorForStat = th.getColorForState(p0, th.getDefaultColor());
       boolean b = (colorForStat != this.b.getColor())? true: false;
       if (b) {
          this.b.setColor(colorForStat);
       }
       d tj = this.j;
       if (tj != null) {
          d tk = this.k;
          if (tk != null) {
             this.i = this.a(tj, tk);
             return true;
          }
       }
       return b;
    }
    public void setAlpha(int p0){
       this.b.setAlpha(p0);
    }
    public void setColorFilter(ColorFilter p0){
       this.b.setColorFilter(p0);
    }
    public void setTintList(ColorStateList p0){
       this.j = p0;
       this.i = this.a(p0, this.k);
       this.invalidateSelf();
    }
    public void setTintMode(PorterDuff$Mode p0){
       this.k = p0;
       this.i = this.a(this.j, p0);
       this.invalidateSelf();
    }
}
