package com.kuaishou.live.common.core.component.gift.domain.slot.config.displaysetup.LiveGiftDisplayConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveGiftDisplayConfig implements Serializable	// class@00125d
{
    public int[] mGiftDisplaySecondsForBatch;
    public int[] mGiftDisplaySecondsForSingle;
    public int[] mGiftStyleThresholdForBatch;
    public int[] mGiftStyleThresholdForSingle;
    public static final long serialVersionUID = 0x65007040b47a04e4;

    public void LiveGiftDisplayConfig(){
       super();
       this.mGiftStyleThresholdForBatch = new int[4]{10,188,1314,0x3354};
       this.mGiftStyleThresholdForSingle = new int[3]{10,188,1314};
       this.mGiftDisplaySecondsForBatch = new int[5]{1,2,4,5,6};
       this.mGiftDisplaySecondsForSingle = new int[4]{1,2,4,5};
    }
}
