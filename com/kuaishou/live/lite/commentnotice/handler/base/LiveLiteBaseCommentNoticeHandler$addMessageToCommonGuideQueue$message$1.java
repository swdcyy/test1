package com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import ia3.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import msd.l;
import java.lang.Object;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls;
import msd.p;
import com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1$frequencyConsumerSupplier$1;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1 implements LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage	// class@00085b
{
    public final LiveLiteGuidanceMessageQueueManager$b a;
    public long b;
    public final a c;
    public final LiveCommentNoticeBaseInfo d;
    public final long e;
    public final long f;
    public final l g;
    public final long h;

    public void LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1(a p0,LiveCommentNoticeBaseInfo p1,long p2,long p3,l p4,long p5){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       super();
       this.a = p4.invoke(this);
       this.b = p5;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.a(this);
    }
    public long b(){
       return this.f;
    }
    public long c(){
       return this.e;
    }
    public void d(long p0){
       this.b = p0;
    }
    public long e(){
       return this.b;
    }
    public p f(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1$frequencyConsumerSupplier$1(this);
    }
    public String g(){
       LiveCommentNoticeBaseInfo obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.mCommonGuideSubBizType;
       a.o(obj, "notice.mCommonGuideSubBizType");
       return obj;
    }
    public String getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public LiveLiteGuidanceMessageQueueManager$b h(){
       return this.a;
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public String l(){
       LiveCommentNoticeBaseInfo obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.mBizId;
       a.o(obj, "notice.mBizId");
       return obj;
    }
}
