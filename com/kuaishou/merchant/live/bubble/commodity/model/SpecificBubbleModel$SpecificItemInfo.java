package com.kuaishou.merchant.live.bubble.commodity.model.SpecificBubbleModel$SpecificItemInfo;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;

public class SpecificBubbleModel$SpecificItemInfo extends Commodity	// class@0018e3
{
    public String mItemId;
    public int mItemSaleType;
    public int mJumpType;
    public String mPrice;
    public Commodity$IconLabel[] mShowIconListV2;
    public static final long serialVersionUID = 0x88e4a8095ce1e1d5;

    public void SpecificBubbleModel$SpecificItemInfo(){
       super();
    }
    public SpecificBubbleModel$SpecificItemInfo correctFormat(){
       Object obj = PatchProxy.apply(null, this, SpecificBubbleModel$SpecificItemInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mId = this.mItemId;
       this.mDisplayPrice = this.mPrice;
       this.getExtraInfo().mShowIconListV2 = this.mShowIconListV2;
       this.getExtraInfo().mSaleType = this.mItemSaleType;
       this.getExtraInfo().mJumpType = this.mJumpType;
       return this;
    }
}
