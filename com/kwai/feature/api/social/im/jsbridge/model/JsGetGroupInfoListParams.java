package com.kwai.feature.api.social.im.jsbridge.model.JsGetGroupInfoListParams;
import java.io.Serializable;
import java.util.List;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;

public final class JsGetGroupInfoListParams implements Serializable	// class@0010e4
{
    public final Boolean fromServer;
    public final List groupIds;
    public final String subBiz;

    public void JsGetGroupInfoListParams(List p0,Boolean p1,String p2){
       super();
       this.groupIds = p0;
       this.fromServer = p1;
       this.subBiz = p2;
    }
}
