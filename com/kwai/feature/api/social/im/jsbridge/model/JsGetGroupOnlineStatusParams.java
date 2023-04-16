package com.kwai.feature.api.social.im.jsbridge.model.JsGetGroupOnlineStatusParams;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Long;
import java.lang.Object;

public final class JsGetGroupOnlineStatusParams implements Serializable	// class@0010e6
{
    public final Long cacheExpireDuration;
    public final List groupIds;
    public final String subBiz;

    public void JsGetGroupOnlineStatusParams(String p0,List p1,Long p2){
       super();
       this.subBiz = p0;
       this.groupIds = p1;
       this.cacheExpireDuration = p2;
    }
}
