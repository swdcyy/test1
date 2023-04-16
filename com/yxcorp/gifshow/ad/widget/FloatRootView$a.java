package com.yxcorp.gifshow.ad.widget.FloatRootView$a;
import joc.c;
import com.yxcorp.gifshow.ad.widget.FloatRootView;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class FloatRootView$a extends c	// class@001920
{
    public final FloatRootView D;

    public void FloatRootView$a(FloatRootView p0){
       this.D = p0;
       super();
    }
    public boolean d(View p0,MotionEvent p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, FloatRootView$a.class, "1");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       boolean b = false;
       if (!p1.getAction()) {
          p0.k = b;
       }
       FloatRootView$a tD = this.D;
       Objects.requireNonNull(tD);
       Object obj = PatchProxy.applyOneRefs(p1, tD, FloatRootView.class, "14");
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          Rect rect = new Rect();
          tD.getGlobalVisibleRect(rect);
          b1 = (rect.top == null)? false: rect.contains((int)p1.getRawX(), (int)p1.getRawY());
       }
       if (b1 && !this.D.getVisibility()) {
          b = true;
       }
       tD.k = b;
       return this.D.k;
    }
    public boolean f(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, FloatRootView$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       FloatRootView$a tD = this.D;
       boolean b = (tD.k != null && tD.b(p1))? true: false;
       return b;
    }
}
