package com.yxcorp.gifshow.detail.slideplay.TouchDelegateLinearLayout$a;
import d6a.w;
import com.yxcorp.gifshow.detail.slideplay.TouchDelegateLinearLayout;
import android.view.View;
import android.content.Context;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;

public final class TouchDelegateLinearLayout$a extends w	// class@00171c
{
    public final TouchDelegateLinearLayout e;
    public final View f;

    public void TouchDelegateLinearLayout$a(TouchDelegateLinearLayout p0,View p1,Context p2,View p3){
       this.e = p0;
       this.f = p1;
       super(p2, p3);
    }
    public boolean b(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TouchDelegateLinearLayout$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.a(p0);
    }
    public boolean c(View p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TouchDelegateLinearLayout$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "delegateView");
       boolean b = false;
       if (p1 == null) {
          return b;
       }
       TouchDelegateLinearLayout$a te = this.e;
       te.getLocationInWindow(te.c);
       TouchDelegateLinearLayout c = this.e.c;
       p0.getLocationInWindow(c);
       c = this.e.c;
       p1 = MotionEvent.obtain(p1);
       p1.offsetLocation((float)(c[b] - c[b]), (float)(c[1] - c[1]));
       p1.recycle();
       return p0.dispatchTouchEvent(p1);
    }
}
