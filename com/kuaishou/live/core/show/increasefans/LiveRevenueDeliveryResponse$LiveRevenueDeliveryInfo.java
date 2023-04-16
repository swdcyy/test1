package com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$AuthorInfo;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$MerchantInfo;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo;

public final class LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo implements Serializable	// class@000c59
{
    public LiveRevenueDeliveryResponse$AuthorInfo mAuthorInfo;
    public LiveRevenueDeliveryResponse$MerchantInfo mMerchantInfo;
    public LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo mRevenueDeliverySettleInfo;
    public static final LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo.Companion = new LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo$a(null);
    }
    public void LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo(){
       super();
    }
    public final LiveRevenueDeliveryResponse$AuthorInfo getMAuthorInfo(){
       return this.mAuthorInfo;
    }
    public final LiveRevenueDeliveryResponse$MerchantInfo getMMerchantInfo(){
       return this.mMerchantInfo;
    }
    public final LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo getMRevenueDeliverySettleInfo(){
       return this.mRevenueDeliverySettleInfo;
    }
    public final void setMAuthorInfo(LiveRevenueDeliveryResponse$AuthorInfo p0){
       this.mAuthorInfo = p0;
    }
    public final void setMMerchantInfo(LiveRevenueDeliveryResponse$MerchantInfo p0){
       this.mMerchantInfo = p0;
    }
    public final void setMRevenueDeliverySettleInfo(LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo p0){
       this.mRevenueDeliverySettleInfo = p0;
    }
}
