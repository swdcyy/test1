package com.kwai.feature.api.social.im.jsbridge.model.JsSearchMessageInChatParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public final class JsSearchMessageInChatParams implements Serializable	// class@0010eb
{
    public final int count;
    public final String keyword;
    public final String offset;
    public final String subBiz;
    public final String targetId;
    public final int targetType;

    public void JsSearchMessageInChatParams(String p0,String p1,int p2,String p3,int p4,String p5){
       super();
       this.keyword = p0;
       this.offset = p1;
       this.count = p2;
       this.subBiz = p3;
       this.targetType = p4;
       this.targetId = p5;
    }
}
