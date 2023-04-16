package com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.LiveCommonBubbleInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import ekd.q;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeClickEventInfo;
import com.kuaishou.livestream.message.nano.ClickCommentNoticeEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveCommonBubbleInfo extends LiveCommentNoticeBaseInfo	// class@000fa5
{
    public LiveCommentNoticeClickEventInfo mClickEvent;
    public List mContentIconUrls;
    public String mDescription;
    public LiveCommentNoticeBaseExtraInfo mExtraInfo;
    public boolean mIsContentIconSquare;
    public String mSubTitle;
    public static final long serialVersionUID = 0xbc3ecdd82fdda5ae;

    public void LiveCommonBubbleInfo(){
       super();
    }
    public void parseJsonRemains(){
       LiveCommonBubbleInfo tmExtraInfo = this.mExtraInfo;
       if (tmExtraInfo != null) {
          this.mDelayDisplayTimeMs = tmExtraInfo.mDelayDisplayTimeMs;
       }
       return;
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommonBubbleInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       this.mSubTitle = p0.subTitle;
       this.mDescription = p0.desc;
       this.mIsContentIconSquare = p0.noticePicIsSquare;
       this.mContentIconUrls = q.a(e0.i(p0.commentNoticePicUrl));
       LiveCommentNoticeClickEventInfo liveCommentN = null;
       if (p0.clickEvent != null) {
          liveCommentN = new LiveCommentNoticeClickEventInfo();
          SCCommentNotice clickEvent = p0.clickEvent;
          liveCommentN.mUrl = clickEvent.url;
          liveCommentN.mHeightPercent = clickEvent.heightPercent;
          liveCommentN.mFullScreen = clickEvent.fullScreen;
       }
       this.mClickEvent = liveCommentN;
       SCCommentNotice delayDisplay = p0.delayDisplayMs;
       this.mDelayDisplayTimeMs = delayDisplay;
       if (!delayDisplay) {
          LiveCommentNoticeBaseExtraInfo liveCommentN1 = LiveCommentNoticeBaseExtraInfo.parseExtraInfo(p0.extraInfo, LiveCommentNoticeBaseExtraInfo.class);
          this.mExtraInfo = liveCommentN1;
          if (liveCommentN1 != null) {
             this.mDelayDisplayTimeMs = liveCommentN1.mDelayDisplayTimeMs;
          }
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCommonBubbleInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CommonBubbleInfo{subTitle=\'"+this.mSubTitle+'''+", description=\'"+this.mDescription+'''+", isContentIconSquare="+this.mIsContentIconSquare+", contentIconUrls="+this.mContentIconUrls+", displayDurationMs="+this.mDisplayDurationMs+", priority="+this.mPriority+", bizId=\'"+this.mBizId+'''+", mLiveCommentNoticeClickEventInfo=\'"+this.mClickEvent+'''+'}';
    }
}
