package com.kuaishou.live.lite.comment.model.AuthorReplyMessage;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class AuthorReplyMessage extends AbstractCommentMessage	// class@000807
{
    public final UserInfo authorUserInfo;
    public final String giftName;

    public void AuthorReplyMessage(String p0,long p1,boolean p2,UserInfo p3,String p4,LiveAudienceState p5){
       a.p(p0, "id");
       a.p(p3, "authorUserInfo");
       a.p(p4, "giftName");
       super(p0, p1, p2, p5);
       this.authorUserInfo = p3;
       this.giftName = p4;
    }
    public void AuthorReplyMessage(String p0,long p1,boolean p2,UserInfo p3,String p4,LiveAudienceState p5,int p6,u p7){
       LiveAudienceState liveAudience = (p6 & 0x20)? null: p5;
       super(p0, p1, p2, p3, p4, liveAudience);
       return;
    }
    public final UserInfo getAuthorUserInfo(){
       return this.authorUserInfo;
    }
    public final String getGiftName(){
       return this.giftName;
    }
}
