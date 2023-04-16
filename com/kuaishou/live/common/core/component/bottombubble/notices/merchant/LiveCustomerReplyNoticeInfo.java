package com.kuaishou.live.common.core.component.bottombubble.notices.merchant.LiveCustomerReplyNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeClickEventInfo;
import com.kuaishou.livestream.message.nano.ClickCommentNoticeEvent;

public class LiveCustomerReplyNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000fe4
{
    public LiveCommentNoticeClickEventInfo mNoticeClickEventInfo;
    public String mTitle;
    public static final long serialVersionUID = 0x3d450a218b06062;

    public void LiveCustomerReplyNoticeInfo(){
       super();
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCustomerReplyNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       if (p0.clickEvent != null) {
          LiveCommentNoticeClickEventInfo liveCommentN = new LiveCommentNoticeClickEventInfo();
          this.mNoticeClickEventInfo = liveCommentN;
          liveCommentN.mUrl = p0.clickEvent.url;
       }
       this.mTitle = p0.title;
       return;
    }
}
