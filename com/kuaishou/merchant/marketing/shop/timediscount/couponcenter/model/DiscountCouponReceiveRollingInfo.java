package com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveRollingInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Long;
import java.util.List;

public final class DiscountCouponReceiveRollingInfo implements Serializable	// class@001c0c
{
    public Long rollingTime;
    public List rollingUserMsg;

    public void DiscountCouponReceiveRollingInfo(){
       super();
       this.rollingTime = Long.valueOf(0);
    }
    public final Long getRollingTime(){
       return this.rollingTime;
    }
    public final List getRollingUserMsg(){
       return this.rollingUserMsg;
    }
    public final void setRollingTime(Long p0){
       this.rollingTime = p0;
    }
    public final void setRollingUserMsg(List p0){
       this.rollingUserMsg = p0;
    }
}
