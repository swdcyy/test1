package com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel$DiscountCouponOverdueModel;

public final class DiscountCouponsInfoModel implements Serializable	// class@001c10
{
    public String buttonText;
    public String buttonUrl;
    public String couponId;
    public String couponPrice;
    public String couponTitle;
    public long endTime;
    public DiscountCouponsInfoModel$DiscountCouponOverdueModel expireInfo;
    public int receiveCondition;
    public long startTime;
    public String useConditionTitle;
    public String useRangeTitle;

    public void DiscountCouponsInfoModel(){
       super();
       this.useRangeTitle = "";
       this.couponTitle = "";
       this.couponPrice = "";
       this.useConditionTitle = "";
       this.buttonText = "";
       this.buttonUrl = "";
       this.couponId = "";
    }
    public final String getButtonText(){
       return this.buttonText;
    }
    public final String getButtonUrl(){
       return this.buttonUrl;
    }
    public final String getCouponId(){
       return this.couponId;
    }
    public final String getCouponPrice(){
       return this.couponPrice;
    }
    public final String getCouponTitle(){
       return this.couponTitle;
    }
    public final long getEndTime(){
       return this.endTime;
    }
    public final DiscountCouponsInfoModel$DiscountCouponOverdueModel getExpireInfo(){
       return this.expireInfo;
    }
    public final int getReceiveCondition(){
       return this.receiveCondition;
    }
    public final long getStartTime(){
       return this.startTime;
    }
    public final String getUseConditionTitle(){
       return this.useConditionTitle;
    }
    public final String getUseRangeTitle(){
       return this.useRangeTitle;
    }
    public final void setButtonText(String p0){
       this.buttonText = p0;
    }
    public final void setButtonUrl(String p0){
       this.buttonUrl = p0;
    }
    public final void setCouponId(String p0){
       this.couponId = p0;
    }
    public final void setCouponPrice(String p0){
       this.couponPrice = p0;
    }
    public final void setCouponTitle(String p0){
       this.couponTitle = p0;
    }
    public final void setEndTime(long p0){
       this.endTime = p0;
    }
    public final void setExpireInfo(DiscountCouponsInfoModel$DiscountCouponOverdueModel p0){
       this.expireInfo = p0;
    }
    public final void setReceiveCondition(int p0){
       this.receiveCondition = p0;
    }
    public final void setStartTime(long p0){
       this.startTime = p0;
    }
    public final void setUseConditionTitle(String p0){
       this.useConditionTitle = p0;
    }
    public final void setUseRangeTitle(String p0){
       this.useRangeTitle = p0;
    }
}
