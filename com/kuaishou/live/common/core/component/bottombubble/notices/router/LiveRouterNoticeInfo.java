package com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import ekd.q;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo$ButtonInfo;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo$ContainerInfo;
import com.kuaishou.livestream.message.nano.ClickCommentNoticeEvent;

public class LiveRouterNoticeInfo extends LiveCommentNoticeBaseInfo	// class@000fee
{
    public LiveRouterNoticeInfo$ButtonInfo mButtonInfo;
    public LiveRouterNoticeInfo$ContainerInfo mContainerInfo;
    public List mContentIconUrls;
    public String mDescription;
    public boolean mEnableShowButton;
    public LiveRouterNoticeExtraInfo mExtraInfo;
    public JsonObject mExtraInfoJson;
    public boolean mIsContentIconSquare;
    public long mNextShowTimeStampMs;
    public String mSubTitle;
    public int mTotalShowTimes;
    public static final long serialVersionUID = 0x842a7f7578d53337;

    public void LiveRouterNoticeInfo(){
       super();
    }
    public void parseJsonRemains(){
       if (PatchProxy.applyVoid(null, this, LiveRouterNoticeInfo.class, "2")) {
          return;
       }
       LiveRouterNoticeInfo tmExtraInfoJ = this.mExtraInfoJson;
       if (tmExtraInfoJ != null) {
          String str = tmExtraInfoJ.toString();
          this.mExtraInfo = LiveCommentNoticeBaseExtraInfo.parseExtraInfo(str, LiveRouterNoticeExtraInfo.class);
          this.mExtraInfoStr = str;
       }
       tmExtraInfoJ = this.mExtraInfo;
       if (tmExtraInfoJ != null) {
          LiveCommentNoticeBaseExtraInfo mDelayDispla = tmExtraInfoJ.mDelayDisplayTimeMs;
          if (mDelayDispla > 0) {
             this.mDelayDisplayTimeMs = mDelayDispla;
          }
       }
       return;
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRouterNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       this.mSubTitle = p0.subTitle;
       this.mDescription = p0.desc;
       this.mIsContentIconSquare = p0.noticePicIsSquare;
       this.mContentIconUrls = q.a(e0.i(p0.commentNoticePicUrl));
       this.mTotalShowTimes = p0.totalShowTimes;
       SCCommentNotice button = p0.button;
       if (button != null) {
          LiveRouterNoticeInfo$ButtonInfo uButtonInfo = new LiveRouterNoticeInfo$ButtonInfo();
          this.mButtonInfo = uButtonInfo;
          uButtonInfo.mButtonText = button.text;
          uButtonInfo.mRouterUrl = button.url;
          uButtonInfo.mHeightPercent = button.heightPercent;
          uButtonInfo.mWebUrl = button.webUrl;
       }
       button = p0.clickEvent;
       if (button != null) {
          LiveRouterNoticeInfo$ContainerInfo uContainerIn = new LiveRouterNoticeInfo$ContainerInfo();
          this.mContainerInfo = uContainerIn;
          uContainerIn.mRouterUrl = button.url;
          uContainerIn.mWebUrl = button.webUrl;
          uContainerIn.mHeightPercent = button.heightPercent;
       }
       button = p0.delayDisplayMs;
       this.mDelayDisplayTimeMs = button;
       if (!button) {
          LiveRouterNoticeExtraInfo liveRouterNo = LiveCommentNoticeBaseExtraInfo.parseExtraInfo(p0.extraInfo, LiveRouterNoticeExtraInfo.class);
          this.mExtraInfo = liveRouterNo;
          if (liveRouterNo != null) {
             this.mDelayDisplayTimeMs = liveRouterNo.mDelayDisplayTimeMs;
             this.mNextShowTimeStampMs = liveRouterNo.mNextShowTimeStampMs;
          }
       }
       return;
    }
}
