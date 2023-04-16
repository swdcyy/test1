package com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler$c;
import erd.g;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.a;
import java.lang.Runnable;
import ekd.k1;

public final class LiveLiteBaseFollowGuideNoticeHandler$c implements g	// class@00086c
{
    public final LiveLiteBaseFollowGuideNoticeHandler b;

    public void LiveLiteBaseFollowGuideNoticeHandler$c(LiveLiteBaseFollowGuideNoticeHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       LiveLiteBaseFollowGuideNoticeHandler$c uoc = LiveLiteBaseFollowGuideNoticeHandler$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoc, "1")) {
          uoc = this.b;
          uoc.d = b;
          k1.s(new a(this, b), uoc, 1);
       }
       return;
    }
}
