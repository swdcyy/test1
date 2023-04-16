package com.kwai.feature.api.corona.api.CoronaDetailFeedResponse;
import com.kwai.feature.api.corona.api.BidirectionalLoadListResponse;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.corona.api.CoronaDetailFeedResponse$ClusterSerial;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.List;
import com.kwai.framework.model.common.ResponseTimeBean;
import java.lang.Boolean;
import la6.a;

public class CoronaDetailFeedResponse implements BidirectionalLoadListResponse, Serializable, Cloneable	// class@000ddf
{
    public String mBCursor;
    public CoronaDetailFeedResponse$ClusterSerial mClusterSerial;
    public int mCount;
    public List mFeeds;
    public boolean mIsCacheData;
    public boolean mIsCollected;
    public String mLlsid;
    public String mName;
    public String mPCursor;
    public int mResult;
    public String mSerialContext;
    public CoronaDetailFeedResponse$SeriesInfo mSeriesInfo;
    public List moreRelatedPhotos;
    public ResponseTimeBean responseTime;
    public static final long serialVersionUID = 0xf85db6238faa6750;

    public void CoronaDetailFeedResponse(){
       super();
    }
    public CoronaDetailFeedResponse clone(){
       ArrayList uArrayList;
       CoronaDetailFeedResponse obj = PatchProxy.apply(null, this, CoronaDetailFeedResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CoronaDetailFeedResponse();
       obj.mBCursor = this.mBCursor;
       obj.mPCursor = this.mPCursor;
       CoronaDetailFeedResponse tmClusterSer = this.mClusterSerial;
       if (tmClusterSer != null) {
          obj.mClusterSerial = tmClusterSer.clone();
       }
       obj.mCount = this.mCount;
       if (!q.f(this.mFeeds)) {
          uArrayList = new ArrayList(this.mFeeds.size());
          obj.mFeeds = uArrayList;
          uArrayList.addAll(this.mFeeds);
       }
       if (!q.f(this.moreRelatedPhotos)) {
          uArrayList = new ArrayList(this.moreRelatedPhotos.size());
          obj.moreRelatedPhotos = uArrayList;
          uArrayList.addAll(this.moreRelatedPhotos);
       }
       obj.mIsCollected = this.mIsCollected;
       obj.mLlsid = this.mLlsid;
       obj.mName = this.mName;
       obj.mResult = this.mResult;
       obj.mSerialContext = this.mSerialContext;
       tmClusterSer = this.responseTime;
       if (tmClusterSer != null) {
          obj.responseTime = tmClusterSer.a();
       }
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public List getItems(){
       return this.mFeeds;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, CoronaDetailFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mPCursor);
    }
    public boolean hasPreviousMore(){
       Object obj = PatchProxy.apply(null, this, CoronaDetailFeedResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mBCursor);
    }
}
