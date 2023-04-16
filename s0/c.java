package s0.c;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.core.graphics.drawable.a;
import java.lang.Runnable;
import android.graphics.ColorFilter;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public class c extends Drawable implements Drawable$Callback	// class@002b86
{
    public Drawable b;

    public void c(Drawable p0){
       super();
       this.b(p0);
    }
    public Drawable a(){
       return this.b;
    }
    public void b(Drawable p0){
       c tb = this.b;
       if (tb != null) {
          tb.setCallback(null);
       }
       this.b = p0;
       if (p0 != null) {
          p0.setCallback(this);
       }
       return;
    }
    public void draw(Canvas p0){
       this.b.draw(p0);
    }
    public int getChangingConfigurations(){
       return this.b.getChangingConfigurations();
    }
    public Drawable getCurrent(){
       return this.b.getCurrent();
    }
    public int getIntrinsicHeight(){
       return this.b.getIntrinsicHeight();
    }
    public int getIntrinsicWidth(){
       return this.b.getIntrinsicWidth();
    }
    public int getMinimumHeight(){
       return this.b.getMinimumHeight();
    }
    public int getMinimumWidth(){
       return this.b.getMinimumWidth();
    }
    public int getOpacity(){
       return this.b.getOpacity();
    }
    public boolean getPadding(Rect p0){
       return this.b.getPadding(p0);
    }
    public int[] getState(){
       return this.b.getState();
    }
    public Region getTransparentRegion(){
       return this.b.getTransparentRegion();
    }
    public void invalidateDrawable(Drawable p0){
       this.invalidateSelf();
    }
    public boolean isAutoMirrored(){
       return a.h(this.b);
    }
    public boolean isStateful(){
       return this.b.isStateful();
    }
    public void jumpToCurrentState(){
       this.b.jumpToCurrentState();
    }
    public void onBoundsChange(Rect p0){
       this.b.setBounds(p0);
    }
    public boolean onLevelChange(int p0){
       return this.b.setLevel(p0);
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       this.scheduleSelf(p1, p2);
    }
    public void setAlpha(int p0){
       this.b.setAlpha(p0);
    }
    public void setAutoMirrored(boolean p0){
       a.j(this.b, p0);
    }
    public void setChangingConfigurations(int p0){
       this.b.setChangingConfigurations(p0);
    }
    public void setColorFilter(ColorFilter p0){
       this.b.setColorFilter(p0);
    }
    public void setDither(boolean p0){
       this.b.setDither(p0);
    }
    public void setFilterBitmap(boolean p0){
       this.b.setFilterBitmap(p0);
    }
    public void setHotspot(float p0,float p1){
       a.k(this.b, p0, p1);
    }
    public void setHotspotBounds(int p0,int p1,int p2,int p3){
       a.l(this.b, p0, p1, p2, p3);
    }
    public boolean setState(int[] p0){
       return this.b.setState(p0);
    }
    public void setTint(int p0){
       a.n(this.b, p0);
    }
    public void setTintList(ColorStateList p0){
       a.o(this.b, p0);
    }
    public void setTintMode(PorterDuff$Mode p0){
       a.p(this.b, p0);
    }
    public boolean setVisible(boolean p0,boolean p1){
       p0 = (super.setVisible(p0, p1) || this.b.setVisible(p0, p1))? true: false;
       return p0;
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
       this.unscheduleSelf(p1);
    }
}
