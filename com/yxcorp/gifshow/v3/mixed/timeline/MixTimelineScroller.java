package com.yxcorp.gifshow.v3.mixed.timeline.MixTimelineScroller;
import ml8.d;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.mixed.model.MixStatus;
import com.yxcorp.gifshow.v3.mixed.model.b;

public class MixTimelineScroller extends CustomHorizontalScroller implements d	// class@001560
{
    public MixTimeline e;

    public void MixTimelineScroller(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTimelineScroller.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a3ef5);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTimelineScroller.class, "3")) {
          return;
       }
       super.onDraw(p0);
       this.e.a();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, MixTimelineScroller.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MixTimelineScroller.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.e.b == null) {
          return false;
       }
       if (!p0.getAction() && this.e.b.F0() == MixStatus.PREVIEWING) {
          this.e.b.q0();
       }
       return super.onTouchEvent(p0);
    }
}
