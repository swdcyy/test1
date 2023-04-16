package com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$l;
import com.kwai.statechart.a;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$k;

public final class LiveLitePreRenderVideoFrameStateMachine$l extends a	// class@0008cb
{
    public final LiveLitePreRenderVideoFrameStateMachine d;

    public void LiveLitePreRenderVideoFrameStateMachine$l(LiveLitePreRenderVideoFrameStateMachine p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePreRenderVideoFrameStateMachine$l.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          if (p0.a != null) {
             this.d.f.b();
          }
          if (p0.b != null) {
             this.d.f.d();
          }
       }
       return;
    }
}
