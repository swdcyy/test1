package com.kuaishou.live.core.voiceparty.crossroompk.model.VoicePartyCrossRoomPkInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class VoicePartyCrossRoomPkInfoResponse implements Serializable	// class@00147c
{
    public int mEndType;
    public boolean mIsVoteEnd;
    public long mPenaltyDeadlineMs;
    public String mPkId;
    public List mScoreInfoList;
    public int mStatus;
    public static final long serialVersionUID = 0x33dabb99fcc779c7;

    public void VoicePartyCrossRoomPkInfoResponse(){
       super();
    }
}
