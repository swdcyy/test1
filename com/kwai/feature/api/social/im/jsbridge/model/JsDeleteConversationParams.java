package com.kwai.feature.api.social.im.jsbridge.model.JsDeleteConversationParams;
import java.io.Serializable;
import java.lang.String;
import com.kwai.feature.api.social.im.jsbridge.model.KrnIMConversation;
import java.lang.Boolean;
import java.lang.Object;

public final class JsDeleteConversationParams implements Serializable	// class@0010e2
{
    public final KrnIMConversation conversation;
    public final Boolean retainMessages;
    public final String subBiz;

    public void JsDeleteConversationParams(String p0,KrnIMConversation p1,Boolean p2){
       super();
       this.subBiz = p0;
       this.conversation = p1;
       this.retainMessages = p2;
    }
}
