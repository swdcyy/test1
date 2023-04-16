package com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior$c;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class GestureCollapseAppBarBehavior$c extends GestureDetector$SimpleOnGestureListener	// class@00165d
{
    public final GestureCollapseAppBarBehavior b;

    public void GestureCollapseAppBarBehavior$c(GestureCollapseAppBarBehavior p0){
       this.b = p0;
       super();
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureCollapseAppBarBehavior$c.class, "2")) {
          return;
       }
       GestureCollapseAppBarBehavior$c tb = this.b;
       if (tb.k != null) {
          GestureCollapseAppBarBehavior$a uoa = tb.D();
          if (uoa != null) {
             uoa.a(true);
          }
          uoa.q = true;
       }
       return;
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, GestureCollapseAppBarBehavior$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       GestureCollapseAppBarBehavior$c tb = this.b;
       if (tb.k == null) {
          return false;
       }
       GestureCollapseAppBarBehavior$a uoa = tb.D();
       if (uoa != null) {
          uoa.a(true);
       }
       uoa.q = true;
       return true;
    }
}
