package com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig;
import v91.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ka3.a;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1$frequencyConsumerSupplier$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls;
import java.lang.Number;
import java.lang.Long;
import msd.p;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;

public final class LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1 implements LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage	// class@00086a
{
    public final a a;
    public final String b;
    public final String c;
    public Long d;
    public final a e;
    public final boolean f;
    public final p g;
    public final LiveLiteBaseFollowGuideNoticeHandler h;
    public final LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig i;
    public final b j;

    public void LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1(LiveLiteBaseFollowGuideNoticeHandler p0,LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig p1,b p2){
       this.h = p0;
       this.i = p1;
       this.j = p2;
       super();
       a uoa = PatchProxy.applyOneRefs(p1, p0, LiveLiteBaseFollowGuideNoticeHandler.class, "5");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(p0, p1);
       }
       this.a = uoa;
       this.b = p1.mCommonGuideSubBizType;
       this.c = p1.mMessageId;
       this.d = p1.mDisplayDuration;
       this.e = uoa;
       this.f = true;
       this.g = new LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1$frequencyConsumerSupplier$1(this);
       return;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.a(this);
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return 0;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return 0;
    }
    public void d(long p0){
       this.d = Long.valueOf(p0);
    }
    public long e(){
       return this.d.longValue();
    }
    public p f(){
       return this.g;
    }
    public String g(){
       return this.b;
    }
    public String getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public LiveLiteGuidanceMessageQueueManager$b h(){
       return this.e;
    }
    public boolean k(){
       return this.f;
    }
    public String l(){
       return this.c;
    }
}
