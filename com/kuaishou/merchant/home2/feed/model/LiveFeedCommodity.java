package com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity;
import java.io.Serializable;
import java.lang.Object;

public class LiveFeedCommodity implements Serializable	// class@0017b5
{
    public int mActivityLabel;
    public LiveFeedCommodity$CommodityTagInfo mCommodityTagInfo;
    public long mId;
    public String mImageUrl;
    public List mImageUrls;
    public List mItemCardTagInfoList;
    public String mJumpUrl;
    public int mMarketGoodType;
    public LiveFeedCommodity$MarketingTagInfo mMarketingTagInfo;
    public String mPrice;
    public String mSalesDesc;
    public int mSourceType;
    public String mTitle;
    public Commodity$IconLabel[] mTitleIconList;
    public static final long serialVersionUID = 0x134b55e01fdde6cd;

    public void LiveFeedCommodity(){
       super();
    }
}
