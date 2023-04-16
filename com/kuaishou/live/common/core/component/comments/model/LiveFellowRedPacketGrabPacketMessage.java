package com.kuaishou.live.common.core.component.comments.model.LiveFellowRedPacketGrabPacketMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;

public class LiveFellowRedPacketGrabPacketMessage extends QLiveMessage	// class@0010bc
{
    public UserInfo mGrabUserInfo;
    public UserInfo mSendUserInfo;
    public static final long serialVersionUID = 0x84e9379a3dde1951;

    public void LiveFellowRedPacketGrabPacketMessage(UserInfo p0,UserInfo p1){
       super();
       this.mSendUserInfo = p0;
       this.mGrabUserInfo = p1;
    }
}
