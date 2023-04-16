package com.kuaishou.live.lite.framework.layoutmanager.widget.LayoutManagerRootView;
import vb3.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.RuntimeException;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import android.view.ViewGroup;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import vb3.i$a;

public final class LayoutManagerRootView extends ConstraintLayout implements i	// class@00091e
{
    public i$a B;
    public boolean C;

    public void LayoutManagerRootView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LayoutManagerRootView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LayoutManagerRootView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void LayoutManagerRootView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onDescendantInvalidated(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LayoutManagerRootView.class, "4")) {
          return;
       }
       a.p(p0, "child");
       a.p(p1, "target");
       if (!PatchProxy.applyVoid(null, this, LayoutManagerRootView.class, "5") && !k1.g()) {
          b.I(LiveLiteLogTag.ROOT_VIEW, "ERROR!!! modify ui on non-ui-thread", new RuntimeException("TRACE"));
       }
       super.onDescendantInvalidated(p0, p1);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LayoutManagerRootView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       boolean b = (this.C != null || super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       LayoutManagerRootView obj = PatchProxy.applyOneRefs(p0, this, LayoutManagerRootView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       obj = this.B;
       if (obj == null) {
          return super.onTouchEvent(p0);
       }
       if (obj != null) {
          obj.onTouchEvent(p0);
       }
       return true;
    }
    public void setInterceptTouchEvent(boolean p0){
       if (PatchProxy.isSupport(LayoutManagerRootView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LayoutManagerRootView.class, "1")) {
          return;
       }
       b.c0(LiveLiteLogTag.LAYOUT_MANAGER, "LayoutManagerRootView setInterceptTouchEvent", "isIntercept", Boolean.valueOf(p0));
       this.C = p0;
       return;
    }
    public void setTouchEventObserver(i$a p0){
       this.B = p0;
    }
}
