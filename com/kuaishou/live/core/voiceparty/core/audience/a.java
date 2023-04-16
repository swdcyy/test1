package com.kuaishou.live.core.voiceparty.core.audience.a;
import erd.g;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$d;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$EnterRoomTimeoutEvent;
import ut7.e;
import com.kwai.statechart.a;

public final class a implements g	// class@0013b4
{
    public final RtcManager$buildAryaInnerState$1$d b;

    public void a(RtcManager$buildAryaInnerState$1$d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          this.b.g(new RtcManager$EnterRoomTimeoutEvent());
       }
       return;
    }
}
