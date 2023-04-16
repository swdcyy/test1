package com.kwai.feature.api.social.message.imshare.model.IMShareKwaiMsgObject;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class IMShareKwaiMsgObject extends IMShareObject	// class@001153
{
    public final KwaiMsg mOriginalMsg;
    public static final long serialVersionUID = 0xc697597a21437be9;

    public void IMShareKwaiMsgObject(KwaiMsg p0){
       super();
       this.mOriginalMsg = p0;
    }
    public int getKwaiMsgType(){
       Object obj = PatchProxy.apply(null, this, IMShareKwaiMsgObject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mOriginalMsg.getMsgType();
    }
    public KwaiMsg getOriginalMsg(){
       return this.mOriginalMsg;
    }
    public int getShareAction(){
       return 7;
    }
}
