package com.kwai.feature.api.social.im.jsbridge.model.MessageSearchItemChat;
import com.kwai.feature.api.social.im.jsbridge.model.MessageSearchItem;
import java.lang.String;
import java.util.List;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class MessageSearchItemChat implements MessageSearchItem	// class@0010fc
{
    public final String aliasName;
    public final String conversationId;
    public final int conversationType;
    public final String groupName;
    public final String groupTag;
    public final Integer groupType;
    public final String imageUrl;
    public final List imageUrls;
    public final Integer memberCount;
    public final long msgClientSeq;
    public final int msgCount;
    public final long msgSeq;
    public final String msgSummary;
    public final long msgTime;
    public final Integer relationship;
    public final String subBiz;
    public final String userName;

    public void MessageSearchItemChat(String p0,int p1,String p2,String p3,List p4,String p5,String p6,Integer p7,String p8,Integer p9,Integer p10,String p11,int p12,long p13,long p14,String p15,long p16){
       int i = this;
       Object obj = p15;
       a.p(p0, "subBiz");
       a.p(p2, "conversationId");
       a.p(obj, "msgSummary");
       super();
       i.subBiz = p0;
       i.conversationType = p1;
       i.conversationId = p2;
       i.imageUrl = p3;
       i.imageUrls = p4;
       i.userName = p5;
       i.aliasName = p6;
       i.relationship = p7;
       i.groupName = p8;
       i.memberCount = p9;
       i.groupType = p10;
       i.groupTag = p11;
       i.msgCount = p12;
       i.msgSeq = p13;
       i.msgClientSeq = p14;
       i.msgSummary = obj;
       i.msgTime = p16;
    }
    public final String getAliasName(){
       return this.aliasName;
    }
    public final String getConversationId(){
       return this.conversationId;
    }
    public final int getConversationType(){
       return this.conversationType;
    }
    public final String getGroupName(){
       return this.groupName;
    }
    public final String getGroupTag(){
       return this.groupTag;
    }
    public final Integer getGroupType(){
       return this.groupType;
    }
    public final String getImageUrl(){
       return this.imageUrl;
    }
    public final List getImageUrls(){
       return this.imageUrls;
    }
    public final Integer getMemberCount(){
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
    public final Integer getRelationship(){
       return this.relationship;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public final String getUserName(){
       return this.userName;
    }
}
