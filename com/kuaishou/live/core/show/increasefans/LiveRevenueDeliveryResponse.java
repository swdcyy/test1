package com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse;
import java.io.Serializable;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.core.show.increasefans.LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo;

public final class LiveRevenueDeliveryResponse implements Serializable	// class@000c5f
{
    public LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo mRevenueDeliveryInfo;
    public static final LiveRevenueDeliveryResponse$a Companion;
    public static final long serialVersionUID;

    static {
       LiveRevenueDeliveryResponse.Companion = new LiveRevenueDeliveryResponse$a(null);
       LiveRevenueDeliveryResponse.serialVersionUID = 0x4ad04ad9f4063cd6;
    }
    public void LiveRevenueDeliveryResponse(){
       super();
    }
    public final LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo getMRevenueDeliveryInfo(){
       return this.mRevenueDeliveryInfo;
    }
    public final void setMRevenueDeliveryInfo(LiveRevenueDeliveryResponse$LiveRevenueDeliveryInfo p0){
       this.mRevenueDeliveryInfo = p0;
    }
}
