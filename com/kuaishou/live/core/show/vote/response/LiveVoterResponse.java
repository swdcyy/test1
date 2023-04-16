package com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveVoterResponse implements Serializable	// class@00124a
{
    public long mResultDisplayMillis;
    public long mServerTime;
    public LiveUserVote mUserVote;
    public LiveVoteContext mVote;

    public void LiveVoterResponse(){
       super();
       this.mResultDisplayMillis = 0x7530;
    }
}
