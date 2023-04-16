package com.yxcorp.gifshow.detail.slidev2.widget.PressControlSpeedRelativeLayout;
import g9a.f;
import android.widget.RelativeLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import g9a.d;
import android.view.View;
import android.util.AttributeSet;
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

public final class PressControlSpeedRelativeLayout extends RelativeLayout implements f	// class@001a07
{
    public d b;

    public void PressControlSpeedRelativeLayout(Context p0){
       Context context;
       a.p(p0, "context");
       super(p0);
       context = this.getContext();
       a.o(context, "context");
       this.b = new d(context, this);
    }
    public void PressControlSpeedRelativeLayout(Context p0,AttributeSet p1){
       Context context;
       a.p(p0, "context");
       super(p0, p1);
       context = this.getContext();
       a.o(context, "context");
       this.b = new d(context, this);
    }
    public void PressControlSpeedRelativeLayout(Context p0,AttributeSet p1,int p2){
       Context context;
       a.p(p0, "context");
       super(p0, p1, p2);
       context = this.getContext();
       a.o(context, "context");
       this.b = new d(context, this);
    }
    public void J1(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PressControlSpeedRelativeLayout.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.b.a(p0);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PressControlSpeedRelativeLayout.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       if (!ExperimentUtils.d() || c.b()) {
          return super.dispatchTouchEvent(p0);
       }
       this.b.b(p0);
       return super.dispatchTouchEvent(p0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PressControlSpeedRelativeLayout.class, "7");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, PressControlSpeedRelativeLayout.class, "1")) {
          return;
       }
       this.b.h(p0);
       return;
    }
    public void t2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PressControlSpeedRelativeLayout.class, "3")) {
          return;
       }
       a.p(p0, "view");
       this.b.f(p0);
       return;
    }
    public void u2(boolean p0){
       if (PatchProxy.isSupport(PressControlSpeedRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressControlSpeedRelativeLayout.class, "4")) {
          return;
       }
       this.b.c(p0);
       return;
    }
    public void v2(boolean p0){
       if (PatchProxy.isSupport(PressControlSpeedRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressControlSpeedRelativeLayout.class, "5")) {
          return;
       }
       this.b.d(p0);
       return;
    }
}
