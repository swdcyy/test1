package com.kuaishou.live.common.core.component.bottombubble.notices.highlight.LiveHighlightNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import ekd.q;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.LiveHighlightNoticeInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;

public class LiveHighlightNoticeInfo extends LiveCommentNoticeBaseInfo	// class@000fd1
{
    public List mContentIconUrls;
    public String mDescription;
    public LiveHighlightNoticeInfo$ExtraInfo mExtraInfo;
    public LiveCommentNoticeButtonInfo mLiveCommentNoticeButtonInfo;
    public long mRandomTimeDuration;
    public LiveAudienceHighlightVideoInfo mVideoInfo;
    public static final long serialVersionUID = 0x8b3b10fb72d4c9af;

    public void LiveHighlightNoticeInfo(){
       super();
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHighlightNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       this.mDescription = p0.desc;
       if (p0.button != null) {
          LiveCommentNoticeButtonInfo liveCommentN = new LiveCommentNoticeButtonInfo();
          this.mLiveCommentNoticeButtonInfo = liveCommentN;
          SCCommentNotice button = p0.button;
          liveCommentN.mBtnTitle = button.text;
          liveCommentN.mBtnUrl = button.url;
       }
       this.mContentIconUrls = q.a(e0.i(p0.commentNoticePicUrl));
       p0 = p0.extraInfo;
       if (p0 != null) {
          LiveHighlightNoticeInfo$ExtraInfo uExtraInfo = LiveCommentNoticeBaseExtraInfo.parseExtraInfo(p0, LiveHighlightNoticeInfo$ExtraInfo.class);
          this.mExtraInfo = uExtraInfo;
          if (uExtraInfo != null) {
             this.mVideoInfo = uExtraInfo.mVideoInfo;
             this.mRandomTimeDuration = uExtraInfo.mRandomTimeDuration;
          }
       }
       return;
    }
}
