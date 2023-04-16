package com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$UserInfoSegment;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public class RichTextMessageOld extends QLiveMessage	// class@0010c6
{
    public LiveStreamRichTextFeed$RichTextSegment[] mSegments;
    public int type;
    public static final long serialVersionUID = 0xe931c2936e05995;

    public void RichTextMessageOld(){
       super();
    }
    public UserInfo getUser(){
       Object obj = PatchProxy.apply(null, this, RichTextMessageOld.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getUserInfo();
    }
    public UserInfo getUserInfo(){
       RichTextMessageOld obj = PatchProxy.apply(null, this, RichTextMessageOld.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSegments;
       if (obj != null && obj.length) {
          int len = obj.length;
          int i = 0;
          while (i < len) {
             object oobject = this.mSegments[i];
             if (oobject.getContentCase() == 1) {
                LiveStreamRichTextFeed$UserInfoSegment user = oobject.getUserInfo().user;
                if (user != null) {
                   return UserInfo.convertFromProto(user);
                }
             }
             i = i + 1;
          }
       }
       return null;
    }
}
