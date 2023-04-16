package com.kuaishou.live.core.basic.model.LiveBatchFeedsResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveBatchFeedsResponse implements Serializable, b	// class@000865
{
    public List mLiveStreamFeeds;
    public int mResult;
    public static final long serialVersionUID = 0x8f61a128e2452b83;

    public void LiveBatchFeedsResponse(){
       super();
    }
    public List getItems(){
       return this.mLiveStreamFeeds;
    }
    public boolean hasMore(){
       return false;
    }
}
