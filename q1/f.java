package q1.f;
import android.graphics.drawable.Drawable$Callback;
import q1.e;
import q1.d;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import q1.h;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import androidx.core.graphics.drawable.a;
import android.graphics.Region;
import java.lang.Runnable;
import android.graphics.ColorFilter;

public class f extends Drawable implements Drawable$Callback, e, d	// class@00294e
{
    public int b;
    public PorterDuff$Mode c;
    public boolean d;
    public h e;
    public boolean f;
    public Drawable g;
    public static final PorterDuff$Mode h;

    static {
       f.h = PorterDuff$Mode.SRC_IN;
    }
    public void f(Drawable p0){
       super();
       this.e = this.d();
       this.a(p0);
    }
    public void f(h p0,Resources p1){
       super();
       this.e = p0;
       this.e(p1);
    }
    public final void a(Drawable p0){
       f tg = this.g;
       if (tg != null) {
          tg.setCallback(null);
       }
       this.g = p0;
       if (p0 != null) {
          p0.setCallback(this);
          this.setVisible(p0.isVisible(), true);
          this.setState(p0.getState());
          this.setLevel(p0.getLevel());
          this.setBounds(p0.getBounds());
          tg = this.e;
          if (tg != null) {
             tg.b = p0.getConstantState();
          }
       }
       this.invalidateSelf();
       return;
    }
    public final Drawable b(){
       return this.g;
    }
    public boolean c(){
       return true;
    }
    public final h d(){
       return new h(this.e);
    }
    public void draw(Canvas p0){
       this.g.draw(p0);
    }
    public final void e(Resources p0){
       f te = this.e;
       if (te != null) {
          h b = te.b;
          if (b != null) {
             this.a(b.newDrawable(p0));
          }
       }
       return;
    }
    public final boolean f(int[] p0){
       if (!this.c()) {
          return false;
       }
       f te = this.e;
       h c = te.c;
       h d = te.d;
       if (c != null && d != null) {
          int colorForStat = c.getColorForState(p0, c.getDefaultColor());
          if (this.d != null && (colorForStat != this.b || d != this.c)) {
             this.setColorFilter(colorForStat, d);
             this.b = colorForStat;
             this.c = d;
             this.d = true;
             return true;
          }
       }else {
          this.d = false;
          this.clearColorFilter();
       }
       return false;
    }
    public int getChangingConfigurations(){
       int changingConf = super.getChangingConfigurations();
       f te = this.e;
       int changingConf1 = (te != null)? te.getChangingConfigurations(): 0;
       return ((changingConf | changingConf1) | this.g.getChangingConfigurations());
    }
    public Drawable$ConstantState getConstantState(){
       f te = this.e;
       if (te == null || !te.a()) {
          return null;
       }
       this.e.a = this.getChangingConfigurations();
       return this.e;
    }
    public Drawable getCurrent(){
       return this.g.getCurrent();
    }
    public int getIntrinsicHeight(){
       return this.g.getIntrinsicHeight();
    }
    public int getIntrinsicWidth(){
       return this.g.getIntrinsicWidth();
    }
    public int getLayoutDirection(){
       return a.f(this.g);
    }
    public int getMinimumHeight(){
       return this.g.getMinimumHeight();
    }
    public int getMinimumWidth(){
       return this.g.getMinimumWidth();
    }
    public int getOpacity(){
       return this.g.getOpacity();
    }
    public boolean getPadding(Rect p0){
       return this.g.getPadding(p0);
    }
    public int[] getState(){
       return this.g.getState();
    }
    public Region getTransparentRegion(){
       return this.g.getTransparentRegion();
    }
    public void invalidateDrawable(Drawable p0){
       this.invalidateSelf();
    }
    public boolean isAutoMirrored(){
       return a.h(this.g);
    }
    public boolean isStateful(){
       h c;
       if (this.c()) {
          f te = this.e;
          if (te != null) {
             c = te.c;
          label_000e :
             boolean b = (c == null || (c.isStateful() || this.g.isStateful()))? true: false;
             return b;
          }
       }
       c = null;
       goto label_000e ;
    }
    public void jumpToCurrentState(){
       this.g.jumpToCurrentState();
    }
    public Drawable mutate(){
       if (this.f == null && super.mutate() == this) {
          this.e = this.d();
          f tg = this.g;
          if (tg != null) {
             tg.mutate();
          }
          tg = this.e;
          if (tg != null) {
             f tg1 = this.g;
             Drawable$ConstantState constantStat = (tg1 != null)? tg1.getConstantState(): null;
             tg.b = constantStat;
          }
          this.f = true;
       }
       return this;
    }
    public void onBoundsChange(Rect p0){
       f tg = this.g;
       if (tg != null) {
          tg.setBounds(p0);
       }
       return;
    }
    public boolean onLayoutDirectionChanged(int p0){
       return a.m(this.g, p0);
    }
    public boolean onLevelChange(int p0){
       return this.g.setLevel(p0);
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       this.scheduleSelf(p1, p2);
    }
    public void setAlpha(int p0){
       this.g.setAlpha(p0);
    }
    public void setAutoMirrored(boolean p0){
       a.j(this.g, p0);
    }
    public void setChangingConfigurations(int p0){
       this.g.setChangingConfigurations(p0);
    }
    public void setColorFilter(ColorFilter p0){
       this.g.setColorFilter(p0);
    }
    public void setDither(boolean p0){
       this.g.setDither(p0);
    }
    public void setFilterBitmap(boolean p0){
       this.g.setFilterBitmap(p0);
    }
    public boolean setState(int[] p0){
       boolean b = this.g.setState(p0);
       boolean b1 = (this.f(p0) || b)? true: false;
       return b1;
    }
    public void setTint(int p0){
       this.setTintList(ColorStateList.valueOf(p0));
    }
    public void setTintList(ColorStateList p0){
       this.e.c = p0;
       this.f(this.getState());
    }
    public void setTintMode(PorterDuff$Mode p0){
       this.e.d = p0;
       this.f(this.getState());
    }
    public boolean setVisible(boolean p0,boolean p1){
       p0 = (super.setVisible(p0, p1) || this.g.setVisible(p0, p1))? true: false;
       return p0;
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
       this.unscheduleSelf(p1);
    }
}
