package com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo$ExtraInfo;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;

public class LiveIncreaseFansNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000fd7
{
    public int mDeliveryPerformStatus;
    public int mDisplayCount;
    public String mExtraInfoStr;
    public String mRenewPopDesc;
    public String mRenewPopTitle;
    public String mRightButtonText;
    public String mToAuthorStopTips;
    public String mUserId;
    public static final long serialVersionUID = 0x36e5cb9c20867744;

    public void LiveIncreaseFansNoticeInfo(){
       super();
    }
    public Class getExtraInfoClass(){
       return LiveIncreaseFansNoticeInfo$ExtraInfo.class;
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveIncreaseFansNoticeInfo.class, "2")) {
          return;
       }
       super.parsePbRemains(p0);
       this.mExtraInfoStr = p0.extraInfo;
       return;
    }
    public void setShortcutsForExtraInfo(){
       if (PatchProxy.applyVoid(null, this, LiveIncreaseFansNoticeInfo.class, "1")) {
          return;
       }
       super.setShortcutsForExtraInfo();
       this.mDisplayCount = (this.mNoticeType == 44)? this.mExtraInfo.mDeliveryCount: this.mExtraInfo.mFansIncreasingCount;
       LiveGenericCommentNoticeInfo tmExtraInfo = this.mExtraInfo;
       this.mUserId = tmExtraInfo.mUserId;
       this.mDeliveryPerformStatus = tmExtraInfo.mDeliveryPerformStatus;
       this.mToAuthorStopTips = tmExtraInfo.mToAuthorStopTips;
       this.mRenewPopTitle = tmExtraInfo.mRenewPopTitle;
       this.mRenewPopDesc = tmExtraInfo.mRenewPopDesc;
       return;
    }
}
