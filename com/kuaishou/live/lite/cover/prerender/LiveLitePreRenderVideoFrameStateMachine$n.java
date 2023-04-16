package com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$n;
import com.kwai.statechart.a;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$k;

public final class LiveLitePreRenderVideoFrameStateMachine$n extends a	// class@0008cd
{
    public final LiveLitePreRenderVideoFrameStateMachine d;

    public void LiveLitePreRenderVideoFrameStateMachine$n(LiveLitePreRenderVideoFrameStateMachine p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePreRenderVideoFrameStateMachine$n.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.d.f.a();
       }
       return;
    }
}
