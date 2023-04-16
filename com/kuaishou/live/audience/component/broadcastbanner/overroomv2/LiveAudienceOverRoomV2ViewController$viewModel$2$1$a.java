package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$viewModel$2$1$a;
import nx0.x$b;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$viewModel$2$1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$viewModel$2;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveAudienceOverRoomV2ViewController$viewModel$2$1$a implements x$b	// class@000a53
{
    public final LiveAudienceOverRoomV2ViewController$viewModel$2$1 a;

    public void LiveAudienceOverRoomV2ViewController$viewModel$2$1$a(LiveAudienceOverRoomV2ViewController$viewModel$2$1 p0){
       this.a = p0;
       super();
    }
    public String a(){
       LiveStreamFeedWrapper obj = PatchProxy.apply(null, this, LiveAudienceOverRoomV2ViewController$viewModel$2$1$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.this$0.this$0.t.r5();
       a.o(obj, "feedService.liveStreamFeedWrapper");
       String userId = obj.getUserId();
       a.o(userId, "feedService.liveStreamFeedWrapper.userId");
       return userId;
    }
    public Activity getActivity(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceOverRoomV2ViewController$viewModel$2$1$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.this$0.this$0.B2();
    }
}
