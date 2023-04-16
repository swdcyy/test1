package com.kwai.live.gzone.vote.been.LiveGzoneVoteLimitInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneVoteLimitInfo implements Serializable	// class@000e76
{
    public int mFreeVoteCount;
    public int mKCoinCount;
    public int mOptionLengthMax;
    public int mOptionLengthMin;
    public static final long serialVersionUID = 0xd229fc074d1d40ad;

    public void LiveGzoneVoteLimitInfo(){
       super();
    }
    public boolean canAddOption(){
       boolean b = (this.mFreeVoteCount > null)? true: false;
       return b;
    }
    public int getOptionType(){
       int i = (this.mFreeVoteCount > null)? 1: 2;
       return i;
    }
}
