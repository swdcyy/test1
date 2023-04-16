package com.kuaishou.merchant.home2.feed.model.ActivityCommodityFeed;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class ActivityCommodityFeed extends BaseFeed	// class@001789
{
    public String mCostSellPoint;
    public ActivityCommodityFeed$ItemBulletin mItemBulletin;
    public String mItemIcon;
    public long mItemId;
    public String mItemImage;
    public String mItemName;
    public String mItemPrice;
    public int mItemSellingPointType;
    public List mItemServiceList;
    public String mJumpUrl;
    public int mNameIconHeight;
    public int mNameIconWidth;
    public String mPricePrefix;
    public String mPriceSuffix;
    public String mSellerId;
    public String mSellingPoint;
    public String mTrustBuyIconUrl;
    public static final long serialVersionUID = 0xe3b2bd826c6b2047;

    public void ActivityCommodityFeed(){
       super();
    }
    public String getBiz(){
       return "ActivityCommodityFeedLogger";
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, ActivityCommodityFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.mItemId);
    }
}
