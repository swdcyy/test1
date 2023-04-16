package com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveModel;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveFailModel;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel;

public final class DiscountCouponReceiveModel implements Serializable	// class@001c0a
{
    public DiscountCouponReceiveFailModel discountCouponReceiveFailModel;
    public DiscountCouponsInfoModel discountCouponReceiveSuccessModel;
    public int result;

    public void DiscountCouponReceiveModel(){
       super();
    }
    public final DiscountCouponReceiveFailModel getDiscountCouponReceiveFailModel(){
       return this.discountCouponReceiveFailModel;
    }
    public final DiscountCouponsInfoModel getDiscountCouponReceiveSuccessModel(){
       return this.discountCouponReceiveSuccessModel;
    }
    public final int getResult(){
       return this.result;
    }
    public final void setDiscountCouponReceiveFailModel(DiscountCouponReceiveFailModel p0){
       this.discountCouponReceiveFailModel = p0;
    }
    public final void setDiscountCouponReceiveSuccessModel(DiscountCouponsInfoModel p0){
       this.discountCouponReceiveSuccessModel = p0;
    }
    public final void setResult(int p0){
       this.result = p0;
    }
}
