package com.kwai.feature.api.social.im.jsbridge.model.JsGetUserOnlineStatusParams;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Boolean;
import java.lang.Object;
import nsd.u;

public final class JsGetUserOnlineStatusParams implements Serializable	// class@0010e7
{
    public final Boolean onlyFromServer;
    public final String subBiz;
    public final List userIds;

    public void JsGetUserOnlineStatusParams(String p0,List p1,Boolean p2){
       super();
       this.subBiz = p0;
       this.userIds = p1;
       this.onlyFromServer = p2;
    }
    public void JsGetUserOnlineStatusParams(String p0,List p1,Boolean p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = Boolean.FALSE;
       }
       super(p0, p1, p2);
       return;
    }
}
