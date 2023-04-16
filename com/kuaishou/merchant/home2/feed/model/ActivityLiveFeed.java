package com.kuaishou.merchant.home2.feed.model.ActivityLiveFeed;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import com.kuaishou.merchant.home2.feed.model.ActivityLiveFeed$Item;
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

public class ActivityLiveFeed extends LiveFeed	// class@00178c
{
    public String mAuthorNickName;
    public String mCoverImg;
    public List mItemList;
    public String mLinkUrl;
    public ActivityLiveFeed$LiveBulletin mLiveBulletin;
    public String mLiveId;
    public String mSellerAvatarImg;
    public String mSellerId;
    public static final long serialVersionUID = 0x568970e0dadff2d9;

    public void ActivityLiveFeed(){
       super();
    }
    public final ActivityLiveFeed$Item g(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ActivityLiveFeed.class, "7");
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
    public LiveFeedCommodity getCommodity(){
       Object[] objArray = null;
       ActivityLiveFeed$Item obj = PatchProxy.apply(objArray, this, ActivityLiveFeed.class, "1");
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
    public String getCommodityName(){
       Object[] objArray = null;
       ActivityLiveFeed$Item obj = PatchProxy.apply(objArray, this, ActivityLiveFeed.class, "3");
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
       ActivityLiveFeed$Item obj = PatchProxy.apply(null, this, ActivityLiveFeed.class, "2");
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
       ActivityLiveFeed$Item obj = PatchProxy.apply(null, this, ActivityLiveFeed.class, "5");
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
       ActivityLiveFeed$Item obj = PatchProxy.apply(null, this, ActivityLiveFeed.class, "4");
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
       ActivityLiveFeed$Item obj = PatchProxy.apply(null, this, ActivityLiveFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g();
       if (obj == null) {
          return null;
       }
       return obj.mCommodityTag;
    }
    public String getId(){
       return this.mLiveId;
    }
    public String getJumpUrl(){
       return this.mLinkUrl;
    }
}
