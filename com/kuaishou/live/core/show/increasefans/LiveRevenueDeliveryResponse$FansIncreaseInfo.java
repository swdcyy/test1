package com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$FansIncreaseInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$FansIncreaseInfo$a;
import nsd.u;
import java.lang.Object;

public final class LiveRevenueDeliveryResponse$FansIncreaseInfo implements Serializable	// class@000c57
{
    public int mFansIncreaseCount;
    public int mFansIncreaseValue;
    public static final LiveRevenueDeliveryResponse$FansIncreaseInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveRevenueDeliveryResponse$FansIncreaseInfo.Companion = new LiveRevenueDeliveryResponse$FansIncreaseInfo$a(null);
    }
    public void LiveRevenueDeliveryResponse$FansIncreaseInfo(){
       super();
    }
    public final int getMFansIncreaseCount(){
       return this.mFansIncreaseCount;
    }
    public final int getMFansIncreaseValue(){
       return this.mFansIncreaseValue;
    }
    public final void setMFansIncreaseCount(int p0){
       this.mFansIncreaseCount = p0;
    }
    public final void setMFansIncreaseValue(int p0){
       this.mFansIncreaseValue = p0;
    }
}
