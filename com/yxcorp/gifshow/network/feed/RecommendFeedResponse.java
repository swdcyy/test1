package com.yxcorp.gifshow.network.feed.RecommendFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class RecommendFeedResponse implements CursorResponse	// class@002157
{
    public String mCursor;
    public String mDominoTitle;
    public EdgeRealTimeConfig mEdgeRealTimeConfig;
    public boolean mEnableItemFeature;
    public boolean mIsNewRefluxUser;
    public String mLlsid;
    public int mPageRealSize;
    public List mQPhotos;
    public int mSimilarExpandStatus;
    public String mSlideDominoTitle;

    public void RecommendFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mQPhotos;
    }
    public String getListLoadSequenceID(){
       return this.mLlsid;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, RecommendFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
