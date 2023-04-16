package com.kuaishou.live.common.core.component.bottombubble.notices.gzone.LiveGzoneCommonNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.LiveGzoneCommonNoticeInfo$ExtraInfo;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeClickEventInfo;
import com.kuaishou.livestream.message.nano.ClickCommentNoticeEvent;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;

public class LiveGzoneCommonNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000fc1
{
    public LiveCommentNoticeClickEventInfo mLiveCommentNoticeClickEventInfo;
    public static final long serialVersionUID = 0x71f9f196a8bf3cc1;

    public void LiveGzoneCommonNoticeInfo(){
       super();
    }
    public Class getExtraInfoClass(){
       return LiveGzoneCommonNoticeInfo$ExtraInfo.class;
    }
    public void parseJsonRemains(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneCommonNoticeInfo.class, "2")) {
          return;
       }
       super.parseJsonRemains();
       return;
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCommonNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       if (p0.clickEvent != null) {
          LiveCommentNoticeClickEventInfo liveCommentN = new LiveCommentNoticeClickEventInfo();
          p0 = p0.clickEvent;
          liveCommentN.mFullScreen = p0.fullScreen;
          liveCommentN.mHeightPercent = p0.heightPercent;
          liveCommentN.mUrl = p0.url;
          this.mLiveCommentNoticeClickEventInfo = liveCommentN;
       }
       if (!this.mDelayDisplayTimeMs) {
          LiveGenericCommentNoticeInfo tmExtraInfo = this.mExtraInfo;
          if (tmExtraInfo != null) {
             this.mDelayDisplayTimeMs = tmExtraInfo.mDelayDisplayTimeMs;
          }
       }
       return;
    }
}
