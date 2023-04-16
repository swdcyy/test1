package com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.Cloneable;
import mkd.a;
import com.kuaishou.merchant.api.core.model.BaseComponentData;
import com.kuaishou.merchant.api.core.model.Commodity$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import com.kuaishou.merchant.api.core.model.Commodity$CommodityActivityInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.CloneNotSupportedException;
import java.lang.Boolean;
import ekd.j;
import java.lang.Number;
import com.kuaishou.merchant.api.core.model.Commodity$InterpretationInfo;

public class Commodity extends BaseComponentData implements Cloneable, a	// class@001524
{
    public String buttonText;
    public boolean isCopyForInterpret;
    public boolean isSearched;
    public boolean mAlwaysShowCustomPrice;
    public String mButtonJumpUrl;
    public CDNUrl[] mBuyButtonImageUrls;
    public boolean mBuyButtonSuccess;
    public String mBuyUrl;
    public int mCurrency;
    public String mCurrencyContent;
    public int mCurrencyPosition;
    public LiveShopFrameModel mCurrentFrame;
    public int mCurrentFrameIndex;
    public long mCurrentStock;
    public Commodity$CustomPrice mCustomPrice;
    public String mDisplayPrice;
    public int mExposeState;
    public Commodity$ExtraInfo mExtraInfo;
    public Commodity$GatherPopularityInfo mGatherPopularityInfo;
    public String mId;
    public List mImageUrls;
    public Commodity$InterpretationInfo mInterpretationInfo;
    public boolean mIsHighlight;
    public boolean mIsShowLogged;
    public Commodity$ItemMark mItemMark;
    public Map mItemTraceMap;
    public int mItemType;
    public String mJumpToken;
    public String mJumpUrl;
    public boolean mLeftRegionBottomButtonSuccess;
    public List mLiveShopFrames;
    public String mOrderId;
    public String mPayDepositUrl;
    public Commodity$a mPopCommodityEvent;
    public CommoditySellingPoint mSellingPoint;
    public int mSequence;
    public int[] mShowIconList;
    public boolean mShowPopAnim;
    public String mSourceTypeName;
    public boolean mStartTwinkleAnimation;
    public Commodity$IconLabel mThumbTag;
    public int mThumbTopComponent;
    public long mTimeStamp;
    public String mTitle;
    public Commodity$TodayHotSale mTodayHotSaleInfo;
    public int mTotalStock;
    public static final long serialVersionUID = 0x8a4810a0e6e6432d;

    public void Commodity(){
       super();
       this.mThumbTopComponent = 0;
       this.isCopyForInterpret = false;
       this.mIsHighlight = false;
       this.isSearched = false;
       this.mCurrency = 0;
       this.mPopCommodityEvent = new Commodity$a();
       this.mShowPopAnim = true;
       this.mIsShowLogged = false;
    }
    public void afterDeserialize(){
       Commodity$IconLabel iconLabel;
       if (PatchProxy.applyVoid(null, this, Commodity.class, "7")) {
          return;
       }
       Commodity tmExtraInfo = this.mExtraInfo;
       if (tmExtraInfo != null) {
          Commodity$ExtraInfo mCommodityAc = tmExtraInfo.mCommodityActivityInfo;
          if (mCommodityAc != null && !TextUtils.x(mCommodityAc.mRestrictiveDesc)) {
             Commodity$IconLabel[] iconLabelArr = new Commodity$IconLabel[]{iconLabel};
             this.mExtraInfo.mMidIconList2 = iconLabelArr;
             iconLabel = new Commodity$IconLabel();
             iconLabel.mType = 17;
             Commodity tmExtraInfo1 = this.mExtraInfo;
             iconLabel.mContent = tmExtraInfo1.mCommodityActivityInfo.mRestrictiveDesc;
          }
       }
       if (!q.f(this.mLiveShopFrames)) {
          this.mCurrentFrame = this.mLiveShopFrames.get(0);
          this.mCurrentFrameIndex = 0;
       }
       return;
    }
    public Commodity clone(){
       Commodity obj = PatchProxy.apply(null, this, Commodity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          obj.mExtraInfo = this.getExtraInfo().clone();
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public Commodity copyForInterpretation(){
       Commodity obj = PatchProxy.apply(null, this, Commodity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.clone();
       obj.isCopyForInterpret = true;
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Commodity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof Commodity) {
          return false;
       }
       return TextUtils.n(this.mId, p0.mId);
    }
    public Commodity$ExtraInfo getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, Commodity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraInfo == null) {
          this.mExtraInfo = new Commodity$ExtraInfo();
       }
       return this.mExtraInfo;
    }
    public Commodity$IconLabel[] getShowIconList(){
       Object obj = PatchProxy.apply(null, this, Commodity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.h(this.getExtraInfo().mShowIconListV2) && !j.g(this.mShowIconList)) {
          Commodity$IconLabel[] iconLabelArr = new Commodity$IconLabel[this.mShowIconList.length];
          this.getExtraInfo().mShowIconListV2 = iconLabelArr;
          for (int i = 0; i < this.mShowIconList.length; i = i + 1) {
             this.getExtraInfo().mShowIconListV2[i] = new Commodity$IconLabel();
             this.getExtraInfo().mShowIconListV2[i].mType = this.mShowIconList[i];
          }
       }
       return this.getExtraInfo().mShowIconListV2;
    }
    public int hashCode(){
       Commodity obj = PatchProxy.apply(null, this, Commodity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mId;
       int i = (obj == null)? 0: obj.hashCode();
       return i;
    }
    public boolean isInterpreting(){
       Commodity tmInterpreta = this.mInterpretationInfo;
       boolean b = true;
       if (tmInterpreta == null || tmInterpreta.mInterpretStatus != b) {
          b = false;
       }
       return b;
    }
    public boolean isSpike(){
       Commodity tmExtraInfo = this.mExtraInfo;
       boolean b = (tmExtraInfo != null && tmExtraInfo.mSaleType == 3)? true: false;
       return b;
    }
}
