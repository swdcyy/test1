package com.yxcorp.plugin.search.widget.FixScrollCoordinatorLayout;
import nfd.i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import nfd.h;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Math;
import java.lang.Integer;

public class FixScrollCoordinatorLayout extends CoordinatorLayout implements i	// class@0007c3
{
    public final h z;

    public void FixScrollCoordinatorLayout(Context p0){
       super(p0, null);
    }
    public void FixScrollCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FixScrollCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.z = new h(p0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       FixScrollCoordinatorLayout obj = PatchProxy.applyOneRefs(p0, this, FixScrollCoordinatorLayout.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.z;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, h.class, str);
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = p0.getActionMasked();
          if (b) {
             if (b == 2) {
                b = (int)Math.abs((p0.getX() - (float)obj.b));
                int i = (int)Math.abs((p0.getY() - (float)obj.c));
                h e = obj.e;
                if (b > e && i > e) {
                   h d = obj.d;
                   if (d == 1 && (b > i || (d == 2 && b < i))) {
                      b = true;
                   }
                }
             }
          }else {
             obj.b = (int)p0.getX();
             obj.c = (int)p0.getY();
          }
          b = false;
       }
       if (b) {
          return false;
       }else {
          return super.onInterceptTouchEvent(p0);
       }
    }
    public void setFixScrollDirection(int p0){
       if (PatchProxy.isSupport(FixScrollCoordinatorLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FixScrollCoordinatorLayout.class, "2")) {
          return;
       }
       this.z.setFixScrollDirection(p0);
       return;
    }
}
