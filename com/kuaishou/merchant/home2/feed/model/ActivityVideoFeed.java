package com.kuaishou.merchant.home2.feed.model.ActivityVideoFeed;
import ny3.l;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import com.kuaishou.merchant.home2.feed.model.ActivityVideoFeed$Item;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import ny3.k;

public class ActivityVideoFeed extends BaseFeed implements l	// class@00178e
{
    public String mAuthorNickName;
    public long mCardId;
    public long mCardType;
    public String mCoverImg;
    public FeedLogCtx mFeedLogCtx;
    public List mItemList;
    public String mJumpLink;
    public String mMainUrl;
    public long mPhotoId;
    public String mSellerAvatarImg;
    public String mSellerId;
    public long mUserId;
    public QPhoto mVideoQPhoto;
    public static final long serialVersionUID = 0x2e082064405c178a;

    public void ActivityVideoFeed(){
       super();
    }
    public final ActivityVideoFeed$Item g(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ActivityVideoFeed.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mItemList)) {
          return objArray;
       }
       return this.mItemList.get(0);
    }
    public String getAuthorId(){
       return this.mSellerId;
    }
    public String getBiz(){
       return "ActivityVideoFeedLogger";
    }
    public final LiveFeedCommodity getCommodity(){
       Object[] objArray = null;
       ActivityVideoFeed$Item obj = PatchProxy.apply(objArray, this, ActivityVideoFeed.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g();
       if (obj != null) {
          objArray = new LiveFeedCommodity();
          objArray.mId = obj.mItemId;
       }
       return objArray;
    }
    public String getCommodityId(){
       Object obj = PatchProxy.apply(null, this, ActivityVideoFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getCommodity() == null) {
          return "";
       }
       return String.valueOf(this.getCommodity().mId);
    }
    public String getCommodityName(){
       Object[] objArray = null;
       ActivityVideoFeed$Item obj = PatchProxy.apply(objArray, this, ActivityVideoFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g();
       if (obj == null) {
          return objArray;
       }
       if (!TextUtils.x(obj.mItemShortName)) {
          return obj.mItemShortName;
       }
       return obj.mCommodityName;
    }
    public String getCommodityPhotoUrl(){
       ActivityVideoFeed$Item obj = PatchProxy.apply(null, this, ActivityVideoFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g();
       if (obj == null) {
          return null;
       }
       return obj.mCommodityPhoto;
    }
    public String getCommodityPrice(){
       ActivityVideoFeed$Item obj = PatchProxy.apply(null, this, ActivityVideoFeed.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g();
       if (obj == null) {
          return null;
       }
       return obj.mCommodityPrice;
    }
    public String getCommodityPricePrefix(){
       ActivityVideoFeed$Item obj = PatchProxy.apply(null, this, ActivityVideoFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g();
       if (obj == null) {
          return null;
       }
       return obj.mCommodityPricePrefix;
    }
    public String getCommodityTag(){
       ActivityVideoFeed$Item obj = PatchProxy.apply(null, this, ActivityVideoFeed.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g();
       if (obj == null) {
          return null;
       }
       if (obj.mShowSellPoint == null) {
          return null;
       }
       return obj.mCommodityTag;
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, ActivityVideoFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.mCardId);
    }
    public String getJumpUrl(){
       return this.mJumpLink;
    }
    public long getLongCommodityId(){
       Object obj = PatchProxy.apply(null, this, ActivityVideoFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.getCommodity() == null) {
          return 0;
       }
       return this.getCommodity().mId;
    }
    public QPhoto getQPhoto(){
       return this.mVideoQPhoto;
    }
    public boolean isCache(){
       return k.a(this);
    }
}
