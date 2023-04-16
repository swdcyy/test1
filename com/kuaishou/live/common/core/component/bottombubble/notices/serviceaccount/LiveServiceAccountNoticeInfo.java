package com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo;
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
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import com.google.gson.Gson;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo$ExtraInfo;
import java.lang.RuntimeException;

public class LiveServiceAccountNoticeInfo extends LiveCommentNoticeBaseInfo	// class@000ffb
{
    public List mContentIconUrls;
    public long mDelayDisplayTimeMs;
    public String mDescription;
    public LiveServiceAccountNoticeInfo$ExtraInfo mExtraInfo;
    public LiveCommentNoticeButtonInfo mLiveCommentNoticeButtonInfo;
    public static final long serialVersionUID = 0xb314c32661511bae;

    public void LiveServiceAccountNoticeInfo(){
       super();
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveServiceAccountNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       this.mDescription = p0.desc;
       this.mContentIconUrls = q.a(e0.i(p0.commentNoticePicUrl));
       LiveCommentNoticeButtonInfo liveCommentN = new LiveCommentNoticeButtonInfo();
       this.mLiveCommentNoticeButtonInfo = liveCommentN;
       CommentNoticeButton text = p0.button.text;
       try{
          liveCommentN.mBtnTitle = text;
          if (p0.extraInfo != null) {
             this.mExtraInfo = new Gson().h(p0.extraInfo, LiveServiceAccountNoticeInfo$ExtraInfo.class);
          }
       }catch(com.google.gson.JsonParseException e3){
          e3.printStackTrace();
       }
       LiveServiceAccountNoticeInfo tmExtraInfo = this.mExtraInfo;
       if (tmExtraInfo != null) {
          this.mDelayDisplayTimeMs = tmExtraInfo.mDelayDisplayTimeMs;
       }
       return;
    }
}
