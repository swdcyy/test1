package com.kuaishou.merchant.interpretation.model.SliceCommodityBubbleModel;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.interpretation.model.SliceCommodityBubbleModel$ItemInfo;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;

public class SliceCommodityBubbleModel implements Serializable	// class@00184b
{
    public int abShowResult;
    public SliceCommodityBubbleModel$ItemInfo mItemInfo;
    public List mItemList;
    public String mLiveStreamJumpUrl;
    public int mMerchantInterpretationStyle;
    public String mRenderUrl;
    public SliceCommodityBubbleModel$SellerInfo mSellerInfo;
    public static final long serialVersionUID = 0xbc978ba76c64ee39;

    public void SliceCommodityBubbleModel(){
       super();
    }
    public void updateCommodityInfo(Commodity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SliceCommodityBubbleModel.class, "1")) {
          return;
       }
       SliceCommodityBubbleModel tmItemInfo = this.mItemInfo;
       if (tmItemInfo != null && tmItemInfo.isValid()) {
          if (p0 == null) {
             p0 = new Commodity();
          }
          tmItemInfo = this.mItemInfo;
          p0.mImageUrls = tmItemInfo.mImageUrls;
          p0.mId = tmItemInfo.mItemId;
          p0.mTitle = tmItemInfo.mItemTitle;
          p0.mDisplayPrice = tmItemInfo.mPromotedPrice;
          if (p0.mExtraInfo == null) {
             p0.mExtraInfo = new Commodity$ExtraInfo();
          }
          Commodity mExtraInfo = p0.mExtraInfo;
          SliceCommodityBubbleModel tmItemInfo1 = this.mItemInfo;
          SliceCommodityBubbleModel$ItemInfo mShowIcons = tmItemInfo1.mShowIcons;
          mExtraInfo.mShowIconListV2 = mShowIcons;
          mExtraInfo.mMidIconList2 = mShowIcons;
          mExtraInfo.mSaleType = tmItemInfo1.mItemSaleType;
          p0.mJumpUrl = tmItemInfo1.mJumpUrl;
       }
       return;
    }
}
