package com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsCountModel;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsCountModel$a;
import nsd.u;
import java.lang.Object;

public final class DiscountCouponsCountModel implements Serializable	// class@001c0e
{
    public int couponsCount;
    public long endTime;
    public long fastestEndTime;
    public long startTime;
    public static final DiscountCouponsCountModel$a Companion;

    static {
       DiscountCouponsCountModel.Companion = new DiscountCouponsCountModel$a(null);
    }
    public void DiscountCouponsCountModel(){
       super();
    }
    public final int getCouponsCount(){
       return this.couponsCount;
    }
    public final long getEndTime(){
       return this.endTime;
    }
    public final long getFastestEndTime(){
       return this.fastestEndTime;
    }
    public final long getStartTime(){
       return this.startTime;
    }
    public final void setCouponsCount(int p0){
       this.couponsCount = p0;
    }
    public final void setEndTime(long p0){
       this.endTime = p0;
    }
    public final void setFastestEndTime(long p0){
       this.fastestEndTime = p0;
    }
    public final void setStartTime(long p0){
       this.startTime = p0;
    }
}
