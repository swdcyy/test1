package com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CloneNotSupportedException;

public class Commodity$ExtraInfo implements Serializable, Cloneable	// class@001515
{
    public String mActivityId;
    public int mAskRecordStatus;
    public boolean mBuyButtonCanClick;
    public String mBuyButtonJumpUrl;
    public int mChooseAbility;
    public Commodity$CommodityActivityInfo mCommodityActivityInfo;
    public String mCommodityRemark;
    public String mEstateButtonDesc;
    public String mEstateButtonText;
    public Commodity$FakeText mFakeText;
    public String mHeaderTitle;
    public int mJumpType;
    public Commodity$LotteryInfo mLotteryInfo;
    public String mMarketPrice;
    public Commodity$IconLabel[] mMidIconList2;
    public String mMultiDiscountsDesc;
    public Commodity$OrderInfo mOrderInfo;
    public String mOriginalPrice;
    public String mParam;
    public List mPriceIconList;
    public String mPricePrefix;
    public int mPriceStyle;
    public String mPriceSuffix;
    public int mSaleStatus;
    public int mSaleType;
    public Commodity$IconLabel[] mShowIconListV2;
    public Commodity$SpikeInfo mSpikeInfo;
    public static final long serialVersionUID = 0xfe0fa4312b379efc;

    public void Commodity$ExtraInfo(){
       super();
       this.mBuyButtonCanClick = true;
    }
    public Commodity$ExtraInfo clone(){
       Object obj = PatchProxy.apply(null, this, Commodity$ExtraInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
}
