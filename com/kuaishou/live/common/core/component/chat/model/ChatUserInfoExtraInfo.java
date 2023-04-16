package com.kuaishou.live.common.core.component.chat.model.ChatUserInfoExtraInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ChatUserInfoExtraInfo implements Serializable	// class@001043
{
    public boolean mEnableGuestGift;
    public boolean mEnableMultiChatV2;
    public int mSupportMultiChatCount;
    public float mWidgetAspectRatio;
    public static final long serialVersionUID = 0x28ad17ff74aea696;

    public void ChatUserInfoExtraInfo(){
       super();
       this.mWidgetAspectRatio = 0x3f800000;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ChatUserInfoExtraInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChatUserInfoExtraInfo{enableGuestGift=\'"+this.mEnableGuestGift+'''+'}';
    }
}
