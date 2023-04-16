package com.kwai.live.gzone.vote.been.LiveGzoneVoteInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneVoteInfo implements Serializable	// class@000e75
{
    public List mCardOptionInfoList;
    public long mEndTime;
    public long mLeftEndTime;
    public long mLeftShowEndTime;
    public long mShowEndTime;
    public long mStartTime;
    public int mStatus;
    public String mTitle;
    public int mType;
    public long mUserCount;
    public String mVoteId;
    public List mVoteOptionInfoList;
    public static final long serialVersionUID = 0x4be01a0d6017061;

    public void LiveGzoneVoteInfo(){
       super();
    }
}
