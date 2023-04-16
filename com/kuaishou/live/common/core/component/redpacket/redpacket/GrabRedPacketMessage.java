package com.kuaishou.live.common.core.component.redpacket.redpacket.GrabRedPacketMessage;
import com.kuaishou.live.basic.model.QLiveMessage;

public class GrabRedPacketMessage extends QLiveMessage	// class@001761
{
    public UserInfo mFromUser;
    public long mGrabKsCoin;
    public boolean mIsPusher;
    public boolean mIsSnatchMyselfRedPacket;
    public int mRedPackType;
    public static final long serialVersionUID = 0xe4e2e75f0b84c5bc;

    public void GrabRedPacketMessage(){
       super();
    }
}
