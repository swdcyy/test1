package com.kwai.feature.api.social.message.imshare.model.IMShareLinkInfoObject;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import com.yxcorp.gifshow.entity.LinkInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class IMShareLinkInfoObject extends IMShareObject	// class@001154
{
    public final LinkInfo linkInfo;
    public static final long serialVersionUID = 0x25e688ae36b92e6d;

    public void IMShareLinkInfoObject(LinkInfo p0,String p1){
       super();
       this.linkInfo = p0;
       this.shareId = p1;
    }
    public static IMShareLinkInfoObject ofSend(LinkInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IMShareLinkInfoObject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMShareLinkInfoObject(p0, null);
    }
    public static IMShareLinkInfoObject ofShare(LinkInfo p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, IMShareLinkInfoObject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMShareLinkInfoObject(p0, p1);
    }
    public int getKwaiMsgType(){
       return 1009;
    }
    public int getShareAction(){
       return 3;
    }
}
