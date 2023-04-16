package com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveRollingInfo$RollingUserMsg;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class DiscountCouponReceiveRollingInfo$RollingUserMsg implements Serializable	// class@001c0b
{
    public String buyerImage;
    public String rollingMessage;

    public void DiscountCouponReceiveRollingInfo$RollingUserMsg(){
       super();
       this.buyerImage = "";
       this.rollingMessage = "";
    }
    public final String getBuyerImage(){
       return this.buyerImage;
    }
    public final String getRollingMessage(){
       return this.rollingMessage;
    }
    public final void setBuyerImage(String p0){
       this.buyerImage = p0;
    }
    public final void setRollingMessage(String p0){
       this.rollingMessage = p0;
    }
}
