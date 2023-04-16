package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.b;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$f;
import com.kuaishou.protobuf.livestream.nano.SCLiveOverRoomMessageV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;

public final class b implements Runnable	// class@000a5f
{
    public final a$f b;
    public final SCLiveOverRoomMessageV2 c;

    public void b(a$f p0,SCLiveOverRoomMessageV2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b tc = this.c;
       a.o(tc, "it");
       this.b.b.b(tc);
       return;
    }
}
