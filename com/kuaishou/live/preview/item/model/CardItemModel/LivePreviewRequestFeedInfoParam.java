package com.kuaishou.live.preview.item.model.CardItemModel.LivePreviewRequestFeedInfoParam;
import java.io.Serializable;
import java.lang.String;
import com.kuaishou.live.preview.item.model.CardItemModel.LivePreviewCoverWidgetTypeParam;
import java.lang.Object;

public class LivePreviewRequestFeedInfoParam implements Serializable	// class@000df0
{
    public String mAuthorId;
    public String mExpTag;
    public long mFeedDispatchTimestampMs;
    public boolean mIsRefreshRequest;
    public LivePreviewCoverWidgetTypeParam mLiveSimplePlayCoverWidgetTypeParam;
    public String mLiveStreamId;
    public static final long serialVersionUID = 0x32a68cc18557727b;

    public void LivePreviewRequestFeedInfoParam(String p0,String p1,String p2,long p3,boolean p4,LivePreviewCoverWidgetTypeParam p5){
       super();
       this.mLiveStreamId = p0;
       this.mAuthorId = p1;
       this.mExpTag = p2;
       this.mFeedDispatchTimestampMs = p3;
       this.mIsRefreshRequest = p4;
       this.mLiveSimplePlayCoverWidgetTypeParam = p5;
    }
}
