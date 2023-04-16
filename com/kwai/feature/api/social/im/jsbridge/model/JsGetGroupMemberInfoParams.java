package com.kwai.feature.api.social.im.jsbridge.model.JsGetGroupMemberInfoParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public final class JsGetGroupMemberInfoParams implements Serializable	// class@0010e5
{
    public final String groupId;
    public final String subBiz;
    public final String userId;

    public void JsGetGroupMemberInfoParams(String p0,String p1,String p2){
       super();
       this.groupId = p0;
       this.userId = p1;
       this.subBiz = p2;
    }
}
