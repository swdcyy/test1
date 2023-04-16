package androidx.transition.ViewOverlayApi14$OverlayViewGroup;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.Integer;
import android.graphics.Rect;
import java.lang.String;
import java.lang.reflect.Method;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.lang.Object;
import android.graphics.drawable.Drawable$Callback;
import java.lang.IllegalStateException;
import android.view.View;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewParent;

public class ViewOverlayApi14$OverlayViewGroup extends ViewGroup	// class@0009da
{
    public ViewGroup b;
    public View c;
    public ArrayList d;
    public ViewOverlayApi14 e;
    public boolean f;
    public static Method g;

    static {
       Class tYPE;
       try{
          Class[] uClassArray = new Class[]{tYPE,tYPE,Rect.class};
          tYPE = Integer.TYPE;
          ViewOverlayApi14$OverlayViewGroup.g = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", uClassArray);
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public void a(Drawable p0){
       this.b();
       if (this.d == null) {
          this.d = new ArrayList();
       }
       if (!this.d.contains(p0)) {
          this.d.add(p0);
          this.invalidate(p0.getBounds());
          p0.setCallback(this);
       }
       return;
    }
    public final void b(){
       if (this.f == null) {
          return;
       }
       throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay\(\)");
    }
    public final void c(){
       if (!this.getChildCount()) {
          ViewOverlayApi14$OverlayViewGroup td = this.d;
          if (td == null || !td.size()) {
             this.f = true;
             this.b.removeView(this);
          }
       }
       return;
    }
    public final void d(int[] p0){
       int[] ointArray = new int[2];
       int[] ointArray1 = new int[2];
       this.b.getLocationOnScreen(ointArray);
       this.c.getLocationOnScreen(ointArray1);
       p0[0] = ointArray1[0] - ointArray[0];
       p0[1] = ointArray1[1] - ointArray[1];
    }
    public void dispatchDraw(Canvas p0){
       int[] ointArray = new int[2];
       int[] ointArray1 = new int[2];
       this.b.getLocationOnScreen(ointArray);
       this.c.getLocationOnScreen(ointArray1);
       int i = 0;
       int i1 = ointArray1[i] - ointArray[i];
       int i2 = ointArray1[1] - ointArray[1];
       p0.translate((float)i1, (float)i2);
       p0.clipRect(new Rect(i, i, this.c.getWidth(), this.c.getHeight()));
       super.dispatchDraw(p0);
       ViewOverlayApi14$OverlayViewGroup td = this.d;
       td = (td == null)? 0: td.size();
       while (i < td) {
          this.d.get(i).draw(p0);
          i = i + 1;
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       return false;
    }
    public void e(Drawable p0){
       ViewOverlayApi14$OverlayViewGroup td = this.d;
       if (td != null) {
          td.remove(p0);
          this.invalidate(p0.getBounds());
          p0.setCallback(null);
          this.c();
       }
       return;
    }
    public ViewParent invalidateChildInParent(int[] p0,Rect p1){
       if (this.b != null) {
          int i = 0;
          p1.offset(p0[i], p0[1]);
          if (this.b instanceof ViewGroup) {
             p0[i] = i;
             p0[1] = i;
             int[] ointArray = new int[2];
             this.d(ointArray);
             p1.offset(ointArray[i], ointArray[1]);
             return super.invalidateChildInParent(p0, p1);
          }else {
             this.invalidate(p1);
          }
       }
       return null;
    }
    public void invalidateDrawable(Drawable p0){
       this.invalidate(p0.getBounds());
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
    }
    public boolean verifyDrawable(Drawable p0){
       boolean b;
       if (!super.verifyDrawable(p0)) {
          ViewOverlayApi14$OverlayViewGroup td = this.d;
          if (td == null || !td.contains(p0)) {
             b = false;
          label_0014 :
             return b;
          }
       }
       b = true;
       goto label_0014 ;
    }
}
