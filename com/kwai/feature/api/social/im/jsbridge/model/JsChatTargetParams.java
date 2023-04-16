package com.kwai.feature.api.social.im.jsbridge.model.JsChatTargetParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public final class JsChatTargetParams implements Serializable	// class@0010e1
{
    public final String subBiz;
    public final String targetId;
    public final int targetType;

    public void JsChatTargetParams(String p0,int p1,String p2){
       super();
       this.subBiz = p0;
       this.targetType = p1;
       this.targetId = p2;
    }
}
