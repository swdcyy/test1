package com.kwai.feature.api.trending.TrendingListResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.TrendingTitleInfo;
import com.yxcorp.gifshow.entity.TrendingListRequestInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class TrendingListResponse implements CursorResponse, Serializable	// class@0011c8
{
    public String mCursor;
    public List mItems;
    public String mLocation;
    public List mRisingTrendingInfos;
    public List mTrendingInfos;
    public List mTrendingListConfigs;
    public static final long serialVersionUID = 0xcc34dd60dc63be74;

    public void TrendingListResponse(){
       super();
       this.mItems = new ArrayList();
    }
    public void assembleItems(TrendingTitleInfo p0,TrendingListRequestInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TrendingListResponse.class, "2")) {
          return;
       }
       TrendingListResponse tmTrendingIn = this.mTrendingInfos;
       if (tmTrendingIn != null) {
          Iterator iterator = tmTrendingIn.iterator();
          while (iterator.hasNext()) {
             TrendingInfo trendingInfo = iterator.next();
             trendingInfo.mPopularType = "COMMON";
             if (p0 != null) {
                trendingInfo.mTypeName = p0.getTitle();
                trendingInfo.mTrendingType = p0.mTrendingType;
                TrendingListResponse tmLocation = this.mLocation;
                if (tmLocation != null) {
                   trendingInfo.mTrendingLocationString = tmLocation;
                }else if(p1 != null){
                   TrendingListRequestInfo mLocation1 = p1.mLocation;
                   if (mLocation1 != null) {
                      trendingInfo.mTrendingLocationString = mLocation1;
                   }
                }
                TrendingInfo mSubTrending = trendingInfo.mSubTrendingInfos;
                if (mSubTrending != null && mSubTrending.size() > 0) {
                   Iterator iterator1 = trendingInfo.mSubTrendingInfos.iterator();
                   while (iterator1.hasNext()) {
                      mSubTrending = iterator1.next();
                      mSubTrending.mTrendingType = p0.mTrendingType;
                      TrendingListResponse tmLocation1 = this.mLocation;
                      if (tmLocation1 != null) {
                         mSubTrending.mTrendingLocationString = tmLocation1;
                      }else if(p1 != null){
                         TrendingListRequestInfo mLocation = p1.mLocation;
                         if (mLocation != null) {
                            mSubTrending.mTrendingLocationString = mLocation;
                            continue ;
                         }else {
                            continue ;
                         }
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
          this.mItems.addAll(this.mTrendingInfos);
       }
       TrendingListResponse tmRisingTren = this.mRisingTrendingInfos;
       if (tmRisingTren != null) {
          Iterator iterator2 = tmRisingTren.iterator();
          while (iterator2.hasNext()) {
             TrendingInfo trendingInfo1 = iterator2.next();
             trendingInfo1.mPopularType = "REAL_TIME";
             if (p0 != null) {
                trendingInfo1.mTypeName = p0.getTitle();
                trendingInfo1.mTrendingType = p0.mTrendingType;
             }
          }
          this.mItems.addAll(this.mRisingTrendingInfos);
       }
       return;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, TrendingListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
