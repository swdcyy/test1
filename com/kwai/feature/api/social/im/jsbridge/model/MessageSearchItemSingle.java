package com.kwai.feature.api.social.im.jsbridge.model.MessageSearchItemSingle;
import com.kwai.feature.api.social.im.jsbridge.model.MessageSearchItem;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class MessageSearchItemSingle implements MessageSearchItem	// class@0010fe
{
    public final String aliasName;
    public final String conversationId;
    public final int conversationType;
    public final String imageUrl;
    public final List imageUrls;
    public final int relationship;
    public final String subBiz;
    public final String userName;

    public void MessageSearchItemSingle(String p0,String p1,int p2,String p3,List p4,String p5,int p6,String p7){
       a.p(p0, "userName");
       a.p(p1, "aliasName");
       a.p(p3, "imageUrl");
       a.p(p4, "imageUrls");
       a.p(p5, "conversationId");
       a.p(p7, "subBiz");
       super();
       this.userName = p0;
       this.aliasName = p1;
       this.relationship = p2;
       this.imageUrl = p3;
       this.imageUrls = p4;
       this.conversationId = p5;
       this.conversationType = p6;
       this.subBiz = p7;
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
    public final String getImageUrl(){
       return this.imageUrl;
    }
    public final List getImageUrls(){
       return this.imageUrls;
    }
    public final int getRelationship(){
       return this.relationship;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public final String getUserName(){
       return this.userName;
    }
}
