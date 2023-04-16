package com.kuaishou.live.core.show.vote.model.LiveAnchorVoteRecord;
import java.io.Serializable;
import java.lang.Object;

public class LiveAnchorVoteRecord implements Serializable	// class@001238
{
    public String mDisplayCreateTime;
    public String mDisplayTotalCount;
    public String mDisplayVoteDuration;
    public List mOptions;
    public String mQuestion;
    public long mVoteDurationMs;
    public String mVoteId;
    public static final long serialVersionUID = 0x4dabd589ecee5668;

    public void LiveAnchorVoteRecord(){
       super();
    }
}
