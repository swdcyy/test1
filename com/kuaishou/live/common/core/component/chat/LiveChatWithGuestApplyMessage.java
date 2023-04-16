package com.kuaishou.live.common.core.component.chat.LiveChatWithGuestApplyMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import java.lang.StringBuilder;

public class LiveChatWithGuestApplyMessage extends QLiveMessage	// class@001029
{
    public boolean hasApply;
    public boolean mIsGuestSupportMultiChat;
    public int mMediaType;
    public boolean mShouldShowButton;
    public static final long serialVersionUID = 0x17d069d3bebc305c;

    public void LiveChatWithGuestApplyMessage(){
       super();
       this.hasApply = false;
    }
    public String getContentString(){
       Object obj = PatchProxy.apply(null, this, LiveChatWithGuestApplyMessage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f1021a9);
    }
    public String getNameString(){
       String obj = PatchProxy.apply(null, this, LiveChatWithGuestApplyMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.c(this.getUser());
       if (obj == null) {
          return "";
       }
       if (obj.length() > 5) {
          obj = obj.substring(0, 4)+"...";
       }
       return obj;
    }
}
