package com.kwai.feature.api.social.im.jsbridge.model.KrnIMConversation;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KrnIMConversation implements Serializable	// class@0010f6
{
    public final String categoryId;
    public final String conversationId;
    public final int conversationType;
    public final String subBiz;

    public void KrnIMConversation(String p0,String p1,int p2,String p3){
       a.p(p1, "conversationId");
       a.p(p3, "categoryId");
       super();
       this.subBiz = p0;
       this.conversationId = p1;
       this.conversationType = p2;
       this.categoryId = p3;
    }
}
