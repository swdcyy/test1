package com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo$ButtonInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveRouterNoticeInfo$ButtonInfo implements Serializable	// class@000fec
{
    public String mButtonText;
    public float mHeightPercent;
    public String mRouterUrl;
    public String mWebUrl;
    public static final long serialVersionUID = 0xf2911bd89e5aedf1;

    public void LiveRouterNoticeInfo$ButtonInfo(){
       super();
    }
    public static LiveRouterNoticeInfo$ButtonInfo transformFromPb(CommentNoticeButton p0){
       LiveRouterNoticeInfo$ButtonInfo uButtonInfo = null;
       Object obj = PatchProxy.applyOneRefs(p0, uButtonInfo, LiveRouterNoticeInfo$ButtonInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          uButtonInfo = new LiveRouterNoticeInfo$ButtonInfo();
          uButtonInfo.mButtonText = p0.text;
          uButtonInfo.mRouterUrl = p0.url;
          uButtonInfo.mWebUrl = p0.webUrl;
          uButtonInfo.mHeightPercent = p0.heightPercent;
       }
       return uButtonInfo;
    }
}
