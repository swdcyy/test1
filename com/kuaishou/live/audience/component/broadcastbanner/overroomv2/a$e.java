package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import e93.f;
import java.util.LinkedList;
import crd.b;
import lnc.b9;

public final class a$e implements Observer	// class@000a5c
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             b.P(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2Model"), "disable for room status");
             f.g(this.b);
             this.b.a.clear();
             p0 = this.b;
             p0.e = null;
             b9.a(p0.h);
          }
       }
       return;
    }
}
