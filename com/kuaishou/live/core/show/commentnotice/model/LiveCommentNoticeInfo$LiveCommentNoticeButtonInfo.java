package com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo implements Serializable	// class@000a51
{
    public float mHeightPercent;
    public String mLiveCommentNoticeBtnTitle;
    public String mLiveCommentNoticeBtnUrl;
    public String mWebUrl;
    public static final long serialVersionUID = 0xaaf2de0a519d60f9;

    public void LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo(){
       super();
    }
    public static LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo convertFromPb(CommentNoticeButton p0){
       LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo liveCommentN = null;
       Object obj = PatchProxy.applyOneRefs(p0, liveCommentN, LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          liveCommentN = new LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo();
          liveCommentN.mHeightPercent = p0.heightPercent;
          liveCommentN.mWebUrl = p0.webUrl;
          liveCommentN.mLiveCommentNoticeBtnUrl = p0.url;
          liveCommentN.mLiveCommentNoticeBtnTitle = p0.text;
       }
       return liveCommentN;
    }
}
