package com.kwai.feature.api.social.message.imshare.model.IMShareMultiImageLinkInfoObject;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import com.yxcorp.gifshow.entity.MultiImageLinkInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class IMShareMultiImageLinkInfoObject extends IMShareObject	// class@001155
{
    public MultiImageLinkInfo multiImageLinkInfo;
    public static final long serialVersionUID = 0x44672e993442af2e;

    public void IMShareMultiImageLinkInfoObject(MultiImageLinkInfo p0,String p1){
       super();
       this.multiImageLinkInfo = p0;
       this.shareId = p1;
    }
    public static IMShareMultiImageLinkInfoObject ofSend(MultiImageLinkInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IMShareMultiImageLinkInfoObject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMShareMultiImageLinkInfoObject(p0, null);
    }
    public static IMShareMultiImageLinkInfoObject ofShare(MultiImageLinkInfo p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, IMShareMultiImageLinkInfoObject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMShareMultiImageLinkInfoObject(p0, p1);
    }
    public int getKwaiMsgType(){
       return 1010;
    }
    public int getShareAction(){
       return 4;
    }
}
