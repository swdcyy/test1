package com.yxcorp.gifshow.detail.slideplay.TouchDelegateFrameLayout$a;
import d6a.w;
import com.yxcorp.gifshow.detail.slideplay.TouchDelegateFrameLayout;
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
import android.widget.FrameLayout;

public final class TouchDelegateFrameLayout$a extends w	// class@00171a
{
    public final TouchDelegateFrameLayout e;
    public final View f;

    public void TouchDelegateFrameLayout$a(TouchDelegateFrameLayout p0,View p1,Context p2,View p3){
       this.e = p0;
       this.f = p1;
       super(p2, p3);
    }
    public boolean b(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TouchDelegateFrameLayout$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.a(p0);
    }
    public boolean c(View p0,MotionEvent p1){
       TouchDelegateFrameLayout$a obj = PatchProxy.applyTwoRefs(p0, p1, this, TouchDelegateFrameLayout$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "delegateView");
       obj = this.e;
       obj.getLocationInWindow(obj.c);
       TouchDelegateFrameLayout c = this.e.c;
       p0.getLocationInWindow(c);
       c = this.e.c;
       p1 = MotionEvent.obtain(p1);
       p1.offsetLocation((float)(c[0] - c[0]), (float)(c[1] - c[1]));
       p1.recycle();
       return p0.dispatchTouchEvent(p1);
    }
}
