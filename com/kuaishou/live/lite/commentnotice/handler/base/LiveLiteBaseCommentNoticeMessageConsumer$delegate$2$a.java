package com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a;
import ia3.b;
import com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeMessageConsumer$delegate$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ia3.c;
import com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeMessageConsumer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import msd.l;
import z1.a;
import la3.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import java.lang.Long;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$a;

public final class LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a implements b	// class@00085c
{
    public final LiveLiteBaseCommentNoticeMessageConsumer$delegate$2 a;

    public void LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a(LiveLiteBaseCommentNoticeMessageConsumer$delegate$2 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a uodelegate$2 = LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a.class;
       if (PatchProxy.isSupport(uodelegate$2) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uodelegate$2, "3")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.this$0.e.a();
       a.o(liveStreamPa, "logPackageProvider.liveStreamPackage");
       LiveCommentNoticeBaseInfo mCommonGuide = this.a.this$0.c().mCommonGuideSubBizType;
       a.o(mCommonGuide, "notice.mCommonGuideSubBizType");
       c.b(c.a, liveStreamPa, mCommonGuide, p0, this.a.this$0.c().getLogExtraInfo(), null, 16, null);
       return;
    }
    public void b(int p0,a p1){
       LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a uodelegate$2 = LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a.class;
       if (PatchProxy.isSupport(uodelegate$2) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uodelegate$2, "4")) {
          return;
       }
       this.a.this$0.f.a(p0, p1);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a.class, "1")) {
          return;
       }
       LiveLiteBaseCommentNoticeMessageConsumer$delegate$2 this$0 = this.a.this$0;
       this$0.g.c(this$0.b());
       return;
    }
    public void d(long p0){
       LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a uodelegate$2 = LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a.class;
       if (PatchProxy.isSupport(uodelegate$2) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uodelegate$2, "2")) {
          return;
       }
       LiveLiteBaseCommentNoticeMessageConsumer$delegate$2 this$0 = this.a.this$0;
       this$0.g.a(this$0.b().l(), new LiveLiteGuidanceMessageQueueManager$a().b(p0));
       return;
    }
}
