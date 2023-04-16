package com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideConsumerImpl$a;
import ja3.c;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideConsumerImpl;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;

public final class LiveLiteFollowGuideConsumerImpl$a implements c	// class@00085f
{
    public final LiveLiteFollowGuideConsumerImpl a;
    public final LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage b;

    public void LiveLiteFollowGuideConsumerImpl$a(LiveLiteFollowGuideConsumerImpl p0,LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(long p0){
       LiveLiteFollowGuideConsumerImpl$a uoa = LiveLiteFollowGuideConsumerImpl$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.g.a(this.b.l(), new LiveLiteGuidanceMessageQueueManager$a().b(p0));
       return;
    }
}
