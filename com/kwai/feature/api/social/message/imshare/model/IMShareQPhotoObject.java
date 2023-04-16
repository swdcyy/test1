package com.kwai.feature.api.social.message.imshare.model.IMShareQPhotoObject;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class IMShareQPhotoObject extends IMShareObject	// class@001157
{
    public final String actionUri;
    public final BaseFeed feed;
    public static final long serialVersionUID = 0x766ff1f2985e8b13;

    public void IMShareQPhotoObject(BaseFeed p0,String p1,String p2){
       super();
       this.feed = p0;
       this.actionUri = p1;
       this.shareId = p2;
    }
    public static IMShareQPhotoObject ofSend(BaseFeed p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, IMShareQPhotoObject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMShareQPhotoObject(p0, p1, null);
    }
    public static IMShareQPhotoObject ofShare(BaseFeed p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, IMShareQPhotoObject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMShareQPhotoObject(p0, p1, p2);
    }
    public int getKwaiMsgType(){
       return 1004;
    }
    public int getShareAction(){
       return 2;
    }
}
