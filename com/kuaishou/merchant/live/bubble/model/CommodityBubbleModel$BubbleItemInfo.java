package com.kuaishou.merchant.live.bubble.model.CommodityBubbleModel$BubbleItemInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;

public class CommodityBubbleModel$BubbleItemInfo implements Serializable	// class@0018e5
{
    public String mBubbleTitle;
    public String mButtonText;
    public String mId;
    public List mImageUrls;
    public int mItemSaleType;
    public int mJumpType;
    public String mJumpUrl;
    public String mPrice;
    public Commodity$IconLabel[] mShowIconListV2;
    public String mTitle;
    public static final long serialVersionUID = 0x224e82d0d39d2d71;

    public void CommodityBubbleModel$BubbleItemInfo(){
       super();
    }
    public Commodity convertToCommodity(){
       Commodity obj = PatchProxy.apply(null, this, CommodityBubbleModel$BubbleItemInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Commodity();
       obj.mId = this.mId;
       obj.mImageUrls = this.mImageUrls;
       obj.mTitle = this.mTitle;
       obj.mDisplayPrice = this.mPrice;
       obj.getExtraInfo().mShowIconListV2 = this.mShowIconListV2;
       obj.getExtraInfo().mSaleType = this.mItemSaleType;
       obj.getExtraInfo().mJumpType = this.mJumpType;
       obj.mJumpUrl = this.mJumpUrl;
       return obj;
    }
}
