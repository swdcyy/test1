package com.kuaishou.live.lite.comment.model.SimpleCommentMessage;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import com.kuaishou.live.lite.comment.model.SimpleCommentMessage$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class SimpleCommentMessage extends AbstractCommentMessage	// class@00080d
{
    public final String content;
    public final UserInfo userInfo;
    public static final SimpleCommentMessage$a Companion;

    static {
       SimpleCommentMessage.Companion = new SimpleCommentMessage$a(null);
    }
    public void SimpleCommentMessage(String p0,long p1,boolean p2,LiveAudienceState p3,UserInfo p4,String p5){
       a.p(p0, "id");
       a.p(p4, "userInfo");
       a.p(p5, "content");
       super(p0, p1, p2, p3);
       this.userInfo = p4;
       this.content = p5;
    }
    public final String getContent(){
       return this.content;
    }
    public final UserInfo getUserInfo(){
       return this.userInfo;
    }
}
