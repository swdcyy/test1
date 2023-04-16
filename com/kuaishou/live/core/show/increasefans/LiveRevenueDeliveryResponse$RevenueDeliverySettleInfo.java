package com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$FansIncreaseInfo;

public final class LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo implements Serializable	// class@000c5d
{
    public int mContributeCoin;
    public int mDeliveryValue;
    public LiveRevenueDeliveryResponse$FansIncreaseInfo mFansIncreaseInfo;
    public static final LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo.Companion = new LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo$a(null);
    }
    public void LiveRevenueDeliveryResponse$RevenueDeliverySettleInfo(){
       super();
    }
    public final int getMContributeCoin(){
       return this.mContributeCoin;
    }
    public final int getMDeliveryValue(){
       return this.mDeliveryValue;
    }
    public final LiveRevenueDeliveryResponse$FansIncreaseInfo getMFansIncreaseInfo(){
       return this.mFansIncreaseInfo;
    }
    public final void setMContributeCoin(int p0){
       this.mContributeCoin = p0;
    }
    public final void setMDeliveryValue(int p0){
       this.mDeliveryValue = p0;
    }
    public final void setMFansIncreaseInfo(LiveRevenueDeliveryResponse$FansIncreaseInfo p0){
       this.mFansIncreaseInfo = p0;
    }
}
