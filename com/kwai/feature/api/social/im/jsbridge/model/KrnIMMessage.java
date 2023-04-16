package com.kwai.feature.api.social.im.jsbridge.model.KrnIMMessage;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KrnIMMessage implements Serializable	// class@0010f7
{
    public final int categoryId;
    public final String conversationId;
    public final int conversationType;
    public final String from;
    public final String realFrom;
    public final long sentTime;
    public final String seq;
    public final String subBiz;

    public void KrnIMMessage(String p0,String p1,int p2,long p3,String p4,String p5,String p6,int p7){
       a.p(p1, "conversationId");
       super();
       this.seq = p0;
       this.conversationId = p1;
       this.conversationType = p2;
       this.sentTime = p3;
       this.from = p4;
       this.realFrom = p5;
       this.subBiz = p6;
       this.categoryId = p7;
    }
}
