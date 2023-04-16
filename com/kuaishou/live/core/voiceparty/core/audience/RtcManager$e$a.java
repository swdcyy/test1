package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$e$a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$e;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import kotlin.jvm.internal.a;
import zo2.o0;

public final class RtcManager$e$a implements Runnable	// class@0013a8
{
    public final RtcManager$e b;
    public final LiveAryaBroadcastProto$LiveAryaBroadcastMessage c;

    public void RtcManager$e$a(RtcManager$e p0,LiveAryaBroadcastProto$LiveAryaBroadcastMessage p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, RtcManager$e$a.class, "1")) {
          return;
       }
       RtcManager$e$a tc = this.c;
       a.o(tc, "msg");
       this.b.a.b.X(tc);
       return;
    }
}
