package com.kuaishou.live.rerank.LiveRerankRequestItemParam;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class LiveRerankRequestItemParam implements Serializable	// class@000f61
{
    public String mAdRerankContext;
    public long mFeedDispatchTimestampMs;
    public final String mLiveStreamId;
    public final String mRecoRerankContext;
    public final String mStid;
    public static final long serialVersionUID = 0x9617c259d60490f6;

    public void LiveRerankRequestItemParam(String p0,String p1,String p2,long p3,String p4){
       super();
       this.mLiveStreamId = p0;
       this.mStid = p1;
       this.mRecoRerankContext = p2;
       this.mFeedDispatchTimestampMs = p3;
       this.mAdRerankContext = p4;
    }
}
