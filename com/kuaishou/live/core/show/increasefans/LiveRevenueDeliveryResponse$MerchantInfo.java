package com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$MerchantInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$MerchantInfo$a;
import nsd.u;
import java.lang.Object;

public final class LiveRevenueDeliveryResponse$MerchantInfo implements Serializable	// class@000c5b
{
    public boolean mIsAutoRenewal;
    public int mKsCoinBalance;
    public static final LiveRevenueDeliveryResponse$MerchantInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveRevenueDeliveryResponse$MerchantInfo.Companion = new LiveRevenueDeliveryResponse$MerchantInfo$a(null);
    }
    public void LiveRevenueDeliveryResponse$MerchantInfo(){
       super();
    }
    public final boolean getMIsAutoRenewal(){
       return this.mIsAutoRenewal;
    }
    public final int getMKsCoinBalance(){
       return this.mKsCoinBalance;
    }
    public final void setMIsAutoRenewal(boolean p0){
       this.mIsAutoRenewal = p0;
    }
    public final void setMKsCoinBalance(int p0){
       this.mKsCoinBalance = p0;
    }
}
