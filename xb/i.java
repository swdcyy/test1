package xb.i;
import android.graphics.drawable.Drawable$Callback;
import xb.v;
import xb.u;
import xb.e;
import android.graphics.drawable.Drawable;
import android.graphics.Matrix;
import xb.f;
import xb.g;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Rect;
import android.graphics.RectF;
import java.lang.Runnable;
import android.graphics.ColorFilter;

public class i extends Drawable implements Drawable$Callback, v, u, e	// class@003045
{
    public Drawable b;
    public final f c;
    public v d;
    public static final Matrix e;

    static {
       i.e = new Matrix();
    }
    public void i(Drawable p0){
       super();
       this.c = new f();
       this.b = p0;
       g.d(p0, this, this);
    }
    public void draw(Canvas p0){
       i tb = this.b;
       if (tb != null) {
          tb.draw(p0);
       }
       return;
    }
    public Drawable$ConstantState getConstantState(){
       i tb = this.b;
       if (tb == null) {
          return super.getConstantState();
       }
       return tb.getConstantState();
    }
    public Drawable getCurrent(){
       return this.b;
    }
    public int getIntrinsicHeight(){
       i tb = this.b;
       if (tb == null) {
          return super.getIntrinsicHeight();
       }
       return tb.getIntrinsicHeight();
    }
    public int getIntrinsicWidth(){
       i tb = this.b;
       if (tb == null) {
          return super.getIntrinsicWidth();
       }
       return tb.getIntrinsicWidth();
    }
    public int getOpacity(){
       i tb = this.b;
       if (tb == null) {
          return 0;
       }
       return tb.getOpacity();
    }
    public boolean getPadding(Rect p0){
       i tb = this.b;
       if (tb == null) {
          return super.getPadding(p0);
       }
       return tb.getPadding(p0);
    }
    public void i(RectF p0){
       i td = this.d;
       if (td != null) {
          td.i(p0);
       }else {
          p0.set(this.getBounds());
       }
       return;
    }
    public void invalidateDrawable(Drawable p0){
       this.invalidateSelf();
    }
    public boolean isStateful(){
       i tb = this.b;
       if (tb == null) {
          return false;
       }
       return tb.isStateful();
    }
    public void j(v p0){
       this.d = p0;
    }
    public Drawable k(Drawable p0){
       return this.v(p0);
    }
    public Drawable mutate(){
       i tb = this.b;
       if (tb != null) {
          tb.mutate();
       }
       return this;
    }
    public void onBoundsChange(Rect p0){
       i tb = this.b;
       if (tb != null) {
          tb.setBounds(p0);
       }
       return;
    }
    public boolean onLevelChange(int p0){
       i tb = this.b;
       if (tb == null) {
          return super.onLevelChange(p0);
       }
       return tb.setLevel(p0);
    }
    public boolean onStateChange(int[] p0){
       i tb = this.b;
       if (tb == null) {
          return super.onStateChange(p0);
       }
       return tb.setState(p0);
    }
    public Drawable p(){
       return this.getCurrent();
    }
    public void r(Matrix p0){
       this.u(p0);
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       this.scheduleSelf(p1, p2);
    }
    public void setAlpha(int p0){
       this.c.b(p0);
       i tb = this.b;
       if (tb != null) {
          tb.setAlpha(p0);
       }
       return;
    }
    public void setColorFilter(ColorFilter p0){
       this.c.c(p0);
       i tb = this.b;
       if (tb != null) {
          tb.setColorFilter(p0);
       }
       return;
    }
    public void setDither(boolean p0){
       this.c.d(p0);
       i tb = this.b;
       if (tb != null) {
          tb.setDither(p0);
       }
       return;
    }
    public void setFilterBitmap(boolean p0){
       this.c.e(p0);
       i tb = this.b;
       if (tb != null) {
          tb.setFilterBitmap(p0);
       }
       return;
    }
    public void setHotspot(float p0,float p1){
       i tb = this.b;
       if (tb != null) {
          tb.setHotspot(p0, p1);
       }
       return;
    }
    public boolean setVisible(boolean p0,boolean p1){
       boolean b = super.setVisible(p0, p1);
       i tb = this.b;
       if (tb == null) {
          return b;
       }
       return tb.setVisible(p0, p1);
    }
    public void u(Matrix p0){
       i td = this.d;
       if (td != null) {
          td.r(p0);
       }else {
          p0.reset();
       }
       return;
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
       this.unscheduleSelf(p1);
    }
    public Drawable v(Drawable p0){
       i tb = this.b;
       g.d(tb, null, null);
       g.d(p0, null, null);
       g.e(p0, this.c);
       g.a(p0, this);
       g.d(p0, this, this);
       this.b = p0;
       this.invalidateSelf();
       return tb;
    }
}
