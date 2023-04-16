package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$b;
import oq5.c;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;

public final class LiveAudienceOverRoomV2ViewController$b implements c	// class@000a50
{
    public final LiveAudienceOverRoomV2ViewController b;

    public void LiveAudienceOverRoomV2ViewController$b(LiveAudienceOverRoomV2ViewController p0){
       this.b = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceOverRoomV2ViewController$b.class, "1")) {
          return;
       }
       List list = LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2ViewController");
       boolean b = (p0.orientation == 2)? true: false;
       b.S(list, "orientation changed", "isLandscape", Boolean.valueOf(b));
       if (p0.orientation == 2) {
          this.b.V2().a(2);
       }else {
          this.b.V2().f(2);
       }
       return;
    }
}
