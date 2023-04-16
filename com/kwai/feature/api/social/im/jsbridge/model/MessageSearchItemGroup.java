package com.kwai.feature.api.social.im.jsbridge.model.MessageSearchItemGroup;
import com.kwai.feature.api.social.im.jsbridge.model.MessageSearchItem;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class MessageSearchItemGroup implements MessageSearchItem	// class@0010fd
{
    public final String conversationId;
    public final int conversationType;
    public final String groupName;
    public final String groupTag;
    public final int groupType;
    public final String imageUrl;
    public final List imageUrls;
    public final int memberCount;
    public final String subBiz;

    public void MessageSearchItemGroup(String p0,int p1,int p2,String p3,String p4,List p5,String p6,int p7,String p8){
       a.p(p0, "groupName");
       a.p(p3, "groupTag");
       a.p(p4, "imageUrl");
       a.p(p5, "imageUrls");
       a.p(p6, "conversationId");
       a.p(p8, "subBiz");
       super();
       this.groupName = p0;
       this.memberCount = p1;
       this.groupType = p2;
       this.groupTag = p3;
       this.imageUrl = p4;
       this.imageUrls = p5;
       this.conversationId = p6;
       this.conversationType = p7;
       this.subBiz = p8;
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
    public final int getGroupType(){
       return this.groupType;
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
    public final String getSubBiz(){
       return this.subBiz;
    }
}
