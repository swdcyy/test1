package com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveFailModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveRollingInfo;

public final class DiscountCouponReceiveFailModel implements Serializable	// class@001c09
{
    public String buttonText;
    public String resultTitle;
    public DiscountCouponReceiveRollingInfo rollingInfo;
    public String subTitle;

    public void DiscountCouponReceiveFailModel(){
       super();
       this.buttonText = "";
    }
    public final String getButtonText(){
       return this.buttonText;
    }
    public final String getResultTitle(){
       return this.resultTitle;
    }
    public final DiscountCouponReceiveRollingInfo getRollingInfo(){
       return this.rollingInfo;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final void setButtonText(String p0){
       this.buttonText = p0;
    }
    public final void setResultTitle(String p0){
       this.resultTitle = p0;
    }
    public final void setRollingInfo(DiscountCouponReceiveRollingInfo p0){
       this.rollingInfo = p0;
    }
    public final void setSubTitle(String p0){
       this.subTitle = p0;
    }
}
