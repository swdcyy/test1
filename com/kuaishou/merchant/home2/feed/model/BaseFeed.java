package com.kuaishou.merchant.home2.feed.model.BaseFeed;
import mkd.a;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import java.io.ObjectInputStream;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ka6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.home2.feed.model.LiveFeed$ActivityInfo;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import com.kuaishou.merchant.home2.feed.model.CardStyle;
import com.kuaishou.merchant.home2.feed.model.CommodityFeed;
import com.kuaishou.merchant.home2.feed.model.ReservationFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.merchant.home2.feed.model.PhotoFeed;
import java.lang.Number;

public abstract class BaseFeed extends SyncableProvider implements a	// class@0008f7
{
    public int mBizType;
    public boolean mCache;
    public CardStyle mCardStyle;
    public String mExpTag;
    public String mListLoadSequenceID;
    public String mOnlineNum;
    public String mPlanId;
    public double mRatio;
    public String mReleaseId;
    public String mScreenId;
    public String mServerExpTag;
    public boolean mShowLogSent;
    public String mSourceId;
    public String mSourceTypeLog;
    public int mType;
    public static final long serialVersionUID = 0x966a6c5ec95ae4f5;

    public void BaseFeed(){
       super();
       this.mType = 1;
       this.mOnlineNum = "";
       this.mRatio = 0x3fe3f7ced916872b;
    }
    private void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFeed.class, "5")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, BaseFeed.class, "3")) {
          return;
       }
       b.b().c(this, BaseFeed.class);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof BaseFeed) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.n(this.getId(), p0.getId());
    }
    public LiveFeed$ActivityInfo getActivityInfo(){
       if (this instanceof LiveFeed) {
          return this.mActivityInfo;
       }
       return null;
    }
    public abstract String getBiz();
    public final String getBizId(){
       Object obj = PatchProxy.apply(null, this, BaseFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getId();
    }
    public CardStyle getCardStyle(){
       return this.mCardStyle;
    }
    public CommodityFeed getCommodityFeed(){
       if (this instanceof LiveFeed) {
          return this.mCommodity;
       }
       if (this instanceof ReservationFeed) {
          return this.mCommodity;
       }
       if (this instanceof CommodityFeed) {
          return this;
       }
       return null;
    }
    public abstract String getId();
    public CDNUrl[] getPhotoUrls(){
       if (this instanceof LiveFeed || this instanceof PhotoFeed) {
          return this.mPhotoUrls;
       }
       if (this instanceof ReservationFeed) {
          return this.mPhotoUrls;
       }
       return null;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, BaseFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getId() != null) {
          return (this.getId()).hashCode();
       }
       return super.hashCode();
    }
}
