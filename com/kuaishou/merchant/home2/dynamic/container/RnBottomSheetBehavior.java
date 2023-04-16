package com.kuaishou.merchant.home2.dynamic.container.RnBottomSheetBehavior;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hf.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Math;
import com.kuaishou.merchant.container.halfcontainer.widget.a;
import java.lang.ref.WeakReference;

public class RnBottomSheetBehavior extends ContainerBottomSheetBehavior	// class@001740
{

    public void RnBottomSheetBehavior(){
       super();
    }
    public View findScrollingChild(View p0){
       View obj = PatchProxy.applyOneRefs(p0, this, RnBottomSheetBehavior.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a(p0, "krn_bottom_sheet_scrollview_id");
       if (obj != null) {
          return obj;
       }
       return super.findScrollingChild(p0);
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, RnBottomSheetBehavior.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p2.getAction() == 2) {
          boolean b = true;
          if (this.F == null && Math.abs(((float)this.y - p2.getY())) - (float)this.n.l() > 0) {
             return b;
          }else {
             float f = p2.getY() - (float)this.y;
             ContainerBottomSheetBehavior tu = this.u;
             View view = (tu != null)? tu.get(): null;
             if (view != null && !view.canScrollVertically(-1)) {
                if (f - (float)this.n.l() <= 0) {
                   b = false;
                }
                return b;
             }
          }
       }
       return super.onInterceptTouchEvent(p0, p1, p2);
    }
}
