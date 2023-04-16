package com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import la6.b;
import java.lang.Cloneable;
import com.yxcorp.gifshow.model.response.RealtimeStartupResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.util.List;
import java.lang.Boolean;
import la6.a;

public class HomeFeedResponse extends RealtimeStartupResponse implements b, Cloneable	// class@001243
{
    public List mBanners;
    public String mContext;
    public Map mCostInfo;
    public String mCursor;
    public String mDegradeType;
    public Map mEdgeCandidateResult;
    public EdgeRealTimeConfig mEdgeRealTimeConfig;
    public boolean mEnableInjectTopBarLive;
    public boolean mEnableItemFeature;
    public boolean mEnableNearbyLogDebug;
    public boolean mEnableRefreshWhenFollow;
    public String mExtendFeedParams;
    public boolean mFeedInjectFailed;
    public String mFeedInjectionFailedText;
    public String mFollowRecommendSource;
    public String mFullColumnLlsid;
    public List mFullColumns;
    public boolean mHasMoreLiveStream;
    public HeaderFooterInfo mHeaderFooterInfo;
    public HotsData mHotsData;
    public boolean mIsFiltered;
    public boolean mIsNewRefluxUser;
    public boolean mIsPrefetchExpired;
    public int mLiveStreamStrategy;
    public String mLlsid;
    public int mLocalRequestSource;
    public Map mMasterNewPhotoPendingStatus;
    public FeedCountResponse mNearbyFeedCountResponse;
    public boolean mNeedFillSchool;
    public boolean mNeedShowFollowRecommend;
    public boolean mNeedShowInterestedUser;
    public boolean mNeedShowNotLoginInterestedUser;
    public PadDataBean mPadData;
    public int mPageRealSize;
    public long mPrefetchExpiredDate;
    public List mQPhotos;
    public String mRecommendId;
    public ResponseTimeBean mResponseTime;
    public String mSessionExtraInfo;
    public String mStreamType;
    public List mSubEntrances;
    public List mSubTags;
    public String mUssid;
    public boolean mWriteRealShowSucc;
    public static final long serialVersionUID = 0xed2203dcf20e63d8;

    public void HomeFeedResponse(){
       super();
    }
    public HomeFeedResponse clone(){
       Object obj = PatchProxy.apply(null, this, HomeFeedResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          Log.k(e0);
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public List getItems(){
       return this.mQPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, HomeFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
