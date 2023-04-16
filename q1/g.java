package q1.g;
import q1.f;
import android.graphics.drawable.Drawable;
import q1.h;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import android.graphics.Rect;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Boolean;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public class g extends f	// class@00294f
{
    public static Method i;

    public void g(Drawable p0){
       super(p0);
       this.g();
    }
    public void g(h p0,Resources p1){
       super(p0, p1);
       this.g();
    }
    public boolean c(){
       boolean b = false;
       if (Build$VERSION.SDK_INT == 21) {
          f tg = this.g;
          if (!tg instanceof GradientDrawable && (!tg instanceof DrawableContainer && (tg instanceof InsetDrawable || tg instanceof RippleDrawable))) {
             b = true;
          }
       }
       return b;
    }
    public final void g(){
       try{
          if (g.i == null) {
             Class[] uClassArray = new Class[0];
             g.i = Drawable.class.getDeclaredMethod("isProjected", uClassArray);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public Rect getDirtyBounds(){
       return this.g.getDirtyBounds();
    }
    public void getOutline(Outline p0){
       this.g.getOutline(p0);
    }
    public boolean isProjected(){
       f tg = this.g;
       if (tg != null) {
          Method i = g.i;
          if (i != null) {
             try{
                Object[] objArray = new Object[0];
                return i.invoke(tg, objArray).booleanValue();
             }catch(java.lang.Exception e0){
             }
          }
       }
       return v1;
    }
    public void setHotspot(float p0,float p1){
       this.g.setHotspot(p0, p1);
    }
    public void setHotspotBounds(int p0,int p1,int p2,int p3){
       this.g.setHotspotBounds(p0, p1, p2, p3);
    }
    public boolean setState(int[] p0){
       if (!super.setState(p0)) {
          return false;
       }
       this.invalidateSelf();
       return true;
    }
    public void setTint(int p0){
       if (this.c()) {
          super.setTint(p0);
       }else {
          this.g.setTint(p0);
       }
       return;
    }
    public void setTintList(ColorStateList p0){
       if (this.c()) {
          super.setTintList(p0);
       }else {
          this.g.setTintList(p0);
       }
       return;
    }
    public void setTintMode(PorterDuff$Mode p0){
       if (this.c()) {
          super.setTintMode(p0);
       }else {
          this.g.setTintMode(p0);
       }
       return;
    }
}
