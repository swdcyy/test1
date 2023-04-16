package com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeMessageConsumer;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import xp5.i;
import la3.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeMessageConsumer$delegate$2;
import msd.a;
import qrd.p;
import qrd.s;
import n93.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n93.b;
import qrd.l1;

public abstract class LiveLiteBaseCommentNoticeMessageConsumer implements LiveLiteGuidanceMessageQueueManager$b	// class@00085e
{
    public a a;
    public final p b;
    public final LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage c;
    public final LiveCommentNoticeBaseInfo d;
    public final i e;
    public final a f;
    public final LiveLiteGuidanceMessageQueueManager g;
    public final a h;

    public void LiveLiteBaseCommentNoticeMessageConsumer(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0,LiveCommentNoticeBaseInfo p1,i p2,a p3,LiveLiteGuidanceMessageQueueManager p4,a p5){
       a.p(p0, "message");
       a.p(p1, "notice");
       a.p(p2, "logPackageProvider");
       a.p(p3, "liveLiteAdLogService");
       a.p(p4, "guideQueueService");
       a.p(p5, "liteBottomBubbleService");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.b = s.c(new LiveLiteBaseCommentNoticeMessageConsumer$delegate$2(this));
    }
    public abstract a a();
    public final LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage b(){
       return this.c;
    }
    public final LiveCommentNoticeBaseInfo c(){
       return this.d;
    }
    public void i(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseCommentNoticeMessageConsumer.class, "2")) {
          return;
       }
       a.p(p0, "message");
       a uoa = this.a();
       if (uoa != null) {
          b uob = this.h.get();
          if (uob != null) {
             uob.b(uoa);
          }
          a = l1.a;
       }else {
          uoa = null;
       }
       this.a = uoa;
       return;
    }
    public void j(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseCommentNoticeMessageConsumer.class, "3")) {
          return;
       }
       a.p(p0, "message");
       LiveLiteBaseCommentNoticeMessageConsumer ta = this.a;
       if (ta != null) {
          b uob = this.h.get();
          if (uob != null) {
             uob.a(ta);
          }
          this.a = null;
       }
       return;
    }
}
