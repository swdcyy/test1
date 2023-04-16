package com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo implements Serializable	// class@001753
{
    public String mEnterRoomCountFromShareRedPackDescription;
    public int mFansGroupStatus;
    public String mNotParticipatedRuleTip;
    public String mParticipateRuleTip;
    public String mParticipatedRuleTip;
    public long mRedPacketDurationMs;
    public String mRedPacketPassword;
    public static final long serialVersionUID = 0xb197c26d1e9dbbb5;

    public void LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo(){
       super();
       this.mRedPacketPassword = "";
    }
}
