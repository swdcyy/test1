package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.Object;
import com.kwai.statechart.StateChart$SubChartBuilder;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$d;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$c;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$1;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$2;
import msd.p;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$PrepareRtcSuccess;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$a;
import ut7.o;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$EnterRoomCompleteEvent;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$b;

public final class RtcManager$buildAryaInnerState$1 extends Lambda implements l	// class@0013a2
{
    public final RtcManager this$0;

    public void RtcManager$buildAryaInnerState$1(RtcManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(StateChart$SubChartBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager$buildAryaInnerState$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       a uoa = new a("InitialState");
       RtcManager$buildAryaInnerState$1$d uobuildAryaI = new RtcManager$buildAryaInnerState$1$d(this, "PreparingState");
       RtcManager$buildAryaInnerState$1$c uobuildAryaI1 = new RtcManager$buildAryaInnerState$1$c(this, "InRoomState");
       p0.a(RtcManager$buildAryaInnerState$1$1.INSTANCE).b(uoa, RtcManager$buildAryaInnerState$1$2.INSTANCE).c(uoa).c(uobuildAryaI).c(uobuildAryaI1).d("prepare_rtc", uoa, uobuildAryaI, RtcManager$PrepareRtcSuccess.class, RtcManager$buildAryaInnerState$1$a.a).d("prepare_done", uobuildAryaI, uobuildAryaI1, RtcManager$EnterRoomCompleteEvent.class, RtcManager$buildAryaInnerState$1$b.a);
       return;
    }
}
