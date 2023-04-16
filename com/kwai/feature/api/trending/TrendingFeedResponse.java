package com.kwai.feature.api.trending.TrendingFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class TrendingFeedResponse implements CursorResponse, Serializable	// class@0011c7
{
    public String mChallengeBoardPostScheme;
    public String mCursor;
    public String mLlsid;
    public List mTrendingFeeds;
    public static final long serialVersionUID = 0xcc34dd60dc63be74;

    public void TrendingFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mTrendingFeeds;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, TrendingFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
