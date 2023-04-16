package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$c;
import mq5.h;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;

public final class LiveAudienceOverRoomV2ViewController$c implements h	// class@000a51
{
    public final LiveAudienceOverRoomV2ViewController b;

    public void LiveAudienceOverRoomV2ViewController$c(LiveAudienceOverRoomV2ViewController p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceOverRoomV2ViewController$c.class, "1")) {
          return;
       }
       this.b.V2().a(4);
       return;
    }
}
