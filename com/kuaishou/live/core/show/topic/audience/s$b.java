package com.kuaishou.live.core.show.topic.audience.s$b;
import android.view.View$OnAttachStateChangeListener;
import com.kuaishou.live.core.show.topic.audience.s;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;

public class s$b implements View$OnAttachStateChangeListener	// class@001216
{
    public final s b;

    public void s$b(s p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$b.class, "1")) {
          return;
       }
       if (!this.b.r.p()) {
          this.b.r.setRepeatCount(-1);
          this.b.r.setAnimationFromUrl(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_WHITE_SPECTRUM.getResourcePath()));
          this.b.r.s();
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$b.class, "2")) {
          return;
       }
       this.b.r.f();
       return;
    }
}
