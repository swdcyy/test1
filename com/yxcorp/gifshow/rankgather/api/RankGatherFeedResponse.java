package com.yxcorp.gifshow.rankgather.api.RankGatherFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class RankGatherFeedResponse implements CursorResponse	// class@0016ec
{
    public String mContentType;
    public String mCursor;
    public HometownCity mGuessHometown;
    public String mLlsid;
    public Location mLocation;
    public List mRankGatherFeeds;
    public List mSlideFeeds;
    public String mSubTitle;
    public String mTitle;

    public void RankGatherFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       RankGatherFeedResponse tmSlideFeeds = this.mSlideFeeds;
       if (tmSlideFeeds == null) {
          tmSlideFeeds = this.mRankGatherFeeds;
       }
       return tmSlideFeeds;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, RankGatherFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
