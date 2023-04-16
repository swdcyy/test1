package com.yxcorp.gifshow.detail.slidev2.widget.PressControlSpeedFrameLayout;
import g9a.f;
import com.kwai.library.slide.base.widget.SlidePlayFrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import nsd.u;
import g9a.d;
import android.widget.FrameLayout;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import wh5.c;
import android.view.ViewGroup;
import g9a.d$a;
import g9a.e;

public final class PressControlSpeedFrameLayout extends SlidePlayFrameLayout implements f	// class@001a06
{
    public d d;

    public void PressControlSpeedFrameLayout(Context p0){
       a.p(p0, "context");
       super(p0, null, 0, 6, null);
       Context this = this.getContext();
       a.o(this, "context");
       this.d = new d(this, this);
    }
    public void PressControlSpeedFrameLayout(Context p0,AttributeSet p1){
       Context context;
       a.p(p0, "context");
       super(p0, p1, 0, 4, null);
       context = this.getContext();
       a.o(context, "context");
       this.d = new d(context, this);
    }
    public void PressControlSpeedFrameLayout(Context p0,AttributeSet p1,int p2){
       Context context;
       a.p(p0, "context");
       super(p0, p1, p2);
       context = this.getContext();
       a.o(context, "context");
       this.d = new d(context, this);
    }
    public void J1(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PressControlSpeedFrameLayout.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.d.a(p0);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PressControlSpeedFrameLayout.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       if (!ExperimentUtils.d() || c.b()) {
          return super.dispatchTouchEvent(p0);
       }
       this.d.b(p0);
       return super.dispatchTouchEvent(p0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PressControlSpeedFrameLayout.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       if (d.k.a()) {
          return true;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void setPressListener(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PressControlSpeedFrameLayout.class, "1")) {
          return;
       }
       this.d.h(p0);
       return;
    }
    public void t2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PressControlSpeedFrameLayout.class, "3")) {
          return;
       }
       a.p(p0, "view");
       this.d.f(p0);
       return;
    }
    public void u2(boolean p0){
       if (PatchProxy.isSupport(PressControlSpeedFrameLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressControlSpeedFrameLayout.class, "4")) {
          return;
       }
       this.d.c(p0);
       return;
    }
    public void v2(boolean p0){
       if (PatchProxy.isSupport(PressControlSpeedFrameLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressControlSpeedFrameLayout.class, "5")) {
          return;
       }
       this.d.d(p0);
       return;
    }
}
