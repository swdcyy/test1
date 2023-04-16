package com.kuaishou.merchant.live.bubble.model.CommodityBubbleModel;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.bubble.model.CommodityBubbleModel$BubbleItemInfo;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;

public class CommodityBubbleModel implements Serializable	// class@0018e6
{
    public CommodityBubbleModel$BubbleItemInfo mBubbleItemInfo;
    public int mLiveAction;
    public String mLiveStreamId;
    public static final long serialVersionUID = 0xbc978ba76c64ee39;

    public void CommodityBubbleModel(){
       super();
    }
    public void updateCommodityInfo(Commodity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommodityBubbleModel.class, "1")) {
          return;
       }
       if (this.mBubbleItemInfo == null) {
          return;
       }
       if (p0 == null) {
          p0 = new Commodity();
       }
       CommodityBubbleModel tmBubbleItem = this.mBubbleItemInfo;
       p0.mImageUrls = tmBubbleItem.mImageUrls;
       p0.mId = tmBubbleItem.mId;
       p0.mTitle = tmBubbleItem.mTitle;
       p0.mDisplayPrice = tmBubbleItem.mPrice;
       if (p0.mExtraInfo == null) {
          p0.mExtraInfo = new Commodity$ExtraInfo();
       }
       Commodity mExtraInfo = p0.mExtraInfo;
       CommodityBubbleModel tmBubbleItem1 = this.mBubbleItemInfo;
       mExtraInfo.mShowIconListV2 = tmBubbleItem1.mShowIconListV2;
       mExtraInfo.mSaleType = tmBubbleItem1.mItemSaleType;
       p0.mJumpUrl = tmBubbleItem1.mJumpUrl;
       return;
    }
}
