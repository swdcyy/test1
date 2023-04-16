package com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo$WishLightExtraInfo;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveWishNoticeInfo extends LiveGenericCommentNoticeInfo	// class@00101a
{
    public long mDisplayEndTime;
    public static final long serialVersionUID = 0xd37618d68e4abf4a;

    public void LiveWishNoticeInfo(){
       super();
    }
    public Class getExtraInfoClass(){
       return LiveWishNoticeInfo$WishLightExtraInfo.class;
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWishNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       this.mDisplayEndTime = p0.displayEndTime;
       return;
    }
}
