package com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideConsumerImpl;
import ja3.b;
import android.content.Context;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.String;
import pg1.e;
import xp5.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import ja3.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import ja3.d;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideConsumerImpl$onFinishConsumeFollowGuide$1$1;
import msd.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideConsumerImpl$a;
import ja3.c;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideConsumerImpl$onStartConsumeFollowGuide$1;

public final class LiveLiteFollowGuideConsumerImpl implements b	// class@000862
{
    public d a;
    public final Context b;
    public final LiveStreamFeed c;
    public final String d;
    public final e e;
    public final i f;
    public final LiveLiteGuidanceMessageQueueManager g;
    public final a h;
    public final a i;

    public void LiveLiteFollowGuideConsumerImpl(Context p0,LiveStreamFeed p1,String p2,e p3,i p4,LiveLiteGuidanceMessageQueueManager p5,a p6,a p7){
       a.p(p0, "context");
       a.p(p2, "anchorUserId");
       a.p(p3, "followManager");
       a.p(p4, "logPackageProvider");
       a.p(p5, "guideMessageService");
       a.p(p6, "commentEditorService");
       a.p(p7, "followGuideViewDelegate");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public void a(LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFollowGuideConsumerImpl.class, "2")) {
          return;
       }
       a.p(p0, "followGuideConfig");
       b.Z(LiveLiteLogTag.LIVE_FOLLOW_GUIDE, "onFinishConsumeFollowGuide");
       LiveLiteFollowGuideConsumerImpl ta = this.a;
       if (ta != null) {
          this.i.h(ta.d(), new LiveLiteFollowGuideConsumerImpl$onFinishConsumeFollowGuide$1$1(ta));
       }
       this.a = null;
       return;
    }
    public void b(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0,LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFollowGuideConsumerImpl.class, "1")) {
          return;
       }
       a.p(p0, "message");
       a.p(p1, "followGuideConfig");
       b.Z(LiveLiteLogTag.LIVE_FOLLOW_GUIDE, "onFinishConsumeFollowGuide");
       d uod = new d(this.b, this.c, this.d, p0.g(), p0.l(), p1, this.e, this.f, new LiveLiteFollowGuideConsumerImpl$a(this, p0), this.h);
       this.a = v0;
       View view = v0.d();
       this.i.e(view, LiveLiteFollowGuideConsumerImpl$onStartConsumeFollowGuide$1.INSTANCE);
       return;
    }
}
