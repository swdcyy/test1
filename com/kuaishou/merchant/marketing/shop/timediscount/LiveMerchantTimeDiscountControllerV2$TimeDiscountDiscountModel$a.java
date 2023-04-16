package com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel$a;
import erd.g;
import com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y94.c;
import com.kuaishou.merchant.marketing.shop.timediscount.view.LiveMerchantTimeDiscountPendent$a;

public final class LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel$a implements g	// class@001bfa
{
    public final LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel b;

    public void LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel$a(LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel$a.class, "1")) {
       }else if(p0.longValue() <= 0){
          p0 = this.b;
          LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel c = p0.c;
          if (c != null) {
             c.a(p0.b);
          }
       }
       return;
    }
}
