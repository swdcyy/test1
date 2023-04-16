package com.kuaishou.merchant.marketing.shop.timediscount.view.LiveMerchantTimeDiscountPendent;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;

public final class LiveMerchantTimeDiscountPendent extends SelectShapeConstraintLayout	// class@001c33
{
    public HashMap C;

    public void LiveMerchantTimeDiscountPendent(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMerchantTimeDiscountPendent(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMerchantTimeDiscountPendent(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void LiveMerchantTimeDiscountPendent(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
}
