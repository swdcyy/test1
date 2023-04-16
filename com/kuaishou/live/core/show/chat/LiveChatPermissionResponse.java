package com.kuaishou.live.core.show.chat.LiveChatPermissionResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveChatPermissionResponse implements Serializable	// class@000a13
{
    public boolean mCanVideoChat;
    public UserInfo mGuestUserInfo;
    public boolean mIsGuestNewVersion;
    public boolean mIsGuestSupportMultiChat;
    public static final long serialVersionUID = 0xd0b9e071b70a7c06;

    public void LiveChatPermissionResponse(){
       super();
    }
}
