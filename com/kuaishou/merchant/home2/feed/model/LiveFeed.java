package com.kuaishou.merchant.home2.feed.model.LiveFeed;
import ny3.l;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.autoplay.live.e$a;
import com.kwai.framework.model.feed.BaseFeed;
import tkd.b;
import tkd.d;
import fs5.a;
import com.yxcorp.gifshow.autoplay.live.e;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity;
import java.util.Collection;
import ekd.q;
import java.util.List;
import ny3.k;

public class LiveFeed extends BaseFeed implements l	// class@0017b2
{
    public LiveFeed$ActivityInfo mActivityInfo;
    public String mAuthorId;
    public LiveAutoPlayModule mAutoPlayModule;
    public String mAvatarUrl;
    public List mAvatarUrls;
    public CommodityFeed mCommodity;
    public int mCommodityDisplayPosition;
    public Commodity mCommodityForIconList;
    public List mCommodityInfoList;
    public int mCommodityUIStyle;
    public FeedLogCtx mFeedLogCtx;
    public int mHeight;
    public String mId;
    public String mJumpUrl;
    public String mLikeNum;
    public String mLiveJumpUrl;
    public String mNick;
    public CDNUrl[] mPhotoUrls;
    public QPhoto mQPhoto;
    public LiveFeed$TagInfo mTagInfo;
    public String mTitle;
    public int mWidth;
    public static final long serialVersionUID = 0xca08611e4d847623;

    public void LiveFeed(){
       super();
       this.mCommodityForIconList = new Commodity();
    }
    public String getAuthorId(){
       return this.mAuthorId;
    }
    public LiveAutoPlayModule getAutoPlayModule(BaseFragment p0){
       LiveFeed obj = PatchProxy.applyOneRefs(p0, this, LiveFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (this.mAutoPlayModule == null) {
             obj = this.mQPhoto;
             if (obj != null) {
                QPhoto mEntity = obj.mEntity;
                if (mEntity instanceof LiveStreamFeed) {
                   e$a uoa = new e$a(mEntity, p0, 23, ":ks-features:ft-merchant:merchant-home:home2");
                   uoa.i(0);
                   uoa.d(true);
                   uoa.e(true);
                   uoa.c("MERCHANT_BUYER_INDEX");
                   uoa.j(true);
                   uoa.l(d.a(-1397441499).l2());
                   this.mAutoPlayModule = new LiveAutoPlayModule(uoa.b());
                }
             }
          }
          return this.mAutoPlayModule;
       }catch(java.lang.Exception e5){
          a.l(MerchantHomeLogBiz.Feed, "LiveFeed", "qPhoto error", e5);
          return null;
       }
    }
    public String getBiz(){
       return "LiveFeedLogger";
    }
    public LiveFeedCommodity getCommodity(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.mCommodityInfoList)) {
          return this.mCommodityInfoList.get(0);
       }
       return objArray;
    }
    public String getId(){
       return this.mId;
    }
    public String getJumpUrl(){
       return this.mJumpUrl;
    }
    public QPhoto getQPhoto(){
       return this.mQPhoto;
    }
    public boolean isCache(){
       return k.a(this);
    }
}
