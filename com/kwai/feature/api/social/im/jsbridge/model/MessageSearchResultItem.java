package com.kwai.feature.api.social.im.jsbridge.model.MessageSearchResultItem;
import com.kwai.feature.api.social.im.jsbridge.model.MessageSearchItem;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class MessageSearchResultItem implements MessageSearchItem	// class@0010ff
{
    public final String conversationId;
    public final int conversationType;
    public final String imageUrl;
    public final List imageUrls;
    public final int memberCount;
    public final long msgClientSeq;
    public final int msgCount;
    public final long msgSeq;
    public final String msgSummary;
    public final long msgTime;
    public final String showName;
    public final String subBiz;

    public void MessageSearchResultItem(String p0,int p1,String p2,String p3,String p4,List p5,int p6,int p7,long p8,long p9,String p10,long p11){
       int i = this;
       Object obj = p10;
       a.p(p0, "subBiz");
       a.p(p2, "conversationId");
       a.p(obj, "msgSummary");
       super();
       i.subBiz = p0;
       i.conversationType = p1;
       i.conversationId = p2;
       i.showName = p3;
       i.imageUrl = p4;
       i.imageUrls = p5;
       i.memberCount = p6;
       i.msgCount = p7;
       i.msgSeq = p8;
       i.msgClientSeq = p9;
       i.msgSummary = obj;
       i.msgTime = p11;
    }
    public final String getConversationId(){
       return this.conversationId;
    }
    public final int getConversationType(){
       return this.conversationType;
    }
    public final String getImageUrl(){
       return this.imageUrl;
    }
    public final List getImageUrls(){
       return this.imageUrls;
    }
    public final int getMemberCount(){
       return this.memberCount;
    }
    public final long getMsgClientSeq(){
       return this.msgClientSeq;
    }
    public final int getMsgCount(){
       return this.msgCount;
    }
    public final long getMsgSeq(){
       return this.msgSeq;
    }
    public final String getMsgSummary(){
       return this.msgSummary;
    }
    public final long getMsgTime(){
       return this.msgTime;
    }
    public final String getShowName(){
       return this.showName;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
}
