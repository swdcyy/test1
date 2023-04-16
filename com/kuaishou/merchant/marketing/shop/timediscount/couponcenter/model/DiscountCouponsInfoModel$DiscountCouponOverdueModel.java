package com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel$DiscountCouponOverdueModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class DiscountCouponsInfoModel$DiscountCouponOverdueModel implements Serializable	// class@001c0f
{
    public final String buttonText;
    public final String buttonUrl;
    public final String resultTitle;
    public final String subTitle;

    public void DiscountCouponsInfoModel$DiscountCouponOverdueModel(){
       super();
       this.resultTitle = "";
       this.buttonText = "";
       this.subTitle = "";
       this.buttonUrl = "";
    }
    public final String getButtonText(){
       return this.buttonText;
    }
    public final String getButtonUrl(){
       return this.buttonUrl;
    }
    public final String getResultTitle(){
       return this.resultTitle;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
}
