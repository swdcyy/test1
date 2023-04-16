package com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$j;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$i;
import com.kwai.statechart.StateChart$b;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$1;
import msd.a;
import mc3.e;
import ut7.g;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$2;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$EndTimingEvent;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$a;
import java.lang.Class;
import ut7.o;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$LeavePageEvent;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$b;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$EnterLiteEvent;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$c;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$d;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$e;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$StopPrePlayEvent;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$f;
import com.kwai.statechart.StateChart;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$LiveLitePrePlayEvent;
import com.kwai.robust.PatchProxy;
import ut7.e;

public final class LiveLitePrePlayStateMachine	// class@000a7e
{
    public final String a;
    public final a b;
    public final LiveLitePrePlayStateMachine$j c;
    public final LiveLitePrePlayStateMachine$i d;
    public final StateChart e;
    public final LiveLitePrePlayStateMachine$h f;

    public void LiveLitePrePlayStateMachine(LiveLitePrePlayStateMachine$h p0){
       LiveLitePrePlayStateMachine liveLitePreP = this;
       Object obj = p0;
       a.p(obj, "listener");
       super();
       liveLitePreP.f = obj;
       liveLitePreP.a = "LiveLitePrePlayStateMachine";
       a uoa = new a("TimingState");
       liveLitePreP.b = uoa;
       LiveLitePrePlayStateMachine$j oj = new LiveLitePrePlayStateMachine$j(liveLitePreP, "PrePlayingState");
       liveLitePreP.c = oj;
       LiveLitePrePlayStateMachine$i oi = new LiveLitePrePlayStateMachine$i(liveLitePreP, "CancelState");
       liveLitePreP.d = oi;
       a uoa1 = uoa;
       LiveLitePrePlayStateMachine$i oi1 = oi;
       LiveLitePrePlayStateMachine$j oj1 = oj;
       LiveLitePrePlayStateMachine$i oi2 = oi;
       LiveLitePrePlayStateMachine$i oi3 = oi;
       StateChart$b uob = new StateChart$b().c("LiveLitePrePlayStateMachine").b(LiveLitePrePlayStateMachine$1.INSTANCE).d(new e()).e(uoa, LiveLitePrePlayStateMachine$2.INSTANCE).f(uoa).f(oj).f(oi).h("End timing", uoa1, oj, LiveLitePrePlayStateMachine$EndTimingEvent.class, LiveLitePrePlayStateMachine$a.a).h("Leave page cancel timing", uoa1, oi1, LiveLitePrePlayStateMachine$LeavePageEvent.class, LiveLitePrePlayStateMachine$b.a).h("Enter lite cancel timing", uoa1, oi1, LiveLitePrePlayStateMachine$EnterLiteEvent.class, LiveLitePrePlayStateMachine$c.a).h("Leave page stop play", oj1, oi2, LiveLitePrePlayStateMachine$LeavePageEvent.class, LiveLitePrePlayStateMachine$d.a);
       oi2 = oi3;
       liveLitePreP.e = uob.h("Enter lite", oj1, oi2, LiveLitePrePlayStateMachine$EnterLiteEvent.class, LiveLitePrePlayStateMachine$e.a).h("Interrupt pre-play", oj1, oi2, LiveLitePrePlayStateMachine$StopPrePlayEvent.class, LiveLitePrePlayStateMachine$f.a).a();
    }
    public final void a(LiveLitePrePlayStateMachine$LiveLitePrePlayEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePrePlayStateMachine.class, "2")) {
          return;
       }
       a.p(p0, "event");
       this.e.n(p0);
       return;
    }
}
