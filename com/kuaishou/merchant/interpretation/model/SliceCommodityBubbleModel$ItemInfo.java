package com.kuaishou.merchant.interpretation.model.SliceCommodityBubbleModel$ItemInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class SliceCommodityBubbleModel$ItemInfo implements Serializable	// class@001849
{
    public List mImageUrls;
    public String mItemId;
    public int mItemSaleType;
    public String mItemTag;
    public String mItemTitle;
    public String mJumpUrl;
    public String mOriginPrice;
    public String mPromotedPrice;
    public LiveShopRMCModel$Row mRow;
    public Commodity$IconLabel[] mShowIcons;
    public String mTitle;
    public List photoUrl;
    public String priceDesc;

    public void SliceCommodityBubbleModel$ItemInfo(){
       super();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, SliceCommodityBubbleModel$ItemInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mItemId) && (!TextUtils.isEmpty(this.mItemTitle) && (!TextUtils.isEmpty(this.mPromotedPrice) && !TextUtils.isEmpty(this.mJumpUrl))))? true: false;
       return b;
    }
}
