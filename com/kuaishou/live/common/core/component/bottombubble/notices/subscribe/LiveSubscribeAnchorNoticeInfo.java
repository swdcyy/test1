package com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
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
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;

public class LiveSubscribeAnchorNoticeInfo extends LiveCommentNoticeBaseInfo	// class@001007
{
    public LiveCommentNoticeButtonInfo mButtonInfo;
    public List mContentIconUrls;
    public String mDescription;
    public LiveSubscribeAnchorNoticeInfo$ExtraInfo mExtraInfo;
    public String mSubTitle;
    public int mTotalShowTimes;
    public static final long serialVersionUID = 0xeb407f405085a186;

    public void LiveSubscribeAnchorNoticeInfo(){
       super();
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeAnchorNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       this.mSubTitle = p0.subTitle;
       this.mDescription = p0.desc;
       this.mContentIconUrls = q.a(e0.i(p0.commentNoticePicUrl));
       this.mExtraInfo = LiveCommentNoticeBaseExtraInfo.parseExtraInfo(p0.extraInfo, LiveSubscribeAnchorNoticeInfo$ExtraInfo.class);
       return;
    }
}
