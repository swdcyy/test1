package com.kwai.feature.api.social.im.jsbridge.model.JsSearchChatParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public final class JsSearchChatParams implements Serializable	// class@0010ea
{
    public final String callback;
    public final boolean enableSearchAllGroup;
    public final boolean enableSearchMessage;
    public final boolean enableSearchP2PChat;
    public final boolean enableSearchPrivateGroup;
    public final boolean enableSearchPublicGroup;
    public final String keyword;
    public final int limitCount;

    public void JsSearchChatParams(String p0,int p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,String p7){
       super();
       this.keyword = p0;
       this.limitCount = p1;
       this.enableSearchP2PChat = p2;
       this.enableSearchPublicGroup = p3;
       this.enableSearchPrivateGroup = p4;
       this.enableSearchAllGroup = p5;
       this.enableSearchMessage = p6;
       this.callback = p7;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final boolean getEnableSearchAllGroup(){
       return this.enableSearchAllGroup;
    }
    public final boolean getEnableSearchMessage(){
       return this.enableSearchMessage;
    }
    public final boolean getEnableSearchP2PChat(){
       return this.enableSearchP2PChat;
    }
    public final boolean getEnableSearchPrivateGroup(){
       return this.enableSearchPrivateGroup;
    }
    public final boolean getEnableSearchPublicGroup(){
       return this.enableSearchPublicGroup;
    }
    public final String getKeyword(){
       return this.keyword;
    }
    public final int getLimitCount(){
       return this.limitCount;
    }
}
