package com.kuaishou.live.core.show.profilecard.http.LiveProfileRevenueDeliveryInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveProfileRevenueDeliveryInfo implements Serializable	// class@000dcd
{
    public boolean mHideJumpEntry;
    public boolean mHideJumpEntryForMultiLine;
    public static final long serialVersionUID = 0x34776821ad70f55f;

    public void LiveProfileRevenueDeliveryInfo(){
       super();
    }
    public boolean shouldHideJumpEntry(){
       boolean b = (this.mHideJumpEntry != null || this.mHideJumpEntryForMultiLine != null)? true: false;
       return b;
    }
}
