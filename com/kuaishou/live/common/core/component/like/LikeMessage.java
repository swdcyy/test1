package com.kuaishou.live.common.core.component.like.LikeMessage;
import mf1.a;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;

public class LikeMessage extends QLiveMessage implements a	// class@001450
{
    public UserStateRichTextSegment[] mUserStateSegment;
    public static final long serialVersionUID = 0xc92179f7e5dd563c;

    public void LikeMessage(){
       super();
    }
    public boolean hasSetUserStateSegment(){
       Object obj = PatchProxy.apply(null, this, LikeMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (j.h(this.mUserStateSegment) ^ 0x01);
    }
    public void setUserStateSegment(UserStateRichTextSegment[] p0){
       this.mUserStateSegment = p0;
    }
}
