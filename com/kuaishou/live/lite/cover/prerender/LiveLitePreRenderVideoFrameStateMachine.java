package com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$n;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$m;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$l;
import com.kwai.statechart.StateChart$b;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$1;
import msd.a;
import oa3.j;
import ut7.g;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$2;
import com.kwai.statechart.a;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$EndTimingEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$c;
import java.lang.Class;
import ut7.o;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$LeavePageEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$d;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$EnterLiteEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$e;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$DestroyLiteEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$f;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$EndRenderingEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$g;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$h;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$i;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$a;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$NoMoreTimingEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$b;
import com.kwai.statechart.StateChart;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$LiveLitePreRenderVideoFrameEvent;
import com.kwai.robust.PatchProxy;
import ut7.e;

public final class LiveLitePreRenderVideoFrameStateMachine	// class@0008ce
{
    public final String a;
    public final LiveLitePreRenderVideoFrameStateMachine$n b;
    public final LiveLitePreRenderVideoFrameStateMachine$m c;
    public final LiveLitePreRenderVideoFrameStateMachine$l d;
    public final StateChart e;
    public final LiveLitePreRenderVideoFrameStateMachine$k f;

    public void LiveLitePreRenderVideoFrameStateMachine(LiveLitePreRenderVideoFrameStateMachine$k p0){
       LiveLitePreRenderVideoFrameStateMachine liveLitePreR = this;
       Object obj = p0;
       a.p(obj, "renderVideoFrameDelegate");
       super();
       liveLitePreR.f = obj;
       liveLitePreR.a = "LiveLitePreRenderVideoFrameStateMachine";
       LiveLitePreRenderVideoFrameStateMachine$n on = new LiveLitePreRenderVideoFrameStateMachine$n(liveLitePreR, "TimingState");
       liveLitePreR.b = on;
       LiveLitePreRenderVideoFrameStateMachine$m om = new LiveLitePreRenderVideoFrameStateMachine$m(liveLitePreR, "RenderingState");
       liveLitePreR.c = om;
       LiveLitePreRenderVideoFrameStateMachine$l ol = new LiveLitePreRenderVideoFrameStateMachine$l(liveLitePreR, "EndState");
       liveLitePreR.d = ol;
       LiveLitePreRenderVideoFrameStateMachine$n on1 = on;
       LiveLitePreRenderVideoFrameStateMachine$l ol1 = ol;
       StateChart$b uob = new StateChart$b().c("LiveLitePreRenderVideoFrameStateMachine").b(LiveLitePreRenderVideoFrameStateMachine$1.INSTANCE).d(new j()).e(on, LiveLitePreRenderVideoFrameStateMachine$2.INSTANCE).f(on).f(om).f(ol).h("End timing", on1, om, LiveLitePreRenderVideoFrameStateMachine$EndTimingEvent.class, LiveLitePreRenderVideoFrameStateMachine$c.a).h("Leave page stop timing", on1, ol1, LiveLitePreRenderVideoFrameStateMachine$LeavePageEvent.class, LiveLitePreRenderVideoFrameStateMachine$d.a).h("Enter lite stop timing", on1, ol1, LiveLitePreRenderVideoFrameStateMachine$EnterLiteEvent.class, LiveLitePreRenderVideoFrameStateMachine$e.a).h("Destroy Lite stop timing", on1, ol1, LiveLitePreRenderVideoFrameStateMachine$DestroyLiteEvent.class, LiveLitePreRenderVideoFrameStateMachine$f.a);
       StateChart$b uob1 = uob.h("Rendering done", om, on, LiveLitePreRenderVideoFrameStateMachine$EndRenderingEvent.class, LiveLitePreRenderVideoFrameStateMachine$g.a);
       LiveLitePreRenderVideoFrameStateMachine$m om1 = om;
       LiveLitePreRenderVideoFrameStateMachine$l ol2 = ol;
       LiveLitePreRenderVideoFrameStateMachine$l ol3 = ol;
       uob1 = uob1.h("Enter lite stop rendering", om1, ol2, LiveLitePreRenderVideoFrameStateMachine$EnterLiteEvent.class, LiveLitePreRenderVideoFrameStateMachine$h.a);
       ol2 = ol3;
       liveLitePreR.e = uob1.h("Leave page stop rendering", om1, ol2, LiveLitePreRenderVideoFrameStateMachine$LeavePageEvent.class, LiveLitePreRenderVideoFrameStateMachine$i.a).h("Destroy Lite stop rendering", om1, ol2, LiveLitePreRenderVideoFrameStateMachine$DestroyLiteEvent.class, LiveLitePreRenderVideoFrameStateMachine$a.a).h("No more timing", om1, ol2, LiveLitePreRenderVideoFrameStateMachine$NoMoreTimingEvent.class, LiveLitePreRenderVideoFrameStateMachine$b.a).a();
    }
    public final void a(LiveLitePreRenderVideoFrameStateMachine$LiveLitePreRenderVideoFrameEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePreRenderVideoFrameStateMachine.class, "2")) {
          return;
       }
       a.p(p0, "event");
       this.e.n(p0);
       return;
    }
}
