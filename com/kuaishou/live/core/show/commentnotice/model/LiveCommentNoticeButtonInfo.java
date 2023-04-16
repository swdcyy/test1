package com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveCommentNoticeButtonInfo implements Serializable	// class@000a4e
{
    public String mBtnTitle;
    public String mBtnUrl;
    public float mHeightPercent;
    public String mWebUrl;
    public static final long serialVersionUID = 0xaaf2de0a519d60f9;

    public void LiveCommentNoticeButtonInfo(){
       super();
    }
    public static LiveCommentNoticeButtonInfo transformFromPb(CommentNoticeButton p0){
       LiveCommentNoticeButtonInfo liveCommentN = null;
       Object obj = PatchProxy.applyOneRefs(p0, liveCommentN, LiveCommentNoticeButtonInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          liveCommentN = new LiveCommentNoticeButtonInfo();
          liveCommentN.mBtnTitle = p0.text;
          liveCommentN.mBtnUrl = p0.url;
          liveCommentN.mWebUrl = p0.webUrl;
          liveCommentN.mHeightPercent = p0.heightPercent;
       }
       return liveCommentN;
    }
}
