package com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import java.io.Serializable;
import java.lang.Object;

public class LiveVoteContext implements Serializable	// class@00123a
{
    public long mLeftMillis;
    public List mOptions;
    public String mQuestion;
    public int mStatus;
    public long mVoteDuration;
    public String mVoteId;

    public void LiveVoteContext(){
       super();
    }
    public boolean isViteStop(){
       boolean b = true;
       if (this.mStatus > b) {
       }else {
          b = false;
       }
       return b;
    }
}
