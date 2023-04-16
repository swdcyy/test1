package f3.g;
import q1.d;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import androidx.core.graphics.drawable.a;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.PorterDuff$Mode;

public abstract class g extends Drawable implements d	// class@001fc4
{
    public Drawable b;

    public void g(){
       super();
    }
    public void applyTheme(Resources$Theme p0){
       g tb = this.b;
       if (tb != null) {
          a.a(tb, p0);
       }
       return;
    }
    public void clearColorFilter(){
       g tb = this.b;
       if (tb != null) {
          tb.clearColorFilter();
          return;
       }else {
          super.clearColorFilter();
          return;
       }
    }
    public Drawable getCurrent(){
       g tb = this.b;
       if (tb != null) {
          return tb.getCurrent();
       }
       return super.getCurrent();
    }
    public int getMinimumHeight(){
       g tb = this.b;
       if (tb != null) {
          return tb.getMinimumHeight();
       }
       return super.getMinimumHeight();
    }
    public int getMinimumWidth(){
       g tb = this.b;
       if (tb != null) {
          return tb.getMinimumWidth();
       }
       return super.getMinimumWidth();
    }
    public boolean getPadding(Rect p0){
       g tb = this.b;
       if (tb != null) {
          return tb.getPadding(p0);
       }
       return super.getPadding(p0);
    }
    public int[] getState(){
       g tb = this.b;
       if (tb != null) {
          return tb.getState();
       }
       return super.getState();
    }
    public Region getTransparentRegion(){
       g tb = this.b;
       if (tb != null) {
          return tb.getTransparentRegion();
       }
       return super.getTransparentRegion();
    }
    public void jumpToCurrentState(){
       g tb = this.b;
       if (tb != null) {
          a.i(tb);
       }
       return;
    }
    public void onBoundsChange(Rect p0){
       g tb = this.b;
       if (tb != null) {
          tb.setBounds(p0);
          return;
       }else {
          super.onBoundsChange(p0);
          return;
       }
    }
    public boolean onLevelChange(int p0){
       g tb = this.b;
       if (tb != null) {
          return tb.setLevel(p0);
       }
       return super.onLevelChange(p0);
    }
    public void setChangingConfigurations(int p0){
       g tb = this.b;
       if (tb != null) {
          tb.setChangingConfigurations(p0);
          return;
       }else {
          super.setChangingConfigurations(p0);
          return;
       }
    }
    public void setColorFilter(int p0,PorterDuff$Mode p1){
       g tb = this.b;
       if (tb != null) {
          tb.setColorFilter(p0, p1);
          return;
       }else {
          super.setColorFilter(p0, p1);
          return;
       }
    }
    public void setFilterBitmap(boolean p0){
       g tb = this.b;
       if (tb != null) {
          tb.setFilterBitmap(p0);
       }
       return;
    }
    public void setHotspot(float p0,float p1){
       g tb = this.b;
       if (tb != null) {
          a.k(tb, p0, p1);
       }
       return;
    }
    public void setHotspotBounds(int p0,int p1,int p2,int p3){
       g tb = this.b;
       if (tb != null) {
          a.l(tb, p0, p1, p2, p3);
       }
       return;
    }
    public boolean setState(int[] p0){
       g tb = this.b;
       if (tb != null) {
          return tb.setState(p0);
       }
       return super.setState(p0);
    }
}
